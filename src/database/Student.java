
package database;

import java.util.ArrayList;

public class Student {
    
    protected String jmeno;
    protected String prijmeni;
    protected int rokNarozeni;
    protected int mesicNarozeni;
    protected int denNarozeni;
    protected ArrayList<Integer> znamka;
    protected double prumer;
    protected int ID;

    public Student(String jmeno, String prijmeni, int rokNarozeni, int mesicNarozeni, int denNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.rokNarozeni = rokNarozeni;
        this.mesicNarozeni = mesicNarozeni;
        this.denNarozeni = denNarozeni;
        this.znamka = new ArrayList<>();
    }

     public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public int getRokNarozeni() {
        return rokNarozeni;
    }

    public int getMesicNarozeni() {
        return mesicNarozeni;
    }

    public int getDenNarozeni() {
        return denNarozeni;
    }

    public void setZnamka(int znamka) {
        this.znamka.add(znamka);
        setPrumer();
    }
    
    public void setPrumer(){
        double sum = 0;
        for(Integer i : znamka){
            sum += i;
        }
        this.prumer = sum/znamka.size();        
    }
    
    public double znamkaSum(){
        double sum = 0;
        for(Integer i : znamka){
            sum += i;
        }
        return sum;
    }
    
}
