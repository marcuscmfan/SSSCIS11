package ciseleven.pa9;

public class Automobile {

    private double litresPerHundred;
    private double gasInTank;

    public Automobile(double litresPerHundred){
        this.litresPerHundred = litresPerHundred;
        this.gasInTank = 0;
    }

    public void fillUp(double litres) {
        this.gasInTank+=litres;
    }

    public void takeTrip(double kilometers) {
        double litres = (kilometers*this.litresPerHundred)/100;
        if(litres > this.gasInTank) System.out.println("Not enough fuel to travel that far!");
        this.gasInTank-=litres;
    }

    public double reportFuel() {
        return gasInTank;
    }

}
