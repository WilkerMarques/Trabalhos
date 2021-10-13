package Service;

import DAO.*;
import ArrayListPojo.*;
import java.util.*;

public class FuncionarioService {

    private Scanner sc;
    
    private FuncionarioDao dao;
    
    public FuncionarioService(){
        this.sc = new Scanner(System.in);
        this.dao = new FuncionarioDao();
    }
    
    public void exibirMenu(){
        boolean sair = false;
        do{
            int op = this.printMenu();
            switch(op){
                case 1:
                    this.printMenuAdicionar();
                    break;
                case 2:
                    this.printMenuBuscar();
                    break;               
                case 3:
                    this.printMenuAlterar();
                    break;
                case 4:
                    this.printMenuExcluir();
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção não disponível. Tente novamente.");
            }
        }
        while(sair != true);
    }

    private int printMenu(){
        System.out.print("##--Menu Funcionario - CRUD--##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| Opção 1 - ADICIONAR         |\n");
        System.out.print("| Opção 2 - BUSCAR            |\n");
        System.out.print("| Opção 3 - ALTERAR           |\n");
        System.out.print("| Opção 4 - EXCLUIR           |\n");
        System.out.print("| Opção 5 - SAIR              |\n");     
        System.out.print("|-----------------------------|\n");
        System.out.print("Digite uma opção: \n");
        return this.sc.nextInt();
    }
    
    private void printMenuAdicionar(){
        System.out.print("**--Menu Funcionario - INSERIR--**\n\n");
        System.out.print("|Digite o ID do funcionario: \n");
        int funcionarioID = this.sc.nextInt();
        System.out.print("| Digite o Nome do funcionario \n");
        String nome = this.sc.next();
        
        FuncionarioPojo pojo = new FuncionarioPojo();
        pojo.setFuncionarioID(funcionarioID);
        pojo.setNome(nome);        
        this.dao.create(pojo);
        
        if (this.dao.read(funcionarioID) != null){
            System.out.println("| Funcionario adicionado.");
            System.out.print("|*****************************\n");
        }
        else{
            System.out.println("| Erro ao adicionar Funcionario.");
            System.out.print("|*****************************\n");
        }
    }


    private void printMenuBuscar(){
        System.out.print("**--Menu Funcionario - BUSCAR--**\n\n");
        System.out.print("| Digite o ID do funcionario: \n");
        int op = this.sc.nextInt();
        FuncionarioPojo item = this.dao.read(op);
        if (item == null){
            System.out.println("Funcionario não existe.");
        }
        else{
            System.out.printf("| Funcionario ID: %d \n", item.getFuncionarioID());
            System.out.printf("| Nome: %s \n", item.getNome());
            System.out.printf("| Sobrenome: %s \n", item.getSobrenome());
            System.out.printf("| Data de Nascimento: %s \n", item.getDataNascimento());
            System.out.printf("| Email: %s \n", item.getEmail());
            System.out.printf("| Sexo: %s \n", item.getSexo());
            System.out.printf("| Data Admissão: %s \n", item.getDataAdmissao());
            System.out.printf("| Ctps: %s \n", item.getCtps());
            System.out.print("|*****************************\n");
        }
    }
    
    private void printMenuAlterar(){
        System.out.print("**--Menu Funcionario - ALTERAR--**\n\n");
        System.out.print("| Digite o ID do funcionario: \n");
        int op = this.sc.nextInt();
        FuncionarioPojo item = this.dao.read(op);
        if (item == null){
            System.out.println("Funcionario não existe.");
        }
        else{
            System.out.printf("| Funcionario ID: %d \n", item.getFuncionarioID());
            System.out.printf("| Nome: %s \n\n", item.getNome());
            System.out.print("| Digite o novo nome do Funcionario: \n");
            sc.nextLine();
            String nome = this.sc.nextLine();
            item.setNome(nome);
            System.out.println("Nome alterado com sucesso.");
            System.out.print("|*****************************\n");
        }
    }
    
    private void printMenuExcluir(){
        System.out.print("**--Menu Funcionario - EXCLUIR--**\n\n");
        System.out.print("| Digite o ID do funcionario: \n");
        int op = this.sc.nextInt();
        FuncionarioPojo item = this.dao.read(op);
        if (item == null){
            System.out.println("Funcionario não existe.");
        }
        else{
            System.out.printf("| Funcionario ID: %d \n", item.getFuncionarioID());
            System.out.printf("| Nome: %s \n\n", item.getNome());
            
            this.dao.delete(item.getFuncionarioID());
            FuncionarioPojo itemDeletado = this.dao.read(op);
            if (itemDeletado == null){
                System.out.println("Funcionario excluido com sucesso.");
            }
            System.out.print("|*****************************\n");
        }        
    }
}
