package ArmourPieces;
import Armour.ArmorType;

public class Gloves extends ArmorType{

    public Gloves(String rarity){
        super(rarity);
    }

    public String getDescription(){
        return super.getDescription() + " Gloves";
    }

}
