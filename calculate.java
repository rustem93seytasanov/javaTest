public class calculate {
	public static void main (String[] arg){
		System.out.println("Claculating...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int sum = first+second;
		System.out.println("Sum = "+sum);
		int del = first/second;
		System.out.println ("Del = "+del);
		int raznost = first-second;
		System.out.println("Raznost =" + raznost);
		int umnoj = first*second;
		System.out.println("Umnojenie = "+umnoj);
		int stepen=first^second;
		System.out.println("Stepen = "+stepen);
}

}