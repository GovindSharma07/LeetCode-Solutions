/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        

        when{
            head == null -> return false
            head.next == null -> return false
            head.next.next == null -> return false
        } 

        var s : ListNode? = head
        var f : ListNode? = head?.next?.next

        while(s != f){
            f = f?.next
            if(f == null) return false
            f = f?.next
            if(f == null) return false
            s = s?.next
        }
        return true
    }
}