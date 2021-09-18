package com.rison.office.chapter15;

/**
 * @author : Rison 2021/9/18 下午12:06
 * 题目描述：输入一个链表，反转链表后，输出链表的所有元素。
 * 思路：定义两个指针，反向输出
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode temp = null;
        while (head != null) {
            ListNode p = head.next;
            head.next = temp;
            temp = head;
            head = p;
        }
        return temp;
    }
}

class ListNode {
    public com.rison.office.chapter15.ListNode next;
    public int num;

    public ListNode(com.rison.office.chapter15.ListNode next, int num) {
        this.next = next;
        this.num = num;
    }

    public ListNode() {
    }

    ;
}