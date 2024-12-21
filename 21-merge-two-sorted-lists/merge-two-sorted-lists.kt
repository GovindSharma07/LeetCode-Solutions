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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {

        if (list1 == null) return list2
        if (list2 == null) return list1

        var dummy = ListNode(0)
        var current = dummy
        var c1 = list1
        var c2 = list2

        // Traverse both lists and merge them
        while (c1 != null && c2 != null) {
            if (c1.`val` < c2.`val`) {
                current.next = c1
                c1 = c1.next
            } else {
                current.next = c2
                c2 = c2.next
            }
            current = current.next!!
        }

        // If there are remaining elements in either list, append them
        if (c1 != null) current.next = c1
        if (c2 != null) current.next = c2

        return dummy.next
        
    }
}