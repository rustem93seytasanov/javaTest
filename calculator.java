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