
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class forServer {
	
	private static final String String = null;
	
	public static void main(String args[]) throws IOException {
		
		int count = 0;
		String word;
		
		ServerSocket socket = new ServerSocket(1342);
		
		//to accept request 
		Socket s = socket.accept();
		
		//to accept the number which the client want to pass
		Scanner fiq = new Scanner(s.getInputStream());
		
		word = fiq.nextLine();
		
		//method to count the number of text
		count = toCountWords(word);
		
		//to pass back result to the client
		PrintStream t = new PrintStream(s.getOutputStream());
		//to send data to client
		t.println(count);
		
		
	}
	
	public static int toCountWords ( String word) {
		
		if ( word.isBlank()) {
			
			return 0;
		}
		
		int count = 0;
		
		for ( int index = 0 ; index < word.length() -1 ; index++ ) {
			
			if ( word.charAt(index) == ' ' && word.charAt ( index + 1 ) != ' ') {
				
				count += 1 ;
				
			}
		}
		
		return + 1;
	}

}