
class Solution {
    fun hasCycle(head: ListNode?): Boolean {

     var tortoise: ListNode? = head
        var hare: ListNode? = head
        while (tortoise != null && hare != null) {
            tortoise = tortoise?.next
            hare = hare?.next?.next
            if (tortoise == hare && tortoise != null) {
                return true
            }
        }
        return false
    }
}