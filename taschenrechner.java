import java.util.Scanner;

public class Taschenrechner {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Taschenrechner");
		System.out.println("Made by Fatmira");
		System.out.println(" ");
		System.out.println("Rechenarten: + | -");
		
		System.out.print("Wähle eine Rechenart: ");
		String user = scan.next();
		System.out.println(" ");

		System.out.print("Zahl 1: ");
		int Zahl1 = scan.nextInt();
		
		System.out.print("Zahl 2: ");
		int Zahl2 = scan.nextInt();
		
		int ErgebnisAdd = Zahl1 + Zahl2;
		int ErgebnisSub = Zahl1 - Zahl2;
		
		switch(user) {
		
		case"+":System.out.println("Das Ergebnis ist: " + ErgebnisAdd);break;
		case"-":System.out.println("Das Ergebnis ist: " + ErgebnisSub);break;
		default:System.out.println("Die rechenart existiert nicht.");break;
		
		}
	}
}
