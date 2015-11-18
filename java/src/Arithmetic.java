class Arithmetic {

    public double calculateInterest(int initialAmount, double interest, int years) {
        double cumulativeInterest = Math.pow((1 + interest), years);
        return cumulativeInterest * initialAmount;
    }

    public static void main(String args[]) {
        Arithmetic arithmetic = new Arithmetic();
        double sum = arithmetic.calculateInterest(Integer.parseInt(args[0]),
                                                  Double.parseDouble(args[1]),
                                                  Integer.parseInt(args[2]));
        System.out.println(sum);
    }
}
