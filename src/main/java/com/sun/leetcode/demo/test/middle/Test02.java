package com.sun.leetcode.demo.test.middle;

import java.util.HashMap;

/**
 * @author shawn
 * @descript
 * @create 2020-10-21 10:24 下午
 */
public class Test02 {
    public static void main(String[] args) {
        // 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
        //输出：7 -> 0 -> 8
        //原因：342 + 465 = 807
        ListNode l1 =new ListNode(2);
        l1.next =new ListNode(4);
        l1.next.next=new ListNode(3);

        ListNode l2 =new ListNode(5);
        l2.next =new ListNode(6);
        l2.next.next=new ListNode(4);

        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(listNode.toString());


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode cure =node;
        // 十位数的值
        int carry=0;
        while (l1 !=null || l2 !=null){
            int x =l1 ==null? 0:l1.val;
            int y =l2 ==null? 0:l2.val;
            int sum= x+y+carry;
            carry =sum/10;
            sum =sum%10;
            cure.next =new ListNode(sum);
            cure =cure.next;
            if(l1 !=null){
                l1=l1.next;
            }
            if(l2 !=null){
                l2=l2.next;
            }
        }
        // 十位进一
        if(carry>0){
            cure.next=new ListNode(carry);
        }
        return node.next;
    }
}


