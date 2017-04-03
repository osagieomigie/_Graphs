import java.util.*;
import java.io.IOException;
import java.io.BufferedWriter;

public class BFS{

	private Queue queue;
	int [] path = new int[31]; 
	boolean []visited = new boolean[31];
	int index = 0;
	
	public BFS(){
		queue = new Queue();
	}

	public void bfs(int adj[][], int start, int end, BufferedWriter output) throws IOException{
		int numNode = adj[start].length-1;
		
		int element;
		queue.enqueue(start);
		visited[start] = true;
		path[index] = start;
		index++;

		if (start == end){
			queue.enqueue(start);
			visited[start] = true;
			path[index] = start;
			index++;
			print_path(output, start, end);
			return;
		}

		while(!queue.isEmpty()){
			element = queue.dequeue();
			//visited[element] = true;
			//path[index] = start;
			//index++;	
			
			for(int i = 0; i<=numNode; i++){
				if(visited[i]== false && adj[element][i] ==1){
					visited[i] = true;
					queue.enqueue(i);
					//path[index] = element;
					//index++;
				}
				if (element == end){
					queue.enqueue(element);
					visited[element] = true;
					path[index] = element;
					index++;
					print_path(output, start, end);
					return;
				}
			}
			//visited[element] = false;
			//index--;
		}
		
	}

	public void print_path(BufferedWriter output, int start, int end) throws IOException
  	{ 
  		int [] x; 
  		String s ="";
  		//x = path.peek();
  		//x = path.toArray(); 
  		output.write(Arrays.toString(path) + "\n");
  		output.flush();
  		
  	}

  	public void clearPath(){
		while (!queue.isEmpty()){
			queue.dequeue();
		}
		
	}
}