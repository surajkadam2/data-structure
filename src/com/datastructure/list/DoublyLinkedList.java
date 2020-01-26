package com.datastructure.list;

import org.apache.commons.lang3.StringUtils;

import com.datastructure.utilts.ConsoleLogger;

/**
 * @author suraj
 *
 */
public class DoublyLinkedList {

	static Node head = null;

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

	}

	private static void printWithAddresses() {
		Node head = doublyLinkedList.head;
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

		Node head = doublyLinkedList.head;
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.nextNode;
		}
		System.out.println();

	}

	private static void pushInFrontOFList(int i) {

		Node newNode = new Node(i);

		if (doublyLinkedList.head == null) {
			doublyLinkedList.head = newNode;
		} else {
			Node currentHead = doublyLinkedList.head;
			doublyLinkedList.head = newNode;
			newNode.nextNode = currentHead;
			currentHead.prevNode = newNode;
			doublyLinkedList.head = newNode;
			
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
