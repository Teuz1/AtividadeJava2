import java.util.Scanner;

public class LacoDecisaoIf {

	/*
	 Operador Lógico E --> &&
	 E1		E2		Saída
	 V		V		V
	 V		F		F
	 F		V		F
	 F		F		F
	 
	 Operador Lógico OU --> ||
	 
	 E1		E2		Saída
	 V		V		V
	 V		F		V
	 F		V		V
	 F		F		F
	 */
	
public static void main(String[] args) {
		
		float n1,n2,n3,media;
		int x = 80;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		System.out.println("\nMédia Aritmética: "+media);//6,5
		System.out.printf("\nMédia aritmética: %.2f",media);
		
		if(media>=7 && media<=10) {
			System.out.println("\nAlune Aprovade!!!");
		}else if(media>=5 && media<7) {
			System.out.println("\nAlune de Exame!!!");
		}else {
			System.out.println("\nAlune Reprovade!!!");
		}
		
		if(x % 2 == 0) {
			System.out.println("\nO número "+x+" é par...");
		}else {
			System.out.println("\nO número "+x+" é ímpar...");
		}

	}


	

	
}
