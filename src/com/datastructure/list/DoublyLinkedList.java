package com.datastructure.list;

import com.datastructure.utilts.ConsoleLogger;

/**
 * @author suraj
 *
 */
public class DoublyLinkedList {

	static Node headNode = null;

	static DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

	public static void main(String[] args) {

		// push
		pushInFrontOFList(10);
		pushInFrontOFList(23);
		pushInFrontOFList(34);
		pushInFrontOFList(90);
		pushInFrontOFList(66);
		pushInFrontOFList(89);
		pushInFrontOFList(74);
		pushInFrontOFList(11);

		// print
		ConsoleLogger.printLine();
		printDLL();
		ConsoleLogger.printLine();

		printWithAddresses();
		ConsoleLogger.printLine();

		// get nth node from list
		ConsoleLogger.printLine();
		getNodeByIndex(1);
		ConsoleLogger.printLine();
		getNodeByIndex(3);
		ConsoleLogger.printLine();

		// get node that contains data
		int k = 100;
		getNodeByData(66);

		ConsoleLogger.printLine();

		// delete nth node
		deleteNthNode(1);
		printDLL();
		ConsoleLogger.printLine();

		deleteNthNode(5);
		printDLL();
		ConsoleLogger.printLine();

		// Delete node that contais data
		deleteNodeThatContainsData(3);
		printDLL();
		ConsoleLogger.printLine();

		deleteNodeThatContainsData(78);
		printDLL();
		ConsoleLogger.printLine();

		insetNodeAtSpecificPsotion(new Node(1000), 2);
		printDLL();
		ConsoleLogger.printLine();

		// delete all nodes
		doublyLinkedList.headNode = null;

		// Merge to LL
		merge();
		ConsoleLogger.printLine();

	}

	private static void merge() {
		// TODO Auto-generated method stub

	}

	private static void insetNodeAtSpecificPsotion(Node node, int i) {
		// TODO Auto-generated method stub

	}

	private static void deleteNodeThatContainsData(int i) {
		// TODO Auto-generated method stub

	}

	private static void deleteNthNode(int i) {
		// TODO Auto-generated method stub

	}

	private static void getNodeByData(int key) {
		// if head Node contains data
		if (doublyLinkedList.headNode.data == key) {
			System.out.println(key);
		} else {

			// Find the index of data
			int index = 1;
			
			//TODO Suraj : review this logic
			Node node = doublyLinkedList.headNode;

			while (node != null) {
				if (node.data == key) {
					System.out.print(headNode.data);
					System.out.println(index);
					break;
				}
				node = node.nextNode;
				index++;
			}
		}

	}

	private static void getNodeByIndex(int indexOfNode) {

		// if index == 1 return head of the list
		if (indexOfNode == 1) {
			System.out.println(doublyLinkedList.headNode.data);
		} else {
			int index = 1;
			// head node
			Node headNode = doublyLinkedList.headNode;
			// Until head is not null
			while (headNode != null) {
				// if index == indexOfNode
				if (index == indexOfNode) {
					System.out.println(headNode.data);
					break;
				}
				headNode = headNode.nextNode;
				index++;
			}
		}

	}

	private static void printWithAddresses() {
		Node head = doublyLinkedList.headNode;
		System.out.println("PN -- CN -- NN");
		System.out.println("----------------");
		while (head != null) {
			if (head.prevNode == null) {
				System.out.println("-  <- " + head.data + " -> " + head.nextNode.data);
			} else if (head.nextNode == null) {
				System.out.println(head.prevNode.data + " <- " + head.data + " -> - ");
			} else {
				System.out.println(head.prevNode.data + " <- " + head.data + " -> " + head.nextNode.data);
			}
			head = head.nextNode;
		}
		System.out.println("----------------");

	}

	private static void printDLL() {

		Node head = doublyLinkedList.headNode;
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.nextNode;
		}
		System.out.println();

	}

	private static void pushInFrontOFList(int i) {

		Node newNode = new Node(i);

		if (doublyLinkedList.headNode == null) {
			doublyLinkedList.headNode = newNode;
		} else {
			Node currentHead = doublyLinkedList.headNode;
			doublyLinkedList.headNode = newNode;
			newNode.nextNode = currentHead;
			currentHead.prevNode = newNode;
			doublyLinkedList.headNode = newNode;

		}

	}

	static class Node {
		Node nextNode;
		Node prevNode;
		int data;

		public Node(int data) {
			this.data = data;
			nextNode = null;
			prevNode = null;
		}
	}

}
