/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.Scanner;

/**
 *
 * @author ravi
 */
// this class created for distribute prize
 public class RandomNumber {

    public int num1;
    public int num2;
    public int num3;

    public RandomNumber() {
        System.out.println("Enter 3 random No as id:");
        Scanner obj = new Scanner(System.in);
        num1 = obj.nextInt();
        num2 = obj.nextInt();
        num3 = obj.nextInt();
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }
    
    }