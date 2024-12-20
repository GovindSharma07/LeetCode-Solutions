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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var f = l1
        var s = l2
        val res : ListNode? = ListNode(0)
        var current = res 
        var carry = 0
        while(f != null && s != null){
            val temp: Int = f.`val` + s.`val` + carry
            current!!.next = ListNode(temp%10)
            current = current!!.next
            f = f.next
            s = s.next
            carry = temp/10
        }

        while(f != null){
            val temp = f.`val` + carry
            current!!.next = ListNode(temp%10)
            current = current!!.next
            f = f.next
            carry = temp/10
        }
        while(s != null){
            val temp = s.`val` + carry
            current!!.next = ListNode(temp%10)
            current = current!!.next
            s = s.next
            carry = temp/10
        }
        if (carry == 1){
            current!!.next = ListNode(1)
        }
        return res!!.next
    }
}