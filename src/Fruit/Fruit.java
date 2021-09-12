package Fruit;
import java.util.Comparator;

public class Fruit {

int no;
String name;
int price;

	Fruit(int no, String name, int price) {
	this.no = no;
	this.name = name;
	this.price = price;
	
	}
	 public int compare(Fruit s) {
		  return name.compareTo(s.name);
	}
	 @Override
		public String toString() {
			return "Fruit [ no = "+ no+" name=" + name + " price = "+price+ "]";
		}
}
	
	

