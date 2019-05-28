package collections;

/*PROBLEM STATEMENT -
 * Doraemon gave Nobita a gadget that swaps words inside a string in the following manner :

If there are W words, word 1 is swapped with word W, word 2 is swapped with word W-1 and so on. The problem is that Nobita himself cannot verify the answer for large strings. Help him write a program to do so.

INPUT :
the first line of the input contains the number of test cases. Each test case consists of a single line containing the string.

OUTPUT :
output the string with the words swapped as stated above.

CONSTRAINTS :
|string length| <= 100000
string contains english alphabets and spaces

SAMPLE INPUT :
1
hello world

SAMPLE OUTPUT :
world hello


 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
class WordsSwapper {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer testCount = Integer.parseInt(br.readLine());
		List<String> resultString = new ArrayList<>();
		for(int i=0; i<testCount; i++) {
			String sentence = br.readLine();
			StringBuffer sb = new StringBuffer();
			if(sentence.matches("^[a-zA-Z\\s]{1,}$") && sentence.length()<=100000) {
				String[] strArray = sentence.split(" ");
				if(strArray.length/2==0) {
					for(int j=0; j<=strArray.length/2; j++) {
						String temp = strArray[j];
						strArray[j] = strArray[strArray.length-j-1];
						strArray[strArray.length-j-1] = temp;
					}
				}
				else {
					for(int j=0; j<strArray.length/2; j++) {
						String temp = strArray[j];
						strArray[j] = strArray[strArray.length-j-1];
						strArray[strArray.length-j-1] = temp;
					}
				}
				for(String s : strArray) {
					sb.append(s);
					sb.append(" ");
				}
				resultString.add(sb.toString().trim());
			}
			
		}
		for(String s : resultString) {
			System.out.println(s);
		}

    }
}
