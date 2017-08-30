/**
класс реализует калькулятор
*/
public class calculator {
	/**
	результаты вычисления
	*/
	private int result;
	/**
	сумируем аргументы
	*/
	public void add (int ... params){
		for (Integer param : params){
			this.result += param;
		}
	}
	/**
	умножение
	*/
	public void umnoj (int first, int second){
		
		this.result=first*second;
		
	}
	/**
	деление
	*/
	public void div (int first, int second){
		//проверка деления на 0, в результате будет 0
		if(second!=0){
		this.result=first/second;
	}
	else{
		this.result=0;
	}
	
	}
	public void razn (int first, int second){
		this.result = first-second;
	}
	/**
	получить результаты
	@return результат вычисления
	*/
	public int getResult (){
		return this.result;
	}
	/**
	очистить результат
	*/
	public void cleanReasult(){
		this.result = 0;
	}
	
	
	
	
	
	
	
	
	
}