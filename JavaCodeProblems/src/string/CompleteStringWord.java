package string;

/*
 	PROBLEM STATEMENT
	A string is said to be complete if it contains all the characters from a to z. Given a string, check if it complete or not.

Input
First line of the input contains the number of strings N. It is followed by N lines each contains a single string.

Output
For each test case print "YES" if the string is complete, else print "NO"

Constraints
1 <= N <= 10
The length of the string is at max 100 and the string contains only the characters a to z

SAMPLE INPUT :
3
wyyga
qwertyuioplkjhgfdsazxcvbnm
ejuxggfsts

SAMPLE OUTPUT :
NO
YES
NO
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompleteStringWord {
	public static void main(String[] args) throws IOException {
		List<String> result = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer testCase = Integer.parseInt(br.readLine());
		if(testCase>=1 && testCase<=10) {
			for(int i=1; i<=testCase; i++) {
				String word = br.readLine();
				if(word.length()<=100 && word.matches("^[a-z]*$")) {
					String testAlphabets = "abcdefghijklmnopqrstuvwxyz";
					String[] wordArray = word.split("");
					for(String s:wordArray) {
						if(testAlphabets.contains(s)) {
							if(testAlphabets.length()>1) {
								String[] testArray = testAlphabets.split(s);
								testAlphabets = testArray[0].concat(testArray[1]);
							}
							else {
								testAlphabets="";
								break;
							}
						}
					}
					if(testAlphabets.isEmpty()) {
						result.add("YES");
					}
					else {
						result.add("NO");
					}	 
				}
			}
		}
		for (String r : result) {
			System.out.println(r);
		}
	}
}
