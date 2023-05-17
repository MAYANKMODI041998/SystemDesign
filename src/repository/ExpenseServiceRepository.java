package repository;

import model.Expense;

import java.util.HashMap;
import java.util.List;

public class ExpenseServiceRepository  {

    HashMap<String,Expense> expenseList;

    public void addExpense(Expense expense) {
        expenseList.put(expense.getExpenseId(),expense);
    }

    public Expense getExpense(String expenseId) {
        return expenseList.get(expenseId);
    }

}
