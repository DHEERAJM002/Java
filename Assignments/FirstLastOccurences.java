package CodingChallenge3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstLastOccurences {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string:");
		String s=br.readLine();
		System.out.println("Enter the character:");
		String c=br.readLine();
		char[] temp=s.toCharArray();
		char p=c.charAt(0);
		String solution="";
		int first=0;
		while(first<s.length()&&temp[first]!=p)
			first++;
		int last=s.length()-1;
		while(last>0&&temp[last]!=p)
			last--;
		if(last==0)
			last=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++) {
			if(i!=first && i!=last)
				solution+=temp[i];
		}
		System.out.println(solution);
	}
}
