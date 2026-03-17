package com.Assignment_4.module10;

// 11. LeetCode 206 – Reverse Linked List
public class ReverseLinkedList {

    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val=val;
        }
    }

    public static ListNode reverseList(ListNode head){

        ListNode prev=null;

        while(head!=null){

            ListNode next=head.next;

            head.next=prev;

            prev=head;

            head=next;
        }

        return prev;
    }

    public static void main(String[] args){

        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);

        ListNode result=reverseList(head);

        while(result!=null){

            System.out.print(result.val+" ");

            result=result.next;
        }
    }
}