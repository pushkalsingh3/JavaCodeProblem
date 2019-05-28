package collections;

/*	PROBLEM STATEMENT -
 * Little Jhool always wanted to have some psychic powers so that he could showoff his skills, and magic to people and impress them. (Specially, his girlfriend Big Jhool!) But, in spite all his efforts, hardwork, dedication, Googling, watching youtube videos he couldn't garner any psychic abilities!

He knew everyone was making fun of him, so to stop all of that - he came up with a smart plan. Anyone who came to him to know about their future, he asked them to write a binary number for him - and then, he smartly told them if the future for that person had good in store, or bad.

The algorithm which Little Jhool follows is, as following:

    If the binary number written by the person has six consecutive 

0s, or 1s

    , his future is bad.
    Otherwise, he says that their future is good.

Input format:

Single line contains a binary number.

Output format:

You need to print "Good luck!" (Without quotes, and WITH exclamation mark!) if the Jhool is going to tell them that they're going to have a good time. Else, print "Sorry, sorry!" if the person is going to be told that he'll have a hard time!

Constraints:

The binary number will be in string format, with the maximum length being 100 characters.
SAMPLE INPUT:
0001111110

SAMPLE OUTPUT:
Sorry, sorry!

Explanation:
Since the binary number given has six consecutive 1s, little Jhool tells the man that he's going to have a bad time!
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class PsychicPoers{
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String binNumber = br.readLine();
		String[] strArray = binNumber.split("");
		Map<String, Integer> occMap = new HashMap<>();
		occMap.put("0", 0);
		occMap.put("1", 0);
		int countOne =0 ;
		int countZero =0;
		for(String s:strArray) {
			if(s.equals("0")) {
				countOne=0;
				countZero++;
				occMap.put("0", countZero);
			}
			else if(s.equals("1")) {
				countZero=0;
				countOne++;
				occMap.put("1", countOne);
			}
			if(occMap.get("1")==6 || occMap.get("0")==6) {
				System.out.println("Sorry, sorry!");
				System.exit(0);
			}
		}
		System.out.println("Good luck!");

    }
}
