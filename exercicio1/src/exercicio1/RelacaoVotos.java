package exercicio1;

public class RelacaoVotos {
	
	public static void main(String[] args) {
		
		CalculoDeVotos resultado = new CalculoDeVotos();
		
		resultado.setEleitoresTotal(1000);
		resultado.setVotosValidos(800);
		resultado.setVotosBrancos(150);
		resultado.setVotosNulos(50);
		
		System.out.println("O percentual de validos �: " + resultado.getPercentualVotosValidos() + "%");
		
		System.out.println("O percentual de brancos �: " + resultado.getPercentualVotosBrancos() + "%");
		
		System.out.println("O percentual de nulos �: " + resultado.getPercentualVotosNulos() + "%");
	}

}
