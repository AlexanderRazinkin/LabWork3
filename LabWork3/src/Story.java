import Obj.AbsObject;
import Obj.Alive.*;
import Obj.Nature.*;
import Obj.Place.*;


public class Story {

    Snusmumrick snus = new Snusmumrick("Снусмумрик");
    Hemul hem = new Hemul("Хемуль");
    Boat boat = new Boat(new AbsObject[]{snus, hem});
    Water water = new Water("Вода");
    Birds birds = new Birds("Птицы");
    Bed_Sheets bed = new Bed_Sheets("Постельное белье");
    Hills hills = new Hills(new AbsObject[]{birds, bed});
    public Story() {
    }

    public void go() {
        this.defaultstory();
    }

    private void defaultstory() {
        boat.showLobby();
        snus.action(1);
        snus.action(3);
        hem.action(1);
        snus.setStatus("ВЕСЕЛЫЙ");
        snus.action(2);
        water.setStatus("СПАДАЕТ");
        Trees trees = new Trees("Деревья");
        trees.setStatus("СЛОМАНЫ");
        trees.check();
        hills.showLobby();
        birds.action();
        bed.setStatus("CУШИТСЯ");
        bed.action();
    }
}
