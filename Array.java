import java.util.Scanner;

class Array {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size");
    int size = sc.nextInt();
    int [] a = new int[size];

    for(int i=0;i<size;i++){
        System.out.println("Enter Array :");
        a[i] = sc.nextInt();
    }      
    System.out.println("Display Array");
    for(int i=0;i<size;i++){
        System.out.print(a[i]+" ");
    }
    }
}