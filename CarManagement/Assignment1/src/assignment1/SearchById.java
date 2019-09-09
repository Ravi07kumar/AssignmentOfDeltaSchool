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
class SearchById {

    public int cusId;

    public SearchById() {
        System.out.println("Enter Id Of Customer");
        Scanner obj = new Scanner(System.in);
        cusId = obj.nextInt();
    }

    public int getCusId() {
        return cusId;
    }

}

