package expenseTracker;

import java.util.Scanner;
import java.util.Calendar;

public class ExpenseTrackerApp {
    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker(1000); // Set initial budget
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Personal Expense Tracker ===");
            System.out.println("1. Add Expense");
            System.out.println("2. View Total Expenses");
            System.out.println("3. Generate Expense Summary by Category");
            System.out.println("4. View Remaining Budget");
            System.out.println("5. Generate Expense Report by Date Range");
            System.out.println("6. Exit");
            System.out.println("====================");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add new expense
                    System.out.print("Enter expense amount: ");
                    double amount = scanner.nextDouble();
                    System.out.print("Enter expense category (1: FOOD, 2: TRANSPORT, 3: ENTERTAINMENT, 4: UTILITIES, 5: OTHER): ");
                    int categoryChoice = scanner.nextInt();
                    ExpenseCategory category = ExpenseCategory.values()[categoryChoice - 1];
                    System.out.print("Enter expense date (YYYY-MM-DD): ");
                    String dateInput = scanner.next();
                    String[] dateParts = dateInput.split("-");
                    Calendar calendar = Calendar.getInstance();
                    calendar.set(Integer.parseInt(dateParts[0]), Integer.parseInt(dateParts[1]) - 1, Integer.parseInt(dateParts[2]));
                    tracker.addExpense(amount, calendar.getTime(), category);
                    break;

                case 2:
                    // View total expenses
                    System.out.println("Total Expenses: " + tracker.getTotalExpenses());
                    break;

                case 3:
                    // Generate expense summary by category
                    tracker.generateExpenseSummary();
                    break;

                case 4:
                    // View remaining budget
                    tracker.displayRemainingBudget();
                    break;

                case 5:
                    // Generate report by date range
                    System.out.print("Enter start date (YYYY-MM-DD): ");
                    String startDateInput = scanner.next();
                    System.out.print("Enter end date (YYYY-MM-DD): ");
                    String endDateInput = scanner.next();
                    // Parsing dates
                    String[] startParts = startDateInput.split("-");
                    String[] endParts = endDateInput.split("-");
                    Calendar startCal = Calendar.getInstance();
                    startCal.set(Integer.parseInt(startParts[0]), Integer.parseInt(startParts[1]) - 1, Integer.parseInt(startParts[2]));
                    Calendar endCal = Calendar.getInstance();
                    endCal.set(Integer.parseInt(endParts[0]), Integer.parseInt(endParts[1]) - 1, Integer.parseInt(endParts[2]));
                    tracker.generateReportByDateRange(startCal.getTime(), endCal.getTime());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

