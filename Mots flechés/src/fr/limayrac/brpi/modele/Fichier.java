package fr.limayrac.brpi.modele;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Fichier {
	
	private static final String FICHIER = "C:\\Users\\matde\\Downloads\\Matthieu Boubee de Gramont Java\\Mots flechés\\ressources\\liste_francais.txt";
	private ArrayList <String> listeDeMots = null;
	
	public Fichier() {
		super();
		listeDeMots = new ArrayList<>();
		ouvrirFichier();
		
	}
	
	//ouvrir le fichier
	private void ouvrirFichier(){
		try{
			InputStream flux = Fichier.class.getResourceAsStream(FICHIER);
			InputStreamReader lecture=new InputStreamReader(flux);
			BufferedReader buff = new BufferedReader(lecture);
			String ligne;
			while ((ligne=buff.readLine())!=null){
				listeDeMots.add(ligne);
			}
			buff.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
	}

	
	public void printMots(){
		System.out.println("Affichage des mots pr�sents dans le dictionnaire");
		for (String m  : listeDeMots) {
			System.out.println(m);
		}
	}
		
	public void printMotsDebut(String d){
			System.out.printf("Affichage des mots commen�ant par %s%n", d);
			for (String m  : listeDeMots) {
				if (m.startsWith(d)){
					System.out.println(m);
				}
			}
	}
		

}
