import java.util.*;
import java.util.Arrays;
public class DFS{
	
	private Queue path;
	

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

	public int[] dfs(int adj[][], int start, int dest){
		int index = 0;
		int [] path = new int[31]; 
		boolean []visited = new boolean[31];
		path = dfsHelper(adj,start,dest, path, 0);
		
		if(path.length < 2){
			path = {start, -1, dest};
		}
		return path;
	}

	public int[] dfsHelper(int adj[][], int start, int dest, int currentPath[], int currentIndex){
		int numNodes = adj[start].length -1;
		int [] result ; 
		visited[start] = true; 
		currentPath[currentIndex] = start;
		currentIndex++;

		if (start == dest){
			return currentPath;
		}

		else{
			for(int i = 0; i<=numNodes; i++){
				if(visited[i]== false && adj[start][i] ==1){

					dfsHelper(adj, i, dest, Arrays.copyOf(currentPath, currentPath.length), currentIndex);
					
				}
			}
			
		}
		

	}

	public void print_path()
	{
  		int i;
  		for (i = 0; i < index; i++)
    		System.out.printf("%d ", path[i]+",");
 
  		System.out.printf("\n");
	}


	/*public String dfs2(int adj[][], int start, int dest){
		int index = 0;
		int [] path = new int[31]; 
		boolean []visited = new boolean[31];
		//StringBuilder path = new StringBuilder();
		path[index]= start;
		
		this.dfs2Helper(adj, start, dest, path, visited, index);
		return path;
	}

	private boolean dfs2Helper(int adj[][], int currentNode, int destNode, int path[], int visited [], int index){
		if((currentNode == destNode)){
			path[index] = currentNode;
			return;
		}
		
		for(int i =0; i <= adj.length; i++){
			if(visited[i]== false && adj[currentNode][i]==1){
				dfs2Helper(adj, i, destNode, path, visited,);
			}
		}

	}


	private void addToPath(int node){
		path[index] = node;
		index++;
	}*/
}