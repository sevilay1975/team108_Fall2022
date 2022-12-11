package day13_MethodOverloading_WhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        // Kullanicidan toplamak uzere sayi alin
        // girilen sayilarin toplami 500 olur veya gecerse
        // " Bu kadar sayi yeter" deyip toplami yazdirin
        // bu soruyu illa da for loop ile yapalim dersek
        // adim sayisini tahmin edip biraz abartabiliriz

        Scanner scan=new Scanner(System.in);
        int sayi=scan.nextInt();
         int count=0;
         int toplam=0;
         //for ile yapimi:
        for (int i = 1; i <10000 ; i++) {
            System.out.println("toplamak uzere tamsayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
            if (toplam >= 500) {
                System.out.println("Bu kadar sayi yeter. Toplamlari " + toplam + " oldu");
                break;
            }
        }
        //while ile yapimi:
        while(toplam<500){
            System.out.println("Lutfen toplamak uzer sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            count++;
        }
        System.out.println("toplam = " + toplam+"  "+count+" seferde ulasildi");
    }
}
