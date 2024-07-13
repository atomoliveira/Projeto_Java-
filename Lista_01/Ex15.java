package Lista_01;
import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {

				var ler = new Scanner(System.in);
				
			       
		        int num,t, i;
		       
		        System.out.printf("Digite um número positivo: ");
		        num = ler.nextInt();
		        
		        while(num <= 0) {
		            System.out.printf("Erro, número negativo! Digite um número positivo: ");
		            num = ler.nextInt();
		        
		        }
		        

			        for (i=0; i<=10; i++) {
			        	
			        	
			            t = num * i;
			            System.out.printf("\n%d X %d = %d", num, i, t);
			        }
	     }
}
	
