package src;

public class Customer {
	public String name;
	public int age;
	public int totalPrice;
	public String table;
	public Customer(String name, int age, int totalPrice, String table) {
		this.name = name;
		this.age = age;
		this.totalPrice = totalPrice;
		this.table=table;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	@Override
	public String toString() {
		return "Customer name= " + name + ", age= " + age + " , totalPrice= " + totalPrice +", Table= " + table
				
			;
	}
	public String getTable() {
		return table;
	}
	public void setTable(String table) {
		this.table = table;
	}
	
}
