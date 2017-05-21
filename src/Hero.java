import java.util.LinkedList;
import java.util.List;

public abstract class Hero implements Moveble {
    private static Hero hero;
    private static String name;


    private HeroType heroType = null;
    private double hp;
    private double maxHp;
    private double speed;
    private double bonusSpeed;
    private double dyingSpeed;
    private List<Power> listOfPower;

    private int level;
    private long score;
    private short lives;

    Hero(HeroType heroType){
        this.heroType = heroType;
    }

    public HeroType getHeroType() {
        return heroType;
    }
    public abstract void born();
     void setDyingSpeed(double dyingSpeed) {
        this.dyingSpeed = dyingSpeed;
    }
     static void setName(String name){
        Hero.name = name;
    }


     static Hero getHero(HeroType heroClass){
        if (hero==null)
            hero = HeroFactory.bornHero(heroClass);
        return hero;
    }

    public double getBonusSpeed() {
        return bonusSpeed;
    }

     void setBonusSpeed(double bonusSpeed) {
        this.bonusSpeed = bonusSpeed;
    }
     void decreaseHP() {
        hp -= dyingSpeed;
        if (!isAlive()) {
            lives--;
            hp = maxHp;
        }
    }

    @Override
    public String toString() {
        String t = String.format("%.2f", hp);
        return name + "\n HP: " + t + "\n Score: " + score
                + "\n Level: " + level + "\n Lives: " + lives + "\n Speed: " + (
                speed+bonusSpeed);
    }

    public void getPower(Power p) {
        listOfPower.add(p);
    }

    private void levelUp() {
        boolean flag;
        do {
            flag = false;
            long s = (2*100 + 50*(level-1)) * (level) / 2;
            if (s <= score) {
                level++;
                flag = true;
            }
            setMaxHp(2.0 + (level - 1)*0.5);
            setSpeed(level/5*0.2+1.0);
            hp = maxHp;
        } while (flag);
    }

     void setMaxHp(double hp) {
        this.maxHp = hp;
    }

     void setSpeed(double speed) {
        this.speed = speed;
    }

    private boolean isAlive() {
        return hp > 0.0;
    }

    private void livesLost() {
        if (!isAlive()) lives--;
    }

     boolean isDead() {
        return lives < 1;
    }

    private void plusHp(double hp) {
        this.hp += hp;
        if (this.hp > maxHp)
            this.hp = maxHp;
    }

    public void eat(Food f) {
        score += f.getPoints();
        plusHp(f.getHp());
        if (f.getBonuses().size()>0) {
            for (Bonus b: f.getBonuses()) {
                switch (b) {
                    case PEPPER: bonusSpeed += 0.01; break;
                    case NUT: bonusSpeed -= 0.01; break;
                }
            }
        }
        levelUp();
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getMaxHp() {
        return maxHp;
    }

    public double getSpeed() {
        return speed;
    }

    public List<Power> getListOfPower() {
        return listOfPower;
    }

     void setListOfPower(List<Power> listOfPower) {
        this.listOfPower = listOfPower;
    }

    public int getLevel() {
        return level;
    }

     void setLevel(int level) {
        this.level = level;
    }

    public long getScore() {
        return score;
    }

    public short getLives() {
        return lives;
    }

     void setLives(short lives) {
        this.lives = lives;
    }
    //  for DEBUG
     void setScore(long score) {
    this.score = score;
}


    @Override
    public void move() {
        System.out.println("Hero move");
    }
}
