package com.anand.dr.dsa;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ElectronicShop {

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
    	int moneySpent =-1;
    	int keyboardLen = keyboards.length;
    	int drivesLen = drives.length;
    	
    	for(int i=0;i<drivesLen;++i) {
    		
    		for(int j=0;j<keyboardLen;++j) {
    			
    			if((drives[i] + keyboards[j]) <= b) {
    				if ((drives[i] + keyboards[j]) > moneySpent) {
    					moneySpent = drives[i] + keyboards[j];
    				}
    			}
    		}
    	}
    	return moneySpent; 

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
		/*
		 * BufferedWriter bufferedWriter = new BufferedWriter(new
		 * FileWriter(System.getenv("OUTPUT_PATH")));
		 * 
		 * String[] bnm = scanner.nextLine().split(" ");
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
		 */

        int b = 2;//Integer.parseInt(bnm[0]);

        int n = 2; //Integer.parseInt(bnm[1]);

        int m = 3; //Integer.parseInt(bnm[2]);

        int[] keyboards = new int[] {3,1};

		/*
		 * String[] keyboardsItems = scanner.nextLine().split(" ");
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
		 * 
		 * for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) { int
		 * keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
		 * keyboards[keyboardsItr] = keyboardsItem; }
		 */

        int[] drives = new int[] {5,2,8};

		/*
		 * String[] drivesItems = scanner.nextLine().split(" ");
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");
		 * 
		 * for (int drivesItr = 0; drivesItr < m; drivesItr++) { int drivesItem =
		 * Integer.parseInt(drivesItems[drivesItr]); drives[drivesItr] = drivesItem; }
		 */
        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        int moneySpent = getMoneySpent(keyboards, drives, b);
        System.out.println("Money Spent :: "+moneySpent);
		/*
		 * bufferedWriter.write(String.valueOf(moneySpent)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

        scanner.close();
    }
}
