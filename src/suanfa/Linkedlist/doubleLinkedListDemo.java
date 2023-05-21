package suanfa.Linkedlist;

public class doubleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode2 heroNode = new HeroNode2(1, "yqc", "goba");
        HeroNode2 heroNode1 = new HeroNode2(2, "gbh", "goba");
        HeroNode2 heroNode2 = new HeroNode2(3, "gbb", "goba");
        HeroNode2 heroNode3 = new HeroNode2(4, "gbw", "goba");

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(heroNode);
        doubleLinkedList.add(heroNode1);
        doubleLinkedList.add(heroNode2);
        doubleLinkedList.add(heroNode3);

        doubleLinkedList.list();

        System.out.println("修改后");
        HeroNode2 heroNode21 = new HeroNode2(2, "杨泉城", "gb");
        doubleLinkedList.update(heroNode21);
        doubleLinkedList.list();

    }
}

class DoubleLinkedList{
    private HeroNode2 head =new HeroNode2(0,"","");

    public HeroNode2 getHead() {
        return head;
    }

    //添加到双向链表的尾部
    public void add(HeroNode2 heroNode){
        HeroNode2 temp=head;

        while (true){
            if (temp.next==null){
                break;
            }
            temp=temp.next;
        }
        temp.next=heroNode;
        heroNode.pre=temp;
    }

    public void update(HeroNode2 newHeroNode){
        if (head.next==null){
            System.out.println("链表为空");
            return;
        }
        HeroNode2 temp=head.next;
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

    public void delete(int no){

        HeroNode2 temp=head.next;
        boolean flag=false;
        while (true){
            if (temp.next==null){
                break;
            }
            if (temp.no==no){
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if (flag){
            temp.pre.next=temp.next;
            if (temp.next!=null){
                temp.next.pre=temp.pre;
            }
        }else {
            System.out.printf("没有找到%d",no);
        }
    }


    public void list(){
        if (head.next==null){
            System.out.println("链表为空");
            return;
        }
        HeroNode2 temp=head.next;
        while (true){
            if (temp==null){
                break;
            }
            System.out.println(temp);
            temp=temp.next;
        }
    }

}


class HeroNode2{
    public int no;
    public String name;
    public String nickname;
    public HeroNode2 next;
    public HeroNode2 pre;

    public HeroNode2(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode2{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\''+
                '}';
    }
}