package byui.cit260.terminalCycle.model;

import java.io.Serializable;

public main(){
    
}

public class User implements Serializable{
    private String name = Null;
    private String saveGame = Null;

    public User() {
    }

        public UserBean(){
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
}

public class Game implements Serializable{
    private String characterSaveData = Null;

    public GameBean(){
    }
        public String getCharacterSaveData(){
            return characterSaveData;
        }
        public void setCharacterSaveData(String characterSaveData){
            this.characterSaveData = characterSaveData;
        }
}

public class CharacterBean implements Serializable{
    private String name = Null;
    private String characterType = Null;
    private int health = 0;
    private int attack = 0;
    private int defence = 0;
    private int combatModifier = 0;

    public CharacterBean(){}

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
}

public class Items implements Serializable{
    private String itemName = Null;
    private String itemType = Null;
    private int quantity = 0;

    public ItemsBean(){
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
}

public class Scene implements Serializable{
    private String description = Null;
    private String symbol = Null;
    private Bool isBlocked = Null;

    public SceneBean(){
    }
        public String getDescription(){
            return description;
        }
        public String getSymbol(){
            return symbol;
        }
        public Bool getIsBlocked(){
            return isBlocked;
        }
        public void setDescription(String description){
            this.description = description;
        }
        public void setSymbol(String symbol){
            this.symbol = symbol;
        }
        public void setIsBlocked(Bool isBlocked){
            this.isBlocked = isBlocked;
        }
}

public class Questions implements Serializable{
    private String question = Null;
    private String answer = Null;

    public QuestionsBean(){
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
}

public class Map implements Serializable{
    private String description = Null;

    public MapBean(){
    }
        public String getDescription(){
            return description;
        }
        public void setDescription(String description){
            this.description = description;
        }
}

public class Location implements Serializable{
    private int branchID = 0;
    private int roomID = 0;

    public LocationBean(){
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
}

/**
-------------------------------------------------------------------

TEMPLATE:

public class Name implements Serializable{
    private Type name = Null;

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
