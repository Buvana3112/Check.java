import java.util.*;
class Count{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] b=new int[a];
        System.out.println(a);
        for(int i=0;i<a;i++){
            b[i]=s.nextInt();
        }
        for(int i=0;i<a;i++){
            int count=0;
            for(int j=0;j<a;j++){
                if(b[i]==b[j]){
                    count=count+1;
                }
            }
            if(count==1){
                System.out.println(b[i]);
            }
        }
    }
}
