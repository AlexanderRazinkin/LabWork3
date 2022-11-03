package Obj.Alive;

import Obj.*;

public class Snusmumrick extends AbsObject implements AliveInterface {

    public Snusmumrick(String name) {
        super(name, true);
    }
    @Override
    public void action(int i) {
        switch(i) {
            case 1:
                System.out.println(getName() + " осторожно выбил пепел из трубки");
                break;
            case 2:
                if(!(getStatus().equals("DEFAULT")))
                    System.out.println(getName() + " "+ getStatus() + ": тихонько рассмеялся и начал набивать свою трубку");
                break;
            case 3:
                System.out.println(getName() + " выглянул из-за камышей");
        }
    }
}
