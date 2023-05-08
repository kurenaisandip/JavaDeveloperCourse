public class Stock extends ShareAsset implements Asset{



    private int totalShares;
    // Constructor of the super class
    public Stock(String symbol, double totalCost, double currentPrice) {
        super(symbol, currentPrice);
        totalShares = 0;
    }

    @Override
    public double getMarketValue() {
        return totalShares * getCurrentPrice();
    }



    public int getTotalShares(){
        return totalShares;
    }

    // Record a purchase of the given number of shares of the
    // stock at the given per share
    public void purchase (int shares, double pricePerShare){
        totalShares += shares;
        addCost(shares * pricePerShare);
    }
}
