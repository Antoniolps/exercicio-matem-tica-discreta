import java.util.Scanner;

public class exercicios {
	
	public static void fatorial() {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor que deseja calcular: ");
		int numero = entrada.nextInt();
		double acumFat = numero;
		
		System.out.print(numero + "!=");
		System.out.print(numero);
		 
		while(numero > 1) {
			--numero;
			acumFat = acumFat * numero;
			System.out.print("*" + numero);
		}
		
		System.out.printf("= %.0f", acumFat);
		
		entrada.close();
	}
	
	public static void disciplinas() {
		Scanner entrada = new Scanner(System.in);
		String[] bd = new String[] {"SQL", "NoSQL", "GIS"};
		String[] ling = new String[] {"Python", "Java", "C", "PHP"};
		String[] engSoft = new String[] {"Métodos ágeis", "Processos de Software"};
		
		System.out.println("Combinacões possíveis: ");
		for(int i = 0; i < bd.length; i++) {
			for(int j = 0; j < ling.length; j++) {
				for(int k = 0; k < engSoft.length; k++) {
					System.out.println(bd[i] + ", " + ling[j] + ", " + engSoft[k]);
				}
			}
		}
		entrada.close();
	}
	
	public static void shows() {
		Scanner entrada = new Scanner(System.in);
		String[] safadao = new String[] {"Safadão românticas", "Safadão antigas", "Safadão carnaval", "Safadão modernas"};
		String[] cp = new String[] {"Calcinha preta nacional", "Calcinha preta internacional"};
		
		System.out.println("Combinacões possíveis: ");
		for(int i = 0; i < safadao.length; i++) {
			for(int j = 0; j < cp.length; j++) {
				System.out.println(safadao[i] + ", " + cp[j]);
			}
		}

		entrada.close();
	}
}
