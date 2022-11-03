package zad5;

public class MainClass {
public static void main(String[] args) {
	Predmet prvPredmet=new Predmet();
	prvPredmet.Predmet="Objektno orietirano programiranje";
	prvPredmet.Profesor="Ilija Jolevski";
	prvPredmet.Krediti=6;
	prvPredmet.Semestar="Treti Semestar";
	
	System.out.println(prvPredmet.Predmet+", "+prvPredmet.Profesor+", "+prvPredmet.Krediti+" krediti, "+prvPredmet.Semestar+".");
	Predmet vtorPredmet=new Predmet("Web programiranje");
	System.out.println(vtorPredmet.Predmet);
	
	Predmet tretPredmet=new Predmet("MSP"," Ilija Jolevski", 6);
	System.out.println(tretPredmet.Predmet+", "+tretPredmet.Profesor+", "+tretPredmet.Krediti+" krediti.");
}
}
