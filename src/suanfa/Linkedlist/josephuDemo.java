package suanfa.Linkedlist;

public class josephuDemo {
    public static void main(String[] args) {
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        circleSingleLinkedList.add(5);
        circleSingleLinkedList.show();

        circleSingleLinkedList.cuntBoy(1,2,5);
    }
}
//创建一个环形单链表
class CircleSingleLinkedList{
    private Node first=new Node(-1);


    public void add(int nums){
        if (nums<1){
            System.out.println("数据补正确");
            return;
        }

        Node cur=null;

        for (int i = 1; i <=nums; i++) {
            Node node = new Node(i);
            if (i==1){
                first=node;
                first.setNext(first);
                cur=first;
            }else {
                cur.setNext(node);
                node.setNext(first);
                cur=node;
            }
        }

    }
    public void show(){
        if (first ==null){
            System.out.println("链表为空");
            return;
        }
        Node cur=first;
        while (true){
            System.out.printf("小孩编号%d\n",cur.getNo());
            if (cur.getNext()==first){
                break;
            }
            cur=cur.getNext();
        }
    }

    //根据用户输入计算出圈顺序
    //startNo表示从第几个开始出圈
    //cuntNum表示数几下
    //nums表示最初有多少个小孩在圈内
    public void cuntBoy(int startNo,int cuntNum,int nums){
        if (first==null||startNo<1||startNo>nums){
            System.out.println("输入有误请重新输入");
            return;
        }

        Node helper=first;//helper指针事先指向链表的最后一个结点
        while (true){
            if (helper.getNext()==first){
                break;
            }
            helper=helper.getNext();
        }
        //小孩报数前要让first和helper向后移动startNo-1次
        for (int i = 0; i < startNo - 1; i++) {
            helper=helper.getNext();
            first=first.getNext();
        }
        //报数时让first和helper同时移动nums-1次出圈
        while (true){
            if (helper==first){
                break;
            }

            for (int i = 0; i < cuntNum - 1; i++) {
                helper=helper.getNext();
                first=first.getNext();
            }
            System.out.printf("要出圈的小孩%d\n",first.getNo());

            first=first.getNext();
            helper.setNext(first);
        }
        System.out.printf("最后留下的小孩的编号%d",first.getNo());

    }


}

//表示一个结点
class Node{
    private int no;
    private Node next;
    public Node(int no){
        this.no=no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}