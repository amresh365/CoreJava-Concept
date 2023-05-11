package paceqal;

import java.util.Objects;

class Laptop
{
	private int id;
	private String brand;
	public Laptop(int id, String brand) {
		this.id = id;
		this.brand = brand;
	}
	 
	@Override
	public int hashCode() {
		return Objects.hash(brand, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false; 
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(brand, other.brand) && id == other.id;
	}

	
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + "]";
	}

}
public class App {
	public static void main(String[] args) {
		
	Laptop laptop1=new Laptop(12,"Hp");	
	Laptop laptop2=new Laptop(13,"Dell");
	
	System.out.println(laptop1.equals(laptop2));
	
	int firstnumber=8;
	int secondnumber=8;
	
	System.out.println(firstnumber==secondnumber);
	
	String a="yes";
	String b="yesobps".substring(0,3);
	
	System.out.println(a==b);
	System.out.println(b);	
	}

}
