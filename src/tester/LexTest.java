package tester;


import java.io.IOException;

import lexer.ComentarioAninhado;
import lexer.Lexer;
import lexer.LexerException;
import lexer.Lexer.State;
import node.InvalidToken;
import node.Token;

public class LexTest {

	public void TestLex(ComentarioAninhado lexer) throws LexerException, IOException{
		
		Token token = lexer.next();
		String Tclass = token.getClass().getSimpleName();
		
		while (!Tclass.equals("EOF")){
			try {
				if (Tclass.equals("TEspaco")) System.out.print(" ");
				else if (Tclass.equals("TTab")) System.out.print("	");
				else if (Tclass.equals("TLbreak")) System.out.println();
				else if (Tclass.equals("TBlank")) System.out.print("");
				else System.out.print(Tclass);
				
				token = lexer.next();
	
				Tclass = token.getClass().getSimpleName();
			} catch (LexerException ex) { 
				System.out.println(ex);
				token = lexer.next();
			}
		}
		
	}
}

