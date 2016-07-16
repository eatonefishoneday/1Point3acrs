/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if (headA == null || headB == null) {
            return null;
        }
    ListNode nodeA = headA,    
             nodeB= headB;
    int lengthA = 1, 
        lengthB = 1;
    
    while ( nodeA.next != null ){
        nodeA = nodeA.next;
        lengthA++;
    }
    
    while ( nodeB.next != null ){
        nodeB = nodeB.next;
        lengthB++;
    }

    if (nodeB != nodeA){
        return null;
    }
    
    if(lengthA > lengthB){
        for( int i = 0; i <lengthA-lengthB; i++){
            headA = headA.next;
        }
    }else if (lengthB > lengthA){
        for(int i = 0; i < lengthB - lengthA; i++){
            headB = headB.next;
        }
    }
    while (headA != headB){
        headA = headA.next;
        headB = headB.next;
    }
    return headA;
    }
}
