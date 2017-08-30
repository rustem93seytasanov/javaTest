import java.util.Scanner;

public class InteractRunner {
	public static void main(String[] arg){
		Scanner reader = new Scanner (System.in);
		try {
			calculator calc = new calculator();
			String exit = "no";
			String deystvie;
			while (!exit.equals("yes")){
				System.out.println("Vvedite deystvie(+,-,/,*)");
				deystvie = reader.next();
				if("+".equals(deystvie)||"*".equals(deystvie)||"/".equals(deystvie)||"-".equals(deystvie))
				{
				System.out.println("Enter first arg : ");
				String first = reader.next();
				System.out.println("Enter second arg : ");
				String second = reader.next();
				if ("+".equals(deystvie))
				{
					calc.add(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result : "+calc.getResult());
				}
				
				else if ("*".equals(deystvie)){
					calc.umnoj(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result : "+calc.getResult());
				}
				else if ("/".equals(deystvie)){
					calc.div(Integer.valueOf(first), Integer.valueOf(second));			
					System.out.println("Result : "+calc.getResult());										
				}
				else if ("-".equals(deystvie)){
					calc.razn(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result : "+calc.getResult());	
				}
				
				calc.cleanReasult();
				System.out.println("Exit yes/no");
				exit = reader.next();
				}
				else{System.out.println("Operators error");}
			}
		} finally {
			reader.close();
		}
	}
}