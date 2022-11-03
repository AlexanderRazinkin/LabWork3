package Obj.Place;

import Obj.AbsObject;

public class Hills extends AbsPlace {
    public Hills(AbsObject... obj) {
        super(new AbsObject[0]);
        this.setLobby(obj);
    }

    public void showLobby() {
        if (this.lobbyCount() == 0) {
            System.out.println("На холмах никого нет");
        } else {
            String res = "";
            for(AbsObject i: lobby) {
                if (res.equals(""))
                    res = i.getName();
                else
                    res += ", " + i.getName();
            }
            System.out.println(res + " находится(-ятся) на холмах");
        }
    }
}
