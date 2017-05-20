class Nut  extends BonusDec{
    public Nut(FoodDec temp){
        super(temp);
    }
    public double getHp(){
        return super.getHp() - 0.1;
    }
    public int getPoints(){
        return super.getPoints() + 1;
    }
}
