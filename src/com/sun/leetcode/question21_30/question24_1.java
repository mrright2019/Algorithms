package com.sun.leetcode.question21_30;

public class question24_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a = new ListNode(1);
		a.next = new ListNode(2);
		a.next.next = new ListNode(3);
		a.next.next.next = new ListNode(4);
		System.out.println(a.val);
		System.out.println(a.next.val);
		System.out.println(a.next.next.val);
		System.out.println(a.next.next.next.val);
		ListNode b=null;
		swapPairs(b);

		System.out.println(a.val);
		System.out.println(a.next.val);
		System.out.println(a.next.next.val);
		System.out.println(a.next.next.next.val);
	}

	public static ListNode swapPairs(ListNode head) {
		if(head == null || head.next==null) return head;
//		ListNode p=head;
//		ListNode q=head.next;
		int temp = head.next.val;
		head.next.val = head.val;
		head.val = temp;
		swapPairs(head.next.next);
		return head;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
