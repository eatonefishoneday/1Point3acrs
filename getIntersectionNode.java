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
 //headA headB和后面的C连起来可以看作两个linked list 长度可能相同/不同
 //如果相同就好做了，相同的话直接判断A.next == B.next 相等就返回
 //如果不同，可以算出A和B的长度的差值，然后让长的list那个从差值的位置next.短的从起点next
 //当两个next相等时，就是交点
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
