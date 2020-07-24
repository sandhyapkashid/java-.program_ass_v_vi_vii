import java.util.*;
class g1{
static void count(int arr[],int a_size){
int ecount=0;
int ocount=0;
for(int i=0;i<a_size;i++){
if((arr[i]&1)==1)
ocount++;
else
ecount++;
}
System.out.println("Number of even:"+ecount);
System.out.println("Number of odd:"+ocount);
}
public static void main(String args[]){
int arr[]={2,4,6,7,8,9,90,78,41,56,79,45,65,85};
int n=arr.length;
count(arr,n);
}
}