package FakeDB;

import java.util.ArrayList;
import java.util.Date;

import ArrayListPojo.*;

public final class FuncionariosFakeDB {
	
	 private static ArrayList<FuncionarioPojo> funcionarios;
	 
	 public static ArrayList<FuncionarioPojo> getFuncionarios(){
	        //Design Pattern Singleton
	        if (funcionarios == null){
	            funcionarios = new ArrayList();
	            inicializarFuncionarios();
	        }
	        return funcionarios;
	    }
	 
	 private static void inicializarFuncionarios(){
	        Date dataInsert = new Date(System.currentTimeMillis());
	        adicionarFuncionario(20100150079L, 10079, "Kshitij", "Gils", "1986-03-27", "F", "1961-10-05", "gils.kshitij@acme.com", "77109076972/663", 77109076972L, 663, 1, dataInsert);
	        adicionarFuncionario(20100150080L, 10080, "Premal", "Baek", "1985-11-19", "M", "1957-12-03", "baek.premal@acme.com", "96290236354/376", 96290236354L, 376, 1, dataInsert);
	        adicionarFuncionario(20100150081L, 10081, "Zhongwei", "Rosen", "1986-10-30", "M", "1960-12-17", "rosen.zhongwei@acme.com", "52422014236/505", 52422014236L, 505, 1, dataInsert);
	        adicionarFuncionario(20100150082L, 10082, "Parviz", "Lortz", "1990-01-03", "M", "1963-09-09", "lortz.parviz@acme.com", "85442167380/393", 85442167380L, 393, 1, dataInsert);
	        adicionarFuncionario(20100150083L, 10083, "Vishv", "Zockler", "1987-03-31", "M", "1959-07-23", "zockler.vishv@acme.com", "84683334806/128", 84683334806L, 128, 1, dataInsert);
	        adicionarFuncionario(20100150084L, 10084, "Tuval", "Kalloufi", "1995-12-15", "M", "1960-05-25", "kalloufi.tuval@acme.com", "73710901529/708", 73710901529L, 708, 1, dataInsert);
	        adicionarFuncionario(20100150064L, 10064, "Udi", "Jansch", "1985-11-20", "M", "1959-04-07", "jansch.udi@acme.com", "09059042917/182", 9059042917L, 182, 1, dataInsert);
	        adicionarFuncionario(20100150065L, 10065, "Satosi", "Awdeh", "1988-05-18", "M", "1963-04-14", "awdeh.satosi@acme.com", "02405475379/917", 2405475379L, 917, 1, dataInsert);
	        adicionarFuncionario(20100150066L, 10066, "Kwee", "Schusler", "1986-02-26", "M", "1952-11-13", "schusler.kwee@acme.com", "10728680729/242", 10728680729L, 242, 1, dataInsert);
	        adicionarFuncionario(20100150067L, 10067, "Claudi", "Stavenow", "1987-03-04", "M", "1953-01-07", "stavenow.claudi@acme.com", "65827388713/150", 65827388713L, 150, 1, dataInsert);
	        adicionarFuncionario(20100150068L, 10068, "Charlene", "Brattka", "1987-08-07", "M", "1962-11-26", "brattka.charlene@acme.com", "75880040060/867", 75880040060L, 867, 1, dataInsert);
	 }
	 
	 private static void adicionarFuncionario(long chave, int funcionarioID, String nome, String sobrenome, String dataAdmissao,
			 String sexo, String dataNascimento, String email, String ctps, long ctpsNum, int ctpsSerie, int paisID, 
			 Date dataInsert){
		 
	        FuncionarioPojo f = new FuncionarioPojo();
	        f.setChave(chave);
	        f.setFuncionarioID(funcionarioID);
	        f.setNome(nome);
	        f.setSobrenome(sobrenome);
	        f.setDataAdmissao(dataAdmissao);
	        f.setSexo(sexo);
	        f.setDataNascimento(dataNascimento);
	        f.setEmail(email);
	        f.setCtps(ctps);
	        f.setCtpsNum(ctpsNum);
	        f.setCtpsSerie(ctpsSerie);
	        f.setPaisID(paisID);
	        f.setDataInsert(dataInsert);	        
	        funcionarios.add(f);            
	    }
}
