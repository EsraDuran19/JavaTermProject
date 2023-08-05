package src;
/* *********** Pledge of Honor ***************************************************************************
* I hereby certify that I have completed this programming project on my own
* without any help from anyone else. The effort in the project thus belongs
* completely to me. I did not search for a solution, or I did not consult to any program
* written by other students or did not copy any program from other sources. I read and 
* followed the guidelines provided in the project description.
*
*
* SIGNATURE: Esra Duran,71694
* 
************************************************************************************************************/

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import java.awt.Image;

public class Project extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project frame = new Project();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * @param Nametext 
	 * @param numtext 
	 * @throws IOException 
	 */
	
	
	public Project() throws Exception {

		List<String> orders= new ArrayList<>();
		
	
		ArrayList<MenuItem > menuitemList= new ArrayList<>();
		MenuItem Ezogelin = new MenuItem(10,15,"Ezogelin");
		menuitemList.add(Ezogelin);
		MenuItem Tarhana = new MenuItem(5,15,"Tarhana");
		menuitemList.add(Tarhana);
		MenuItem Yayla = new MenuItem(8,15,"Yayla");
		menuitemList.add(Yayla);
		MenuItem Mercimek= new MenuItem(4,15,"Mercimek");
		menuitemList.add(Mercimek);
		MenuItem Tavuksuyu = new MenuItem(6,15,"Tavuksuyu");
		menuitemList.add(Tavuksuyu);
		
		
		MenuItem Cola = new MenuItem(50,6,"Cola");
		menuitemList.add(Cola);
		MenuItem  Water= new MenuItem(40,5,"Water");
		menuitemList.add(Water);
		MenuItem Coffee = new MenuItem(6,10,"Coffee");
		menuitemList.add(Coffee);
		MenuItem Tea = new MenuItem(100,6,"Tea");
		menuitemList.add(Tea);
		MenuItem  Ayran= new MenuItem(6,5,"Ayran");
		menuitemList.add(Ayran);
		
		MenuItem Meatball = new MenuItem(10,25,"Meatball");
		menuitemList.add(Meatball);
		MenuItem Kuru_Fasulye = new MenuItem(20,20,"Kuru Fasulye");
		menuitemList.add(Kuru_Fasulye);
		MenuItem Pasta = new MenuItem(10,15,"Pasta");
		menuitemList.add(Pasta);
		MenuItem Steak = new MenuItem(6,40,"Steak");
		menuitemList.add(Steak);
		MenuItem Chicken_Finger = new MenuItem(6,15,"Chicken Finger");
		menuitemList.add(Chicken_Finger);
		
		MenuItem Salad = new MenuItem(6,15,"Salad");
		menuitemList.add(Salad);
		MenuItem Sandwich = new MenuItem(6,15,"Sandwich");
		menuitemList.add(Sandwich);
		MenuItem Hamburger = new MenuItem(30,15,"Hamburger");
		menuitemList.add(Hamburger);
		MenuItem Pizza = new MenuItem(6,15,"Pizza");
		menuitemList.add(Pizza);
		MenuItem Cheese = new MenuItem(100,15,"Cheese");
		menuitemList.add(Cheese);
		
		MenuItem Künefe = new MenuItem(18,20,"Künefe");
		menuitemList.add(Künefe);
		MenuItem Baklava = new MenuItem(6,15,"Baklava");
		menuitemList.add(Baklava);
		MenuItem Tiramisu = new MenuItem(6,15,"Tiramisu");
		menuitemList.add(Tiramisu);
		MenuItem Kek = new MenuItem(6,10,"Kek");
		menuitemList.add(Kek);
		MenuItem Kurabiye = new MenuItem(15,5,"Kurabiye");
		menuitemList.add(Kurabiye);
		
	
		
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1243, 726);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 203, 812, 486);
		contentPane.add(tabbedPane);
		
		Image resim=new ImageIcon(Project.class.getResource("/imageRes.jpg")).getImage();
		Image resim1=new ImageIcon(Project.class.getResource("/resim1.jpg")).getImage();

		
		Image img=new ImageIcon(Project.class.getResource("/soup.jpg")).getImage();
		Image img1=new ImageIcon(Project.class.getResource("/drink.jpg")).getImage();
		Image img2=new ImageIcon(Project.class.getResource("/MainMeal.jpg")).getImage();
		Image img3=new ImageIcon(Project.class.getResource("/Appetizer.jpg")).getImage();
		Image img4=new ImageIcon(Project.class.getResource("/dessert.jpg")).getImage();
		
		
		
		
		
		File file = new File("Customers.txt");
        if (!file.exists()) {
            try {
				file.createNewFile();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
        }
		
		
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Customer", null, panel, null);
		panel.setLayout(null);
		
		

		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(301, 69, 99, 22);
		panel.add(menuBar);
		
		JMenu Menubutton = new JMenu("Menu");
		
		Menubutton.setBounds(301, 30, 113, 27);
		
		
		
		
	
	
		JMenu subMenu = new JMenu("Soup");
		JMenu subMenu1 = new JMenu("Drinks");
		JMenu subMenu2 = new JMenu("Main Meal");
		JMenu subMenu3 = new JMenu("Appetizer");
		JMenu subMenu4 = new JMenu("Desserts");
		
		subMenu.setIcon(new ImageIcon(img));
		subMenu1.setIcon(new ImageIcon(img1));
		subMenu2.setIcon(new ImageIcon(img2));
		subMenu3.setIcon(new ImageIcon(img3));
		subMenu4.setIcon(new ImageIcon(img4));
		
			
			JCheckBoxMenuItem soup1 = new JCheckBoxMenuItem("Ezogelin 15TL");
			JCheckBoxMenuItem soup2 = new JCheckBoxMenuItem("Tarhana 15TL");
			JCheckBoxMenuItem soup3 = new JCheckBoxMenuItem("Yayla 15TL");
			JCheckBoxMenuItem soup4 = new JCheckBoxMenuItem("Mercimek 15TL");
			JCheckBoxMenuItem soup5 = new JCheckBoxMenuItem("Tavuksuyu 15TL");
			
			
			JCheckBoxMenuItem drink1 = new JCheckBoxMenuItem("Cola 6TL");
			JCheckBoxMenuItem drink2 = new JCheckBoxMenuItem("Water 5TL");
			JCheckBoxMenuItem drink3 = new JCheckBoxMenuItem("Coffee 10TL");
			JCheckBoxMenuItem drink4 = new JCheckBoxMenuItem("Tea 6TL");
			JCheckBoxMenuItem drink5 = new JCheckBoxMenuItem("Ayran 5TL");
			
			JCheckBoxMenuItem MainMeal1 = new JCheckBoxMenuItem("Meatball 25TL");
			JCheckBoxMenuItem MainMeal2 = new JCheckBoxMenuItem("Kuru Fasulye 20TL");
			JCheckBoxMenuItem MainMeal3 = new JCheckBoxMenuItem("Pasta 15TL");
			JCheckBoxMenuItem MainMeal4 = new JCheckBoxMenuItem("Steak 40TL");
			JCheckBoxMenuItem MainMeal5 = new JCheckBoxMenuItem("Chicken Finger 15TL");
			
			JCheckBoxMenuItem Appetizer1 = new JCheckBoxMenuItem("Salad 15TL");
			JCheckBoxMenuItem Appetizer2 = new JCheckBoxMenuItem("Sandwich 15TL");
			JCheckBoxMenuItem Appetizer3 = new JCheckBoxMenuItem("Hamburger 15TL");
			JCheckBoxMenuItem Appetizer4 = new JCheckBoxMenuItem("Pizza 15TL");
			JCheckBoxMenuItem Appetizer5 = new JCheckBoxMenuItem("Cheese 15TL");
			
			JCheckBoxMenuItem Dessert1 = new JCheckBoxMenuItem("Künefe 20TL");
			JCheckBoxMenuItem Dessert2 = new JCheckBoxMenuItem("Baklava 15TL");
			JCheckBoxMenuItem Dessert3 = new JCheckBoxMenuItem("Tiramisu 15TL");
			JCheckBoxMenuItem Dessert4 = new JCheckBoxMenuItem("Kek 10TL");
			JCheckBoxMenuItem Dessert5 = new JCheckBoxMenuItem("Kurabiye 5TL");
			
		JCheckBoxMenuItem[] menuListJCheck=  {soup1,soup2,soup3,soup4,soup5,drink1,drink2,drink3,drink4,drink5,MainMeal1,MainMeal2,MainMeal3,MainMeal4,MainMeal5,
							Appetizer1,Appetizer2,Appetizer3,Appetizer4,Appetizer5,Dessert1,Dessert2,Dessert3,Dessert4,Dessert5};
					
			subMenu.add(soup1);
			soup1.setVisible(Ezogelin.available());
			subMenu.add(soup2);
			soup2.setVisible(Tarhana.available());
			subMenu.add(soup3);
			soup3.setVisible(Yayla.available());
			subMenu.add(soup4);
			soup4.setVisible(Mercimek.available());
			subMenu.add(soup5);
			soup5.setVisible(Tavuksuyu.available());
			
			subMenu1.add(drink1);
			drink1.setVisible(Cola.available());
			subMenu1.add(drink2);
			drink2.setVisible(Water.available());
			subMenu1.add(drink3);
			drink3.setVisible(Coffee.available());
			subMenu1.add(drink4);
			drink4.setVisible(Tea.available());
			subMenu1.add(drink5);
			drink5.setVisible(Ayran.available());
			
			subMenu2.add(MainMeal1);
			MainMeal1.setVisible(Meatball.available());
			subMenu2.add(MainMeal2);
			MainMeal2.setVisible(Kuru_Fasulye.available());
			subMenu2.add(MainMeal3);
			MainMeal3.setVisible(Pasta.available());
			subMenu2.add(MainMeal4);
			MainMeal4.setVisible(Steak.available());
			subMenu2.add(MainMeal5);
			MainMeal5.setVisible(Chicken_Finger.available());
			
			subMenu3.add(Appetizer1);
			Appetizer1.setVisible(Salad.available());
			subMenu3.add(Appetizer2);
			Appetizer2.setVisible(Sandwich.available());
			subMenu3.add(Appetizer3);
			Appetizer3.setVisible(Hamburger.available());	
			subMenu3.add(Appetizer4);
			Appetizer4.setVisible(Pizza.available());
			subMenu3.add(Appetizer5);
			Appetizer5.setVisible(Cheese.available());
			
			subMenu4.add(Dessert1);
			Dessert1.setVisible(Künefe.available());
			subMenu4.add(Dessert2);
			Dessert2.setVisible(Baklava.available());
			subMenu4.add(Dessert3);
			Dessert3.setVisible(Tiramisu.available());
			subMenu4.add(Dessert4);
			Dessert4.setVisible(Kek.available());
			subMenu4.add(Dessert5);
			Dessert5.setVisible(Kurabiye.available());
			
			
			
			
			

			Menubutton.add(subMenu);
			Menubutton.add(subMenu1);
			Menubutton.add(subMenu2);
			Menubutton.add(subMenu3);
			Menubutton.add(subMenu4);
			

			menuBar.add(Menubutton);
			
			


			JLabel Name = new JLabel("Name");
			Name.setBounds(28, 152, 49, 14);
			panel.add(Name);
			
			JLabel numPeople = new JLabel("Number of People");
			numPeople.setBounds(28, 177, 138, 14);
			panel.add(numPeople);
			
			JLabel Age = new JLabel("Age");
			Age.setBounds(28, 202, 47, 17);
			panel.add(Age);
			
			JTextField Nametext = new JTextField();
			Nametext.setBounds(176, 147, 96, 20);
			panel.add(Nametext);
			Nametext.setColumns(10);
			
			JTextField numtext = new JTextField();
			numtext.setBounds(176, 174, 96, 20);
			panel.add(numtext);
			numtext.setColumns(10);
			
			JTextField Agetext = new JTextField();
			Agetext.setBounds(176, 199, 96, 20);
			panel.add(Agetext);
			Agetext.setColumns(10);
			
			
			ArrayList<JRadioButton> tableList= new ArrayList<>();
			
			ArrayList<String> tableList1= new ArrayList<>();
			
			
			JRadioButton table2 = new JRadioButton("Table 2(1-2 people)");
			table2.setBounds(576, 80, 147, 23);
			table2.setActionCommand("Table 2");
			panel.add(table2);
			
			
			JRadioButton table1 = new JRadioButton("Table 1(1-2 people)");
			table1.setBounds(576, 40, 147, 23);
			table1.setActionCommand("Table 1");
			panel.add(table1);
			
			JRadioButton table3 = new JRadioButton("Table 3(3-4 people)");
			table3.setBounds(576, 131, 147, 23);
			table3.setActionCommand("Table 3");
			panel.add(table3);
			
			JRadioButton table4 = new JRadioButton("Table 4(3-4 people)");
			table4.setBounds(576, 177, 147, 23);
			table4.setActionCommand("Table 4");
			panel.add(table4);
			
			JRadioButton table5 = new JRadioButton("Table 5(5-6 people)");
			table5.setBounds(576, 227, 147, 23);
			table5.setActionCommand("Table 5");
			panel.add(table5);
			
			tableList.add(table5); 
			tableList.add(table4); 
			tableList.add(table3); 
			tableList.add(table2);
			tableList.add(table1);
			table1.setVisible(tableAvailable(table1,tableList));
			table2.setVisible(tableAvailable(table2,tableList));
			table3.setVisible(tableAvailable(table3,tableList));
			table4.setVisible(tableAvailable(table4,tableList));
			table5.setVisible(tableAvailable(table5,tableList));
			
			
			tableList1.add(table1.getActionCommand());
			tableList1.add(table2.getActionCommand());
			tableList1.add(table3.getActionCommand());
			tableList1.add(table4.getActionCommand());
			tableList1.add(table5.getActionCommand());
			



			ButtonGroup bg= new ButtonGroup(); 
			bg.add(table1); 
			bg.add(table2); 
			bg.add(table3); 
			bg.add(table4); 
			bg.add(table5); 
			
			
			
			
			 JLabel customerLabel = new JLabel("Your Order");
			 customerLabel.setBounds(18, 299, 779, 14);
			 panel.add(customerLabel);
			 
			JButton Button = new JButton("Complete reservation");
			Button.setBounds(253, 245, 180, 23);
			panel.add(Button);
			
 		Button.addActionListener(new ActionListener() {
 	
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				ArrayList<String> orderedmeals= new ArrayList<>();
 				int totalprice=0;
 				if (tableList1.size()==0) {
 					JOptionPane.showMessageDialog(null, "There is no empty table! ");
 				}
 				if (bg.getSelection()==null) {
 					JOptionPane.showMessageDialog(null, "Please choose a table! ");
 				}
 				else if (Nametext.getText().isEmpty() || numtext.getText().isEmpty() || Agetext.getText().isEmpty()) {
 					JOptionPane.showMessageDialog(null, "Please fill all the blanks! ");
 					
 				}
 				
 				
 				
 				
 				else {

 				
 					
	 					Integer numPeopleInt=Integer.parseInt(numtext.getText());
	 					
	 					if ((numPeopleInt<=2 &&  (bg.getSelection().getActionCommand()=="Table 1"||bg.getSelection().getActionCommand()=="Table 2" ))
	 							||(numPeopleInt<=4 && numPeopleInt>2 &&(bg.getSelection().getActionCommand()=="Table 3"||bg.getSelection().getActionCommand()=="Table 4" ))
	 							||(numPeopleInt>=5 &&  (bg.getSelection().getActionCommand()=="Table 5")) ){
 					
 					int selected=0;
 					for(int i=0; i<menuListJCheck.length;i++) {
 						if (menuListJCheck[i].isSelected()){
 							orderedmeals.add(menuitemList.get(i).getName());
 							menuitemList.get(i).decreaseStock();
 							menuListJCheck[i].setEnabled(menuitemList.get(i).available());
 							menuListJCheck[i].setSelected(false);
 							totalprice+=menuitemList.get(i).getPrice();
 							selected++;	
 							
 							}
 						}
 						if (selected!=0) {
 	 						
 		 					
 					 			customerLabel.setText("You chose "+bg.getSelection().getActionCommand()
 					 							+ ".  Order: "+orderedmeals.toString() + " Total Price: "+totalprice +" TL"
 					 							);
 					 			
 					 			Customer customer =new Customer(Nametext.getText(),Integer.parseInt(Agetext.getText()),totalprice,bg.getSelection().getActionCommand());
 		 						tableList1.remove(bg.getSelection().getActionCommand());
 		 						bg.getSelection().setEnabled(false);
 		 						bg.clearSelection();
 		 						
 		 						
 		 						customer.setTotalPrice(totalprice);
 		 						orders.add(customer.getAge()+"-"+customer.getName()+"-"+customer.getTotalPrice()+"-"+customer.getTable());
 		 						
 		 						Nametext.setText("");
 		 						Agetext.setText("");
 		 						numtext.setText("");
 		 						
 		 						FileWriter fileWriter;
 		 						try {
 		 							fileWriter = new FileWriter(file, true);
 		 							BufferedWriter bWriter = new BufferedWriter(fileWriter);
 		 							bWriter.write(customer.toString()+"\n");
 		 							
 		 							
 		 							 bWriter.close();
 		 						} catch (IOException e2) {
 		 							
 		 							e2.printStackTrace();
 		 						}
 		 				        
 						}
 		 					
 						
 		 					else {
 		 							JOptionPane.showMessageDialog(null, "Please select at least item from menu!");

 		 					}
	 					
	 				
	 					
 				}			
 							else {
 		 						JOptionPane.showMessageDialog(null, "This table is not suitable for you!");
 		 					
 		 						}	
 				
 				}
 			}
 			
 			
 		});
		

				
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Management", null, panel_1, null);
		panel_1.setLayout(null);
	
		              
		
		JButton orderButton = new JButton("Show info");
		orderButton.setBounds(265, 16, 198, 50);
		panel_1.add(orderButton);
			
			
			

			
		
		JLabel label2 = new JLabel("");
		label2.setBounds(33, 11, 592, 189);
		contentPane.add(label2);
		label2.setIcon(new ImageIcon(resim));
		
		JLabel label = new JLabel("");
		label.setBounds(819, 11, 382, 249);
		contentPane.add(label);
		
		label.setIcon(new ImageIcon(resim1));
		
	
		
		
		
	
		
		

		
		orderButton.addActionListener(new ActionListener()    {
		
			@Override
			public void actionPerformed(ActionEvent e){
					
				Collections.sort(orders);
				
				for (int i=0;i<orders.size()-1;i++) {
					System.out.println();
					if (Integer.parseInt(orders.get(i).split("-")[0])==Integer.parseInt(orders.get(i+1).split("-")[0])) {
						System.out.println("jer");
						if (Integer.parseInt(orders.get(i).split("-")[2]) < Integer.parseInt(orders.get(i+1).split("-")[2])) {
							String a=orders.get(i);
							orders.set(i, orders.get(i+1));
							orders.set(i+1, a);
						}
					}
					
				}
				String[][] data= new String[orders.size()][4];
				String[] colNames= {"Age","Name","Total Price","Table"};
				for(int i=0;i<orders.size();i++) {
					String[] a=orders.get(i).split("-");
					data[i]=a;
					
					
				}
				JTable jtable = new JTable(data,colNames);
				jtable.setLocation(26, 81);
				jtable.setSize(376,342);
				
				panel_1.add(jtable);
				JScrollPane scr0= new JScrollPane(jtable);
				scr0.setBounds(-2,77,379,359);
				panel_1.add(scr0);
				
				
				String[][] stockData= new String[25][3];
		String[] columnNames = {"Item","Stock","Ordered"};
		for(int i=0; i<menuitemList.size();i++) {
			
			String[] b={menuitemList.get(i).getName(),String.valueOf(menuitemList.get(i).getdecreasedStock()),String.valueOf(menuitemList.get(i).getStock()-menuitemList.get(i).getdecreasedStock())};
			stockData[i]= b;
		}
		JTable stocktable= new JTable(stockData,columnNames);
		stocktable.setSize(187, 431);
		stocktable.setLocation(610, 16);
		panel_1.add(stocktable);
		JScrollPane scr =new JScrollPane(stocktable);
		scr.setBounds(398, 77, 407, 359);
		panel_1.add(scr);
							
			}
		
		});
		
	}
	public boolean tableAvailable1(JRadioButton table, ArrayList<String> tablelistStr){
		
		if (tablelistStr.contains(table.getActionCommand())){
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean tableAvailable(JRadioButton table, ArrayList<JRadioButton> tablelist){
		
		if (tablelist.contains(table)){
			return true;
		}
		else {
			return false;
		}
	}
}
