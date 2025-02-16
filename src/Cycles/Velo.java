package Cycles;
import java.util.Random;

public class Velo {
	private double DEFAUT_BRAQUET=13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea;
	
public double getDEFAUT_BRAQUET() {
	return DEFAUT_BRAQUET;
	}

public void setDEFAUT_BRAQUET(double DEFAUT_BRAQUET) {
	this.DEFAUT_BRAQUET = DEFAUT_BRAQUET;
}
 
public Velo (double braquet, double diamRoue) {
	this.braquet = braquet;
	this.diamRoue = diamRoue;
}

public Velo (double braquet) {
	this.braquet = braquet; 
}

public Velo () {
	this.braquet = 0.0; 
	this.diamRoue = 0.0;
}

public Random getGenAlea () {
	return genAlea ;
}

public void setGenAlea(Random genAlea) {
	this.genAlea = genAlea;
}

public double getBraquet () {
	return braquet;
}

public void setBraquet (double braquet) {
	this.braquet = braquet; 
}

public double getDiamRoue() {
	return diamRoue;
}

public void setDiamRoue (double diamRoue) {
	this.diamRoue = diamRoue; 
}

@Override
public String toString () {
	return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + " ]"; 
}

public double getPuissance (double FrequenceCoupsDePedale) {
	return FrequenceCoupsDePedale*braquet*diamRoue*genAlea.nextDouble();
}
 
    public static void main(String[] args) {
        Velo velo1 = new Velo(14.5, 26.0);
        Velo velo2 = new Velo(28.0);
        Velo velo3 = new Velo();

        velo1.setGenAlea(new java.util.Random());
        velo2.setGenAlea(new java.util.Random());
        velo3.setGenAlea(new java.util.Random());
        
        System.out.println(velo1);
        System.out.println(velo2);
        System.out.println(velo3);
        
        System.out.println(velo1.getBraquet());
        System.out.println(velo2.getBraquet());
        System.out.println(velo3.getBraquet());
        
        System.out.println(velo1.getDiamRoue());
        System.out.println(velo2.getDiamRoue());
        System.out.println(velo3.getDiamRoue());
        
        System.out.println(velo1.getGenAlea());
        System.out.println(velo2.getGenAlea());
        System.out.println(velo3.getGenAlea());
        
        double FrequenceCoupsDePedale = 25;
        System.out.println(velo1.getPuissance(FrequenceCoupsDePedale));
        System.out.println(velo2.getPuissance(FrequenceCoupsDePedale));
        System.out.println(velo3.getPuissance(FrequenceCoupsDePedale));
      
    }
}



