public class Queue{
	int head;
	int tail;
	int [] list;

	Queue(){
		list = new int[31];
		head = -1;
		tail = -1;
	}

	Queue(int aList[]){
		list = new int[31];
		head = -1;
		tail = -1;
		for(int i =0; i < aList.length; i++){
			this.enqueue(aList[i]);
		}
	}

	public void enqueue(int aNode){
		if(head == -1){
			head = 0;
			tail = 0;
		}
		else{
			tail = tail + 1;
		}
		list[tail] = aNode;
	}

	public []int toArray(){
		return list; 
	}

	public int dequeue(){
		int temp = list[head];
		if(head == tail){
			head = -1;
			tail = -1;
		}

		else{
			head = head + 1;
		}

		return temp;
	}

	public boolean isEmpty(){
		if (head == -1){
			return true;
		}
		else{
			return false; 
		}
	}
}