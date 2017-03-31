import java.util.*;
public class BFS{

	private Queue queue;
	int [] path = new int[31]; 
	boolean []visited = new boolean[31];
	int index = 0;
	
	public BFS(){
		queue = new Queue();
	}

	/*public void bfs(int adj[][], int source){

		int numNode = adj[source].length-1;
		int []visited = new int[numNode +1];
		int i, element;
		visited[source] = 1;
		queue.enqueue(source);
		while (!queue.isEmpty()) {
			element = queue.dequeue();
			i = element;
			System.out.println(i + "\t");
			while(i <= numNode){
				if (adj[element][i] == 1 && visited[i] == 0){
					queue.enqueue(i);
					visited[i] =1;
				}
				i++;
			}
		}
	}*/

	public void bfs(int adj[][], int start, int end){
		int numNode = adj[start].length-1;
		
		int element;
		queue.enqueue(start);
		visited[start] = true;
		path[index] = start;
		index++;

		while(!queue.isEmpty()){
			element = queue.dequeue();
			
			if (start == end){
				print_path();
				return;
			}	
			
			for(int i = 0; i<=numNode; i++){
				if(visited[i]== false && adj[element][i] ==1){

					queue.enqueue(i);
					visited[i] = true;
					//path[index]= i;
					if(element == end){
						return;
					}

				}
			}
		}
		
		/*for(int i = 0; i< numNode; i++){
			if(adj[start][i] == 1 && visited[i] == false){
				queue.enqueue(adj[start][i]);
			}
		}*/

		
	}

	public void print_path()
	{
		int i;
  		for (i = 0; i < index; i++)
    		System.out.printf("%d ", path[i]);
 
  		System.out.printf("\n");
	}
}