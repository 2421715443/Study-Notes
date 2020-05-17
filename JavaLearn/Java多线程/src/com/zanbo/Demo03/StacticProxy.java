package com.zanbo.Demo03;

public class StacticProxy {

    public static void main(String[] args) {

        new Thread(()-> System.out.println("520")).start();
        new YouProxy(new You()).importantBase();

    }

}


interface Base{
    void importantBase();
}

class You implements Base{

    @Override
    public void importantBase() {
        System.out.println("学习基础");
    }

}

class YouProxy implements Base{

    private Base target;

    public YouProxy(Base target) {
        this.target = target;
    }

    @Override
    public void importantBase() {
        System.out.println("预习");
        this.target.importantBase();
        System.out.println("复习");
    }

}