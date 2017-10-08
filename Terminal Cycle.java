package byui.cit260.terminalCycle.model;

import java.io.Serializable;
import java.util.Objects;

public class main(){
    
}

public class User implements Serializable{
    private String name = "Null";
    private String saveGame = "Null";

        public void UserBean(){
        }
            public String getName(){
                return name;
            }
            public String getSaveGame(){
                return saveGame;
            }
            public void setName(String name){
                this.name = name;
            }
            public void setSaveGame(String saveGame){
                this.saveGame = saveGame;
            }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.saveGame);
        return hash;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", saveGame=" + saveGame + '}';
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
        final User other = (User) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.saveGame, other.saveGame)) {
            return false;
        }
        return true;
    }
}

public class Game implements Serializable{
    private String characterSaveData = "Null";

    public void GameBean(){
    }
        public String getCharacterSaveData(){
            return characterSaveData;
        }
        public void setCharacterSaveData(String characterSaveData){
            this.characterSaveData = characterSaveData;
        }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.characterSaveData);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "characterSaveData=" + characterSaveData + '}';
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.characterSaveData, other.characterSaveData)) {
            return false;
        }
        return true;
    }
}

public class Character implements Serializable{
    private String name = "Null";
    private String characterType = "Null";
    private int health = 0;
    private int attack = 0;
    private int defence = 0;
    private int combatModifier = 0;

    public void CharacterBean(){}

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
        final Character other = (Character) obj;
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

public class Items implements Serializable{
    private String itemName = "Null";
    private String itemType = "Null";
    private int quantity = 0;

    public void ItemsBean(){
    }
        public String getItemName(){
            return name;
        }
        public String getItemType(){
            return name;
        }
        public int getQuantity(){
            return name;
        }
        public void setItemName(String itemName){
            this.itemName = itemName;
        }
        public void setItemType(String itemType){
            this.itemType = itemType;
        }
        public void setQuantity(int quantity){
            this.quantity = quantity;
        }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.itemName);
        hash = 59 * hash + Objects.hashCode(this.itemType);
        hash = 59 * hash + this.quantity;
        return hash;
    }

    @Override
    public String toString() {
        return "Items{" + "itemName=" + itemName + ", itemType=" + itemType + ", quantity=" + quantity + '}';
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
        final Items other = (Items) obj;
        if (this.quantity != other.quantity) {
            return false;
        }
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        return true;
    }
}

public class Scene implements Serializable{
    private String description = "Null";
    private String symbol = "Null";
    private String isBlocked = "Null";

    public void SceneBean(){
    }
        public String getDescription(){
            return description;
        }
        public String getSymbol(){
            return symbol;
        }
        public String getIsBlocked(){
            return isBlocked;
        }
        public void setDescription(String description){
            this.description = description;
        }
        public void setSymbol(String symbol){
            this.symbol = symbol;
        }
        public void setIsBlocked(String isBlocked){
            this.isBlocked = isBlocked;
        }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.description);
        hash = 83 * hash + Objects.hashCode(this.symbol);
        hash = 83 * hash + Objects.hashCode(this.isBlocked);
        return hash;
    }

    @Override
    public String toString() {
        return "Scene{" + "description=" + description + ", symbol=" + symbol + ", isBlocked=" + isBlocked + '}';
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (!Objects.equals(this.isBlocked, other.isBlocked)) {
            return false;
        }
        return true;
    }
}

public class Questions implements Serializable{
    private String question = "Null";
    private String answer = "Null";

    public void QuestionsBean(){
    }

        public String getQuestion(){
            return question;
        }
        public String getAnswer(){
            return answer;
        }
        public void setQuestion(String question){
            this.question = question;
        }
        public void setAnswer(String answer){
            this.answer = answer;
        }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.question);
        hash = 83 * hash + Objects.hashCode(this.answer);
        return hash;
    }

    @Override
    public String toString() {
        return "Questions{" + "question=" + question + ", answer=" + answer + '}';
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
        final Questions other = (Questions) obj;
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        return true;
    }
}

public class Map implements Serializable{
    private String description = "Null";

    public void MapBean(){
    }
        public String getDescription(){
            return description;
        }
        public void setDescription(String description){
            this.description = description;
        }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "description=" + description + '}';
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }
}

public class Location implements Serializable{
    private int branchID = 0;
    private int roomID = 0;

    public void LocationBean(){
    }
        public int getBranchID(){
            return branchID;
        }
        public int getRoomID(){
            return roomID;
        }
        public void setBranchID(int branchID){
            this.branchID = branchID;
        }
        public void setRoomID(int roomID){
            this.roomID = roomID;
        }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.branchID;
        hash = 13 * hash + this.roomID;
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "branchID=" + branchID + ", roomID=" + roomID + '}';
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
        final Location other = (Location) obj;
        if (this.branchID != other.branchID) {
            return false;
        }
        if (this.roomID != other.roomID) {
            return false;
        }
        return true;
    }
}

/**
-------------------------------------------------------------------

TEMPLATE:

public class Name implements Serializable{
    private Type name = "Null";

    public ClassBean(){
    }
        public Type getName(){
            return name;
        }
        public void Type setName(Type name){
            this.name = name;
        }
}
*/
