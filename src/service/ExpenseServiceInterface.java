package service;

import model.Expense;

public interface ExpenseServiceInterface {

    void addExpense(Expense expense);
    Expense getExpense(String expenseId);
}
