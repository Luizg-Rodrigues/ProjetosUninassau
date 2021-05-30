package atividade06;

public class Celular implements Processador, Aparelho, Bateria {
	
	private boolean carregado;
	private int porcentagem;
	private String marca; 
	
	
	
	public Celular(String marca) {
		this.setCarregado(false);
		this.setMarca(marca);
		this.setPorcentagem(0);
	}
	
	
	
	@Override
	public int getMAH() {
		return 8800;
	}

	@Override
	public void carregar() {
		System.out.println("Celular carregado!");
		this.setCarregado(true);
		this.setPorcentagem(100);
	}

	@Override
	public int porcentagem() {
		return this.getPorcentagem();
	}

	@Override
	public String getTipoTela() {
		return "LTPS";
	}

	@Override
	public String getTipoAparelho() {
		return "Celular";
	}

	@Override
	public String getModeloProcessador() {
		return "Exynos 9609 Octa-Core";
	}

	@Override
	public String getPotencia() {
		return "2.2GHz";
	}

	public boolean getCarregado() {
		return carregado;
	}

	public void setCarregado(boolean carregado) {
		this.carregado = carregado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}



	public int getPorcentagem() {
		return porcentagem;
	}



	public void setPorcentagem(int porcentagem) {
		this.porcentagem = porcentagem;
	}



	@Override
	public String toString() {
		return "Celular [carregado=" + carregado + ", porcentagem=" + porcentagem + ", marca=" + marca
				+ "]";
	}

}
