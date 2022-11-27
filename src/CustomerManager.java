import java.util.Scanner;

/**
 * @author hcalpay
 * @Date 12.11.2022
 */
public class CustomerManager {

    BaseShopCalculatorManager baseShopCalculatorManager ;
    BaseShopCalculatorManager baseShopCalculatorManagerYedek ;

    Scanner scanner = new Scanner(System.in);
    void doTheShopping(){
        System.out.println("-------------------\n-> Ekmek Hesaplaması\n-------------------");
        System.out.print("-> Kaç Ekmek Alacaksınız: ");
        int x = scanner.nextInt();
        if(x>10){
            System.out.println("-> Supermarket Ekmek Fiyatı: "+baseShopCalculatorManager.breadBuy(x)/x+" TL");
            System.out.println("-> Almış Olduğunuz "+ x +" Ekmek İçin Ödeyeceğiniz Fiyat: "+baseShopCalculatorManager.breadBuy(x)+" TL");
        }else {
            System.out.println("-> Market Ekmek Fiyatı: "+baseShopCalculatorManagerYedek.breadBuy(x)/x+" TL");
            System.out.println("-> Almış Olduğunuz "+ x +" Ekmek İçin Ödeyeceğiniz Fiyat: "+baseShopCalculatorManagerYedek.breadBuy(x)+" TL");
        }

    }

}
