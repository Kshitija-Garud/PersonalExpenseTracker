package expenseTracker;

import java.util.Date;

public class Expense {
    private double amount;
    private Date date;
    private ExpenseCategory category;

    public Expense(double amount, Date date, ExpenseCategory category) throws InvalidExpenseException {
        if (amount <= 0) {
            throw new InvalidExpenseException("Expense amount must be positive.");
        }
        this.amount = amount;
        this.date = date;
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    public ExpenseCategory getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Expense [Amount: " + amount + ", Date: " + date + ", Category: " + category + "]";
    }
}
