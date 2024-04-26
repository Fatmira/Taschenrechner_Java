import java.util.Scanner;

public class Taschenrechner {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Taschenrechner");
		System.out.println("Made by Fatmira");
		System.out.println(" ");
		System.out.println("Rechenarten: + | - | / | * ");
		
		System.out.print("Wähle eine Rechenart: ");
		String user = scan.next();
		System.out.println(" ");

		System.out.print("Zahl 1: ");
		float Zahl1 = scan.nextFloat();
		
		System.out.print("Zahl 2: ");
		float Zahl2 = scan.nextFloat();
		
		float ErgebnisAdd = Zahl1 + Zahl2;
		float ErgebnisSub = Zahl1 - Zahl2;
		float ErgebnisDiv = Zahl1 / Zahl2;
		float ErgebnisMul = Zahl1 * Zahl2;
		
		
		switch(user) {
		
		case"+":System.out.println("Das Ergebnis ist: " + ErgebnisAdd);break;
		case"-":System.out.println("Das Ergebnis ist: " + ErgebnisSub);break;
		case"/":System.out.println("Das Ergebnis ist: " + ErgebnisDiv);break;
		case"*":System.out.println("Das Ergebnis ist: " + ErgebnisMul);break;
		default:System.out.println("Die rechenart existiert nicht.");break;
		
		}
	}
}
