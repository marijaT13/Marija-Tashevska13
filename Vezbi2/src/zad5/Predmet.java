package zad5;

public class Predmet {
public String Predmet;
public String Profesor;
public int Krediti;
public String Semestar;


public Predmet() {}
public Predmet(String Predmet) {
	this.Predmet=Predmet;
}
public Predmet(String Predmet, String Profesor,int i) {
	this.Predmet=Predmet;
	this.Profesor=Profesor;
	this.Krediti=i;
}
}
