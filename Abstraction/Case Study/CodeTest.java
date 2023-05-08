public class CodeTest {

    public static void main(String[] args) {


        // CAse Study: Financial Software

        /**
         * let's Consider the problem of gathering info about a person's financial investments.
         * We have Stocks, Dividend Stocks, Mutual Funds, Real estate, Cash.....
         *
         * How would you design a complete portfolio System?
         * What new types of objects would you write??
         *

         */

        // 1-Classes: Stocks, DividendStocks, MutualFunds, Cash
        // 2-Relations: DividendStock is-a Stock

        // 3-Because different assets compute their market values in different ways:
        // We use Interface: getMarket Value and getProfit

        // 4- Similarities between mutual funds and stocks?
        // both stores assets that are based on shares

        // This is the example of polymorphism
        Asset asset = new MutualFund("AMZ", 300);

        System.out.println(asset.getMarketValue());
    }
}
