import java.util.*;
class Index{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] b=new int[a];
        System.out.println(a);
        for(int i=0;i<a;i++){
            b[i]=s.nextInt();
        }
        for(int i=0;i<a;i++){
            if(i==b[i]){
                System.out.print(i+" ");
            }
        }
        
    }
}
