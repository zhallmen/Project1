import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class Encryption{
	char[]letters={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'+
	, 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

	char[]randomLetters=Arrays.copyOf(letters, letters.length);


	Random rand=new Random(); //create new random
	Scanner scan=new Scanner(System.in); //create new scanner
	String message;


	public Encryption(){

		for(int i=0;i<letters.length;i++){

			int x=rand.nextInt(25);
			char ch=randomLetters[i];
			randomLetters[i]=randomLetters[x];
			randomLetters[x]=ch;
		}
		System.out.println("Encrypted Letters: ");
		System.out.println(randomLetters);
	}

	public String newMessage(String newMsg){
		String newString=" ";
		for(char alphabet: newMsg.toCharArray()){

			int place=(alphabet-97);
			char perChar=randomLetters[place];
			newString=newString+perChar;


		}

		return newString;
	}



	public String toString(){
		System.out.println("Enter secret message here: ");
		String message=scan.next();
		return message;

	}



}