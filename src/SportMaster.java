public class SportMaster {
    public static void main(String[] args) {

        int purchaseAmount = 14_000;
        int currentAmount = 3000;
        int amountForBonus = 1000;
        
        int standartCard = 15_000;
        int standartBonus = 50;

        int silverCard = 15_0000;
        int silverBonus = 70;

        int goldCard = 15_0000;
        int goldBonus = 100;
       
        int bonus = 0;
        int bonusMultiplication = purchaseAmount / amountForBonus;
        int amountAllPurchase = purchaseAmount + currentAmount;

        if(amountAllPurchase <= standartCard){
            bonus = bonusMultiplication * standartBonus;
        }else if(amountAllPurchase <= silverCard){
             bonus = bonusMultiplication * silverBonus;
        }else if(amountAllPurchase > goldCard){
             bonus = bonusMultiplication * goldBonus;
        }
        System.out.println(bonus);
    }
}
