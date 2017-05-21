import java.util.LinkedList;

public class Samurai extends Hero{
    public Samurai() {
        super(HeroType.Samurai);
        born();
    }

    @Override
    public void born() {
        setLevel(1);
        setScore(0L);
        setLives((short) 3);

        setSpeed(1.0);
        setDyingSpeed(0.1);
        setMaxHp(4);
        setBonusSpeed(1.5);
        setListOfPower(new LinkedList<>());
    }
}
