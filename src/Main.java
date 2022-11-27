public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.baseShopCalculatorManager = new SuperMarketCalculatorManager();
        customerManager.baseShopCalculatorManagerYedek = new MarketCalculatorManager();

//        customerManager.baseShopCalculatorManager2 = new MarketCalculatorManager();

        // Süpermarket için hesaplama yaptırtacağız.
        // new olarak MarketCalculatorManager belirlemiş olsaydık o sınıfa göre hesaplama yaptırtacaktık.
        customerManager.doTheShopping();

    }
}
