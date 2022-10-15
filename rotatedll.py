class Node:    
    def __init__(self,data):    
        self.data = data;    
        self.previous = None;    
        self.next = None;    
            
class RotateList:    
    def __init__(self):    
        self.head = None;    
        self.tail = None;    
        self.size = 0;    
    def addNode(self, data):    
        newNode = Node(data);    
            
        if(self.head == None):    
            self.head = self.tail = newNode;        
            self.head.previous = None;    
            self.tail.next = None;    
        else:    
            self.tail.next = newNode;    
            newNode.previous = self.tail;    
            self.tail = newNode;    
            self.tail.next = None;    
        self.size = self.size + 1;    
            
    def rotateList(self, n):    
        current = self.head;    
            
        if(n == 0 or n >= self.size):    
            return;    
        else:    
            for i in range(1, n):    
                current = current.next;    
            self.tail.next = self.head;    
            self.head = current.next;    
            self.head.previous = None;    
            self.tail = current;    
            self.tail.next = None;    
    def display(self):    
        current = self.head;    
        if(self.head == None):    
            print("List is empty");    
            return;    
                
        while(current != None):    
            print(current.data),    
            current = current.next;    
        print();    
            
dList = RotateList();    
dList.addNode(1);    
dList.addNode(2);    
dList.addNode(3);    
dList.addNode(4);    
dList.addNode(5);    
     
print("Original List: ");    
dList.display();    
     
dList.rotateList(3);    
     
print("Updated List: ");    
dList.display();   
