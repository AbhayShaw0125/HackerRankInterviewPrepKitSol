import scala.io.StdIn._

class SinglyLinkedListNode(var data: Int) {
    var next: SinglyLinkedListNode = null
}

class SinglyLinkedList {
    var head: SinglyLinkedListNode = null
    var tail: SinglyLinkedListNode = null

    def insertNode(data: Int): Unit = {
        val node = new SinglyLinkedListNode(data)
        if (head == null) head = node
        else tail.next = node
        tail = node
    }
}

object Solution {

    def mergeLists(head1: SinglyLinkedListNode, head2: SinglyLinkedListNode): SinglyLinkedListNode = {

        val dummy = new SinglyLinkedListNode(-1) // fake head
        var tail = dummy

        var h1 = head1
        var h2 = head2

        // Merge until one list finishes
        while (h1 != null && h2 != null) {
            if (h1.data <= h2.data) {
                tail.next = h1
                h1 = h1.next
            } else {
                tail.next = h2
                h2 = h2.next
            }
            tail = tail.next
        }

        // Attach leftover nodes
        if (h1 != null) tail.next = h1
        else tail.next = h2

        dummy.next
    }

    def printList(node: SinglyLinkedListNode): Unit = {
        var curr = node
        while (curr != null) {
            print(curr.data)
            if (curr.next != null) print(" ")
            curr = curr.next
        }
        println()
    }

    def main(args: Array[String]) {
        val t = readInt()

        for (_ <- 0 until t) {

            val l1Count = readInt()
            val list1 = new SinglyLinkedList()
            for (_ <- 0 until l1Count) {
                list1.insertNode(readInt())
            }

            val l2Count = readInt()
            val list2 = new SinglyLinkedList()
            for (_ <- 0 until l2Count) {
                list2.insertNode(readInt())
            }

            val mergedHead = mergeLists(list1.head, list2.head)
            printList(mergedHead)
        }
    }
}
