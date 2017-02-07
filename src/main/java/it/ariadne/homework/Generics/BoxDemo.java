package it.ariadne.homework.Generics;
import java.util.List;
import java.util.ArrayList;

public class BoxDemo {

	  public static <U> void addBox(U u, 
	      List<Box<U>> boxes) {
	    Box<U> box = new Box<>();
	    box.set(u);
	    boxes.add(box);
	  }

	  public static <U> void outputBoxes(List<Box<U>> boxes) {
	    int counter = 0;
	    for (Box<U> box: boxes) {
	      U boxContents = box.get();
	      System.out.println("Box #" + counter + " contains [" +
	             boxContents.toString() + "]");
	      counter++;
	    }
	  }

	  public static void main(String[] args) {
	    ArrayList<Box<Number>> listOfIntegerBoxes =
	      new ArrayList<>();
	    BoxDemo.addBox(Integer.valueOf(10), listOfIntegerBoxes);
	    BoxDemo.addBox(Double.valueOf(20.1), listOfIntegerBoxes);
	    BoxDemo.addBox(Float.valueOf(30.2f), listOfIntegerBoxes);
	    BoxDemo.outputBoxes(listOfIntegerBoxes);
	  }
	}

class Box<T> {
    // T stands for "Type"
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}