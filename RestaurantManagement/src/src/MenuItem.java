package src;

import java.util.List;

import javax.swing.JOptionPane;

public class MenuItem {
	public   int stock;
	public int price;
	public String name;
	public int decreasedstock;
	public MenuItem(int stock, int price,String name) {

		this.stock = stock;
		this.price = price;
		this.name=name;
		decreasedstock=stock;
	}
	
	public void decreaseStock() {
			if (stock>0) {
				
			decreasedstock=decreasedstock-1;
			}
			else {
				JOptionPane.showMessageDialog(null, "No stock left! ");
			}

	}
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public  int getdecreasedStock() {
		return decreasedstock;
	}

	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public boolean available() {
		if(decreasedstock>0) return true;
		else {
			
			return false;
		}
	}
	

}
