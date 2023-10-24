package calculos;

public class Principal {
	
	public static void main(String[] args) {
		
		Adicionar adicao = new Adicionar();
		System.out.println(adicao.somar(10, 25));
		
		
		Subtrair sub = new Subtrair();
		System.out.println(sub.sub(35, 15));
		
		Calcular multu = new Calcular();
		System.out.println(multu.multi(5, 8));
		
		Calcular div = new Calcular();
		System.out.println(div.div(18, 2));
		
		Expo ex = new Expo();
		System.out.println(ex.exp(2, 6));
		
	}
}
