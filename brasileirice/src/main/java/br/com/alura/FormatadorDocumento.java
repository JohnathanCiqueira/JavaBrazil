package br.com.alura;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDocumento {

	public static void main(String[] args) {

		String cpf = "11111111111";
		String cnpj = "88794586000154";
		String tituloEleitor = "232764330167";

		CPFFormatter formatterCPF = new CPFFormatter();
		String cpfFormatado = formatarDocumento(formatterCPF, cpf);
		String cpfSemFormatacao = desformatarDocumento(formatterCPF, cpf);

		System.out.println("CPF : " + cpf);
		System.out.println("CPF Formatado : " + cpfFormatado);
		System.out.println("CPF Desformatado : " + cpfSemFormatacao);

		CNPJFormatter formatterCNPJ = new CNPJFormatter();
		String cnpjFormatado = formatarDocumento(formatterCNPJ, cnpj);
		String cnpjSemFormatacao = desformatarDocumento(formatterCNPJ, cnpj);

		System.out.println("CNPJ : " + cnpj);
		System.out.println("CNPJ Formatado : " + cnpjFormatado);
		System.out.println("CNPJ Desformatado : " + cnpjSemFormatacao);

		TituloEleitoralFormatter formatterTitulo = new TituloEleitoralFormatter();
		String tituloFormatado = formatarDocumento(formatterTitulo, tituloEleitor);
		String tituloSemFormatacao = desformatarDocumento(formatterTitulo, tituloEleitor);

		System.out.println("Titulo : " + tituloEleitor);
		System.out.println("Titulo Formatado : " + tituloFormatado);
		System.out.println("Titulo Desformatado : " + tituloSemFormatacao);

	}

	private static String formatarDocumento(Formatter formatador, String documento) {
		return formatador.format(documento);
	}

	private static String desformatarDocumento(Formatter formatador, String documento) {
		return formatador.unformat(documento);
	}
}
