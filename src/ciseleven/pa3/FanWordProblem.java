package ciseleven.pa3;

public class FanWordProblem {
    public static void main(String[] args) {
        carRentalCost(5, 955);
    }

    public static void carRentalCost(int D, int d) {

        if(d<75) return;

        double C = 28.5 * (D) + 0.095 * (d-75);

        System.out.println(C);

    }

}
