package it.ariadne.homework.Generics;


public class GenericsDemo {

	public static void main(String[] args) {
		GenericTool<Integer> gt = new GenericTool<Integer>(18);
		System.out.println(gt.getValueOfT());

		GenericTool<Float> anothergt = new GenericTool<Float>(17.999f);
		System.out.println(anothergt.getValueOfT());

		int n;
		n = gt.compareTo(anothergt);
		if(n==0) {
			System.out.println("Equal numbers!");
		} else if (n==1) {
			System.out.println(gt.getValueOfT() + " is greater than " + anothergt.getValueOfT());
		} else if (n == -1){
			System.out.println(gt.getValueOfT() + " is smaller than " + anothergt.getValueOfT());
		}
	}

}

class GenericTool <T extends Number> {

	private T t;

	GenericTool (T t) {
		this.t = t;
	}

	public T getValueOfT() {
		return this.t;
	}
	
	public void setValueOfT(T newt) {
		this.t = newt;
	}

	public <V extends Number> int compareTo(GenericTool<V> o) {
		int n = 0;
		if(this.getValueOfT().longValue() > o.getValueOfT().longValue()) {
			n = 1;
		} else if (this.getValueOfT().longValue() == o.getValueOfT().longValue()) {
			n = 0;
		} else if (this.getValueOfT().longValue() < o.getValueOfT().longValue()) {
			n = -1;
		}
		return n;
	}
}