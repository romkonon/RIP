import java.util.LinkedList;

public class Viking extends Hero{
    public Viking() {
        super(HeroType.Viking);
        born();
    }

    @Override
    public void born() {
        setLevel(1);
        setScore(0L);
        setLives((short) 2);

        setSpeed(1.0);
        setDyingSpeed(0.2);
        setMaxHp(6);
        setBonusSpeed(0.5);
        setListOfPower(new LinkedList<>());
        setHp(6);
    }
}
