/**
 * @author hcalpay
 * @Date 12.11.2022
 */
public class SuperMarketCalculatorManager extends BaseShopCalculatorManager{

    @Override
    double breadBuy(int howMuchBread) {
        return howMuchBread * 2.5;
    }
}
