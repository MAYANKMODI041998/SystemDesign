package repository;

import model.Expense;
import model.User;

import java.util.HashMap;

public class BalanceServiceRepository {

    HashMap<User, HashMap<User,Double>> balanceSheet;

    public BalanceServiceRepository()
    {
        balanceSheet = new HashMap<>(new HashMap<>());
    }
    public void updateBalance(Expense expense) {

        HashMap<User,Double> dividedAmount = expense.getDividedAmount();
        User paidBy=expense.getPaidBy();
        HashMap<User,Double> balanceSheetOfUser = balanceSheet.get(paidBy);
//
//        if(balanceSheetOfUser == null)
//            balanceSheetOfUser= new HashMap<>();

        for(User paidFor: dividedAmount.keySet())
        {
            if(paidFor.getId().equals(paidBy.getId()))
                continue;
            double amount = dividedAmount.get(paidFor);
            double amountUserGave;
            amountUserGave=  balanceSheetOfUser.get(paidFor) + amount;
            double amountUserTaken ;
            amountUserTaken = balanceSheet.get(paidFor).get(paidBy);
            double totalAmountGave = amountUserGave-amountUserTaken;
            if(totalAmountGave == 0)
                balanceSheetOfUser.remove(paidFor);
            balanceSheetOfUser.replace(paidFor, totalAmountGave);

        }
        balanceSheet.replace(paidBy, balanceSheetOfUser);
        return;

    }


    public void showBalance(User user) {

        HashMap<User,Double> balanceSheetOfUser = balanceSheet.get(user);
        if(balanceSheetOfUser == null)
        {
            System.out.println("Not Available");
            return;
        }
        for(User u:balanceSheetOfUser.keySet())
        {

            System.out.println(u.getId() +  " owes " + user.getId() +" : " + balanceSheetOfUser.get(u));
        }

    }
}
