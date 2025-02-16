package Cycles;

public class VeloElec extends Velo{
	
	public static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR=15.0;
	private double facteurPuissanceMoteur;
	private double DEFAUT_COUPLE_MOTEUR;
	
public VeloElec(){
	super();
	this.facteurPuissanceMoteur=DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
}

public VeloElec(double diamRoue, double coupleMoteur){
	super(diamRoue);
	this.facteurPuissanceMoteur=coupleMoteur;
}
public VeloElec(double braquet, double diamRoue, double coupleMoteur){
	super(braquet,diamRoue);
	this.facteurPuissanceMoteur=coupleMoteur;
}

public double getDEFAUT_COUPLE_MOTEUR() {
    return DEFAUT_COUPLE_MOTEUR ; 
}
public void setDEFAUT_COUPLE_MOTEUR(double DEFAUT_COUPLE_MOTEUR ) {
    this.DEFAUT_COUPLE_MOTEUR = DEFAUT_COUPLE_MOTEUR ; 
}

public double getFacteurPuissanceMoteur(){ 
	return facteurPuissanceMoteur;
	}

public void setFacteurPuissanceMoteur(double coupleMoteur){
	this.facteurPuissanceMoteur=coupleMoteur;
}

@Override
public String toString(){
	return"VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
}

@Override
public double getPuissance(double FrequenceCoupsDePedale){
	return super.getPuissance(FrequenceCoupsDePedale)*facteurPuissanceMoteur;
}

public static void main(String[] args) {
    VeloElec velo1 = new VeloElec();
    VeloElec velo2 = new VeloElec(26.0, 20.0);
    VeloElec velo3 = new VeloElec(2.5, 27.5, 25.0);

    System.out.println("Vélo électrique 1 : " + velo1);
    System.out.println("Vélo électrique 2 : " + velo2);
    System.out.println("Vélo électrique 3 : " + velo3);

    velo1.setFacteurPuissanceMoteur(18.0);
    System.out.println("Facteur de puissance Vélo 1 après modification : " + velo1.getFacteurPuissanceMoteur());


    velo2.setDEFAUT_COUPLE_MOTEUR(22.0);
    System.out.println("Défaut couple moteur Vélo 2 après modification : " + velo2.getDEFAUT_COUPLE_MOTEUR());

    double frequencePedalage = 80.0; 
    System.out.println("Puissance Vélo 1 : " + velo1.getPuissance(frequencePedalage));
    System.out.println("Puissance Vélo 2 : " + velo2.getPuissance(frequencePedalage));
    System.out.println("Puissance Vélo 3 : " + velo3.getPuissance(frequencePedalage));
}



}