package Obj.Alive;

import Obj.*;
import Obj.Place.Coarse;

public class Hemul extends AbsObject implements AliveInterface {
    public Hemul(String name) {
        super(name, true);
    }

    @Override
    public void action(int i) {
        switch (i) {
            case 1:
                System.out.println(getName() + " уверенно держит курс на " + Coarse.NORTH);
                break;
            case 2:
                System.out.println(getName() + " уверенно держит курс на " + Coarse.EAST);
                break;
            case 3:
                System.out.println(getName() + " уверенно держит курс на " + Coarse.SOUTH);
                break;
            case 4:
                System.out.println(getName() + " уверенно держит курс на " + Coarse.WEST);
                break;
        }
    }
}
