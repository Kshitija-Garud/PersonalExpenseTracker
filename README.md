# **Personal Expense Tracker**

## **Project Overview**
The **Personal Expense Tracker** is a simple, command-line Java application designed to help individuals manage their expenses. The application allows users to track expenses, categorize them, set budgets, and generate financial reports by category or specific date ranges.

## **Key Features**
- **Expense Recording**: Add new expenses with amounts, categories, and dates.
- **Expense Categorization**: Automatically categorize expenses into predefined groups (e.g., FOOD, TRANSPORT, ENTERTAINMENT, UTILITIES, and OTHER).
- **Expense Reports**: Generate reports to view total expenses, summaries by category, and reports filtered by date range.
- **Budget Tracking**: Set a budget for each category and monitor remaining budgets.
- **Date Filtering**: Generate reports for expenses within a custom date range.

## **Technologies Used**
- **Programming Language**: Java 11 or higher
- **IDE**: Any Java IDE (e.g., IntelliJ IDEA, Eclipse)
- **Data Structures**: Collections (List, Enum for categories)
- **Date Handling**: Java's `Calendar` and `Date` classes

## **Installation and Setup**

### **Prerequisites**
1. **Java JDK**: Version 11 or higher.
   - You can download it from the official [Oracle JDK website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

2. **IDE (Optional)**: You can use IntelliJ IDEA, Eclipse, or any IDE of your choice for development.

### **Clone the Repository**
Clone the project to your local machine:
```bash
git clone <repository_url>
cd Personal-Expense-Tracker
```

### **Steps to Run**
1. **Compile the Java Code**:
   If you’re running from the command line, use the following command:
   ```bash
   javac Main.java
   ```

2. **Run the Application**:
   Once compiled, you can execute the application using:
   ```bash
   java Main
   ```

3. **Interact with the Application**:
   The program will display a menu with several options. Simply enter the corresponding number to perform a specific action.

## **How the Application Works**
- **Menu System**: The application starts with a menu system, offering different functionalities such as adding expenses, viewing total expenses, generating reports, and more.
  
- **Add Expense**: When you select to add an expense, you’ll be prompted to enter:
   - **Amount**: The expense amount.
   - **Category**: Select the category for the expense (Food, Transport, etc.).
   - **Date**: Enter the date for the expense (format: YYYY-MM-DD).
  
- **Expense Reports**: 
   - You can view your total expenses, a breakdown by category, or generate a report based on a specific date range.

- **Budget Tracking**: Each category has an associated budget, and you can track how much of it remains as you add expenses.

## **Design Choices**

### **Classes Overview**
- **Main**: The main entry point for the application that controls the user interface and calls the necessary methods for functionality.
- **Expense**: This class holds the data for each expense, including the amount, date, and category.
- **Category Enum**: This is an enumeration that defines the different categories of expenses (e.g., FOOD, TRANSPORT, ENTERTAINMENT).
- **ExpenseTracker**: This class is responsible for managing the list of expenses and generating reports. It contains the core business logic.
  
### **Why Object-Oriented Design?**
Object-Oriented Programming (OOP) principles were employed to structure the code:
- **Encapsulation**: Each class has clearly defined responsibilities. Data related to expenses is encapsulated within the `Expense` class, and functionality related to managing expenses is handled by the `ExpenseTracker`.
- **Inheritance**: Although not heavily utilized in this version, inheritance could be added in the future (e.g., subclassing for specific types of expenses or reports).
- **Modularity**: The code is broken into multiple classes, ensuring that each component is easy to understand and maintain.

### **Handling Dates**
Java’s `Calendar` class is used to normalize the start and end dates when generating reports. The goal is to ensure the date comparisons are inclusive of the entire day by setting the start date to `00:00:00` and the end date to `23:59:59.999`.

## **Assumptions**
- The application assumes that the user is familiar with basic command-line interactions.
- The **date format** for entering expenses is strictly `YYYY-MM-DD`.
- **Expense categories** are predefined and cannot be modified by the user. Future versions could allow dynamic category creation.
- **No external databases** are used; expenses are stored in memory. Data will be lost when the application is closed.
- **No User Authentication**: This application is designed for a single user. There’s no account or session management.
- **Budget Limits**: The application allows users to set budgets for each category, but there is no notification system when a budget is exceeded (yet).

## **Future Enhancements**
- **Persistent Data Storage**: Implement file-based storage (e.g., JSON, CSV, or database) to persist expenses between application sessions.
- **Graphical User Interface (GUI)**: A GUI could be added using JavaFX or Swing for a more user-friendly experience.
- **User Authentication**: Implement user registration and login to allow multiple users to use the application.
- **Advanced Reporting**: Add features like pie charts or bar graphs for visualizing spending patterns.
- **Alerts for Budget Exceedance**: Notify users when they exceed a set category budget.

## **Contributing**
We welcome contributions! Feel free to open an issue or submit a pull request with improvements, bug fixes, or new features.

---

### **Example Output**:
```
=== Personal Expense Tracker ===
1. Add Expense
2. View Total Expenses
3. Generate Expense Summary by Category
4. View Remaining Budget
5. Generate Expense Report by Date Range
6. Exit
====================
Enter your choice: 1
Enter expense amount: 100
Enter expense category (1: FOOD, 2: TRANSPORT, 3: ENTERTAINMENT, 4: UTILITIES, 5: OTHER): 1
Enter expense date (YYYY-MM-DD): 2024-12-20
Expense added: Expense [Amount: 100.0, Date: Fri Dec 20 16:03:18 IST 2024, Category: FOOD]
=== Personal Expense Tracker ===
1. Add Expense
2. View Total Expenses
3. Generate Expense Summary by Category
4. View Remaining Budget
5. Generate Expense Report by Date Range
6. Exit
====================
Enter your choice: 1
Enter expense amount: 200
Enter expense category (1: FOOD, 2: TRANSPORT, 3: ENTERTAINMENT, 4: UTILITIES, 5: OTHER): 2
Enter expense date (YYYY-MM-DD): 2024-12-22
Expense added: Expense [Amount: 200.0, Date: Sun Dec 22 16:03:31 IST 2024, Category: TRANSPORT]
=== Personal Expense Tracker ===
1. Add Expense
2. View Total Expenses
3. Generate Expense Summary by Category
4. View Remaining Budget
5. Generate Expense Report by Date Range
6. Exit
====================
Enter your choice: 2
Total Expenses: 300.0
=== Personal Expense Tracker ===
1. Add Expense
2. View Total Expenses
3. Generate Expense Summary by Category
4. View Remaining Budget
5. Generate Expense Report by Date Range
6. Exit
====================
Enter your choice: 1
Enter expense amount: 100
Enter expense category (1: FOOD, 2: TRANSPORT, 3: ENTERTAINMENT, 4: UTILITIES, 5: OTHER): 5
Enter expense date (YYYY-MM-DD): 2024-12-30
Expense added: Expense [Amount: 100.0, Date: Mon Dec 30 16:04:17 IST 2024, Category: OTHER]
=== Personal Expense Tracker ===
1. Add Expense
2. View Total Expenses
3. Generate Expense Summary by Category
4. View Remaining Budget
5. Generate Expense Report by Date Range
6. Exit
====================
Enter your choice: 2
Total Expenses: 400.0
=== Personal Expense Tracker ===
1. Add Expense
2. View Total Expenses
3. Generate Expense Summary by Category
4. View Remaining Budget
5. Generate Expense Report by Date Range
6. Exit
====================
Enter your choice: 3
=== Expense Summary ===
FOOD: 100.0
TRANSPORT: 200.0
ENTERTAINMENT: 0.0
UTILITIES: 0.0
OTHER: 100.0
=== Personal Expense Tracker ===
1. Add Expense
2. View Total Expenses
3. Generate Expense Summary by Category
4. View Remaining Budget
5. Generate Expense Report by Date Range
6. Exit
====================
Enter your choice: 5
Enter start date (YYYY-MM-DD): 2024-12-20
Enter end date (YYYY-MM-DD): 2024-12-22
=== Expenses from Fri Dec 20 00:00:00 IST 2024 to Sun Dec 22 23:59:59 IST 2024 ===
Expense [Amount: 100.0, Date: Fri Dec 20 16:03:18 IST 2024, Category: FOOD]
Expense [Amount: 200.0, Date: Sun Dec 22 16:03:31 IST 2024, Category: TRANSPORT]
=== Personal Expense Tracker ===
1. Add Expense
2. View Total Expenses
3. Generate Expense Summary by Category
4. View Remaining Budget
5. Generate Expense Report by Date Range
6. Exit
====================
Enter your choice: 5
Enter start date (YYYY-MM-DD): 2024-12-20
Enter end date (YYYY-MM-DD): 2024-12-30
=== Expenses from Fri Dec 20 00:00:00 IST 2024 to Mon Dec 30 23:59:59 IST 2024 ===
Expense [Amount: 100.0, Date: Fri Dec 20 16:03:18 IST 2024, Category: FOOD]
Expense [Amount: 200.0, Date: Sun Dec 22 16:03:31 IST 2024, Category: TRANSPORT]
Expense [Amount: 100.0, Date: Mon Dec 30 16:04:17 IST 2024, Category: OTHER]
=== Personal Expense Tracker ===
1. Add Expense
2. View Total Expenses
3. Generate Expense Summary by Category
4. View Remaining Budget
5. Generate Expense Report by Date Range
6. Exit
====================
Enter your choice: 4
Remaining budget: 600.0
=== Personal Expense Tracker ===
1. Add Expense
2. View Total Expenses
3. Generate Expense Summary by Category
4. View Remaining Budget
5. Generate Expense Report by Date Range
6. Exit
====================
Enter your choice: 6
Exiting...

