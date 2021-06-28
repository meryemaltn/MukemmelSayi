import java.util.Scanner;
 
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int total = 0;
        
        System.out.print("Bir sayi giriniz: ");
        int num = scan.nextInt();
        
        for(int i = 1; i < num; i++)
        {
            if(num % i == 0) {
                total += i;
            }
        }
        if(num == total) {
            System.out.println(num + " Mükemmel bir sayidir");
        }
        else {
            System.out.println(num + " Mükemmel bir sayi degildir.");
        }
    }
}