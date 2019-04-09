package br.com.compiladores.analisadorLexico;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String caminho = "C:\\Users\\mathe\\eclipse-workspace\\Compiladores\\src\\Compiladores.txt";
		LeitorDeArquivo leitorDeArquivo = new LeitorDeArquivo();
		try {
			String mensagemDeErro = leitorDeArquivo.leituraDoArquivo(leitorDeArquivo.defineArquivoDeLeitura(caminho));
			if (mensagemDeErro != null) {
				System.out.println(mensagemDeErro);
			}else {
				System.out.println("Sem erros no c�digo analisado");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
