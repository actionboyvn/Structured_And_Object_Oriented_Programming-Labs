package Zadanie1;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class Sniadanie {
	JFrame frame = new JFrame();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	ArrayList<JCheckBox> checkbox = new ArrayList<JCheckBox>();
	
	JButton buttonAccept = new JButton();
	JLabel messageAccept = new JLabel("                                                                                              ");
	JLabel reviewDishes = new JLabel(" ");
	JLabel reviewCost = new JLabel(" ");
	
	JLabel labelMenu = new JLabel();
	JLabel labelMeal = new JLabel();
	JLabel labelPay = new JLabel();
	JTextField textMeal = new JTextField(30);
	JTextField textPay = new JTextField(30);
	double sumPay = 0;
	String[] dishes = {"Rogalik", "Jajecznica", "Herbata", "Kawa", "Woda"};
	double[] cost =   {5, 15, 4, 6, 1.5};
	String newMeal = "";
	class ReactCheckBox implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int indeks = 0;
			for (int i = 0; i < checkbox.size(); i++)
				if (e.getSource() == checkbox.get(i)) indeks = i;
			if (checkbox.get(indeks).isSelected())
				sumPay += cost[indeks]; else sumPay -= cost[indeks];

			String sumPay_formated = String.format("%.2f", sumPay);
			textPay.setText(sumPay_formated);
			PrintMeal();
		}
	}
	class ReactButton implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (sumPay == 0) {
				messageAccept.setText("Prosze wybrac potrawy!");
				reviewDishes.setText("");
				reviewCost.setText("");
			}
			else {
				messageAccept.setText("Zamówione pomyślnie:");
				reviewDishes.setText("- Potrawy: " + newMeal);
				reviewCost.setText("- Kwota = " + String.format("%.2f", sumPay));
			}
		}
	}
	public void PrintMeal() {
		newMeal = "";
		for (int i = 0; i < checkbox.size(); i++)
			if (checkbox.get(i).isSelected()) newMeal += dishes[i] + ", ";
		textMeal.setText(newMeal);
	}
	public void GUI() {
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		labelMenu.setText("Menu");
		
		for (int i = 0; i < 5; i++) {
			JCheckBox thisCheckBox = new JCheckBox(dishes[i] + " - " + cost[i] + "zl");
			thisCheckBox.addActionListener(new ReactCheckBox());
			checkbox.add(thisCheckBox);
		}
		
		buttonAccept.setText("Akceptuj");
		buttonAccept.addActionListener(new ReactButton());
		
		panel1.add(labelMenu);
		
		for (int i = 0; i < checkbox.size(); i++)
			panel1.add(checkbox.get(i));
		
		panel1.add(buttonAccept);
		panel1.add(messageAccept);
		panel1.add(reviewDishes);
		panel1.add(reviewCost);
		
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		labelMeal.setText("Moje sniadanie");
		labelPay.setText("Kwota do zaplaty: ");
		textPay.setText("0.0");
		
		panel2.add(labelMeal);
		panel2.add(textMeal);
		panel2.add(labelPay);
		panel2.add(textPay);
		frame.getContentPane().add(BorderLayout.WEST, panel1);
		frame.getContentPane().add(BorderLayout.EAST, panel2);
		frame.setSize(1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Sniadanie");
		
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		Sniadanie projekt = new Sniadanie();
		projekt.GUI();
	}
}
