class Node{
    int value;
    Node next;
    
    public Node(int value){
        this.value=value;
        this.next=null;
    }
}
class Main{
    public static void main(String []args){
        
        Node n1=new Node(10);
        Node n2=new Node(10);
        Node n3=new Node(20);
        Node n4=new Node(30);
        Node n5=new Node(40);
        Node n6=new Node(50);
        Node n7=new Node(60);
        
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        
        Node temp = n1;
        int sum=0;
        while(temp!=null){
            sum+=temp.value;
            temp = temp.next;
        }
        System.out.print(sum);
    }
}
