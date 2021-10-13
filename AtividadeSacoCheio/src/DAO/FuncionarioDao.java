package DAO;

import FakeDB.*;
import ArrayListPojo.*;
import java.util.*;

public class FuncionarioDao {

    public FuncionarioDao(){
        FuncionariosFakeDB.getFuncionarios();
    }
    
    public void create(FuncionarioPojo pojo){
        FuncionariosFakeDB.getFuncionarios().add(pojo);
    }

    public FuncionarioPojo read(int funcionarioID){
        return this.search(funcionarioID);
    }
    
    public ArrayList<FuncionarioPojo> readAll(){
        return FuncionariosFakeDB.getFuncionarios();
    }    
    
    public void update(FuncionarioPojo pojo){
        FuncionarioPojo busca = this.search(pojo.getFuncionarioID());
        FuncionariosFakeDB.getFuncionarios().remove(busca);
        FuncionariosFakeDB.getFuncionarios().add(pojo);
    }
    
    public void delete(int FuncionarioID){
        FuncionarioPojo busca = this.search(FuncionarioID);
        FuncionariosFakeDB.getFuncionarios().remove(busca);        
    }
    
    private FuncionarioPojo search(int funcionarioID){
        return FuncionariosFakeDB.getFuncionarios().stream()
                .filter(f -> f.getFuncionarioID() == funcionarioID)
                .findFirst()
                .orElse(null);        
    }
}


