package br.com.compiladores.analisadorLexico;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeitorDeArquivo {
	public FileReader defineArquivoDeLeitura(String nomeDoArquivo) throws FileNotFoundException {
		return new FileReader(nomeDoArquivo);
	}

	public String leituraDoArquivo(FileReader arquivoDeLeitura) throws IOException {
		BufferedReader br = new BufferedReader(arquivoDeLeitura);
		String texto = "";
		Integer contador = 1;
		AnalisadorLexico analisadorLexico = new AnalisadorLexico();
		while (br.ready()) {
			String linha = br.readLine();
			String[] listaDePalavrasDaLinha = linha.split("\\r|\\n|\\s");
			if (analisadorLexico.analisaPalavras(contador, listaDePalavrasDaLinha)) {
				contador++;
				texto = texto + linha;
				linha = "";
			}else {
				br.close();
				return "Erro na linha " +  contador;
			}
		}
		br.close();
		return null;
	}
}
