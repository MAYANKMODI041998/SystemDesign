package service;

import model.Expense;
import model.User;
import repository.BalanceServiceRepository;

public class BalanceService implements BalanceServiceInterface{

    BalanceServiceRepository balanceServiceRepository;

    public BalanceService() {
        this.balanceServiceRepository = new BalanceServiceRepository();
    }

    @Override
    public void updateBalance(Expense expense) {
        balanceServiceRepository.updateBalance(expense);
    }

    @Override
    public void showBalance(User user) {
        balanceServiceRepository.showBalance(user);
    }
}
