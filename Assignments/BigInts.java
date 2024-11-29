package CodingChallenge3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BigInts {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number:");
		BigInteger n1=new BigInteger(br.readLine());
		System.out.println("Enter second number:");
		BigInteger n2=new BigInteger(br.readLine());
		BigInteger result=n1.multiply(n2);
		System.out.println("The product is:");
		System.out.println(result.toString());
	}
}
