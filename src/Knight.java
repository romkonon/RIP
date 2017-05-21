import java.util.LinkedList;

public class Knight extends Hero{
    public Knight() {
        super(HeroType.Knight);
        born();
    }

    @Override
    public void born() {
        setLevel(1);
        setScore(0L);
        setLives((short) 4);

        setSpeed(1.0);
        setDyingSpeed(0.1);
        setMaxHp(2);
        setBonusSpeed(-0.5);
        setListOfPower(new LinkedList<>());
    }
}
