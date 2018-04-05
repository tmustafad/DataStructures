package com.turkmen.QuickUnion;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author TTTDEMIRCI
 *
 */
public class QuickUnion {

	public Map<Integer, Node> map = new HashMap<>();

	public void union(int data1, int data2) {
		Node node1 = map.get(data1);
		Node node2 = map.get(data2);

		Node parent1 = findSet(node1);
		Node parent2 = findSet(node2);

		if (parent1.data == parent2.data)
			return;

		if (parent1.depth >= parent2.depth) {
			parent1.depth = parent1.depth == parent2.depth ? parent1.depth + 1 : parent1.depth;
			parent2.parent = parent1;
		} else {
			parent1.parent = parent2;
		}

	}

	public void makeSet(int data) {
		Node node = new Node();

		node.data = data;
		node.depth = 0;
		node.parent = node;
		map.put(data, node);
	}

	public Integer findSet(Integer data) {

		return findSet(map.get(data)).data;
	}

	private Node findSet(Node node) {

		Node parent = node.parent;
		if (node == parent) {
			return node;
		}

		node.parent = findSet(node.parent);
		return node.parent;

	}

	static class Node {
		int data;
		Node parent;
		int depth;
	}

}
