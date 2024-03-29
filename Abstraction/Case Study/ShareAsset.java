public abstract class ShareAsset{

    // This is a redundant Coding

    private String symbol;
    private double totalCost;
    private double currentPrice;

    // Constructor
    public ShareAsset(String symbol, double currentPrice){
        this.symbol = symbol;

        this.currentPrice = currentPrice;
        totalCost = 0.0;
    }

    // adds a cost of given amount to this assets
    public void addCost (double cost){
        totalCost += cost;
    }

    // returns the price per share of this asset
    public double getCurrentPrice(){
        return currentPrice;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    // returns the current market value of this asset
    public abstract double getMarketValue();

//    returns the profit earned on shares of this asset
    public double getProfit(){
        // calls an abstract getMarketValue method
        return getMarketValue() - totalCost;
    }
}
