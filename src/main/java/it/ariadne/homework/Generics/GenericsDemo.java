package it.ariadne.homework.Generics;

public class GenericsDemo {

	public static void main(String[] args) {
		GenericTool<Integer> gt = new GenericTool<Integer>(18);
		System.out.println(gt.getValueOfT());

		GenericTool<Float> anothergt = new GenericTool<Float>(18.0f);
		System.out.println(anothergt.getValueOfT());

		int n;
		n = gt.compareTo(anothergt);
		System.out.println("Result of compare method: " + n);
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

	public <V extends Number> int compareTo(GenericTool<V> o) {
		int n = 0;
		if(this.getValueOfT().doubleValue() > o.getValueOfT().doubleValue()) {
			n = 1;
		} else if (this.getValueOfT().doubleValue() == o.getValueOfT().doubleValue()) {
			n = 0;
		} else if (this.getValueOfT().doubleValue() < o.getValueOfT().doubleValue()) {
			n = -1;
		}
		return n;
	}
}