package com.sun.leetcode.demo.test;

import javax.tools.ForwardingFileObject;

/**
 * @author sunxiang
 * 21 合并2个有序链表
 * @date 2020-10-27 18:25
 **/
public class Test21 {
    public static void main(String[] args) {
        // 递归
        ListNode l1 =new ListNode(1);
        ListNode l12 =new ListNode(2);
        l1.next =l12;
        ListNode l13 =new ListNode(3);
        l12.next =l13;

        ListNode l2 =new ListNode(1);
        ListNode l22 =new ListNode(3);
        l2.next =l22;
        ListNode l23 =new ListNode(4);
        l22.next =l23;

        ListNode listNode = mergeTwoLists(l1, l2);
        System.out.println();

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 ==null){
            return l2;
        }
        if(l2 ==null){
            return l1;
        }
        // 输入：1->2->4, 1->3->4
        //输出：1->1->2->3->4->4
        if(l1.val < l2.val){
            l1.next =mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next =mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}


