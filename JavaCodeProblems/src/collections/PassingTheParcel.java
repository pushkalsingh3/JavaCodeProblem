package collections;

/* PROBLEM STATEMENT-
 * Have you ever been a part of the exciting game Passing the Parcel ? Sid is on a school picnic with his classmates. The teacher decides to make the whole class play the game of Passing the Parcel. Since the winner of the game gets lots of chocolates and ice cream as his/her prize, all the students are over-excited about the game, including Sid. Here are the rules of the game:

    For the purpose of the game, our Parcel here is a football.
    There are a total of N students in the class. Their roll numbers being 1,2,3...N.
    All N students are made to sit uniformly in a circle in roll number order (ie. from 1 to N in clockwise direction).
    The Parcel is first handed over to the student with roll number 1.
    The teacher starts playing a song using a loud stereo system. The lyrics of the song are denoted by a string which consists of only letters 'a' and 'b'. Assume that each lyric of the song is a single letter.
    If the lyric 'a' occurs in the song, the student who is currently holding the Parcel passes it on to the next student. This passing takes place in clockwise direction.
    If the lyric 'b' occurs in the song, the student who is currently holding the Parcel loses his/her chances of winning the game. He/she hands over the parcel to the next student (in clockwise direction) and moves out.
    The game continues until a single student survives in the end. He/she will be the winner of the game.
    Note that the song repeats continuously ie. while the game is going on, if at all the song ends, the stereo system will automatically start playing the song from the start without any delay.

Given N the number of students in the class and the lyrics of the song, you have to find out the roll number of the student who wins the game.

Input :

The input consists of 2 lines. The first line consists of N, the number of students in the class. The next line consists of a string denoting the lyrics of the song the teacher plays.

Output :

Print a single integer denoting the roll number of the student who wins the game.

Constraints :
2<=N<=1000
1<=|S|<=1000, where |S| denotes the length of the input string. It is guaranteed that at least 1 lyric in the song will be a 'b'
SAMPLE INPUT

6
abba

SAMPLE OUTPUT

5

Explanation

a :1->2
b : 2 goes out, handing over the parcel to 3 b : 3 goes out, handing over the parcel to 4 a :4->5 a :5->6 b : 6 goes out, handing over the parcel to 1 b : 1 goes out, handing over the parcel to 4 a :4->5 a :5->4 b : 4 goes out
Hence winner is 5.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class PassingTheParcel {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer testCount = Integer.parseInt(br.readLine());
		if(testCount>=2 && testCount<=1000) {
			List<Integer> students = new ArrayList<Integer>();
			for(int j=1; j<=testCount; j++) {
				students.add(j);
			}
			String lyrics = br.readLine();
			int point = 0;
			if(lyrics.length()>=1 && lyrics.length()<=1000) {
				while(students.size()!=1) {
					for(int i=0; i<lyrics.length(); i++) {
						if(lyrics.charAt(i)=='a') {
							if(point==students.size()-1) {
								point=0;
							}
							else {
								point+=1;
							}
						}
						else if(lyrics.charAt(i)=='b') {
							if(students.size()==1) {
								break;
							}
							if(point==students.size()-1) {
								students.remove(point);
								point=0;
							}
							else {
								students.remove(point);
							}
						}
					}
				}
				System.out.println(students.get(0));
			}
			
		}

    }
}
