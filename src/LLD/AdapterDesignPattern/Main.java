package LLD.AdapterDesignPattern;

import LLD.AdapterDesignPattern.Adaptee.*;
import LLD.AdapterDesignPattern.Adapter.*;

public class Main {
    public static void main(String[] args){
        WeightConverter weightConverter = new WeightConverterImpl(new MenWeighingMachine());
        weightConverter.convertToKG();
    }
}
