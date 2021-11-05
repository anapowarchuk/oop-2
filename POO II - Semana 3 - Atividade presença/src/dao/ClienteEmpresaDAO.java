package dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import modelo.ClienteEmpresa;

public class ClienteEmpresaDAO {

	private ClienteEmpresa cli;

	public ClienteEmpresaDAO() {
	}

	public void salvarClienteEmpresa(ClienteEmpresa c) {
		FileWriter fw;
		try {
			fw = new FileWriter("arquivoCard.text");
			BufferedWriter  bw =  new BufferedWriter(fw);
 
			bw.write(c.toString());
			bw.flush();
			
			fw.close();
			bw.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
} 	
