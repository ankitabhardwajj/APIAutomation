package com.thetestingacademy;

public class builderpattern_designpattern {
public builderpattern_designpattern floor1(){
    System.out.println("stage1 is done");
    return this;
}

public builderpattern_designpattern floor2(String name){
    System.out.println("stage2 is done");
    return this;
}

public builderpattern_designpattern floor3(){
    System.out.println("satge3 is done");
    return this;
}

    public static void main(String[] args) {
        builderpattern_designpattern bd = new builderpattern_designpattern();
        bd.floor1().floor2("ankita").floor3();
    }
}
