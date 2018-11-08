package com.ipiecoles.java.java220;

public class Commercial extends Employe {
    public Commercial() {
    }
    private Double caAnnuel;

    public Double getCaAnnuel(){
        return caAnnuel;
    }

    public void setCaAnnuel(Double caAnnuel) {
        this.caAnnuel = caAnnuel;
    }

    @Override
    public Double getPrimeAnnuelle() {
        double prime = this.getCaAnnuel() * 0.05;
        prime = Math.ceil(prime);
        if (prime < 500.0){
            return 500.0;
            }
            return prime;
        }
}
