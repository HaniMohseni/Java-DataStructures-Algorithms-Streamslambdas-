package com.sg.ClassSmple;

//modelling a trade class with fields ID,  Date and Tricker , given a collection of trade
// objects and a target tricker , retun the trade objects  without that tricker

import java.util.ArrayList;
        import java.util.Date;
        import java.util.List;
        import java.util.stream.Collectors;

// Define a Trade class with fields ID, Date, and Ticker
class Trade {
    private int ID;
    private Date date;
    private String ticker;

    // Constructor to initialize Trade objects
    public Trade(int ID, Date date, String ticker) {
        this.ID = ID;
        this.date = date;
        this.ticker = ticker;
    }

    // Getter methods to access private fields
    public int getID() {
        return ID;
    }

    public Date getDate() {
        return date;
    }

    public String getTicker() {
        return ticker;
    }

    // Override toString method to print Trade details
    @Override
    public String toString() {
        return "Trade{" +
                "ID=" + ID +
                ", date=" + date +
                ", ticker='" + ticker + '\'' +
                '}';
    }
}

// Main class TradeExample
public class TradeExample {
    public static void main(String[] args) {
        // Create a collection (ArrayList) to store Trade objects
        List<Trade> trades = new ArrayList<>();

        // Add some Trade objects to the collection
        trades.add(new Trade(1, new Date(), "AAPL"));
        trades.add(new Trade(2, new Date(), "GOOGL"));
        trades.add(new Trade(3, new Date(), "MSFT"));
        trades.add(new Trade(4, new Date(), "AAPL"));

        // Define the target ticker to filter out
        String targetTicker = "AAPL";

        // Filter out trades without the target ticker
        List<Trade> filteredTrades = filterTradesByTicker(trades, targetTicker);

        // Display the filtered trades
        System.out.println("Trades without " + targetTicker + ":");
        for (Trade trade : filteredTrades) {
            System.out.println(trade);
        }
    }

    // Method to filter trades by a target ticker
    public static List<Trade> filterTradesByTicker(List<Trade> trades, String targetTicker) {
        return trades.stream()
                // Use stream API to filter trades based on the target ticker
                .filter(trade -> !trade.getTicker().equals(targetTicker))
                // Collect the filtered trades into a new list
                .collect(Collectors.toList());
    }
}

