package Nov16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLists {
	public static void main(String[] args) {
		//Dynamic Array
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(50);
		alist.add(30);
		alist.add(40);
		alist.add(30);
		alist.add(60);
		System.out.println(alist);
		Collections.shuffle(alist);
		alist.remove(4);//removes that element at index 4
		for(int i=0;i<alist.size();i++)
			System.out.print(alist.get(i)+" ");
		System.out.println();
		alist.add(0, 10);//adding an element at index=0
		for(int a:alist)
			System.out.print(a+" ");
		System.out.println();
		alist.addFirst(0);//adding at first
		alist.addLast(70);//adding at last
		Collections.sort(alist);
		Collections.swap(alist, 0, 1);
		Iterator<Integer> it=alist.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
		System.out.println();
		System.out.println(alist.contains(70));
		ArrayList<Integer> alist1=new ArrayList<Integer>();
		alist1.add(20);
		alist1.add(30);
		alist1.add(40);
		alist1.add(50);
		alist1.add(60);
		alist.addAll(alist1);//Adding a list to another list at end
		System.out.println(alist);
		alist.addAll(0, alist1);
		System.out.println(alist);//Adding a list at the front
	}
}
