import java.util.Scanner;
public class SKMotors {
    public static void main(String[] args) {
        
        try (Scanner Scanner = new Scanner(System.in)) {
            // 2. Capture Vehicle Details
            System.out.println("=== SK. Motors Vehicle Auction System ===");
            System.out.print("Enter Vehicle Registration Number: ");
            String regNumber = Scanner.nextLine();
            
            System.out.print("Enter Initial Vehicle Cost: ");
            double vehicleCost = Scanner.nextDouble();
            
            System.out.print("Enter Additional Expenses Incurred: ");
            double expenses = Scanner.nextDouble();
            
            double totalInvestment = vehicleCost + expenses;
            
            // 1. Accept 3 Bidders
            System.out.println("\n--- Start Bidding (3 Bidders Required) ---");
            double highestBid = 0;
            String winnerName = "";
            
            for (int i = 1; i <= 3; i++) {
                System.out.print("Enter Name of Bidder " + i + ": ");
                Scanner.nextLine(); // consume newline
                String bidderName = Scanner.nextLine();
                
                System.out.print("Enter Bid Amount for " + bidderName + ": ");
                double bidAmount = Scanner.nextDouble();
                
                if (bidAmount > highestBid) {
                    highestBid = bidAmount;
                    winnerName = bidderName;
                }
            }
            
            // Auction Result
            System.out.println("\n--- Auction Result ---");
            System.out.println("Winning Bidder: " + winnerName);
            System.out.println("Highest Bid (Selling Price): " + highestBid);
            
            // 2. Capture Deposits and Balance
            System.out.print("\nEnter Deposit Amount made by " + winnerName + ": ");
            double deposit = Scanner.nextDouble();
            
            double balance = highestBid - deposit;
            
            // Display Vehicle and Financial Details
            System.out.println("\n--- Vehicle Summary ---");
            System.out.println("Registration Number: " + regNumber);
            System.out.println("Vehicle Initial Cost: " + vehicleCost);
            System.out.println("Additional Expenses: " + expenses);
            System.out.println("Total Investment: " + totalInvestment);
            System.out.println("Selling Price: " + highestBid);
            System.out.println("Balance Left on Vehicle: " + balance);
            
            // 3. Profit or Loss Calculation (After balance is cleared)
            // Profit/Loss = Selling Price - Total Investment
            double profitOrLoss = highestBid - totalInvestment;
            
            System.out.println("\n--- Final Financial Statement ---");
            if (profitOrLoss > 0) {
                System.out.println("Profit Made: " + profitOrLoss);
            } else if (profitOrLoss < 0) {
                System.out.println("Loss Incurred: " + Math.abs(profitOrLoss));
            } else {
                System.out.println("No Profit or Loss (Break-even).");
            }
        }
    }
}


