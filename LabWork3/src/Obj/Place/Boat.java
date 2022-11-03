package Obj.Place;

import Obj.AbsObject;

public class Boat extends AbsPlace {
    public Boat(AbsObject... obj) {
        this.setLobby(obj);
    }

    public void showLobby() {
        if (this.lobbyCount() == 0) {
            System.out.println("Лодка пустая");
        } else {
            String res = "";
            for(AbsObject i: lobby) {

                if (res.equals(""))
                    res = i.getName();
                else
                    res += ", " + i.getName();
            }
            System.out.println(res + " сидит(-ят) в лодке");
        }
    }
}
