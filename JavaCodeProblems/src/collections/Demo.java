package collections;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
	public static void main(String[] args) throws IOException {
		List<String> result = new ArrayList<String>();
		int flag = 1;
		Integer player;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer testCase = Integer.parseInt(br.readLine());
		if(testCase>=1 && testCase<=10) {
			for(int i=1; i<=testCase; i++) {
				Integer number = Integer.parseInt(br.readLine());
				if(number>=1 && number<=1000) {
					String[] villiansArray = br.readLine().split(" ");
					
					String[] playersArray = br.readLine().split(" ");
					
					while(flag==1 && playersArray.length>=1) {
						Integer temp = 0;
						if(playersArray[0]!=null) {
							player = Integer.parseInt(playersArray[0]);
						}
						else {
							break;
						}
						for(int j=0; j<villiansArray.length; j++) {
							if(villiansArray[j]!=null) {
								Integer villain = Integer.parseInt(villiansArray[j]);
								if(villain<=player && villain>temp) {
									temp=villain;
								}
							}
							else {
								break;
							}
							
						}
						if(temp!=0) {
							flag=1;
							List<String> tempList = new ArrayList<String>(Arrays.asList(villiansArray));
							List<String> tempList1 = new ArrayList<String>(Arrays.asList(playersArray));
							tempList.remove(temp.toString());
							tempList1.remove(playersArray[0]);
							playersArray=tempList1.toArray(playersArray);
							villiansArray=tempList.toArray(villiansArray);
						}
						else {
							flag=0;
						}
					}
					
					if(flag==1) {
						result.add("WIN");
					}
					else {
						result.add("LOSE");
					}
					
				}
			}
		}
		for (String r : result) {
			System.out.println(r);
		}
	}
}
