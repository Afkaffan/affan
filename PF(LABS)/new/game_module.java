import java.util.Scanner;

public class game_module{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("type WASD to move up,left,down,right");
        System.out.println();
        String in= sc.nextLine();
        check(in);

    }

    public static void check(String a){

        int x=0;
        int y=0;
        for(int i=0;i<a.length();i++){
            
            Character b= a.charAt(i);

            if (b=='w') {
                y+=1;
            }
            
            if (b=='s') {
                y-=1;
            }

            if (b=='a') {
                x+=1;
            }

            if (b=='d') {
                x-=1;
            }


        }
        
        if (x==0 && y==0) {
        
            System.out.println("true");   
        
        }else{
        
            System.out.println("false");
        
        }

    }
    
}
