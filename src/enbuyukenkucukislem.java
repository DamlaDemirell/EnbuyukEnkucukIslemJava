import java.util.Scanner;
public class  enbuyukenkucukislem {
    public static void main(String[] args) {
        // title
        System.out.println("En büyük ve en küçük sayıyı bulma işlemi. ");
        //Scanner input
        Scanner input = new Scanner(System.in);
        // istenilen durum :
        System.out.println("Kaç adet sayı girecekseniz: ");
        // değişken ve veri atama
        int number = input.nextInt();

        int i = 1; // kaçtan başlasın istiyor isek.

        int enBuyuk = Integer.MIN_VALUE; // En büyük sayıyı saklamak için başlangıç değeri olarak en küçük integer değeri
        int enKucuk = Integer.MAX_VALUE; // En küçük sayıyı saklamak için başlangıç değeri olarak en büyük integer değeri

        // başı sonu bilinen döngü
        while (i <= number) {
            System.out.println(i+ "Sayıyı giriniz: ");
            int currentNumber = input.nextInt();

            // En büyük sayıyı güncelle
            if( currentNumber> enBuyuk){
                enBuyuk = currentNumber;
            }
            // En küçük sayıyı güncelle
            if( currentNumber < enKucuk){
                enKucuk = currentNumber;
            }


            i++;
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}

