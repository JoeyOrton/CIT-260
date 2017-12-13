package modelLayer;

import java.io.Serializable;
import java.util.Objects;

public class Items implements Serializable{
    public enum Item {
    stoneSword,
    ironSword,
    stoneDagger,
    ironDagger,
    stoneSheild,
    ironSheild,
    healthPotion,
    pouchOfGold,
    sackOfGold,
    chestOfGold,
    leatherArmor,
    ironArmor;
}
}