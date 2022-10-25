package ArmourPieces;
import Armour.ArmorType;

public class Chestplate extends ArmorType{

    public Chestplate(String rarity){
        super(rarity);
    }

    public String getDescription(){
        return super.getDescription() + " Chestplate";
    }

}
