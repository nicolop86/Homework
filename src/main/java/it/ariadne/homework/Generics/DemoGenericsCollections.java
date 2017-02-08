package it.ariadne.homework.Generics;

import java.util.ArrayList;
import java.util.List;

public class DemoGenericsCollections {

	public static void main(String[] args) {
		List<NaturalNumber> ln = new ArrayList<NaturalNumber>();
		ln.add(new NaturalNumber(13));
		ln.add(new NaturalNumber(14));
		ln.add(new NaturalNumber(15));
		List<EvenNumber> le = new ArrayList<EvenNumber>();
		le.add(new EvenNumber(2));
		le.add(new EvenNumber(6));
		le.add(new EvenNumber(10));
		//List<? extends NaturalNumber> lultima = le;
		// lultima.add(new EvenNumber(20));
		//lultima.add(null);
		ListOfEven<EvenNumber> listOfEven = new ListOfEven<EvenNumber>(le); 
		System.out.println(listOfEven.numberOfElements());
		
		NaturalNumber[] arrayOfNatural = {new NaturalNumber(9), new NaturalNumber(10),
				new NaturalNumber(11)};
		for(int i = 0; i<arrayOfNatural.length; i++){
			System.out.println(arrayOfNatural[i].getNumber());
		};
		
		Algorithm.swap(arrayOfNatural, 0, 1);
		for(int i = 0; i<arrayOfNatural.length; i++){
			System.out.println(arrayOfNatural[i].getNumber());
		};
	}

}

class NaturalNumber {
	
	private int i;
	
	public NaturalNumber(int i) {
		this.i = i;
	}
	
	public int getNumber() {
		return this.i;
	}

}

class EvenNumber extends NaturalNumber {
	
	public EvenNumber(int i) {
		super(i);
	}
	
}

class ListOfEven <T extends NaturalNumber> {
	
	List<T> list;
	
	public ListOfEven (List<T> list) {
		this.list = list;
	}
	
	public int numberOfElements() {
		int count = 0;
		for(int i = 0; i<list.size(); i++) {
			count++;
		}
		return count;
	}
}