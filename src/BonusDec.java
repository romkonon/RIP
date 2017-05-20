public abstract class BonusDec implements FoodDec{
    protected final FoodDec bonusFood;
    public BonusDec(FoodDec temp){
        this.bonusFood = temp;
    }
    public double getHp(){
        return bonusFood.getHp();
    }
    public int getPoints(){
        return bonusFood.getPoints();
    }
}
