
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class forClient {
	
	public static void main(String args[] ) throws IOException {
		
		int calc;
		String words;
		
		//object to input data from user
		Scanner a = new Scanner(System.in);
		
		//object for socket
		Socket soc =  new Socket("127.0.0.1", 1342);
		//to accept data from server for socket
		Scanner b = new Scanner(soc.getInputStream());
		
		//use scanner a to accept data from user
		System.out.println("Please enter text ");
		words = a.nextLine();
		
		//pass on number to server using socket obj (soc)
		PrintStream txt = new PrintStream(soc.getOutputStream());
		
		//pass number to server by printStream obj
		txt.println(words);
		
		calc = b.nextInt();
		System.out.println("Total of word you enter : " + calc );
		
	}
}
