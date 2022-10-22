class Node:
    def __init__(self,val=0):
        self.val = val
        self.next = None
        
class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        
    def insert(self, val):
        node = Node(val)
        if self.head == None:
            self.head = self.tail = node
        else:
            self.tail.next = node
            self.tail = self.tail.next
            
    def show(self):
        temp = self.head
        while temp:
            print(temp.val,end=" ")
            temp= temp.next
        print("")
        
    def reverse(self):
        left=  self.tail = self.head
        right = left.next
        left.next = None
        while right:
            temp = right.next
            right.next = left
            left = right
            right = temp
        self.head = left

        
if __name__ == '__main__':
    
    l1 = LinkedList()
    l1.insert(5)
    l1.insert(6)
    l1.insert(7)
    l1.insert(88)
    l1.show()
    l1.reverse()
    l1.show()
