import java.util.Scanner;

	public class Hipotenusa2 {
			static Scanner leia = new Scanner(System.in);
				public static void main(String[] args) {

				calculo();
}
			
	 private static void calculo() {
		Hipotenusa h = new Hipotenusa();
		
			
		
		System.out.println("Digite o cateto oposto: ");
			h.co = leia.nextDouble();		
		System.out.println("Digite o cateto adjacente: ");
			h.ca = leia.nextDouble();	
			
			h.resul();	
}	
	
}