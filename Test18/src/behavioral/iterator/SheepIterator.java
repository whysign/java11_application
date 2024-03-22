package behavioral.iterator;

import java.util.Iterator;

//Sheep �� �迭�� �����ϰ� , �и��ϰ��� �� ���
public class SheepIterator implements Iterator<Sheep> {
	private Sheep[] sheeps; 
	int position = 0;
	public SheepIterator(Sheep[] sheeps) {
		super();
		this.sheeps = sheeps;
	}
	@Override
	public boolean hasNext() {
		if(position >= sheeps.length || sheeps[position]==null) {
			return false;
		}else {
			return true;
		}	
	}
	@Override
	public Sheep next() {
		Sheep tmpSheep = sheeps[position];
		position++;
		return tmpSheep;
	}
	
	
}
