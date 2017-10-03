import java.util.Scanner;  
public class ComparacionNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in); 
		
		System.out.println("Escribe el numero A");
		int a = lector.nextInt();
		
		System.out.println("Escribe numero B");
		int b = lector.nextInt(); 
		
		if (a > b){
			System.out.println("A es mayor que B");
		
		} else if(a==b){
			System.out.println("A es igual a B");
		} else
			System.out.println("A es menos que B");
		}
	}
