import java.util.*;
class Repeat{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        String a=s.nextLine();
        Set<Integer> treeSet = new TreeSet<>();
        char[] b=a.toCharArray();
        for(int i=0;i<b.length;i++){
            for(int j=i+1;j<b.length;j++){
                int x=Character.getNumericValue(b[i]);
                int y=Character.getNumericValue(b[j]);
                if(x==y){
                    treeSet.add(x);
                }
            }
        }
            for (int i : treeSet) {
               System.out.print(i+" ");
            }
    }
}
