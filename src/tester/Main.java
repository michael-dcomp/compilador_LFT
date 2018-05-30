package tester;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PushbackReader;

import lexer.ComentarioAninhado;
import lexer.Lexer;

public class Main {

	public static void main(String[] args) throws Exception {
		
			try {
					File f = new File("src/Test.txt");
				
					ComentarioAninhado lexer = new ComentarioAninhado (new PushbackReader(new FileReader(f), 1024));
	
					LexTest lexTest = new LexTest();
					lexTest.TestLex(lexer);
	
				} catch (FileNotFoundException e) {
					System.out.println (e);
				}

	}
	
}
