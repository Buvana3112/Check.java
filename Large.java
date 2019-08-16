import java.util.*;
class Large{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] b=new int[a];
        System.out.println(a);
        for(int i=0;i<a;i++){
            b[i]=s.nextInt();
           
        }
        
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                if(b[i]<b[j]){
                    int t=b[i];
                    b[i]=b[j];
                    b[j]=t;
                }
            }
        } 
        String x=""; 
        for(int i=0;i<a;i++){
           x=x+b[i];
        }
        int y=Integer.parseInt(x);
        if(y>0){
            System.out.println(y);
        }
        else{
            System.out.println("0");
        }
    }
}
