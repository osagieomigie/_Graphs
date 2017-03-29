import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Assign4{
	
	public static void main(String[] args) {
		
		try{
			FileReader reader = new FileReader(args[0]);
			BufferedReader breader = new BufferedReader(reader);

			String line; 
			String [] array; 
			int [][]adj = new int [31][31];
			int source = 0; 
			int row =0; 
			
			while( (line = breader.readLine()) != null ){
				array = line.split("\\s+");
				for(int a =0; a <= 30; a++){
					adj[row][a] = Integer.parseInt(array[a]);
				}
				row++;
			}	

			for (int i = 0; i <= 30; i++) {
				for (int j = 0; j <= 30; j++) 
					System.out.printf("%d ", adj[i][j]);
			System.out.println();
			}

			BFS b = new BFS();
			b.bfs(adj, source);
			System.out.println("DFS");
			DFS d = new DFS();
			d.dfs(adj, source);
			
			reader.close();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
	}	
}