package zad3;

public class MainClass {
	public static void main(String[] args) {
		Covek C=new Covek();
		C.ime="Marija";
		C.prezime="Tashevska";
		C.maticenBroj="2208002415019";
		
		System.out.println("Imeto na covekot e :"+ C.ime);
		System.out.println("Prezimeto na covekot e: "+ C.prezime);
		System.out.println("Covekot ima maticen broj: "+C.maticenBroj);
	}
}
