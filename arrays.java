// Program to perfomr array travelsal 
import java.util.*;
class Arrays {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int marks[] = new int[size];
        
        
        System.out.println("Enter the marks of subject ");
        for (int i = 0 ; i < size ; i++){
            marks[i] = sc.nextInt();
        }
        
        int x = 22;
        
        for ( int i = 0; i < size ; i++){
            if(marks[i] == x){
                System.out.println("The element in array is present at the index of :" +i );
            }
        }
        
        for(int i = 0 ; i < size; i++){
            System.out.println(marks[i]);
        }
        
        
        
    }
}
