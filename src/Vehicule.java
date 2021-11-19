abstract public class Vehicule{
    private String nom;
    private String marque;
    private int nb_roue;
    private int vitesse_Max;

    public Vehicule(String nom,String marque,int nb_roue,int vitesse_Max ){
       
        this.nom = nom;
        this.marque = marque;
        this.nb_roue = nb_roue;
        this.vitesse_Max = vitesse_Max;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

     public String getMarque(){
    return marque;
    }

    public void setMarque(String marque){
        this.marque = marque;
    }

    public int getNbroue(){
        return nb_roue;
    }
    public void setNbroue(int nb_roue){
        this.nb_roue = nb_roue;
    }

     public int getVitessemax(){
        return vitesse_Max;
    }
    public void setVitessemax(int vitesse_Max){
        this.vitesse_Max = vitesse_Max;
    }

     public void seDeplacer(){
         System.out.println("je me déplace");
    }

    public void freiner(){
        System.out.println("je freine") ;
    }

    // method abstract
    abstract public void Trajet();

     public static void main(String[] args) {
        Moto sweety = new Moto("Weavy", "Wave" , 2, 200,"cliontant", "vitre", "IM2002", "verte");

        System.out.println("NOM :"+ sweety.getNom());
        System.out.println("MARQUE :"+ sweety.getMarque());
        System.out.println("NOMBRE DE ROUE :"+ sweety.getNbroue());
        System.out.println("VITESSE MAXI :"+ sweety.getVitessemax());
        System.out.println("PHARE :"+ sweety.getPhare());
        System.out.println("RETRO :"+ sweety.getRetroviseur());
        System.out.println("IMMATRICULATION :"+ sweety.getImmatriculation());
        System.out.println("COULEUR :"+ sweety.getCouleur());

    }


}