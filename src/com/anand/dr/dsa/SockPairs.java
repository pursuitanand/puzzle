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

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        int numOfPairs =0 ;List<Integer> foundPairInd = new ArrayList<Integer>();
        int sizeOfArray = ar.size();
        System.out.println("Size of Array"+sizeOfArray);
        for(int i =0 ;i<sizeOfArray ; ++i){
            if(!foundPairInd.contains(i)) {
            	System.out.print(i);
            	
                for(int j =i+1 ;j<sizeOfArray ; ++j){
                	System.out.print("j="+j);
                    if(ar.get(j)==ar.get(i)){
                       numOfPairs+=1;
                       foundPairInd.add(j);
                       break; 
                    }
                }
            }
        	
        }
        System.out.println();
        System.out.println(foundPairInd);
        return numOfPairs;

    }

}

public class SockPairs {
    public static void main(String[] args) throws IOException {
		/*
		 * BufferedReader bufferedReader = new BufferedReader(new
		 * InputStreamReader(System.in)); BufferedWriter bufferedWriter = new
		 * BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		 */
        int n = 15;//Integer.parseInt(bufferedReader.readLine().trim());

		/*
		 * List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
		 * "").split(" ")) .map(Integer::parseInt) .collect(toList());
		 */
        List<Integer> ar = new ArrayList<Integer> (Arrays.asList(6, 5, 2 ,3 ,5, 2, 2 ,1, 1 ,5 ,1 ,3 ,3, 3, 5));
        int result = Result.sockMerchant(n, ar);

		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedReader.close(); bufferedWriter.close();
		 * 
		 */
        
        System.out.println("Result " + result);
    }
}
