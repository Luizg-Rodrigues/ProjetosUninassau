package atividade06;

public class Main {
	
	public static void main(String[] args) {

		Celular celular = new celular ("Motorola");
	
		System.out.println(celular.getTipoAparelho());
		celular.carregar();
		System.out.println(celular.toString());
		System.out.println("Bateria: mAh" + celular.getMAH());
		System.out.println(celular.getModeloProcessador());
		System.out.println("Potencia: " + celular.getPotencia());
		System.out.println("Tela: " + celular.getTipoTela());
	
}

}
