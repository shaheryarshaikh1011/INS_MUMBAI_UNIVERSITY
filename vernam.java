import java.util.*;
public class vernam {
    public static void main(String ar[])
    {
        char[] arr={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String pt,key,et="",dt="";
        int[] arr1=null;
        int pidx=0;
        int kidx=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter plaintext and key");
        pt=s.nextLine();
        key=s.nextLine();
        if(pt.length()!=key.length())
        {
            System.out.println("Plaintext and Key Must Be of same length");
        }
        else
        {
            arr1=new int[pt.length()];
        }
        for(int i=0;i<pt.length();i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(pt.charAt(i)==arr[j])
                    pidx=j;
            }
            arr1[i]=pidx;
        }
        for(int i=0;i<key.length();i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(key.charAt(i)==arr[j])
                    kidx=j;
            }
            arr1[i]=(arr1[i]+kidx)%52;
        }
        int I=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(i!=arr.length)
            {
                et=et+arr[arr1[I++]];
            }
        }
        System.out.println("Encrypted text is:"+et);
        for(int i=0;i<et.length();i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(et.charAt(i)==arr[j])
                    pidx=j;
            }
            arr1[i]=pidx;
        }
        for(int i=0;i<key.length();i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(key.charAt(i)==arr[j])
                    kidx=j;
            }
            arr1[i]=((arr1[i]-kidx)+52)%52;
        }
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(k!=arr1.length)
                dt=dt+arr[arr1[k++]];
        }
        System.out.println("Decrypted text is:"+dt);
        s.close();
    }
}
