package br.com.alura;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class validacaoDocumento {

	public static void main(String[] args) {

		String cpf = "86288366757";
		try {
			validarDocumentos(new CPFValidator(), cpf);
			System.out.println("CPF VÁLIDO");

		} catch (InvalidStateException e) {
			System.out.println("CPF INVÁLIDO :\n " + e);
		}

		String cnpj = "88794586000154";
		try {
			validarDocumentos(new CNPJValidator(), cnpj);
			System.out.println("CNPJ VÁLIDO");
		} catch (InvalidStateException e) {
			System.out.println("CNPJ : " + e);
		}
		
		String tituloEleitor = "232764330167";
		try {
			validarDocumentos(new TituloEleitoralValidator(), tituloEleitor);
			System.out.println("Titulo VÁLIDO");
		} catch (InvalidStateException e) {
			System.out.println("Titulo INVÁLIDO : " + e);
		}
	
	}
	
	private static void validarDocumentos(Validator<String> validador, String documento) {
		validador.assertValid(documento);
		
	}

}
