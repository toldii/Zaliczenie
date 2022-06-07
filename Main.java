import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
    System.out.println("Podaj pierwszą liczbe: ");
    int a = scan.nextInt();
       System.out.println("Podaj drugą liczbe: ");
    int b = scan.nextInt();
    System.out.println("Podaj trzecią liczbe: ");
    int c = scan.nextInt();
    int max =0 ;
    if (a>b && b>c){
      max = a;
      }
      if (b>a && b>c) {
        max =b;
      }
       if (c>b && c>a) {
        max =c;
    }
    System.out.println("Największa z podanych liczb to: " + max );
}
}