package lex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Teste {
	
	public static void main(String[] args) {
		try {
			BufferedReader cod = new BufferedReader(new FileReader("C:/Users/Avell 1513/Desktop/backup/Classroom/Facul/Compiladores/Anal_lexico/src/codigo.txt"));
			
			String linha = cod.readLine();
			String[] tokens = {"Program","Var", ";", "Const", "Begin","Read", "End.", ",", ":", "(", ")", "=", "+", "Write", "A","x" ,"b", "B","real", "y","*","2", "3",":=", "b;"};
			while (linha != null){
				//System.out.printf("%s\n", linha);
				String[] palavras = linha.split("\\s+|(?=;)");
				for (String a: tokens){
					for (String b: palavras){
						if (!a.equals(b)){
							linha = cod.readLine();
							break;
						} else {
							System.out.println("Não encontrada a palavra "+b);
						}
					}
				}
				linha = cod.readLine();
			}
			cod.close();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
