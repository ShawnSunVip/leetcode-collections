package com.sun.leetcode.demo.test.middle;

/**
 * @author sunxiang
 * @date 2020-10-27 18:44
 **/
public class ListNode {
      int val;
      ListNode next;// 下一个链表对象
      ListNode(int x) { val = x; } //赋值链表的值

      @Override
      public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
      }
}
