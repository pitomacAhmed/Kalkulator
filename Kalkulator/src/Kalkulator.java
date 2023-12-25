import java.util.Scanner;
public class Kalkulator {
	public static void main(String[] args) {
Scanner input=new Scanner (System.in);
Scanner scan=new Scanner (System.in);
System.out.println("Vnesi go prviot broj:");
double a=input.nextDouble();
System.out.println("Vnesi go vtoriot broj:");
double b=input.nextDouble();
System.out.println("Vnesi ja  posakuvanata operacija: ");
String operacija=scan.nextLine();
double c;
System.out.println("Vnesi ja vtorata operacija");
String operacija1=scan.nextLine();

switch(operacija1) {
case "+":
	c=a+b;
	System.out.println(a+operacija1+b+"="+c);
	break;
case "-":
	c=a-b;
	System.out.println(a+operacija1+b+"="+c);
	break;
case"*":
	c=a*b;
	System.out.println(a+operacija1+b+"="+c);
case"/":
	c=a/b;
	System.out.println(a+operacija1+b+"="+c);
	break;
	default:
		System.out.println("Proverite što imate napisano.");
		break;
	
        }

	}

}
