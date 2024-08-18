import java.util.Scanner;

public class file{
	public static void main(String[] args){
		Scanner number = new Scanner(System.in);
			System.out.print("enter Number");
			int nomber = number.nextInt();
			
			if(nomber%2==0){
				System.out.println("The no is even");
					if(nomber%4==0){
					System.out.print("The no is even and divisible by 4");
						}
					else{
					System.out.print("the no is even but not divisible by 4");
						}
			}
			else{
			System.out.print("the no is odd");
			}
		}
	}