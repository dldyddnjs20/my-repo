import java.util.ArrayList;


class Fruit2               {public String toString() {return "Fruit";}}
class Apple2 extends Fruit2{public String toString() {return "Apple";}}
class Grape2 extends Fruit2{public String toString() {return "Grape";}}

class Juice {
	String name;
	Juice (String name){this.name = name + "juice";}
	public String toString() {return name;}
}
class Juicer{
	static Juice MakeJuice(FruitBox2<? extends Fruit2>box) {
		String tmp="";
		
		for(Fruit2 f:box.getList()) {
			tmp += f + " ";}
		return new Juice(tmp);
	}
}

class FruitBox2<T extends Fruit2>extends Box2<T>{}

class Box2<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get (int i) {return list.get(i);}
	ArrayList<T> getList(){return list;}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}

public class Exam074_class_GenericType3 {
	public static void main(String[] args) {
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());
		
		
	    System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(Juicer.MakeJuice(fruitBox));
		System.out.println(Juicer.MakeJuice(appleBox));
	}

}


