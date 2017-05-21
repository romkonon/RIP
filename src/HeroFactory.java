class HeroFactory{
    static Hero bornHero(HeroType heroType){
        Hero hero;
        switch (heroType){
            case Viking: hero = new Viking(); break;
            case Knight: hero = new Knight(); break;
            case Samurai: hero = new Samurai(); break;
            default: hero = new BasicHero();
        }
        return hero;
    }
}