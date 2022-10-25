package Attributes;
import Armour.Armour;
import Armour.ArmourDecorator;

public abstract class Attribute extends ArmourDecorator{

    public Attribute(Armour armour){
        super(armour);
    }

    @Override
    public String getDescription() {
        return armour.getDescription();
    }
}
