public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // Constructor with symbol and name
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // Method to calculate percentage change
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    // Setter for previous closing price
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    // Setter for current price
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    // Getters for symbol and name
    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }
}