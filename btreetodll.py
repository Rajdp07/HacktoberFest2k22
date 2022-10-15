class Node:    
    def __init__(self,data):    
        self.data = data;    
        self.left = None;    
        self.right = None;    
            
class BinaryTreeToDLL:    
    def __init__(self):    
        self.root = None;    
        self.head = None;    
        self.tail = None;    
    def convertbtToDLL(self, node):    
        if(node == None):    
            return;    
                
        self.convertbtToDLL(node.left);    

        if(self.head == None):    
            self.head = self.tail = node;    
        else:    
            self.tail.right = node;    
            node.left = self.tail;    
            self.tail = node;    
        self.convertbtToDLL(node.right);    
        
    def display(self):    
        current = self.head;    
        if(self.head == None):    
            print("List is empty");    
            return;    
        print("Nodes of generated doubly linked list: ");    
        while(current != None):    
            print(current.data),    
            current = current.right;    
            
           
bt = BinaryTreeToDLL();    
bt.root = Node(1);    
bt.root.left = Node(2);    
bt.root.right = Node(3);    
bt.root.left.left = Node(4);    
bt.root.left.right = Node(5);    
bt.root.right.left = Node(6);    
bt.root.right.right = Node(7);    
     
bt.convertbtToDLL(bt.root);    
     
bt.display();
