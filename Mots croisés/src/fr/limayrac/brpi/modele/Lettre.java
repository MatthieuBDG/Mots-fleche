package fr.limayrac.brpi.modele;

public class Lettre
{
    private char libelle;
    private int nb_mot_associe;

    public Lettre(char lib, int nb_mot)
    {
        libelle = lib;
        nb_mot_associe = nb_mot;
    }

    public char getLibelle()
    {
        return libelle;
    }

    public int getNb_mot_associe()
    {
        return nb_mot_associe;
    }
}
