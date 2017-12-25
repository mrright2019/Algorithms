package com.sun.algorithms.os;

public class LRU {
	public LRUNode head = null;

	public LRU(int n) {
		for (int i = 0; i < n; i++) {
			head = new LRUNode(i, head);
		}

	}

	public int find(int i) {
		LRUNode a = head;
		LRUNode p = null;
		while (a != null) {
			if (a.id == i) {
				if (p != null) {
					p.next = a.next;
					head = new LRUNode(i, head);
				}
				return 1;
			}
			p = a;
			a = a.next;
		}
		return 0;
	}

	public void vi(int i) {
		if(find(i)==1)return;
		LRUNode p = head;
		LRUNode pp=null;
		while(p.next != null) {
			pp=p;
			p=p.next;
		}
		pp.next=null;
		head = new LRUNode(i,head);
	}

	public void Output() {
		LRUNode a = head;
		while (a != null) {
			System.out.print(a.id+"\t");
			a = a.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRU a = new LRU(10);
		a.Output();
		a.vi(5);
		a.Output();
		a.vi(20);
		a.Output();
	}

}

class LRUNode {
	public int id;
	LRUNode next;

	public LRUNode(int i) {
		id = i;
		next = null;
	}

	public LRUNode(int i, LRUNode ln) {
		id = i;
		next = ln;
	}
}