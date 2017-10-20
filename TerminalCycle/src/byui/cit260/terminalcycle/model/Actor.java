package byui.cit260.terminalCycle.model;

import java.io.Serializable;
import java.util.Objects;

public class Actor implements Serializable{
    private String name = "Null";
    private String characterType = "Null";
    private int health = 0;
    private int attack = 0;
    private int defence = 0;
    private int combatModifier = 0;

    public void Character(){}

        public String getName(){
            return name;
        }
        public String getCharacterType(){
            return characterType;
        }
        public int getHealth(){
            return health;
        }
        public int getAttack(){
            return attack;
        }
        public int getDefence(){
            return defence;
        }
        public int getCombatModifier(){
            return combatModifier;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setCharacterType(String characterType){
            this.characterType = characterType;
        }
        public void setHealth(int health){
            this.health = health;
        }
        public void setAttack(int attack){
            this.attack = attack;
        }
        public void setDefence(int defence){
            this.defence = defence;
        }
        public void setCombatModifier(int combatModifier){
            this.combatModifier = combatModifier;
        }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.characterType);
        hash = 43 * hash + this.health;
        hash = 43 * hash + this.attack;
        hash = 43 * hash + this.defence;
        hash = 43 * hash + this.combatModifier;
        return hash;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", characterType=" + characterType + ", health=" + health + ", attack=" + attack + ", defence=" + defence + ", combatModifier=" + combatModifier + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Actor other = (Actor) obj;
        if (this.health != other.health) {
            return false;
        }
        if (this.attack != other.attack) {
            return false;
        }
        if (this.defence != other.defence) {
            return false;
        }
        if (this.combatModifier != other.combatModifier) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.characterType, other.characterType)) {
            return false;
        }
        return true;
    }
}