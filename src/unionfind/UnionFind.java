/*
 * Copyright 2012 Anderson Queiroz <contato(at)andersonq(dot)eti(dot)br>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OFFViewer. If not, see <http://www.gnu.org/licenses/>.
 */

package unionfind;

/**
 * Union-Find main class
 * @author Anderson Queiroz <contato(at)andersonq(dot)eti(dot)br
 *
 */
public class UnionFind {

	public UnionFind()
	{
		
	}
	
	public void makeSet(Node node)
	{
		node.setFather(node);
	}
	
	/**
	 * Find the element that represent one set
	 * @param node a node that belongs to a set
	 * @return Represent of node's set, or null if there is not node in any set
	 */
	public Node findSet(Node node)
	{
		if(node.getFather() == node)
		{
			return node;
		}
		else
		{
			return findSet(node);
		}
	}
	
	/**
	 * Put together the tree that contains node1 below the tree that contains node2 
	 * @param node1 a node
	 * @param node2 a node
	 */
	public void union (Node node1, Node node2)
	{
		Node root1, root2;
		
		root1 = findSet(node1);
		root2 = findSet(node2);
		
		root1.setFather(root2);
	}
}
