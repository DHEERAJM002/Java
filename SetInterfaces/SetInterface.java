package Nov18;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
	public static void main(String[] args) {
		HashSet<Integer> hset=new HashSet<Integer>();
		hset.add(90);
		hset.add(80);
		hset.add(null);
		hset.add(80);
		System.out.println(hset);
		LinkedHashSet<Integer> lset=new LinkedHashSet<Integer>();
		lset.add(90);
		lset.add(80);
		lset.add(null);
		lset.add(80);
		System.out.println(lset);
		TreeSet<Integer> tset=new TreeSet<Integer>();
		tset.add(90);
		tset.add(80);
		//tset.add(null);
		tset.add(80);
		System.out.println(tset);
	}
}
