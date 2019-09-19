public class SportMaster {
    public static void main(String[] args) {

        int PurchaseAmount = 14_000;
        int CurrentAmount = 3000;
        int bonus;
        int AmountForBonus = 1000;

        // Виды бонусных карт и бонусов
        int Standart_Card = 15_000;
        int Standart_Bonus = 50;

        int Silver_Card = 15_0000;
        int Silver_Bonus = 70;

        int Gold_Card = 15_0000;
        int Gold_Bonus = 100;

        int AmountAllPurchase = PurchaseAmount + CurrentAmount;

        if(AmountAllPurchase <= Standart_Card){
            bonus = CurrentAmount / AmountForBonus * Standart_Bonus;
            System.out.println(bonus);
        }else if(AmountAllPurchase <= Silver_Card){
            bonus = CurrentAmount / AmountForBonus * Silver_Bonus;
            System.out.println(bonus);
        }else if(AmountAllPurchase > Gold_Card){
            bonus = CurrentAmount / AmountForBonus* Gold_Bonus;
            System.out.println(bonus);
        }

    }
}
