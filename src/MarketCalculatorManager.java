/**
 * @author hcalpay
 * @Date 12.11.2022
 */
public class MarketCalculatorManager extends BaseShopCalculatorManager{
    @Override
    double breadBuy(int howMuchBread) {
        return howMuchBread* 1.75;
    }
}
