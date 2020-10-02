package calcula;
import dominio.Programa;
import java.util.Scanner;

public class CalculaPrograma {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
	
		System.out.print("Digite o codigo: ");
		int codigo = leia.nextInt();
		
		System.out.print("Digite a quantidade: ");
		int quantidade = leia.nextInt();
		
		System.out.print("Digite o preço: ");
		float preco = leia.nextFloat();
		
		System.out.print("Digite a forma de pagamento\n"
				+ "1- Dinheiro\n"
				+ "2- Cheque\n"
				+ "3- Cartao de Debito\n"
				+ "4- Cartao de Credito\n"
				+ " : ");
		int pagamento = leia.nextInt();	
		
		double valorfinal = (quantidade*preco);
		double descdinheiro = (quantidade*preco)*0.1;
		double desccheque = (quantidade*preco)*0.02;
		double desccartao = (quantidade*preco)*0.05;
		

		if (pagamento == 1) {
			System.out.println("Valor do desconto: R$ "+descdinheiro);
			System.out.println("Valor Final: R$ "+(valorfinal - descdinheiro));
		}
		else if (pagamento == 2) {
			System.out.println("Valor do desconto: R$ "+desccheque);
			System.out.println("Valor Final: R$ "+(valorfinal - desccheque));
		}
		else if (pagamento == 3) {
			System.out.println("Valor do desconto: R$ "+desccartao);
			System.out.println("Valor Final: R$ "+(valorfinal - desccartao));
		}
		else if (pagamento == 4) {
			System.out.println("Valor do desconto: R$ "+desccartao);
			System.out.println("Valor Final: R$ "+(valorfinal - desccartao));
		}
		else if (pagamento > 4)	{
			System.out.println("Numero invalido, Repita a ação");
		}
		

}
}