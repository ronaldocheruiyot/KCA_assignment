import java.util.ArrayList;

public class StockAnalysis {

    // Method to calculate average stock price
    public static double calculateAveragePrice(int[] prices) {
        double sum = 0;
        for (int price : prices) {
            sum += price;
        }
        return sum / prices.length;
    }

    // Method to find maximum stock price
    public static int findMaximumPrice(int[] prices) {
        int max = prices[0];
        for (int price : prices) {
            if (price > max) {
                max = price;
            }
        }
        return max;
    }

    // Method to count occurrences of a target price
    public static int countOccurrences(int[] prices, int target) {
        int count = 0;
        for (int price : prices) {
            if (price == target) {
                count++;
            }
        }
        return count;
    }

    // Method to compute cumulative sum using ArrayList
    public static ArrayList<Integer> computeCumulativeSum(ArrayList<Integer> prices) {
        ArrayList<Integer> cumulative = new ArrayList<>();
        int sum = 0;
        for (int price : prices) {
            sum += price;
            cumulative.add(sum);
        }
        return cumulative;
    }

    // Main method to test program
    public static void main(String[] args) {
        int[] stockArray = {100, 105, 102, 98, 110, 115, 108, 112, 109, 111};
        ArrayList<Integer> stockList = new ArrayList<>();
        for (int price : stockArray) {
            stockList.add(price);
        }

        System.out.println("Average Price: " + calculateAveragePrice(stockArray));
        System.out.println("Maximum Price: " + findMaximumPrice(stockArray));
        System.out.println("Occurrences of 110: " + countOccurrences(stockArray, 110));
        System.out.println("Cumulative Sum: " + computeCumulativeSum(stockList));
    }
}
