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