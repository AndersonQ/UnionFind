package test;

import java.util.Vector;

import unionfind.Node;
import unionfind.UnionFind;

/**
 * A class to test Union-Find
 * @author Anderson Queiroz <contato(at)andersonq(dot)eti(dot)br
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Graph total cost
		int totalcost;
		//The Union-Find
		UnionFind unionfind = new UnionFind();
		//The edges
		Vector<Edge> edges = new Vector<Edge>();
		//The nodes
		Vector<Node> nodes = new Vector<Node>();
		
		Node nodeA = new Node('A');
		Node nodeB = new Node('B');
		Node nodeC = new Node('C');
		Node nodeD = new Node('D');
		Node nodeE = new Node('E');
		Node nodeF = new Node('F');
		Node nodeG = new Node('G');
		Node nodeH = new Node('H');
		Node nodeI = new Node('I');
		nodes.add(nodeA);
		nodes.add(nodeB);
		nodes.add(nodeC);
		nodes.add(nodeD);
		nodes.add(nodeE);
		nodes.add(nodeF);
		nodes.add(nodeG);
		nodes.add(nodeH);
		nodes.add(nodeI);

		edges.add(new Edge(nodeH, nodeG, 1));
		edges.add(new Edge(nodeI, nodeC, 2));
		edges.add(new Edge(nodeG, nodeF, 2));
		edges.add(new Edge(nodeA, nodeB, 4));
		edges.add(new Edge(nodeC, nodeF, 4));
		edges.add(new Edge(nodeI, nodeG, 6));
		edges.add(new Edge(nodeC, nodeD, 7));
		edges.add(new Edge(nodeH, nodeI, 7));
		edges.add(new Edge(nodeA, nodeH, 8));
		edges.add(new Edge(nodeB, nodeC, 8));
		edges.add(new Edge(nodeD, nodeE, 9));
		edges.add(new Edge(nodeE, nodeF, 10));
		edges.add(new Edge(nodeB, nodeH, 11));
		edges.add(new Edge(nodeD, nodeF, 14));
		
		totalcost = unionfind.kruskal(nodes, edges);
		
		System.out.println("The graph total cost is " + totalcost);
	}

}
