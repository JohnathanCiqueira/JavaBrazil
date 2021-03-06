package br.com.alura;

import java.io.IOException;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

public class CEP {
	
	public static void main(String[] args) {
		ViaCEPClient cliente = new ViaCEPClient();
		try {
			String cep = "02963110";
			ViaCEPEndereco endereco = cliente.getEndereco(cep);
			System.out.println(endereco.getLogradouro());
			System.out.println(endereco.getBairro());
			System.out.println(endereco.getLocalidade());
			System.out.println(endereco.getUf());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
