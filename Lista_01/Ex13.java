package Lista_01;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Ex13 {

	public static void main(String[] args) {
		double hora, remuneracao, custo, cargaHoraria;
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		System.out.println("=======================================");
		System.out.println(" Calculo do valor da hora de um serviço ");
		System.out.println("=======================================");
		
		System.out.print("remuneração mensal pretendida: ");
		remuneracao = teclado.nextDouble();
		System.out.print("Custo operacional mensal: ");
		custo = teclado.nextDouble();
		System.out.print("Carga horaria mensal de trabalho: ");
		cargaHoraria = teclado.nextDouble();
	
		hora =(remuneracao +(remuneracao *0.3)+ custo +remuneracao *0.2)/cargaHoraria;
		System.out.println("O Valor da hora :" + formatador.format(hora));
		
		teclado.close();
		
		}

}
