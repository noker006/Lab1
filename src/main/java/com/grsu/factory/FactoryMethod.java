package com.grsu.factory;


public class FactoryMethod {
    public AbstractCreator getCreator(String type){
        if(type.equals("mini bus")){
            return new MiniBusCreator();
        } else return new CarCreator();
    }
}
