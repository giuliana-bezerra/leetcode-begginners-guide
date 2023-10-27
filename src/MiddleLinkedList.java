/*
 * Given the head of a singly linked list, return the middle node of the linked list. 
 * If there are two middle nodes, return the second middle node. 
 */
public class MiddleLinkedList {
  public static void main(String[] args) {
    var head = new ListNode();

    System.out.println(new Solution().middleNode(head));
  }
}

class Solution {
  public ListNode middleNode(ListNode head) {
    var current = new ListNode(head.val, head.next);
    var length = 0;

    while (current != null) {
      length++;
      current = current.next;
    }

    var middleIndex = length / 2;
    var middleNode = new ListNode(head.val, head.next);
    for (int i = 0; i < middleIndex; i++) {
      middleNode = middleNode.next;
    }

    return middleNode;
  }
}

class ListNode {
  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}
