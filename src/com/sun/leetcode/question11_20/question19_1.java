package com.sun.leetcode.question11_20;

public class question19_1 {

	private static ListNode a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a1=new ListNode(1);
		ListNode a2=new ListNode(2);
		ListNode a3=new ListNode(3);
		ListNode a4=new ListNode(4);
		ListNode a5=new ListNode(5);
		a1.next=a2;
		a2.next=a3;
		a3.next=a4;
		a4.next=a5;
		a = removeNthFromEnd(a1,0);
		return;
	}
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int n1 = 1;  
        ListNode list1 = new ListNode(head.val);  
        ListNode list2 = new ListNode(head.val);  
        head = head.next;  
        ListNode head_1 = list1;  
        ListNode head_2 = list2;  
        while(head != null){  
            ListNode node = new ListNode(head.val);  
            list1.next = node;  
            head = head.next;  
            list1 = node;  
            n1++;  
            if(n1 > n){  
                  
                list2.next = head_1;  
                list2 = head_1;  
                head_1 = head_1.next;  
            }  
        }  
        list2.next = head_1.next;  
        return head_2.next;  
    }
	
}

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
	}
}