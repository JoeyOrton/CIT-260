package modelLayer;

import java.io.Serializable;
import java.util.Objects;

public class Actor implements Serializable{
    private String name = "Null";
    private String characterType = "Null";
    public int playerHealth = 100;
    public int playerPower = 10;
    private int defence = 10;
    private int combatModifier = 1;
    int goldAmmt;
    int plLevel;
    int x = 0;
    int y = 0;

    public void Character(){}

        public String getName(){
            return name;
        }
        public String getCharacterType(){
            return characterType;
        }
        public int getHealth(){
            return playerHealth;
        }
        public int getAttack(){
            return playerPower;
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
            if (characterType == "sword") {
                setAttack(20);
                setDefence(10);
            }else if (characterType == "sheild") {
                setAttack(10);
                setDefence(20);
            } else{
                setAttack(15);
                setAttack(15);
            }
            this.characterType = characterType;
        }
        public void setHealth(int health){
            this.playerHealth = health;
        }
        public void setAttack(int attack){
            this.playerPower = attack;
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
        hash = 43 * hash + this.playerHealth;
        hash = 43 * hash + this.playerPower;
        hash = 43 * hash + this.defence;
        hash = 43 * hash + this.combatModifier;
        return hash;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", characterType=" + characterType + ", health=" + playerHealth + ", attack=" + playerPower + ", defence=" + defence + ", combatModifier=" + combatModifier + '}';
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
        if (this.playerHealth != other.playerHealth) {
            return false;
        }
        if (this.playerPower != other.playerPower) {
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