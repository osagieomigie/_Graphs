public class Stack{
	int top;
	int [] list;

	public Stack(){
		top = -1;
		list = new int[50];
	}

	public void push(int aValue){
		list[++top] = aValue;
	}

	public int pop(){
		int temp = list[top--];
		return temp; 
	}

	public int peek(){
		return list[top];
	}

	public boolean isEmpty(){
		if (top == -1){
			return true;
		}
		else{
			return false; 
		}
	}
}