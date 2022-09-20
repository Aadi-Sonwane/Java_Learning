public class Strings {
  public static void main(String[] args) {
    String greeting = "Hello";
    System.out.println(greeting);
    
    // length() funcation is use for to count the alphabet 
    String alph = "abcdefghijklmnopqrstuvwxyzDDD";
    System.out.println("The lenght of this String is :" +alph.length());
    
    // to convert the letters into upper case we use toUppperCase(); funcation 
    System.out.println(alph.toUpperCase());
    
    
    // to convert the letters into lowwer case we use tolowerCase(); funcation
    System.out.println(alph.toLowerCase());
    
    
    // .. In perticular string we want to find perticualr charcter then we use Indexof(); 
    
    String name = "Aditya sonwane ";
    System.out.println(name.indexOf("Aditya"));
  }
}
