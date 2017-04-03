import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Assign4{
	
	public static void main(String[] args) {

		if(args.length != 4){
			System.err.println("ENTER CORRECT ARGUMENTS");
			System.exit(0);
		}
		
		try{
			FileReader reader = new FileReader(args[0]);
			BufferedReader breader = new BufferedReader(reader);

			String line; 
			String queryLine; 
			String [] array;
			int [][] queryArray = new int[17][17]; 
			String [] q;                      
			int [] path;  
			int [][]adj = new int [31][31];
			int start = 0; 
			int dest = 0; 
			int row =0; 
			
			while( (line = breader.readLine()) != null ){
				array = line.split("\\s+");
				for(int a =0; a <= 30; a++){
					adj[row][a] = Integer.parseInt(array[a]);
				}
				row++;
			}	

			FileReader queryReader = new FileReader(args[1]);
			BufferedReader queryBreader = new BufferedReader(queryReader);

			FileWriter writer = new FileWriter(args[2]);
	        BufferedWriter bufferedWriter1 = new BufferedWriter(writer);

	        FileWriter writer2 = new FileWriter(args[3]);
	        BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);

			while( (queryLine = queryBreader.readLine()) != null ){
				q = queryLine.split("\\s+");
				start = Integer.parseInt(q[0]);
				dest = Integer.parseInt(q[1]);
	        	DFS d = new DFS();
	        	BFS b = new BFS();

	        	for(int i = 0; i < q.length ; i++){
					d.dfs(adj, start, dest, bufferedWriter1);
	        		d.clearPath();

	        		b.bfs(adj, start, dest, bufferedWriter2);
	        		b.clearPath();
				}
			}
			bufferedWriter1.close();
			bufferedWriter2.close();
			queryReader.close();
			
			

						
			reader.close();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
	}	
}