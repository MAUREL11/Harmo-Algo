import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un nom pour la première personne :");
		String nom = sc.nextLine();
		
		System.out.println("Veuillez saisir un prénom pour la première personne :");
		String prenom = sc.nextLine();
		
		Personne personne = new Personne(nom,prenom);
		System.out.println(personne.toString());
		
		
		
		
		System.out.println("Veuillez saisir un nom pour la seconde personne :");
		String nom2 = sc.nextLine();
		
		System.out.println("Veuillez saisir un prénom pour la seconde personne :");
		String prenom2 = sc.nextLine();
		
		Personne personne2 = new Personne(nom2,prenom2);
		System.out.println(personne2.toString());	*/
		
		Personne[] carnetAdresse = {} ;
		
		carnetAdresse[0] = new Personne("test","test");
		carnetAdresse[1] = new Personne("test2","test2");
		System.out.println((carnetAdresse[0]));
		
	}

}
