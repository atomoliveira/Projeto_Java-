package Lista_01;

  import java.util.Scanner;

	public class Ex02 {

	    public static void main(String[] args) {
			  var entrada = new Scanner(System.in);
			  double cotacao_dolar, valor_dolar,valor_real;

			  System.out.println("==============================");
			  System.out.println("  Conversor de dólar em real  ");
			  System.out.println("==============================");
			  

			    System.out.println("Digite a cotação do dolar: ");
			    cotacao_dolar = entrada.nextDouble();

			    System.out.println("Digite o valor em dolar: ");
			    valor_dolar = entrada.nextDouble();

			    valor_real = cotacao_dolar * valor_dolar;

			    System.out.println("O Valor em reais é " + valor_real + "\n");
			        }
			}     
