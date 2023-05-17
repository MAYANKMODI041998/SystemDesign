package model;

import java.util.HashMap;

public class Expense {
    User paidBy;
    ExpenseType expenseType;
    String expenseId;

    double amount;
    HashMap<User, Double> dividedAmount;


    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }

    public void setExpenseType(ExpenseType expenseType) {
        this.expenseType = expenseType;
    }

    public String getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(String expenseId) {
        this.expenseId = expenseId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public HashMap<User, Double> getDividedAmount() {
        return dividedAmount;
    }

    public void setDividedAmount(HashMap<User, Double> dividedAmount) {
        this.dividedAmount = dividedAmount;
    }
}
