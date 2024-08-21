package LLD.DecoratorDesignPattern;

import LLD.DecoratorDesignPattern.AdditionalFeature.*;
import LLD.DecoratorDesignPattern.JustCoffee.*;

public class Main {
    public static void main(String[] args){
        Coffee coffee = new ExtraMilk(new ExtraSugar(new Americano()));
        System.out.println(coffee.cost());
    }
}
