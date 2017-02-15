/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentJava.utility;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ScannerUtil {

    public static int getInt() {
        int inputInt = 0;
        while (true) {
            try {
                inputInt = new Scanner(System.in).nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Please input number: ");
            }
        }
        return inputInt;
    }
}
