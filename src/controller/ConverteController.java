package controller;

import br.com.kaua.pilhaint.Pilha;

public class ConverteController {

	public static String decToBin(int num) {
		StringBuilder numDec = new StringBuilder("Número " + num + " em binário: ");
		Pilha p = new Pilha();
		do {
			int resto = num % 2;
			p.push(resto);
			num = num/2;
		} while (num > 0);
		do {
			int i = 0;
			int j = p.size();
			try {
				numDec.append(p.top());
				p.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
			i++;
		} while (p.size() != 0);
		
		return numDec.toString();
	}
}
