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
				/**
				проверка на правильность введенного оператора
				если оператор введен неправильно - программа не выполнит оперцаий
				и выведет сообщение об ошибке
				*/
				if("+".equals(deystvie)||"*".equals(deystvie)||"/".equals(deystvie)||"-".equals(deystvie))
				{
					/**
					ввод значений для арифметических операций
					*/
				System.out.println("Enter first arg : ");
				String first = reader.next();
				System.out.println("Enter second arg : ");
				String second = reader.next();
				/**
				вызов метода который осуществляет сложение
				вызов метода который возвращает результат
				выводит результат на экран
				*/
				if ("+".equals(deystvie))
				{
					calc.add(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result : "+calc.getResult());
				}
				/**
				вызов метода который осуществляет умножение
				вызов метода который возвращает результат
				выводит результат на экран
				*/
				else if ("*".equals(deystvie)){
					calc.umnoj(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result : "+calc.getResult());
				}
				/**
				вызов метода который осуществляет деление
				вызов метода который возвращает результат
				выводит результат на экран
				*/
				else if ("/".equals(deystvie)){
					calc.div(Integer.valueOf(first), Integer.valueOf(second));			
					System.out.println("Result : "+calc.getResult());										
				}
				/**
				вызов метода который осуществляет вычитание
				вызов метода который возвращает результат
				выводит результат на экран
				*/
				else if ("-".equals(deystvie)){
					calc.razn(Integer.valueOf(first), Integer.valueOf(second));
					System.out.println("Result : "+calc.getResult());	
				}
				/**
				очищает результат операции
				предлагает выйти из программы
				*/
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