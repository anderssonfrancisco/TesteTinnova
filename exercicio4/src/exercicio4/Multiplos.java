package exercicio4;

public class Multiplos {
	
	public int SomaMultiplos(int num) {
		
		int soma = 0;
		
		for(int i = 1; i < num; i++) {
			
			if(i % 3 == 0 || i % 5 == 0) {
				
				soma += i;
			}
		}
		
		return soma;
	}

}
