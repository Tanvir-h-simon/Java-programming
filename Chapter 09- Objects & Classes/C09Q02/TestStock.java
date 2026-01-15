public class TestStock {
    public static void main(String[] args) {
        // Creating Stock object
        Stock stock = new Stock("ORCL", "Oracle Corporation");

        // Setting previous closing price and current price
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);

        // Displaying stock details
        System.out.println("Stock Symbol: " + stock.getSymbol());
        System.out.println("Stock Name: " + stock.getName());
        System.out.println("Price Change Percentage: " + stock.getChangePercent() + "%");
    }
}