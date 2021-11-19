public class Moto extends Vehicule implements Etat {

    private String phare;
    private String retroviseur;
    private String immatriculation;
    private String couleur;

    public Moto(String nom,String marque,int nb_roue,int vitesse_Max, String phare,String retroviseur,String immatriculation,String couleur )
    {
        super( nom, marque, nb_roue,vitesse_Max);
        this.phare = phare;
        this.retroviseur = retroviseur;
        this.immatriculation =immatriculation ;
        this.couleur = couleur;

    }

    public String getPhare(){
        return phare;
    }

    public void setPhare(String phare){
        this.phare = phare;
    }

    public String getRetroviseur(){
        return retroviseur;
    }

    public void setRetroviseur(String retroviseur){
        this.retroviseur = retroviseur;
    }

     public String getImmatriculation(){
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation){
        this.immatriculation = immatriculation;
    }

     public String getCouleur(){
        return couleur;
    }

    public void setCouleur(String couleur){
        this.couleur = couleur;
    }
   
     public void Trajet() {
        System.out.println("Il a quitté Porto-Novo pour se rendre à Banikoara ");
    }

    public void neuve(){
        System.out.println("Ceci est un vehicule neuve");
    }

    public void venu(){
        System.out.println("Ceci est un vehicule de venu de france");
    }

}