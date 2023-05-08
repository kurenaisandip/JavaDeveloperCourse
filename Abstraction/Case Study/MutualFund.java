public class MutualFund extends ShareAsset implements Asset {


    private double totalShares;
    public MutualFund (String symbol, double currentPrice){
        super(symbol, currentPrice);
        totalShares = 0.0;
    }


    public double getTotalShares() {
        return totalShares;
    }

    @Override
    public double getMarketValue() {
        return 0;
    }

    @Override
    public double getProfit() {
        return getMarketValue() - getTotalCost();
    }


    // records purchase of the given shares at the given price
    public void purchase(double shares, double pricePerShare) {
        totalShares += shares;
        addCost(shares * pricePerShare);
    }

    public void addCost(double v) {

    }
}
