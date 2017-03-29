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



	/*public String dfs(int adj [][], int finalID, String currPath)
	{

		System.out.println("Current path is at: " + currPath);

		//Making a list of this vertex's neighbours
		Vertex neighbourList[] = new Vertex[currVX.getNumberOfNeighbours()];
		int currPosition = 0;

		for (int x = 0; x < numOfVXs; x++) {
			if (currVX.hasEdge(x)) {
				neighbourList[currPosition] = vertexList[x];
				currPosition++;
			}
		}

		//Marking this vertex as visited
		currVX.markVisited();

		for (int x = 0; x < currVX.getNumberOfNeighbours(); x++) {

			//If this is the vertex that we're looking for
			if (neighbourList[x].getVXID() == finalID) {
				System.out.println("final id found. current path is: " + currPath);
				return currPath;
			}

			//Update path with new neighbour, recursively call DFS
			if (!neighbourList[x].isVisited()) {
				currPath = currPath + ", " + neighbourList[x].getVXID();
				dfs(neighbourList[x], finalID, currPath);
			}
			
			else// if (this.allVXvisited()==true)
			{
				System.out.println("All vertexes visited. current path = -1");
				currPath = currVX.getVXID()+", -1";
				return currPath;
			}
			
		}
		
		return currPath;
	}*/
}