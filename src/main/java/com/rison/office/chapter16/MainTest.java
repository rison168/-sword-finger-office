package com.rison.office.chapter16;

import java.lang.reflect.Member;

/**
 * @author : Rison 2021/9/18 下午2:19
 * 题目描述：输入两个单调递增的链表，输出两个链表合成后的链表，当然我
 * 们需要合成后的链表满足单调不减规则。
 * 思路：递归与非递归求解，小数放在前面。
 */
public class MainTest {
    public ListNode merge(ListNode listNode1, ListNode listNode2) {
        if (listNode1 == null) {
            return listNode2;
        }
        if (listNode2 == null) {
            return listNode1;
        }
        ListNode newNode = null;
        if (listNode1.num <= listNode2.num) {
            newNode = listNode1;
            newNode = merge(listNode1.next, listNode2);
        } else {
            newNode = listNode2;
            newNode = merge(listNode1, listNode2.next);
        }
        return newNode;

    }
}

class ListNode {
    public com.rison.office.chapter16.ListNode next;
    public int num;

    public ListNode(com.rison.office.chapter16.ListNode next, int num) {
        this.next = next;
        this.num = num;
    }

    public ListNode() {
    }

    ;
}