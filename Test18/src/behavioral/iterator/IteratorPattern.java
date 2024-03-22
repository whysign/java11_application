package behavioral.iterator;

import java.util.Iterator;

public class IteratorPattern {
	public static void main(String[] args) {
		GoatThread goats = new GoatThread();
		goats.addGoat(); 	//30
		goats.addGoat();	//31
		goats.removeGoat();	//31
		goats.addGoat();	//32
		goats.addGoat();	//33
		Iterator<Integer> goatIter =goats.createIterator();
		while(goatIter.hasNext()) {
			int key= goatIter.next();
			Goat goat =goats.GOATS.get(key);
			System.out.println(key);
			goat.soud();
		}
	}
}
