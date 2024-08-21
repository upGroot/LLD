package LLD.AdapterDesignPattern.Adapter;

import LLD.AdapterDesignPattern.Adaptee.*;

public class WeightConverterImpl implements WeightConverter{
    WeighingMachine weighingMachine;

    public WeightConverterImpl(WeighingMachine weighingMachine) {
        this.weighingMachine = weighingMachine;
    }
    @Override
    public void convertToKG() {
        int weightInPound = weighingMachine.weightInPounds();
        System.out.println(weightInPound * .45);
    }
}
