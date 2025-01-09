package expenseTracker;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Calendar;


public class ExpenseTracker {
    private List<Expense> expenses;
    private double budget;

    public ExpenseTracker(double budget) {
        this.expenses = new ArrayList<>();
        this.budget = budget;
    }

    public void addExpense(double amount, Date date, ExpenseCategory category) {
        try {
            Expense expense = new Expense(amount, date, category);
            expenses.add(expense);
            System.out.println("Expense added: " + expense);
        } catch (InvalidExpenseException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public double getTotalExpenses() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }

    public double getRemainingBudget() {
        return budget - getTotalExpenses();
    }

    public void generateExpenseSummary() {
        System.out.println("=== Expense Summary ===");
        for (ExpenseCategory category : ExpenseCategory.values()) {
            double categoryTotal = getCategoryTotal(category);
            System.out.println(category + ": " + categoryTotal);
        }
    }

 

    public void generateReportByDateRange(Date startDate, Date endDate) {
        // Normalize the start date to 00:00:00 and end date to 23:59:59
        Calendar startCalendar = Calendar.getInstance();
        startCalendar.setTime(startDate);
        startCalendar.set(Calendar.HOUR_OF_DAY, 0);
        startCalendar.set(Calendar.MINUTE, 0);
        startCalendar.set(Calendar.SECOND, 0);
        startCalendar.set(Calendar.MILLISECOND, 0);
        Date normalizedStartDate = startCalendar.getTime();

        Calendar endCalendar = Calendar.getInstance();
        endCalendar.setTime(endDate);
        endCalendar.set(Calendar.HOUR_OF_DAY, 23);
        endCalendar.set(Calendar.MINUTE, 59);
        endCalendar.set(Calendar.SECOND, 59);
        endCalendar.set(Calendar.MILLISECOND, 999);
        Date normalizedEndDate = endCalendar.getTime();

        System.out.println("=== Expenses from " + normalizedStartDate + " to " + normalizedEndDate + " ===");

        for (Expense expense : expenses) {
            // Compare each expense's date with the normalized date range
            if (!expense.getDate().before(normalizedStartDate) && !expense.getDate().after(normalizedEndDate)) {
                System.out.println(expense);
            }
        }
    }




    private double getCategoryTotal(ExpenseCategory category) {
        double total = 0;
        for (Expense expense : expenses) {
            if (expense.getCategory() == category) {
                total += expense.getAmount();
            }
        }
        return total;
    }

    public void displayRemainingBudget() {
        System.out.println("Remaining budget: " + getRemainingBudget());
    }
}

