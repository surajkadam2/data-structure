package com.datastructure.list;

import com.datastructure.utilts.ConsoleLogger;

/**
 * @author suraj
 *
 */
public class SinglyLinkedList {

	// Head Node/First node/Starting poit
	static Node headNode = null;

	// create object for LL
	static SinglyLinkedList linkedList = new SinglyLinkedList();

	public static void main(String[] args) {

		// Create Nodes
		Node head = new Node(1);
		Node secondNode = new Node(2);
		Node thirdNode = new Node(3);
		Node forthNode = new Node(4);

		// Assing head and next node chaining
		linkedList.headNode = head;
		head.nextNode = secondNode;
		secondNode.nextNode = thirdNode;
		thirdNode.nextNode = forthNode;

		printLL(linkedList);

		// insert a elemnt in front for a LL
		linkedList.pushNodeInFront(45);
		linkedList.pushNodeInFront(100);
		linkedList.pushNodeInFront(78);
		linkedList.pushNodeInFront(98);
		linkedList.pushNodeInFront(234);

		ConsoleLogger.printLine();
		printLL(linkedList);
		ConsoleLogger.printLine();

		// get nth node from list
		ConsoleLogger.printLine();
		getNodeByIndex(1);
		ConsoleLogger.printLine();
		getNodeByIndex(3);
		ConsoleLogger.printLine();

		// get node that contains data
		int k = 100;
		getNodeByData(k);
		ConsoleLogger.printLine();

		// delete nth node
		deleteNthNode(1);
		printLL(linkedList);
		ConsoleLogger.printLine();

		deleteNthNode(5);
		printLL(linkedList);
		ConsoleLogger.printLine();

		// Delete node that contais data
		deleteNodeThatContainsData(3);
		printLL(linkedList);
		ConsoleLogger.printLine();

		deleteNodeThatContainsData(78);
		printLL(linkedList);
		ConsoleLogger.printLine();

		insetNodeAtSpecificPsotion(new Node(1000), 2);
		printLL(linkedList);
		ConsoleLogger.printLine();

		// delete all nodes
		linkedList.headNode = null;

		// Merge to LL
		merge();
		ConsoleLogger.printLine();

	}

	private static void merge() {
		// Merge two single LL
		SinglyLinkedList firstLL = new SinglyLinkedList();
		firstLL.pushNodeInFront(100);
		firstLL.pushNodeInFront(67);
		firstLL.pushNodeInFront(760);
		firstLL.pushNodeInFront(670);
		SinglyLinkedList secondLL = new SinglyLinkedList();
		secondLL.pushNodeInFront(345);
		secondLL.pushNodeInFront(656);
		secondLL.pushNodeInFront(9);
		secondLL.pushNodeInFront(23);

		SinglyLinkedList merged = new SinglyLinkedList();

		Node headNode = firstLL.headNode;
		while (headNode == null) {
			headNode.nextNode = secondLL.headNode;
		}
		printLL(merged);
	}

	private static void insetNodeAtSpecificPsotion(Node newNode, int position) {

		// if Position is equal to 1
		if (position == 1) {
			Node currentHead = linkedList.headNode;
			newNode.nextNode = currentHead;
			linkedList.headNode = newNode;
		} else {

			// Find node at position
			int index = 1;
			Node headNode = linkedList.headNode;

			Node nodeToReplace = null;
			Node preOfNodeToReplace = null;
			Node nextOfNodeTOReplace = null;

			while (headNode != null) {

				if (index == position - 1) {
					// Find prev of node to replace
					preOfNodeToReplace = headNode;
				} else if (index == position) {
					// Find node to replace
					nodeToReplace = headNode;
				} else if (index == position + 1) {
					// Find next of node to replace
					nextOfNodeTOReplace = headNode;
				}

				if (preOfNodeToReplace != null && nodeToReplace != null && nextOfNodeTOReplace != null) {
					preOfNodeToReplace.nextNode = newNode;
					newNode.nextNode = nextOfNodeTOReplace;
					break;
				}

				headNode = headNode.nextNode;
				index++;
			}

		}

	}

	private static void deleteNodeThatContainsData(int key) {

		// if data is equal to head node data
		if (linkedList.headNode.data == key) {
			linkedList.headNode = linkedList.headNode.nextNode;
		} else {
			// Find the position of node that contains data
			int postion = 1;
			Node headNode = linkedList.headNode;
			while (headNode != null) {
				if (headNode.data == key) {
					break;
				}
				headNode = headNode.nextNode;
				postion++;
			}

			int index = 1;
			headNode = linkedList.headNode;
			Node preNode = null;
			// Until head node is not null
			while (headNode != null) {
				// find the prev node
				if (index == postion - 1) {
					preNode = headNode;
				}
				// find the to delete
				if (headNode.data == key) {
					// Assing next node for prev node to node to deletes next node
					preNode.nextNode = headNode.nextNode;
					break;
				}
				// Assign next Node
				headNode = headNode.nextNode;
				index++;
			}

		}

	}

	private static void deleteNthNode(int nthNode) {

		// if nth node is 1
		if (nthNode == 1) {
			Node newHead = headNode.nextNode;
			linkedList.headNode = newHead;
		} else {
			// find the position of node
			int index = 1;
			Node head = linkedList.headNode;
			Node prevNode = null;
			// Until head node is not null
			while (head != null) {
				// find the prev node
				if (index == (nthNode - 1)) {
					prevNode = head;
				}
				// find the to delete
				if (index == nthNode) {
					// Assing next node for prev node to node to deletes next node
					prevNode.nextNode = head.nextNode;
					break;
				}
				// Assign next Node
				head = head.nextNode;
				index++;
			}
		}

	}

	private static void getNodeByData(int key) {

		// If head node data is equal to key
		if (headNode.data == key) {
			System.out.println(headNode.data);
		} else {
			Node headNode = linkedList.headNode;
			// Until head node is not null
			while (headNode != null) {
				if (headNode.data == key) {
					System.out.println(headNode.data);
					break;
				}
				// Assign next Node
				headNode = headNode.nextNode;
			}
		}

	}

	private static void getNodeByIndex(int nthIndex) {

		// If nth index is 1
		if (nthIndex == 1) {
			System.out.println(headNode.data);
		} else {
			Node headNode = linkedList.headNode;
			int index = 1;
			// Until head node is not null
			while (headNode != null) {
				if (index == nthIndex) {
					System.out.println(headNode.data);
					break;
				}
				// Assign next Node
				headNode = headNode.nextNode;
				index++;
			}
		}

	}

	private static void printLL(SinglyLinkedList linkedList) {
		String ll = "";
		// Print LL
		// get head node
		Node headToItrate = linkedList.headNode;
		// Until head node is not null
		while (headToItrate != null) {
			ll = ll + headToItrate.data + " ";
			// Assign next Node
			headToItrate = headToItrate.nextNode;
		}
		System.out.println(ll);
	}

	public void pushNodeInFront(int data) {

		// Crate a new hode
		Node newNode = new Node(data);

		// Assing next node to new node
		newNode.nextNode = headNode;

		// set next node to head
		headNode = newNode;

	}

	static class Node {
		// variable to store data
		int data;
		// next node of the current node
		Node nextNode;

		// Constructor to init data and node to null;
		public Node(int data) {
			this.data = data;
			nextNode = null;
		}

	}

}
