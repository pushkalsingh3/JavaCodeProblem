package string;

import java.util.Scanner;

public class DigitShuffle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer input = sc.nextInt();
		char[] charArray = input.toString().toCharArray();
		StringBuffer strBuff = new StringBuffer();
		int arrLength = charArray.length;
			for(int i=0; i<arrLength/2; i++) {
				strBuff.append(charArray[i]);
				strBuff.append(charArray[arrLength-i-1]);
			}
		if(arrLength%2!=0) {
			strBuff.append(charArray[arrLength/2]);
		}
		System.out.println(Integer.parseInt(strBuff.toString()));
		
	}
}
