package suanfa.Linkedlist;

import java.util.Stack;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode heroNode = new HeroNode(1, "yqc", "goba");
        HeroNode heroNode1 = new HeroNode(2, "gbh", "goba");
        HeroNode heroNode2 = new HeroNode(3, "gbb", "goba");
        HeroNode heroNode3 = new HeroNode(4, "gbw", "goba");

        SingleLinkedlist singleLinkedList = new SingleLinkedlist();

//        singleLinkedList.add(heroNode);
//        singleLinkedList.add(heroNode1);
//        singleLinkedList.add(heroNode2);
//        singleLinkedList.add(heroNode3);



        singleLinkedList.addByOrder(heroNode);
        singleLinkedList.addByOrder(heroNode2);
        singleLinkedList.addByOrder(heroNode1);
        singleLinkedList.addByOrder(heroNode3);





        singleLinkedList.list();
        System.out.println("链表节点数"+getlength(singleLinkedList.getHead()));

        HeroNode heroNode4 = new HeroNode(3, "杨泉城", "第三");
        singleLinkedList.update(heroNode4);
        singleLinkedList.delete(2);

        System.out.println();


        singleLinkedList.list();

        System.out.println("链表节点数"+getlength(singleLinkedList.getHead()));


        System.out.println("获取倒数第k个节点");
        HeroNode res=findLastIndex(singleLinkedList.getHead(),1);
        System.out.println("res="+res);




        System.out.println("反转之前");
        singleLinkedList.list();
        reverseList(singleLinkedList.getHead());
        System.out.println("反转之后");
        singleLinkedList.list();


        System.out.println();
        System.out.println("逆序打印单链表");
        reversePrint(singleLinkedList.getHead());


    }
    //逆序打印单链表
    public static void reversePrint(HeroNode head){
        if (head.next==null){
            return;
        }
        Stack<HeroNode> stack = new Stack();
        HeroNode cur=head.next;
        while (cur!=null){
            stack.push(cur);
            cur=cur.next;
        }

        while (stack.size()>0){
            System.out.println(stack.pop());
        }
    }

    //反转单链表
    public static void reverseList(HeroNode head){
        if (head.next==null||head.next.next==null){
            return;
        }
        HeroNode cur=head.next;
        HeroNode next=null;//指向当前节点的下一个节点
        HeroNode reverseHead=new HeroNode(0,"","");
        //遍历原来的链表，每遍历一个结点，请将其取出，并放在reverseHead链表的最前端

        while (cur!=null){
            next=cur.next;//存储当前节点的下一个节点
            cur.next=reverseHead.next;//将cur的下一个节点指向新的链表的最前端
            reverseHead.next=cur;//将cur连接到新链表上
            cur=next;
        }
        //将head.next指向reverseHead.next
        head.next=reverseHead.next;
    }

    //获取倒数第k个节点
    public static  HeroNode findLastIndex(HeroNode head,int index){
        if (head.next==null){
            return null;
        }
        int size=getlength(head);
        if (index<=0||index>size){
            return null;
        }
        HeroNode cur =head.next;
        for (int i = 0; i < size - index; i++) {
            cur=cur.next;
        }
        return cur;
    }

    //获取链表节点数
    public static int getlength(HeroNode head){

        if (head.next==null){
            return 0;
        }
        int length=0;
        HeroNode cur=head.next;
        while (cur!=null){
            length++;
            cur=cur.next;
        }
        return length;
    }
}

class SingleLinkedlist{
    //初始化一个头结点
    private HeroNode head =new HeroNode(0,"","");

    public HeroNode getHead() {
        return head;
    }

    //添加到尾部
    public void add(HeroNode heroNode){
        HeroNode temp=head;

        while (true){
            if (temp.next==null){
                break;
            }
            temp=temp.next;
        }

        temp.next=heroNode;
    }

    public void addByOrder(HeroNode heroNode){
        //头结点不能动因此通过一个辅助指针来找到添加的位置
        HeroNode temp=head;
        boolean flag=false;
        while (true){
            if (temp.next==null){
                break;
            }
            if (temp.next.no>heroNode.no){
                break;
            }else if (temp.next.no== heroNode.no){
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if (flag){
            System.out.println("准备添加的数据已经存在");
        }else {
            heroNode.next=temp.next;
            temp.next=heroNode;
        }
    }
    public void delete(int no){
        HeroNode temp=head;
        boolean flag=false;
        while (true){
            if (temp.next==null){
                break;
            }
            if (temp.next.no==no){
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if (flag){
            temp.next=temp.next.next;
        }else {
            System.out.printf("没有找到%d",no);
        }
    }


    public void update(HeroNode newHeroNode){
        if (head.next==null){
            System.out.println("链表为空");
            return;
        }
        HeroNode temp=head.next;
        boolean flag=false;
        while (true){
            if (temp.next==null){
                break;
            }
            if (temp.no == newHeroNode.no){
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if (flag==true){
            temp.nickname= newHeroNode.nickname;
            temp.name= newHeroNode.name;
        }else {
            System.out.printf("没有找到编号%d",newHeroNode.no);
        }
    }



    //显示链表
    public void list(){
        if (head.next==null){
            System.out.println("链表为空");
            return;
        }
        HeroNode temp=head.next;
        while (true){
            if (temp==null){
                break;
            }
            System.out.println(temp);
            temp=temp.next;
        }
    }
}



class HeroNode{
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;
    public HeroNode(int no,String name,String nickname){
        this.no=no;
        this.name=name;
        this.nickname=nickname;
    }


    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\''+
                '}';
    }
}