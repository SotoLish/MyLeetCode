package org.soto.ds;

/**
 * 链表对象
 * @author liuqixin
 * @date 2019/12/4 15:19
 */
public class ListNode {
    /**
     * 链表值
     */
    public int val;
    /**
     * 下个节点的对象
     */
    public ListNode next;
    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(this.val);
        ListNode n = this;
        while(n.next != null){
            n = n.next;
            strBuilder.append(" -> "+ n.val );
        }
        return strBuilder.toString();
    }
}
