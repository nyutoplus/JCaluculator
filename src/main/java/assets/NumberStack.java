package assets;

import java.util.ArrayList;
import java.util.List;

public class NumberStack {
	
	List<Number> numberList;
	
	public NumberStack() {
		numberList = new ArrayList<>();
	}
	
	public void addStack(Number num) {
		numberList.add(num);
	}
	
	public void removeList() {
		numberList.remove(numberList.size() - 1);
	}
	
	public Number[] getStacks() {
		return numberList.toArray(new Number[0]);
	}

}
