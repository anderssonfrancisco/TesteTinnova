package exercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
	
	public List<Integer> sortear(List<Integer> array) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>(array);
		
		int cont = lista.size();
		
		do {
			for(int i = 0; i < lista.size(); i++) {
				if(i < lista.size() - 1) {
					Integer valor = lista.get(i);
					Integer proximoValor = lista.get(i + 1);
					if(valor > proximoValor) {
						Collections.swap(lista, i, i + 1);
					}
				}
			}
			
			cont -= 1;
		} while (cont >= 0);
		
		return lista;
		
	}
	
 
}
