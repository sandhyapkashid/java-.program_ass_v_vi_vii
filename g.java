import java.util.*;
class g{
public static void main(String args[]){
ArrayList<Integer>list=new ArrayList<Integer>();
list.add(2);
list.add(62);
list.add(4);
list.add(78);
list.add(6);
list.add(10);
list.add(49);
list.add(20);
list.add(59);
list.add(43);
list.add(29);
list.add(30);
list.add(56);
list.add(89);
System.out.println("List"+list);
int minlist=Collections.min(list);
int maxlist=Collections.max(list);
System.out.println("Begin value of list is:"+minlist);
System.out.println("End value of list:"+maxlist);
}
}