/**
����� ��������� �����������
*/
public class calculator {
	/**
	���������� ����������
	*/
	private int result;
	/**
	�������� ���������
	*/
	public void add (int ... params){
		for (Integer param : params){
			this.result += param;
		}
	}
	/**
	���������
	*/
	public void umnoj (int first, int second){
		
		this.result=first*second;
		
	}
	/**
	�������
	*/
	public void div (int first, int second){
		//�������� ������� �� 0, � ���������� ����� 0
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
	�������� ����������
	@return ��������� ����������
	*/
	public int getResult (){
		return this.result;
	}
	/**
	�������� ���������
	*/
	public void cleanReasult(){
		this.result = 0;
	}
	
	
	
	
	
	
	
	
	
}