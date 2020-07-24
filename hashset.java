import java.util.*;
class hashset{
public static void main(String args[]){
HashSet<Integer>hs=new HashSet<Integer>();
hs.add(1);
hs.add(2);
hs.add(3);
hs.add(4);
System.out.println("List of HashSet:"+hs);
System.out.println("Initial Size:");
System.out.println(hs.size());
System.out.println("After ensuring Size:");
hs.add(14);
System.out.println(hs.size());
hs.remove(14);
System.out.println("After decreasing size:"+hs.size());
System.out.println("Is Set Empty:"+hs.isEmpty());
System.out.println("does the element contains in hashset:"+hs.contains(3));
Object[] arr=hs.toArray();
System.out.println("conversion of hashset into array:");
for(Object obj:arr)
System.out.println(obj+" ");
hs.add(5);
System.out.println("After appending Element:"+hs);
hs.remove(3);
System.out.println("After removing element:"+hs);
hs.clear();
System.out.println("After removing element:"+hs);

}
}