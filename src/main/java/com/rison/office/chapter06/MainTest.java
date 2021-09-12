package com.rison.office.chapter06;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.Stack;

/**
 * @author : Rison 2021/9/12 下午8:14
 * 题目描述：用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中
 * 的元素为int类型。
 * 思路：一个栈压入元素，而另一个栈作为缓冲，将栈1的元素出栈后压入栈2
 * 中。也可以将栈1中的最后一个元素直接出栈，而不用压入栈2中再出栈。
 */
public class MainTest {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return -1;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack2.pop());
            }
        }
        return stack2.pop();
    }
}


