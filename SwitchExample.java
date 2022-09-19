import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter Your Choice ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n){
            case 1: System.out.println("This is one ");
            break;
            case 2: System.out.println("this is two");
            break;
            case 3: System.out.println("This is three");
            break;
            default: System.out.println("Invalid ");
        }
    }
}
