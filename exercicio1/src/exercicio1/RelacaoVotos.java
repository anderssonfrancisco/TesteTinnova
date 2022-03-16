package exercicio1;

public class RelacaoVotos {
	
	public static void main(String[] args) {
		
		CalculoDeVotos resultado = new CalculoDeVotos();
		
		resultado.setEleitoresTotal(1000);
		resultado.setVotosValidos(800);
		resultado.setVotosBrancos(150);
		resultado.setVotosNulos(50);
		
		System.out.println("O percentual de validos é: " + resultado.getPercentualVotosValidos() + "%");
		
		System.out.println("O percentual de brancos é: " + resultado.getPercentualVotosBrancos() + "%");
		
		System.out.println("O percentual de nulos é: " + resultado.getPercentualVotosNulos() + "%");
	}

}
