import java.util.*;
public class BFS{
	private Queue queue;
	
	public BFS(){
		queue = new Queue();
	}

	public void bfs(int adj[][], int source){

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
	}

	/*public String[] bfs(int adj[][], int start, int end){
		int numNode = adj[start].length-1;
		int []visited = new int[numNode +1];
		int i, element;
		int [] path;
		int pathPosition;
		queue.enqueue(start);
		visited[start] = 1;

		for(int i = 0; i< numNode; i++){
			if(adj[start][i] == 1 && visited[i] == 0){
				queue.enqueue(adj[start][i]);
			}
		}

		while(!queue.isEmpty()){
			element = queue.dequeue();
			visited[element] = 1;
		}
	}*/
}