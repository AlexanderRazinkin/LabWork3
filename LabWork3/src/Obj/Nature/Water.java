package Obj.Nature;

import Obj.AbsObject;
import Obj.Status;

public class Water extends AbsObject implements NatureInterface {
    public Water(String name) {
        super(name, false);
    }

    public void action() {
        if (!(getStatus().equals("DEFAULT"))) {
            System.out.println(this.getName() + " " + getStatus() + " Медленно выползали на солнечный свет вымытые штормом берега и долины");
        } else {
            System.out.println(this.getName() + " еще не спала");
        }

    }
}
