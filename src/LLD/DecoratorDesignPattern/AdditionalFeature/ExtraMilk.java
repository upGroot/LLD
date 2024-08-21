package LLD.DecoratorDesignPattern.AdditionalFeature;

import LLD.DecoratorDesignPattern.JustCoffee.Coffee;

public class ExtraMilk extends Extra{
    public ExtraMilk(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double cost() {
        return coffee.cost() + 20;
    }
}
