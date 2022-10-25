package ArmourPieces;
import Armour.ArmorType;

public class Boots extends ArmorType{

    public Boots(String rarity){
        super(rarity);
    }

    public String getDescription(){
        return super.getDescription() + " Boots";
    }

}
