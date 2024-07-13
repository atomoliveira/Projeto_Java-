package Lista_01;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ex08 {

	public static void main(String[] args) {
			
    var tcd = new Scanner(System.in);
			
	System.out.println("===================================");
	System.out.println("CONVERSOR DE kILOMETROS PARA MILHAS");
	System.out.println("====================================");
    System.out.println("Informe a velocidade em km/h");
			
		try {
				
				double velocKmH = tcd.nextDouble();
				double velocMiH = velocKmH / 1.609;
				
				NumberFormat nf = new DecimalFormat("#,##0.00");
				
				System.out.println("Velocidade em Milhas/h " + nf.format(velocMiH) );
				
			} catch (Exception e) {
				System.out.println("Falha :" + e.getMessage() );
			}
			
		}
		
	}