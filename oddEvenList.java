public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode leftDummy = new ListNode(0);
        ListNode rightDummy = new ListNode(0);
        ListNode left = leftDummy, right = rightDummy; 
        int i =1 ;
        while ( head != null){
             
            if( (i % 2) == 1 ){
                left.next = head;
                left = head;
            }else{
                right.next = head;
                right = head;
            }
            i++;
            head = head.next;
            
            }

        right.next = null;
        left.next = rightDummy.next;

        return leftDummy.next;

    }
}
