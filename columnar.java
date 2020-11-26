import java.util.*;
public class columnar {
 String pt,et="",dt="";
 char[][] arr;
 int[] arr1;
 int r,c;
 public columnar(int x,int y)
 {
 r=x;
 c=y;
 arr=new char[r][c];
 }
 public void encrypt(String pt1,int num)
 {
 pt=pt1;
 et="";
 if(num>=1)
 {
 int k=0;
 for(int i=0;i<r;i++)
 {
 for(int j=0;j<c;j++)
 {
 if(k!=pt.length())
 arr[i][j]=pt.charAt(k++);
 else
 arr[i][j]=' ';
 }
 }
 System.out.println("Encrypted Array:");
 for(int i=0;i<r;i++)
 {
 for(int j=0;j<c;j++)
 {
 System.out.println(arr[i][j]+"|");
 }
 System.out.println();
 }
 arr1=new int[c];
 Scanner s=new Scanner(System.in);
 System.out.println("Enter Column Number:");
 for(int i=0;i<arr1.length;i++)
 {
 arr1[i]=s.nextInt();
 }
 for(int j=0;j<arr1.length;j++)
 {
 for(int i=0;i<r;i++)
 {
 et=et+arr[i][arr1[j]];
 }
 }
 System.out.println("Encrypted Text:"+et);
 encrypt(et, num-1);
 s.close();
 }
 }
 public static void main(String args[])
 {
 String msg;
 Scanner s=new Scanner(System.in);
 System.out.println("Enter Plaintext:");
 msg=s.nextLine();
 int col,row;
 System.out.println("Enter The Size:");
 col=s.nextInt();
 int rem,m;
 rem=msg.length()%col;
 m=msg.length()%col;
 if(m>0 && m<col)
 {
 rem=rem+1;
 }
 row=rem;
 columnar s1=new columnar(row,col);
 s1.encrypt(msg, 1);
 s.close();
 }

}
