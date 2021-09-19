package br.com.alura.exercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestaMap {

    public static void main(String[] args) {

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        
        nomesParaIdade.keySet().forEach(key -> {
        	System.out.println(key);
        });
        
        nomesParaIdade.values().forEach(value -> {
        	System.out.println(value);
        });
        
        Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
        for (Entry<String, Integer> entry : associacoes) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
    }
}