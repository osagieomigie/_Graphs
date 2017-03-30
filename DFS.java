import java.util.*;
public class DFS{
	
	private Stack aStack;

	public DFS(){
		aStack = new Stack();
	}

	public void dfs(int adj[][], int start){

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
	}
}