package LLD.DecoratorDesignPattern.AdditionalFeature;

import LLD.DecoratorDesignPattern.JustCoffee.Coffee;

public abstract class Extra extends Coffee {
    Coffee coffee;
    public Extra(Coffee coffee) {
        this.coffee = coffee;
    }
}
