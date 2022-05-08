
package fr.limayrac.brpi.modele;

public class Case {
	
	char contenu;
	int tab_orientation[];
	
	public Case() {
		
	}

	public String getContenu() {
		String res =String.valueOf(contenu);
		return res;
	}

	public void setContenu(char contenu) {
		this.contenu = contenu;
	}

	public int[] getTab_orientation() {
		return tab_orientation;
	}

	public void setTab_orientation(int[] tab_orientation) {
		this.tab_orientation = tab_orientation;
	}
	
}
