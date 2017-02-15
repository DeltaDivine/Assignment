/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentJava.view;

import AssignmentJava.utility.ScannerUtil;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ConsoleMenu {

    public static void main(String[] args) {
        printMenu();
    }
    
    static void printMenu(){

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
        
        //Switch construct
        switch(ScannerUtil.getInt()){
            case 1:
                System.out.println("All student list");
                break;
            case 2:
                System.out.println("Add a student");
                break;
            case 3:
                System.out.println("Fix a student's info");
                break;
            case 4:
                System.out.println("Delete a student");
                break;
            case 5:
                System.out.println("Search students");
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
