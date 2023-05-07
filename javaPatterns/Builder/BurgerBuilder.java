public final class BurgerBuiler{
    private Burger burger;
    public Burger build(){
        return burger;
    }
    public BurgerBuilder setSalad(){
        this.burger.salad=true;
        return this;
    }
    public BurgerBuilder setMeat(){
        this.burger.meat="beef";
        return this;
    }
    public BurgerBuiler setSauce(){
        this.burger.salad=true;
        return this;
    }
}