package br.edu.insper.desagil.aula3;

import java.util.ArrayList;
import java.util.List;

public class Histograma {

	public List<Integer> calcula(List<Integer> numeros) {
		List<Integer> l = new ArrayList<>();
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
		l.add(0);
		for (int x : numeros ) {
			if (x == 0) {
				l.set(x, l.get(x)+1);
			}
			if (x == 1) {
				l.set(x, l.get(x)+1);
			}
			if (x == 2) {
				l.set(x, l.get(x)+1);
			}
			if (x == 3) {
				l.set(x, l.get(x)+1);
			}
			if (x == 4) {
				l.set(x, l.get(x)+1);
			}
			if (x == 5) {
				l.set(x, l.get(x)+1);
			}
			if (x == 6) {
				l.set(x, l.get(x)+1);
			}
			if (x == 7) {
				l.set(x, l.get(x)+1);
			}
			if (x == 8) {
				l.set(x, l.get(x)+1);
			}
			if (x == 9) {
				l.set(x, l.get(x)+1);
			}
			
		}

		return l;
	}

}
