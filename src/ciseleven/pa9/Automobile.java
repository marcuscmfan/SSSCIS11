package ciseleven.pa9;

public class Automobile {

    private double litresPerHundred;
    private double gasInTank;
    private double limit;

    public Automobile(double litresPerHundred){
        this.litresPerHundred = litresPerHundred;
        this.gasInTank = 0;
        this.limit = 500;
    }

    public void fillUp(double litres) {
        if (litres > limit) {
            System.out.println("You cannot fill the tank with this much fuel");
        }else {
            this.gasInTank+=litres;
        }
    }

    public void takeTrip(double kilometers) {
        double litres = (kilometers*this.litresPerHundred)/100;
        if(litres > this.gasInTank){
            System.out.println("Not enough fuel to travel that far!");
        }else {
            this.gasInTank-=litres;
        }
    }

    public double reportFuel() {
        return gasInTank;
    }

}
