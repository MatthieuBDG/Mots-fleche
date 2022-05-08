package fr.limayrac.brpi.modele;

public class Definition
{
    private String intitule;
    private String direction;

    public Definition(String intitul, String dir)
    {
        intitule = intitul;
        direction = dir;
    }

    public String getIntitule()
    {
        return intitule;
    }

    public String getDirection()
    {
        return direction;
    }
}
