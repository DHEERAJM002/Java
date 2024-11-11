package Nov11;
//CTP cannot be achieved by changing return types
public class FunctionOverLoad {
	void add(int i,int j) {
		System.out.println("Int function :"+(i+j));
	}
	void add(float i,float j) {
		System.out.println("Float function :"+(i+j));
	}
	void add(double i,double j) {
		System.out.println("Double function :"+(i+j));
	}
	void add(short i,short j) {
		System.out.println("Short function :"+(i+j));
	}
	void add(long i,long j) {
		System.out.println("Long function :"+(i+j));
	}
	void add(byte i,byte j) {
		System.out.println("Byte function :"+(i+j));
	}
	void add(int i,int j,int k) {
		System.out.println("Int 3 parameters function :"+(i+j+k));
	}
	void add(short i,long j) {
		System.out.println("Short and Long function :"+(i+j));
	}
	void add(String a,String b) {
		System.out.println("String addition function : "+a+b);
	}
	public static void main(String[] args) {
		FunctionOverLoad obj=new FunctionOverLoad();
		obj.add(1, 4);
		obj.add((float)1.0,(float)2.0);
		obj.add(1.021,2.013);
		obj.add((long)1, 3);
		obj.add((short)4, (short)3);
		obj.add((byte)4, (byte)3);
		obj.add(1, 2,3);
		obj.add((short)1,(long)2 );
		obj.add("Hello","Hello");
	}
}
