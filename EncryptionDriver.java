import java.util.Scanner;

public class EncryptionDriver{

	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter secret message here: ");
		String message=scan.next();

		Encryption phrase=new Encryption();
		String sentence=phrase.newMessage(message);
		System.out.println("Here is your secret message: ");
		System.out.println(sentence);

	}
}