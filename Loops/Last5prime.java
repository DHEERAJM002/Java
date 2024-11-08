package Nov8;

public class Last5prime {
	public static void main(String[] args) {
		int n=0;
		//first 5 prime numbers
		System.out.println("First 5 prime numbers between 1-100 are:");
		for(int i=1;i<=100;i++) {
				if(n==5)
					break;
				int cnt=0;
				for(int j=1;j<=i;j++) {
					if(i%j==0)
						cnt++;
				}
				if(cnt==2) {
					n++;
					System.out.println(i);
				}
		}
		//last 5 prime numbers
		System.out.println("Last 5 prime numbers between 1-100 are:");
		n=0;
				for(int i=100;i>=1;i--) {
						if(n==5)
							break;
						int cnt=0;
						for(int j=1;j<=i;j++) {
							if(i%j==0)
								cnt++;
						}
						if(cnt==2) {
							n++;
							System.out.println(i);
						}
				}	
	}

}
