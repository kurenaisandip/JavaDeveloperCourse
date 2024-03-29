public class Cash implements Asset{


        private double amount; // amount of money held

    // Constructor
    public Cash (double amount) {
        this.amount = amount;
    }


    @Override
    public double getMarketValue() {
        return amount;
    }

    // no profit calculation since cash is a fixed asset
    @Override
    public double getProfit() {
        return 0;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
