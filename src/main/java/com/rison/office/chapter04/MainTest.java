package com.rison.office.chapter04;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author : Rison 2021/9/9 下午4:29
 * 题目描述：输入一个链表，从尾到头打印链表每个节点的值。
 * <p>
 * 思路：借助栈实现，或使用递归的方法。
 */
public class MainTest {

    public ArrayList<Integer> printListFromTailTOHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        if (listNode == null) {
            return list;
        }

        Stack<ListNode> stack = new Stack<ListNode>();
        while (listNode != null) {
            stack.push(listNode);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop().val);
        }
        return list;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}