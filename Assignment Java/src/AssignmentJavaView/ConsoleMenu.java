/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentJavaView;

import AssignmentJavaFunction.Add;
import AssignmentJavaFunction.Delete;
import AssignmentJavaFunction.Find;
import AssignmentJavaFunction.Fix;
import AssignmentJavaFunction.List;
import AssignmentJavaUtility.ScannerUtil;

/**
 *
 * @author User
 */
public class ConsoleMenu {

    public static void main(String[] args) {
        ConsoleMenu.printMenu();
    }

    static void printMenu() {

        //Switch construct
        int choice = 0;

        while (choice != 6) {
            //display menu
            System.out.println("============================");
            System.out.println("|     Student Management   |");
            System.out.println("============================");
            System.out.println("|          1. List         |");
            System.out.println("|          2. Add new      |");
            System.out.println("|          3. Fix          |");
            System.out.println("|          4. Delete       |");
            System.out.println("|          5. Search       |");
            System.out.println("|          6. Exit         |");
            System.out.println("============================");

            choice = ScannerUtil.getInt();
            switch (choice) {
                case 1:
                    List.getList();
                    break;
                case 2:
                    Add.New();
                    break;
                case 3:
                    Fix.Update();
                    break;
                case 4:
                    Delete.Delete();
                    break;
                case 5:
                    Find.search();
                    break;
                case 6:
                    System.out.println("Exit program");
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }
    }
}
