

# Complete the mergeLists function below.

#
# For your reference:
#
# SinglyLinkedListNode:
#     int data
#     SinglyLinkedListNode next
#
#
def mergeLists(head1, head2):
    dummy = SinglyLinkedListNode(-1)   
    tail = dummy                       
    while head1 is not None and head2 is not None:
        if head1.data <= head2.data:
            tail.next = head1         
            head1 = head1.next         
        else:
            tail.next = head2
            head2 = head2.next

        tail = tail.next              
    if head1 is not None:
        tail.next = head1
    else:
        tail.next = head2

    return dummy.next            


