import model.*;
import service.BalanceService;
import service.BalanceServiceInterface;
import service.ExpenseService;
import service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Splitwise {
    User user;
    ExpenseService expenseService;
    UserService userService;

    BalanceService balanceService;

    public Splitwise() {

        expenseService = new ExpenseService();
        userService = new UserService();
        balanceService = new BalanceService();

    }
    void startApplication()
    {
        System.out.println("Enter 1 to add user, 2 to add expense, 3 to check balance of user, 4 to exit");
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
        switch(s)
        {
            case "1": adduser();
                startApplication();
            break;

            case "2": addExpense();
                startApplication();
            break;

            case "3": System.out.println("Give user id");
            String id=sc.next();
            User user1 = userService.getUser(id);
            showBalance(user1);
                startApplication();
            break;
            case "4": return;

            default:                startApplication();
                break;
        }




    }
    void adduser()
    {
        User u1 = new User();
        System.out.println("add user id");
        Scanner sc=new Scanner(System.in);
        String id=sc.next();
        u1.setId(id);

        userService.addUser(u1);

    }
    void addExpense()
    {
        ExpenseCreator expenseCreator = null;
        Scanner sc=new Scanner(System.in);
        String expenseTYpe = sc.next();
        if(expenseTYpe.equals(ExpenseType.EQUAL.toString()))
            expenseCreator = new Expense_EQUAL();
        System.out.println("Enter userid of paid user");
        String s=sc.next();

        User user1 = userService.getUser(s);

        List<User> paidFor = new ArrayList<>();
        System.out.println("Enter Number of user involved in payment");
        int numberOfuser = sc.nextInt();
        for(int i=1;i<=numberOfuser;i++)
        {
            System.out.println("Enter user id");
            String userId = sc.next();
            User paidForUser = new User();
            paidForUser.setId(userId);
            paidFor.add(paidForUser);
        }
        System.out.println("Enter expenseId");

        Expense expense1=expenseCreator.createExpense(user1,ExpenseType.EQUAL,120,paidFor, sc.next());
        balanceService.updateBalance(expense1);




    }
    void showBalance(User user)
    {
        balanceService.showBalance(user);
    }

}