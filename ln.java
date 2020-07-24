import java.util.*;
class ln{
public static void main(String args[]){
LinkedList<String> ll=new LinkedList<String>();
ll.add("A");
ll.add("B");
ll.addLast("C");
ll.addFirst("D");
ll.add(2,"E");
System.out.println(ll);
ll.remove(3);
ll.removeFirst();
ll.set(1,"F");
for(String str:ll)
System.out.print(str+" ");
LinkedList sec_list=new LinkedList();
sec_list=(LinkedList)ll.clone();
System.out.println("Second LinkedList is:"+sec_list);
System.out.println("The Object that replaced is:"+ll.set(2,"G"));
System.out.println("The element is:"+ll.get(2));
System.out.println("Does the List contains'A':"+ll.contains("A"));
ll.push("Z");
System.out.println(ll);
String s=ll.pop();
System.out.println(s);
Collection<String>collect=new ArrayList<String>();
collect.add("A");
collect.add("Computer");
ll.addAll(collect);
System.out.println("the first element is:"+ll.getFirst());
System.out.println("the last element is:"+ll.getLast());
System.out.println("The first element is:"+ll.removeFirst());
System.out.println("The last element is :"+ll.removeLast());
ll.addLast("Last");
ll.add("L");
ll.add("M");
ll.add("N");
System.out.println("The list is as fallows:");
ListIterator list_Iter=ll.listIterator(2);
while(list_Iter.hasNext()){
System.out.println(list_Iter.next());
}
System.out.println("The first occurrence of Fis at index:"+ll.indexOf("F"));
ll.clear();
System.out.println("List after clearing all elements:"+ll);
}
}
