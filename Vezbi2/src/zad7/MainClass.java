package zad7;
import java.util.Scanner;
public class MainClass {
public static void main(String[] args) {
	Triagolnik prvTriagolnik=new Triagolnik();
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("Vnesi vrednost za stranata a na triagolnikot: ");
	prvTriagolnik.a=scanner.nextDouble();
	System.out.println("Vnesi vrednost za stranata b na triagolnikot: ");
	prvTriagolnik.b=scanner.nextDouble();
	System.out.println("Vnesi vrednost za stranata c na triagolnikot: ");
	prvTriagolnik.c=scanner.nextDouble();
	
	System.out.println("Perimetarot na triagolnik e: "+prvTriagolnik.perimetar());
	System.out.println("Plostinata na triagolnikot e: "+prvTriagolnik.plostina());
}
}
