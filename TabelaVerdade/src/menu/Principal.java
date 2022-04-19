package menu;

import java.util.Scanner;
public class Principal {
	
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		int opcao;
		
		do {
			System.out.println("\n:: Menu");
			System.out.println("   1 - Conjunção");
			System.out.println("   2 - Disjunção" );
			System.out.println("   3 - Implicação" );
			System.out.println("   4 - Bicondicional" );
			System.out.println("   0 - sair");
			
			System.out.print("\n   Opção? ");
			opcao = teclado.nextInt();
			teclado.nextLine(); 
			
			switch (opcao) {
			case 0:
				System.out.println("\n   Obrigado por usar o sistema!");
				break;
			case 1:
				conjuncao();
				break;
			case 2:
				disjuncao();	
				break;
			case 3:
				implicacao();
				break;	
			case 4:
				bicondicional();
				break;	
			default:
				System.out.println("\n   Opção inexistente!");
				break;
			}
			
		} while (opcao != 0);
	}

	public static void conjuncao() {
		Scanner teclado = new Scanner(System.in);
		String var1;
		String var2;
		Conjuncao c;
		System.out.println("    Conjunção");
		System.out.println("    Variavel 1");
		var1 = teclado.nextLine();
		System.out.println("    Variavel 2");
		var2 = teclado.nextLine();
		c = new Conjuncao(var1,var2);
		System.out.println("    |" + c.var1 + "|" + c.var2 + "|" + c.var1 +" ^ "+ c.var2+"|"  );
		System.out.println("    |v|v|  v  |" );
		System.out.println("    |v|f|  f  |" );
		System.out.println("    |f|v|  f  |" );
		System.out.println("    |f|f|  f  |" );
		
	}
	
	public static void disjuncao() {
		Scanner teclado = new Scanner(System.in);
		String var1;
		String var2;
		Disjuncao d;
		System.out.println("    Disjunção");
		System.out.println("    Variavel 1");
		var1 = teclado.nextLine();
		System.out.println("    Variavel 2");
		var2 = teclado.nextLine();
		d = new Disjuncao(var1,var2);
		System.out.println("    |" + d.var1 + "|" + d.var2 + "|" + d.var1 +" v "+ d.var2+"|"  );
		System.out.println("    |v|v|  v  |" );
		System.out.println("    |v|f|  v  |" );
		System.out.println("    |f|v|  v  |" );
		System.out.println("    |f|f|  f  |" );
		
	}
	
	public static void implicacao() {
		Scanner teclado = new Scanner(System.in);
		String var1;
		String var2;
		Implicacao i;
		System.out.println("    implicação");
		System.out.println("    Variavel 1");
		var1 = teclado.nextLine();
		System.out.println("    Variavel 2");
		var2 = teclado.nextLine();
		i = new Implicacao(var1,var2);
		System.out.println("    |" + i.var1 + "|" + i.var2 + "|" + i.var1 +" -> "+ i.var2+"|"  );
		System.out.println("    |v|v|   v  |" );
		System.out.println("    |v|f|   f  |" );
		System.out.println("    |f|v|   v  |" );
		System.out.println("    |f|f|   v  |" );
		
	}
	
	public static void bicondicional() {
		Scanner teclado = new Scanner(System.in);
		String var1;
		String var2;
		Bicondicional b;
		System.out.println("    Bicondicional");
		System.out.println("    Variavel 1");
		var1 = teclado.nextLine();
		System.out.println("    Variavel 2");
		var2 = teclado.nextLine();
		b = new Bicondicional(var1,var2);
		System.out.println("    |" + b.var1 + "|" + b.var2 + "|" + b.var1 +" <-> "+ b.var2+"|"  );
		System.out.println("    |v|v|   v   |" );
		System.out.println("    |v|f|   f   |" );
		System.out.println("    |f|v|   f   |" );
		System.out.println("    |f|f|   v   |" );
		
	}
}
