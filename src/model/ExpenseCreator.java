package model;

import java.util.HashMap;
import java.util.List;

public abstract class ExpenseCreator {

    public ExpenseCreator()
    {

    }
    public abstract Expense createExpense(User userPaid, ExpenseType expenseType, double amount, List<User> userList, String expenseId) ;


    public boolean verifyExpense(HashMap<User, Double> dividedAmount, double amount ) {
        for(User paidFor : dividedAmount.keySet())
        {
            amount=amount - dividedAmount.get(paidFor);
        }
        return amount == 0;
    }
}
