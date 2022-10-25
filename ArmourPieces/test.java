package ArmourPieces;
import Armour.Armour;
import Factory.BossDrop;

public class test {
    public static void main(String[] args) {

        BossDrop factory = new BossDrop();
        Armour a = factory.makeArmour();
        System.out.println(a.getDescription());

        }
}
