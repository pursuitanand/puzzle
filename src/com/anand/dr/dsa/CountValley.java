package com.anand.dr.dsa;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultVally {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    // Write your code here
    	int numOfValleys=0;boolean isIntialStep = true; 
    	Character firstStepChar = null;
    	Stack<Character> stack = new Stack<Character>();
    	char[] pathAr = path.toCharArray();
    	for(int i=0;i<pathAr.length;++i) {
    		System.out.println(stack);
    		if(isIntialStep) {
    			stack.push(pathAr[i]);
    			firstStepChar = pathAr[i];
    			isIntialStep = false;
    			//break;
    		}else {
    			if(null!=firstStepChar && firstStepChar == pathAr[i]) {
        			stack.push(pathAr[i]);
        		}else {
        			stack.pop();
        		}
    		}
    		
    		if(!isIntialStep && stack.empty()) {
    			if(firstStepChar!='U') {
    				numOfValleys+=1;
    			}
    			System.out.println("Number of Valley"+numOfValleys);
    			isIntialStep=true;
    		}
    		
    	}
    return numOfValleys; 
    }
    
    public static int countingValleysOther(int steps, String path) {
        // Write your code here
        	int numOfValleys=0;boolean isIntialStep = true; 
        	List<Character> U = new ArrayList<Character>();
        	List<Character> D = new ArrayList<Character>();
        	Character firstStepChar = null;
        	Stack<Character> stack = new Stack<Character>();
        	char[] pathAr = path.toCharArray();
        	for(int i=0;i<pathAr.length;++i) {
        		
        		if(isIntialStep) {
        			if(pathAr[i] == 'D') {
            			D.add(pathAr[i]);
            		}
            		if(pathAr[i] == 'U') {
            			U.add(pathAr[i]);
            		}
        			firstStepChar = pathAr[i];
        			isIntialStep = false;
        			//break;
        		}else {
        			if(pathAr[i] == 'D') {
            			D.add(pathAr[i]);
            		}
            		if(pathAr[i] == 'U') {
            			U.add(pathAr[i]);
            		}
        		}
        		
        		if(!isIntialStep && (D.size() == U.size())) {
        			if(firstStepChar!='U') {
        				numOfValleys+=1;
        			}
        			System.out.println("Number of Valley"+numOfValleys);
        			isIntialStep=true;
        		}
        		
        	}
        return numOfValleys; 
        }

}

public class CountValley {
    public static void main(String[] args) throws IOException {
		/*
		 * BufferedReader bufferedReader = new BufferedReader(new
		 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
		 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 */

        int steps = 8;//Integer.parseInt(bufferedReader.readLine().trim());

        String path = "UDDDUDUU";//bufferedReader.readLine();

        int result = ResultVally.countingValleysOther(steps, path);

		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedReader.close(); bufferedWriter.close();
		 */
        
        System.out.println("Result ::"+result);
    }
}

