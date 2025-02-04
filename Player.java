import java.util.List;
import java.util.Arrays;

public class Player implements ISaveable {
    String name, weapon;
    int hitpoints, strength;

    public Player(String name, int hitpoints, int strength){
        this.name = name;
        this.hitpoints = hitpoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public String getWeapon() {
        return weapon;
    }

    @Override
    public String toString(){
        return "Player{name='" + name + "', hitpoints=" + hitpoints + ", strength=" + strength + ", weapon='" + weapon + "'}";
    }

    @Override
    public List<String> write(){
       return Arrays.asList(name, String.valueOf(hitpoints), String.valueOf(strength), weapon);
    }

    @Override
    public void read(List<String> values){
        if(values != null && values.size() > 0){
            name = values.get(0);
            hitpoints = Integer.parseInt(values.get(1));
            strength = Integer.parseInt(values.get(2));
            weapon = values.get(3);
        }
    }
}
