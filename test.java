import java.io.*;
import java.util.*;
class test{
static final int MAX_CHAR=256;
static int countChar(String str){
int count5[]=new int[MAX_CHAR];
int len=str.length();
for(int i2=0;i2<len;i2++)
count5[str.charAt(i2)]++;
char chz[]=new char[str.length()];
for(int i2=0;i2<len;i2++){
chz[i2]=str.charAt(i2);
int find=0;
for(int j2=0;j2<=i2;j2++){
if(str.charAt(i2)==chz[j2])
find++;
}
if(find==1)
System.out.println("Number of Occurrence of"+str.charAt(i2)+"is:"+count5[str.charAt(i2)]);
}
return 0;
}
public static void main(String args[])throws IOException{
FileWriter fw=new FileWriter("test.txt");
String str="File Handling in Java";
for(int i=0;i<str.length();i++)
fw.write(str.charAt(i));
System.out.println("Writing Successful");
fw.close();
int ch;
FileReader fr=null;
try{
fr=new FileReader("test.text");
}
catch(FileNotFoundException fe){
System.out.println("File not found exception");
}
int vowels=0,consonants=0,p=0;
while((ch=fr.read())!=-1){
int count=0,count1=0;
char ch1;
str=str.toLowerCase();
for(int k=0;k<str.length();k++){
if(str.charAt(k)!=' '){
count++;
}
if(str.charAt(k)=='a'||
str.charAt(k)=='e'||
str.charAt(k)=='i'||
str.charAt(k)=='o'||
str.charAt(k)=='u')
{
vowels++;
}
else{
consonants++;
}
}
char ch2[]=new char[str.length()];
for(int l=0;l<str.length();l++){
ch2[l]=str.charAt(l);
if(((l>0)&&(ch2[l]!=' ')&&(ch2[l-1]==' '))||((ch2[0]!=' '&&(l==0))))
count1++;
}
System.out.println("Total number of characters in a string:"+count);
System.out.println("Total number of vowels in test.text file is="+vowels);
System.out.println("Total number of consonents in test.text file is="+consonants);
System.out.println("Total number of words in test.txt file is="+count1);
countChar(str);
fr.close();
}
}
}