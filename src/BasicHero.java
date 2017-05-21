import java.util.LinkedList;

public class BasicHero extends Hero {

    public BasicHero() {
        super(HeroType.Basic);
    }

    @Override
    public void born() {
        setLevel(1);
        setScore(0L);
        setLives((short) 3);

        setSpeed(1.0);
        setDyingSpeed(0.1);
        setMaxHp(2);
        setBonusSpeed(0.0);
        setListOfPower(new LinkedList<>());
    }
}
