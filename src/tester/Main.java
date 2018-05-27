package tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PushbackReader;

import lexer.Lexer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
//		if (args.length > 0){
		try {	
				File f = new File("src/Test.txt");
			
				Lexer lexer = new Lexer (new PushbackReader(new FileReader(f), 1024));

				LexTest lexTest = new LexTest();
				lexTest.TestLex(lexer);

			} catch (FileNotFoundException e) {
				System.out.println (e);
			}
//		} else { 
//			System.err.println("Arquivo não encontrado."); 
//			System.exit(1);

//		}

	}
	
}
