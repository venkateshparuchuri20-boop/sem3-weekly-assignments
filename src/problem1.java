import java.util.Scanner;
public class problem1 {
    public static void main(String[] args){
        System.out.println("enter seat numbers of students");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean found=false;
        for(int i=0;i<n;i++){
            boolean alreadyprinted=false;
            for(int k=0;k<i;k++){
                if(a[k]==a[i]){
                    alreadyprinted=true;
                    break;
                }
            }
            if(alreadyprinted){
                continue;
            }
            for(int j=i+1;j<n;j++){
               if(a[i]==a[j]){
                   System.out.printf("duplicate seat number found %d",a[i]);
                   found=true;
                   break;
               }
            }
        }
        if(!found){
            System.out.printf("no duplicates seats found ");
        }
        sc.close();
    }
}
