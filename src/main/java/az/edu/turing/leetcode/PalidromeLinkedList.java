package az.edu.turing.leetcode;

import java.util.ArrayList;

public class PalidromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<>();
        if (head == null) return false;
        while (head!= null) {
            list.add(head.val);
            head=head.next;
        }
        for (int i = list.size()-1; i > 0; i--) {
            list1.add(list.get(i));
        }

        if (list1.equals(list)) {
            return true;
        }
        return false;
    }
}
