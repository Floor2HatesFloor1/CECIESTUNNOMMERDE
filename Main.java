package exo;

public class Main
{
    public static final int villas = 3, maisons = 12, apparts = 23;
    public static int bonbonsEnMoins = 2;
    public static int nombreTotalDeBonbonsObtenus, nombreTotalDeToursEffectues;
    public static int bonbonsParVilla = 23;
    public static int bonbonsParMaison = 12;
    public static int bonbonsParAppart = 5;

    public static void main(String[] args)
    {

        while(bonbonsParVilla > 0 || bonbonsParMaison > 0 || bonbonsParAppart > 0)
        {
            if(bonbonsParVilla < 0)
            {
                bonbonsParVilla = 0;
            }
            if(bonbonsParAppart < 0)
            {
                bonbonsParAppart = 0;
            }
            if(bonbonsParMaison < 0)
            {
                bonbonsParMaison = 0;
            }
            nombreTotalDeBonbonsObtenus = nombreTotalDeBonbonsObtenus + (bonbonsParVilla * villas) + (bonbonsParMaison * maisons) + (bonbonsParAppart * apparts);
            bonbonsParMaison = bonbonsParMaison - bonbonsEnMoins;
            bonbonsParVilla = bonbonsParVilla - bonbonsEnMoins;
            bonbonsParAppart = bonbonsParAppart - bonbonsEnMoins;
            nombreTotalDeToursEffectues++;
        }
        System.out.println(nombreTotalDeBonbonsObtenus);
        System.out.println(nombreTotalDeToursEffectues);
    }

}
