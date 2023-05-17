package model;

import java.util.HashMap;
import java.util.List;

public class Expense_EQUAL extends ExpenseCreator{


    @Override
    public Expense createExpense(User userPaid, ExpenseType expenseType, double amount, List<User> userList, String expenseId) {
        System.out.println("Splitting amount equally");
        HashMap<User, Double> dividedAmount = new HashMap<>();
        for(User paidFor: userList)
        {
            dividedAmount.put(paidFor, amount/userList.size());
        }
        if(verifyExpense(dividedAmount, amount) == false){
            System.out.println("Not Properly divided.");
            return null;
        }
        Expense expense=new Expense();
        expense.setExpenseId(expenseId);
        expense.setAmount(amount);
        expense.setExpenseType(expenseType);
        expense.setPaidBy(userPaid);
        expense.setDividedAmount(dividedAmount);

        return expense;

    }
}
