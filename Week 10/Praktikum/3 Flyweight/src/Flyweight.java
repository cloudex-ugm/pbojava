import java.util.Random;
import java.util.HashMap;

interface IPlayer{
    public void buyWeapon(String weapon);
    public void missionBriefing();
}

class RedTeam implements IPlayer{
    private final String _obj;
    private String _weapon;

    public RedTeam(){
        _obj = "Deliver the Payload";
    }

    public void buyWeapon(String weapon){
        this._weapon = weapon;
    }

    public void missionBriefing(){
        System.out.print("Red Player has spawned with " + this._weapon + "/ Your objective is to " + this._obj + "\n");
    }
}

class BlueTeam implements IPlayer{
    private final String _obj;
    private String _weapon;

    public BlueTeam(){
        _obj = "Stop the Payload";
    }

    public void buyWeapon(String weapon){
        this._weapon = weapon;
    }

    public void missionBriefing(){
        System.out.print("Blue Player has spawned with " + this._weapon + "/ Your objective is to " + this._obj + "\n");
    }
}

class PlayerFactory{
    private static HashMap <String, IPlayer> hm = new HashMap<String, IPlayer>();

    public static IPlayer GetPlayer(String type){
        IPlayer p = null;
        if (hm.containsKey(type)){
            p = hm.get(type);
        }
        else{
            switch(type){
                case "Red Team":
                    p = new RedTeam();
                    break;
                case "Blue Team":
                    p = new BlueTeam();
                    break;
                default : break;
            }
            hm.put(type, p);
        }
        return p;
    }
}

class WeaponFactory{
    private static String[] weapons = {"M4A1", "AK-47", "G36C", "SIG MCX", "M4 Carbine"};

    public static String getWeapon(){
        Random r = new Random();
        int randInt = r.nextInt(weapons.length);
        return weapons[randInt];
    }
}