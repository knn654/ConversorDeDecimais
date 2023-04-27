package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {
	
	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número desejado: "));
		if (num > 1000) {
			System.out.println("Número inválido digitado!!!");
		} else {
			System.out.println(ConverteController.decToBin(num));
		}
	}
}
