package fr.limayrac.brpi.modele;

public class Mot
{
    private int longueur;
    private String mot;

    public Mot(int l, String m)
    {
        longueur = l;
        mot = m;
    }

    public int getLongueur()
    {
        return longueur;
    }

    public String getMot()
    {
        return mot;
    }
}
