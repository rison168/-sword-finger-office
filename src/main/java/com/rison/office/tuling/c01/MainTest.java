package com.rison.office.tuling.c01;

/**
 * @author : Rison 2021/9/22 上午10:39
 * 反转链表
 * 反转一个单链表
 * <p>
 * 迭代，重复某一过程，每一次处理结果作为下一次处理的初始值，这些初始值类似于状态、每
 * 次处理都会改变状态、直至到达最终状态
 * 从前往后遍历链表，将当前节点的next指向上一个节点，因此需要一个变量存储上一个节点prev，当前
 * 节点处理完需要寻找下一个节点，因此需要一个变量保存当前节点curr，处理完后要将当前节点赋值给
 * prev，并将next指针赋值给curr，因此需要一个变量提前保存下一个节点的指针next
 * <p>
 * 递归：以相似的方法重复，类似于树结构，先从根节点找到叶子节点，从叶子节点开始遍历
 * 大的问题(整个链表反转)拆成性质相同的小问题(两个元素反转)curr.next.next = curr
 * 将所有的小问题解决，大问题即解决
 */
public class MainTest {

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode iterate(ListNode head) {
        ListNode prev = null, curr, next;
        curr = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode recursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = recursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

}
