import java.util.*;
public class DFS{
	
	//private Stack path;
	int index = 0;
	int [] path = new int[31]; 
	boolean []visited = new boolean[31];

	public DFS(){
		//path = new Stack();
	}

	/*public void dfs(int adj[][], int start){

		int numNodes = adj[start].length -1;
		int[] visited = new int[numNodes + 1];
		int element = start;
		int i = start;
		System.out.println(element + "\t");
		visited[start] =1;
		aStack.push(start);
		while(!aStack.isEmpty()){

			element = aStack.peek();
			i = element;
			while(i <= numNodes){

				if(adj[element][i] == 1 && visited[i] == 0){
					aStack.push(i);
					visited[i] =1;
					element = i;
					System.out.print(element + "\t");
					continue;
				}
				i++;
			}
			aStack.pop();
		}
	}*/

	public void dfs(int adj[][], int start, int dest){
		int numNodes = adj[start].length -1;
		int [][] newAdj = new int[numNodes][numNodes]; 
		//newAdj = adj;

		visited[start] = true;
		boolean pass = false; 
		path[index] = start;
		index++;

		if (start == dest){
			print_path();
			return;
		}

		else{
			for(int i = 0; i<=numNodes; i++){
				if(visited[i]== false && adj[start][i] ==1){
					dfs(adj, i, dest);
					pass = true;
				}

				/*if(visited[i]== true && adj[start][i] == 1){
					System.out.println("No path found");
					path[index] = -1;
					return;
				}*/
			}
		}
		if(visited[start]== false){
			return;
		}

		visited[start] = false;
		index--;

		//return 
	} 

	public void print_path()
	{
  		int i;
  		for (i = 0; i < index; i++)
    		System.out.printf("%d ", path[i]);
 
  		System.out.printf("\n");
	}
}