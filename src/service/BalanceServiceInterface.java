package service;

import model.Expense;
import model.User;

public interface BalanceServiceInterface {

    void updateBalance(Expense expense);
    void showBalance(User user);
}
