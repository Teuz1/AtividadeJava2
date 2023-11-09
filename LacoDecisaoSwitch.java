	import java.util. Scanner;
	
	public class LacoDecisaoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
			
			int op;
			
			Scanner leia = new Scanner(System.in);
			System.out.println("\n\t\tMenu de Elogios");
			System.out.println("\n1- Família DETERMINADA");
			System.out.println("\n2- Família DEDICADA");
			System.out.println("\n3- Família ALEGRE");
			System.out.println("\n4- Família PERSISTENTE");
			System.out.println("\nEscolha a sua opção de elogio: ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				System.out.println("\nFamília DETERMINADA");
				break;
			case 2:
				System.out.println("\nFamília DEDICADA");
				break;
			case 3:
				System.out.println("\nFamília ALEGRE");
				break;
			case 4:
				System.out.println("\nFamília PERSISTENTE");
				break;
				default:
					System.out.println("\nOpção Inválida!!!");
			}

	
		
	}

	
	
	
}
