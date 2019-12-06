package org.soto.d001;


import org.soto.ds.ListNode;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。
 * 其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * @author liuqixin
 * @date 2019/12/4 15:03
 */
public class P002_LinklistAdd {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);
        ListNode l2 = new ListNode(0);
//        l2.next = new ListNode(8);

        ListNode l3 = addTwoNumbers(l1, l2);
        System.out.println(l3);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 是否有进位
        boolean hasCarry = false;
        // 结果链表，使用一个无用的头节点，用于连接当前链表
        ListNode res = new ListNode(0);
        ListNode n1 = l1;
        ListNode n2 = l2;
        // 当前链表列表
        ListNode currNode = res;
        while (n1 != null || n2 != null) {

            // 是否有进位判断
            int n = (n1 == null ? 0 : n1.val) + (n2 == null ? 0 : n2.val) + (hasCarry ? 1 : 0);
            // 判断是否有进位
            if (n > 9) {
                n %= 10;
                hasCarry = true;
            } else {
                hasCarry = false;
            }

            // 当前节点连接
            currNode.next = new ListNode(n);
            currNode = currNode.next;

            // 下一个节点，空判断避免两个链表长度不一致
            n1 = (n1 == null ? null :n1.next);
            n2 = (n2 == null ? null :n2.next);
        }
        // 节点有进位，加1
        if (hasCarry) {
            currNode.next = new ListNode(1);
        }
        return res.next;
    }


}



