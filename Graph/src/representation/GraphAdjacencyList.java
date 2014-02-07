package representation;

import java.util.Map;

public class GraphAdjacencyList<E> {
	
	Map<E, E[]> adjacencyList;

	public Map<E, E[]> getAdjacencyList() {
		return adjacencyList;
	}

	public void setAdjacencyList(Map<E, E[]> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}
}
