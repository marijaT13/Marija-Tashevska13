package zad4;

public class MainClass {
public static void main(String[] args) {
	Avtomobil prvAvtomobil=new Avtomobil();
	prvAvtomobil.marka="Citroen";
	prvAvtomobil.model="Xsara";
	prvAvtomobil.pominatiKm="256789";
	Avtomobil vtorAvtomobil=new Avtomobil("Chevrolette","Kalos", "220000");
	
	System.out.println(prvAvtomobil.marka+ " "+prvAvtomobil.model+" "+
	prvAvtomobil.pominatiKm);
	System.out.println(vtorAvtomobil.marka+" "+vtorAvtomobil.model+" "+
	vtorAvtomobil.pominatiKm);
		
}
}
