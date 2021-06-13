import java.util.Scanner;
class ifsample{
    public static void main(String argrs[]){
        Scanner s = Scanner(System.in); //changed here
        System.out.println("enter length ");
        int length = s.nextInt();
        System.out.println("enter breadth ");
        int breadth = s.nextInt();
        if(breadth==length){
            System.out.println("SQUARE")    ;
        }
        else {
            System.out.println("RECTANGLE");}
    }
}
