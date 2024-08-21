package LLD.SplitwiseLLD;

import LLD.SplitwiseLLD.BalanceSheet.*;
import LLD.SplitwiseLLD.Group.*;
import LLD.SplitwiseLLD.Split.*;
import LLD.SplitwiseLLD.User.*;

import java.util.*;

public class Splitwise {
    UserController userController;
    GroupController groupController;

    ExpenseBalanceSheetController balanceSheetController;

    Splitwise(){
        userController = new UserController();
        groupController = new GroupController();
        balanceSheetController = new ExpenseBalanceSheetController();
    }

    public void demo(){

        setupUserAndGroup();

        //Step1: add members to the group
        Group group = groupController.getGroup("G1001");
        group.addMember(userController.getUserById("U2001"));
        group.addMember(userController.getUserById("U3001"));

        //Step2. create an expense inside a group
        List<Split> splits = new ArrayList<>();
        Split split1 = new Split(userController.getUserById("U1001"), 300);
        Split split2 = new Split(userController.getUserById("U2001"), 300);
        Split split3 = new Split(userController.getUserById("U3001"), 300);
        splits.add(split1);
        splits.add(split2);
        splits.add(split3);
        group.createExpense("Exp1001", "Breakfast", 900, splits, SplitType.EQUAL, userController.getUserById("U1001"));

        List<Split> splits2 = new ArrayList<>();
        Split splits2_1 = new Split(userController.getUserById("U1001"), 400);
        Split splits2_2 = new Split(userController.getUserById("U2001"), 100);
        splits2.add(splits2_1);
        splits2.add(splits2_2);
        group.createExpense("Exp1002", "Lunch", 500, splits2, SplitType.UNEQUAL, userController.getUserById("U2001"));

        for(User user : userController.getAllUsers()) {
            balanceSheetController.showBalanceSheetOfUser(user);
        }
    }

    public void setupUserAndGroup(){

        //onboard user to splitwise app
        addUsersToSplitwiseApp();

        //create a group by user1
        User user1 = userController.getUserById("U1001");
        groupController.createNewGroup("G1001", "Outing with Friends", user1);
    }

    private void addUsersToSplitwiseApp(){

        //adding User1
        User user1 = new User("U1001", "User1");
        //adding User2
        User user2 = new User ("U2001", "User2");

        //adding User3
        User user3 = new User ("U3001", "User3");

        userController.addUser(user1);
        userController.addUser(user2);
        userController.addUser(user3);
    }

}
