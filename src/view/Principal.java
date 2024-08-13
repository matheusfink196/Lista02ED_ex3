package view;
import controller.vetController;
public class Principal {
	public static void main(String args []) {
		vetController vcon = new vetController();
		
		int tamanho = 5;
		int[]vetor = {10,5,20,13,22};
		int cont = 0;
		int resul = vcon.contagem(tamanho-1, vetor, cont);
		System.out.println("numero de pares: " +resul);
		
	}
}
