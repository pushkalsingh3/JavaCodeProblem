package collections;

/*
 PROBLEM STATEMENT - 
 Alfi asked Roy to go for shopping with her. Witty Roy came up with a condition. He said, for each product of MRP (Maximum Retail Price) R, she'll have to pay minimum of all the prime factors of R and he himself will pay rest of the amount. Without giving it a second thought Alfi agreed.

Now they bought N number of products. You're to find how much money did Roy had to pay for each product.

Input:

First line will contain integer N, number of products they bought.

Next N lines each will contain R, MRP of each product.

Output:

Print single integer in a new line, the amount of money Roy had to pay for each product.

Constraints:

2<=N,R<=1000000

Warning: Large I/O. Be careful with certain languages.
SAMPLE INPUT

2
5
10

SAMPLE OUTPUT

0
8

Explanation

Test Case #1: Only 1 prime factor of 5 is 5 itself, so Alfi will pay all the money and hence Roy has to pay 0.

Test Case #2: Prime Factors of 10 are 2 and 5, minimum of these is 2, so Alfi pays 2 and hence Roy has to pay the rest, which is 8.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class FindMRP {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
		Integer testCount = sc.nextInt();
		List<Integer> returnAmount = new ArrayList<Integer>();
		for(int j=0; j<testCount; j++) {
			Integer input = sc.nextInt();
			Integer input1 = input;
			List<Integer> primeFactors = new ArrayList<Integer>();
			int flag = 0;
			while (input%2==0) 
	        { 
	            flag = 1;
	            input /= 2;
	        }
			if(flag == 1) {
				primeFactors.add(2);
			}
			for (int i = 3; i <= Math.sqrt(input); i+= 2) 
	        { 
	            while (input%i == 0) 
	            { 
	                primeFactors.add(i); 
	                input /= i; 
	            } 
	        }
			if(primeFactors.isEmpty()) {
				returnAmount.add(0);
			}
			else {
				returnAmount.add(input1-primeFactors.get(0));
			}
		}
		for(Integer value : returnAmount) {
			System.out.println(value);
		}
	
    }
}

