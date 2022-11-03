package zad1;

public class MainClass {
	public static void main(String[] args) {
		Student object1=new Student();
		object1.fName="Stefan";
		object1.lName="Stefanovski";
		object1.index=2222;
		
		System.out.println("Podatocite za prviot objekt se:");
		System.out.println(object1.fName+" "+object1.lName+" "+object1.index);
		
		
		
		
		Student object2=new Student("Angela","Angelovska", 3333);
		System.out.println("Podatocite za vtoriot objekt se: ");
		System.out.println(object2.fName+ " "+ object2.lName+ " "+ object2.index);
		
	}
}
