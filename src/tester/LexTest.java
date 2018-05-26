package tester;


import java.io.IOException;

import lexer.Lexer;
import lexer.LexerException;
import lexer.Lexer.State;
import node.Token;

public class LexTest {

	public void TestLex(Lexer lexer) throws LexerException, IOException{
		
		Token token = lexer.next();
		String Tclass = token.getClass().getSimpleName();
		
		while (!Tclass.equals("EOF")){
			
			if (Tclass.equals("TEspaco")) System.out.print(" ");
			else if (Tclass.equals("TTab")) System.out.print("	");
			else if (Tclass.equals("TLbreak")) System.out.println();
			else if (Tclass.equals("TBlank")) System.out.print("");
			else if (Tclass.equals("TCommentline")) System.out.println("TCommentline");
			else if (Tclass.equals("TComment")) System.out.print("TCommentBlock");
			else System.out.print(Tclass);
			
			token = lexer.next();

			Tclass = token.getClass().getSimpleName();
		}
		
	}
}

