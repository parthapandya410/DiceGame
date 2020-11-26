/*import java.util.*;
public class Dice_Game{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter your name :-");
        s = sc.nextLine();
        player p1 = new player(s);
        player p2 = new player("Autobot");
        int cnt1=0,cnt2=0,i;
        for(i=0;i<5;i++){
            if( 7 == p1.roll_dice(i)){
                cnt1++;
            }
            else{
                cnt2++;
            }
            if( 7 == p2.roll_dice(i)){
                cnt2++;
            }
            else{
                cnt1++;
            }
        }
        if(cnt1 > cnt2){
            System.out.println("winner is " + p1.s);
        }
        else if(cnt1 == cnt2){
            System.out.println("There will be a tie brekar");
            if( 7 == p1.roll_dice(i)){
                System.out.println("winner is " + p1.s);
            }
            else{
                System.out.println("winner is autobot");
            }
        }
        else{
            System.out.println("winner is autobot");
        }  
    }
}*/