package Obj.Nature;

import Obj.AbsObject;

public class Birds extends AbsObject implements NatureInterface{
    public Birds(String name) {
        super(name, false);
    }

    @Override
    public void action() {
        System.out.println(getName() + " отыскивали свои старые гнезда");
    }
}
