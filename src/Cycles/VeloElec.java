package Cycles;
import java.util.Random;

public class VeloElec extends Velo{
	
	public static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR=15.0;
	private double facteurPuissanceMoteur;
	
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

public String toString(){
	return"VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
}

public double getPuissance(double FrequenceCoupsDePedale){
	return super.getPuissance(FrequenceCoupsDePedale)*facteurPuissanceMoteur;
}
}