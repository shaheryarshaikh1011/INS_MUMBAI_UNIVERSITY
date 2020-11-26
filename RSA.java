import java.io.*;
import java.math.*;
public class RSA {
 public static void main(String args[])throws IOException
 {
 RSA obj=new RSA();
 obj.accept();
 }
 public void accept()throws IOException
 {
 BufferedReader br=new BufferedReader(new
InputStreamReader(System.in));
 int a,b;
 System.out.println("Enter Prime no. p:");
 a=Integer.parseInt(br.readLine());
 System.out.println("Enter Prime no. q:");
 b=Integer.parseInt(br.readLine());
 boolean f1=checkprime(a);
 boolean f2=checkprime(b);
 if(f1&&f2)
 {
 op(a,b);
 }
 else
 {
 System.out.println("Error: Please enter prime no. only:");
 accept();
 }
 }
 public void op(int a,int b)throws IOException
 {
 BufferedReader br=new BufferedReader(new
InputStreamReader(System.in));
 BigInteger p=BigInteger.valueOf(a);
 BigInteger q=BigInteger.valueOf(b);
 BigInteger one=new BigInteger("1");
 BigInteger n=p.multiply(q);
 BigInteger temp1=p.subtract(one);
 BigInteger temp2=q.subtract(one);
 BigInteger mul=temp1.multiply(temp2);
 System.out.println("Enter No. For division:");
 int c=Integer.parseInt(br.readLine());
 BigInteger d=BigInteger.valueOf(c);
 BigInteger r;
 while(true)
 {
 r=mul.gcd(d);
 if(r.toString().equals("1"))
 {
 break;
 }
 d=d.add(one);
 }
 BigInteger n1=new BigInteger("0");
 BigInteger zero=new BigInteger("0");
 BigInteger de;
 while(true)
 {

if((one.add(n1.multiply(mul))).remainder(d).toString().equals(zero.toString()
))
 {
 de=n1.multiply(mul).add(one).divide(d);
 break;
 }
 n1=n1.add(one);
 }
 System.out.println("Enter No. for Encryption:");
 int o=Integer.parseInt(br.readLine());
 BigInteger p1=BigInteger.valueOf(o);
 System.out.println("Value of (p1*q) is: "+n);
 System.out.println();
 System.out.println("Value of (p1-1)(Q-1) is:"+mul);
 System.out.println();
 System.out.println("Value of D is:"+d);
 System.out.println();
 System.out.println("Value of N1 is:"+n1);
 System.out.println();
 System.out.println("Value of DE=(c1+(n1*mul))/d is:"+de);
 System.out.println("Public Key is: "+n+" "+de);
 System.out.println();
 System.out.println("Private Key is: "+n+" "+d);
 System.out.println();
 BigInteger p2=new BigInteger("10");
 BigInteger en=p1.modPow(d, n);
 System.out.println("Encrypted No. is: "+en);
 p1=en.modPow(de, n);
 System.out.println("Decrypted No. is: "+p1);
 System.out.println();
 }
 public boolean checkprime(int no)
 {
 for(int i=2;i<no;i++)
 if(no%i==0)
 return false;
 return true;
 }
}
