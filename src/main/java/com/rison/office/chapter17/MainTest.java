package com.rison.office.chapter17;

/**
 * @author : Rison 2021/9/18 下午2:26
 * 题目描述：输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约
 * 定空树不是任意一个树的子结构）
 * 思路：若根节点相等，利用递归比较他们的子树是否相等，若根节点不相
 * 等，则利用递归分别在左右子树中查找
 */
public class MainTest {
    public boolean hasSubTree(TreeNode root1, TreeNode root2) {
        boolean result = false;
        if (root1 != null && root2 != null) {
            if (root1.num == root2.num) {
                result = doesTree1HaveTree2(root1, root2);
            }
            if (!result) {
                return hasSubTree(root1.leftTreeNode, root2) || hasSubTree(root1.rightTreeNode, root2);
            }
        }
        return result;
    }

    public boolean doesTree1HaveTree2(TreeNode node1, TreeNode node2) {
        if (node2 == null) {
            return true;
        }
        if (node1 == null) {
            return false;
        }
        if (node1.num != node2.num) {
            return false;
        }
        return doesTree1HaveTree2(node1.leftTreeNode, node2.leftTreeNode) && doesTree1HaveTree2(node1.rightTreeNode, node2.rightTreeNode);
    }

}

class TreeNode {
    public int num;
    public TreeNode rightTreeNode;
    public TreeNode leftTreeNode;
}