
import java.util.*;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedWriter;
public class DFS{
	
	private int index = 0;
 	//private int []path = new int[31]; 
 	private Stack<Integer>path;
 	private boolean []visited = new boolean[31];

	public DFS(){
		path = new Stack<Integer>();
		//aPath = new Stack<Integer>();
	}

 	public void dfs(int adj[][], int start, int dest, BufferedWriter output) throws IOException{
 		int numNodes = adj[start].length -1;
 		
 		
 		visited[start] = true; 
 		path.push(start);
 		index++;
 		
 		if (start == dest){
 			print_path(output, start, dest);
 			return;
 		}
 
 		for(int i = 0; i<=numNodes; i++){
 			if(visited[i]== false && adj[start][i] ==1){
 				dfs(adj, i, dest, output);
 			}
 		}
 		visited[start] = false;
 		path.pop();
	}

 	public void print_path(BufferedWriter output, int start, int end) throws IOException
  	{ 
  		int [] x; 
  		String s ="";
  		//x = path.peek();
  		//x = path.toArray(); 
  		output.write(Arrays.toString(path.toArray()) + "\n");
  		if (path.isEmpty()){
  			//s = (x[0]+ " ,-1, " + end);
  			output.write(s);
  			output.flush();
  		}
  		
  	}

  	public void clearPath(){
		while (!path.isEmpty()){
			path.pop();
		}
		
	}

	/*public String print_path()
	{
		StringBuilder result = new StringBuilder();
		String node = " ";
  	
  		for (int i = 0; i < index; i++){
    		node = path[i]+",";
    		result.append(node);
 		}

  		return result.toString();
	}*/

}