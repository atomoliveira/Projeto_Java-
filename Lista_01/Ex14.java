package Lista_01;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
	 double total, desconto, totalDesconto, valorPago, troco;
				// objetos
				Scanner teclado = new Scanner(System.in);
				DecimalFormat formatador = new DecimalFormat("#0.00");
				// entrada
				System.out.println("PDV");
				System.out.print("Valor total: ");
				total = teclado.nextDouble();
				System.out.print("Desconto(%): ");
				desconto = teclado.nextDouble();
				// processamento
				totalDesconto = total - (desconto * total) / 100;
				// saida
				System.out.println("Total com desconto: R$ " + totalDesconto);
				System.out.print("Valor pago em dinheiro: ");
				valorPago = teclado.nextDouble();
				troco = valorPago - totalDesconto;
				System.out.println("Troco: R$ " + formatador.format(troco));
				teclado.close();
			}
		}
	


