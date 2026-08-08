import java.util.Scanner;
public class problem3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int i;
        System.out.println("enter signal input");
        String you=sc.nextLine().toLowerCase();
        int[] hass=new int[26];
        for(i=0;i<you.length();i++){
             hass[you.charAt(i)-'a']++;
        }
        int max=hass[0];
        int maxindex=0;
        for( i=0;i<hass.length;i++){
            if(hass[i]>max){
                max=hass[i];
                maxindex=i;
            }
        }
        System.out.printf("most repeated character is %c repeated %d times",(char)(maxindex+'a'),max);
        sc.close();
    }
}
