package fr.limayrac.brpi.modele;
public class main {
	
	public static void main(String[] args) {


		
		grille maGrille = new grille(6,6);
		Case uneCase	= new Case();
		Case uneDef		= new Case();
		Case deuxDef	= new Case();
		
		
		
		uneDef.setContenu('u');
		deuxDef.setContenu('@');
		
		for (int h = 0; h < 5; h++) {
			for(int l = 0; l < 5; l++) {
				
				maGrille.fillGrille(uneCase, h, l);
				
			}
		}
		
		maGrille.fillGrille(uneDef, 5, 6);
		maGrille.fillGrille(deuxDef, 6, 6);
		maGrille.displayGrille();
	}
	
}