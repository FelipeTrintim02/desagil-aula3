package br.edu.insper.desagil.aula3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Nomes {

	public Map<String, List<String>> inverte(Map<String, List<String>> d) {
		Map<String, List<String>> nomes = new HashMap<>();

		for (String nome : d.keySet()) {
			List<String> sobrenomes = d.get(nome);
			for(String sobrenome : sobrenomes) {
				if (!nomes.containsKey(sobrenome)) {
					List<String> l = new ArrayList<>();
					nomes.put(sobrenome, l);
					
				}
				nomes.get(sobrenome).add(nome);
			}
		}

		return nomes;
	}

}
