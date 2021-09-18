package com.rison.office.chapter12;

/**
 * @author : Rison 2021/9/18 上午11:28
 * 题目描述：给定单向链表的头指针和一个节点指针，在O(1)时间复杂度内删
 * 除该节点。
 * 思路：将要删除节点的下一个节点的值赋给要删除的节点，然后指向下下一
 * 个节点
 */
public class MainTest {
    public ListNode deleteNode(ListNode head, ListNode deLisNode) {
        if (deLisNode == null || head == null) {
            return new ListNode();
        }
        if (head == deLisNode) {
            head = new ListNode();
        }
        if (deLisNode.next == null) {
            ListNode pointListNode = head;
            while (pointListNode.next != null) {
                pointListNode = pointListNode.next;
            }
            pointListNode.next = null;
        } else {
            deLisNode.num = deLisNode.next.num;
            deLisNode.next = deLisNode.next.next;
        }
        return head;
    }
}

class ListNode {
    public ListNode next;
    public int num;

    public ListNode(ListNode next, int num) {
        this.next = next;
        this.num = num;
    }

    public ListNode() {
    }

    ;
}