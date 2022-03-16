package exercicio3;

public class CalculoFatorial {
	
	public int SaberFatorial(int valor) {
		
		 int fator = 1;
		 
		 for(int i = 1; i <= valor; i++) {
			 
			 fator *= i;
		 }
	            
		 return fator;
	}
		

}
