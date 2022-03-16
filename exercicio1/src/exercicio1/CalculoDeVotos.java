package exercicio1;

public class CalculoDeVotos {
	
	private int EleitoresTotal;
	private int VotosValidos;
	private int VotosBrancos;
	private int VotosNulos;
	
	public void setEleitoresTotal(int EleitoresTotal) {
		this.EleitoresTotal = EleitoresTotal;
	}
	
	public void setVotosValidos(int VotosValidos) {
		this.VotosValidos = VotosValidos;
	}
	
	public void setVotosBrancos(int VotosBrancos) {
		this.VotosBrancos = VotosBrancos;
	}
	
	public void setVotosNulos(int VotosNulos) {
		this.VotosNulos = VotosNulos;
	}
	
	public int getEleitoresTotal() {
		return EleitoresTotal;
	}
	
	public int getVotosValidos() {
		return VotosValidos;
	}
	
	public int getVotosBrancos() {
		return VotosBrancos;
	}
	
	public int getVotosNulos() {
		return VotosNulos;
	}
	
	public double getPercentualVotosValidos() {
        return Double.valueOf(VotosValidos) / Double.valueOf(EleitoresTotal) * 100;
    } 
	
	public double getPercentualVotosBrancos() {
		return Double.valueOf(VotosBrancos) / Double.valueOf(EleitoresTotal) * 100;
	}
	
	public double getPercentualVotosNulos() {
		return Double.valueOf(VotosNulos) / Double.valueOf(EleitoresTotal) * 100;
	}

}
