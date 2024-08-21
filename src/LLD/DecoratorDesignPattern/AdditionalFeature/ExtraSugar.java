package LLD.DecoratorDesignPattern.AdditionalFeature;

import LLD.DecoratorDesignPattern.JustCoffee.Coffee;

public class ExtraSugar extends Extra{
    Coffee coffee;
    public ExtraSugar(Coffee coffee) {
        super(coffee);
    }
    @Override
    public double cost() {
        return this.coffee.cost() + 10.0;
    }
}
