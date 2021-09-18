package com.rison.office.chapter14;

/**
 * @author : Rison 2021/9/18 上午11:59
 * 题目描述：输入一个链表，输出该链表中倒数第k个结点。
 * 思路：定义一快一慢两个指针，快指针走K步，然后慢指针开始走，快指针
 * 到尾时，慢指针就找到了倒数第K个节点。
 */
public class MainTest {
    public ListNode FindKToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (k-- > 1) {
            if (fast.next != null) {
                fast = fast.next;
            } else {
                return null;
            }
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }

        }
        return slow;
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