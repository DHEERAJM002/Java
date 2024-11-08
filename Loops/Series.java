package Nov8;
//1/1-1/2+1/3-1/4+/1/5-1/6+....- +1/10
public class Series {

	public static void main(String[] args) {
		int n=8;
		double sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				sum+=1/(double)(i);
			}
			else {
				sum-=1/(double)(i);
			}
		}
		System.out.println(sum);	
	}
}
