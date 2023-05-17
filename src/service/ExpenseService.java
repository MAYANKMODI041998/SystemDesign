package service;

import model.Expense;
import model.ExpenseCreator;
import model.ExpenseType;
import model.User;
import repository.ExpenseServiceRepository;

import java.util.List;

public class ExpenseService implements ExpenseServiceInterface{
    ExpenseServiceRepository expenseServiceRepository;
    ExpenseCreator expenseCreator;
    public ExpenseService() {
        this.expenseServiceRepository = new ExpenseServiceRepository();


    }


    @Override
    public void addExpense(Expense expense) {
        expenseServiceRepository.addExpense(expense);
    }

    @Override
    public Expense getExpense(String expenseId) {
        return expenseServiceRepository.getExpense(expenseId);
    }
}
