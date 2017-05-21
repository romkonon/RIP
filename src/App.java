import java.util.Timer;
import java.util.TimerTask;

public class App {

    static final private int T = 100;

    public static void main(String[] args) {
        Hero h = Hero.getHero(HeroType.Viking);
        Hero.setName("test hero");
        Hero f = Hero.getHero(HeroType.Basic);
        Hero.setName("testing name");
        Timer mainTimer = new Timer();
        TimerTask killingTask = new KillingTask(h);
        mainTimer.schedule(killingTask, 0, T);

        FoodDec foodDec = new Apple();
        System.out.println(foodDec.getHp()+" ; "+foodDec.getPoints());
        foodDec = new Nut(foodDec);
        foodDec = new Nut(foodDec);
        System.out.println(foodDec.getHp()+" ; "+foodDec.getPoints());
        System.out.println(h.getHeroType().toString() + f.getHeroType().toString());
    }

}
