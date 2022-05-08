package fr.limayrac.brpi.modele;

public class grille {

	int Hauteur;
	int Largeur;
	Case tab_case[][];
	
	public grille(int a, int b) {
		
		this.setLongueur(a);
		this.setLargeur(b);
	
	}

	public int getLongueur() {
		return Hauteur;
	}

	public void setLongueur(int hauteur) {
		Hauteur = hauteur;
	}

	public int getLargeur() {
		return Largeur;
	}

	public void setLargeur(int largeur) {
		Largeur = largeur;
	}

	public Case[][] getTab_case() {
		return tab_case;
	}

	public void setTab_case(Case[][] tab_case) {
		this.tab_case = tab_case;
	}
	
	public void displayGrille() {
		int length;
		int typeCase;
		
		
		for (int h = 0; h < Hauteur; h++) {
			for(int l = 0; l < Largeur; l++) {
				
				length = 0;
				typeCase = 0;
				
				Case c = tab_case[l][h];
				String content =  new String(c.getContenu());
				length = content.length();
				typeCase = content.indexOf('@');
				
				if(length == 1) {
					
					if(content.equals("")) content = "| ";										
					System.out.printf("|"+content);
					
				}
				else if(typeCase == -1) {
					
					System.out.printf("|*");
				}
				else {
					System.out.printf("|+");
				}
				
				content = null;
			}
		}
	}
	
	public void fillGrille(Case a, int h, int l) {
		this.tab_case[l][h] = a;
	}
	
}
	
