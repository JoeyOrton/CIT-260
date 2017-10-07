public class User implaments java.io.Serializable{
    private String name = Null;
    private String saveGame = Null;

        public UserBean(){
        }
            public String getName(){
                return name;
            }
            public String getSaveGame(){
                return saveGame;
            }
            public void String setName(String name){
                this.name = name;
            }
            public void String setSaveGame(String saveGame){
                this.saveGame = saveGame;
            }
}

public class Game implaments java.io.Serializable{
    private String characterSaveData=Null;

    public GameBean(){
    }
        public String getCharacterSaveData(){
            return characterSaveData;
        }
        public void String setCharacterSaveData(String characterSaveData){
            this.characterSaveData=characterSaveData;
        }
}

public class Character implaments java.io.Serializable{
    private String name = Null;
    private String characterType = Null;
    private Long health = 0;
    private Long attack = 0;
    private Long defence = 0;
    private Long combatModifier = 0;

    public CharacterBean(){
    }
        public String getName(){
            return name;
        }
        public String getCharacterType(){
            return characterType;
        }
        public Long getHealth(){
            return health;
        }
        public Long getAttack(){
            return attack;
        }
        public Long getDefence(){
            return defence;
        }
        public Long getCombatModifier(){
            return combatModifier;
        }
        public void String setName(String name){
            this.name = name;
        }
        public void String setCharacterType(String characterType){
            this.characterType = characterType;
        }
        public void Long setHealth(Long health){
            this.health = health;
        }
        public void Long setAttack(Long attack){
            this.attack = attack;
        }
        public void Long setDefence(Long defence){
            this.defence = defence;
        }
        public void Long setCombatModifier(Long combatModifier){
            this.combatModifier = combatModifier;
        }
}

public class Items implaments java.io.Serializable{
    private String itemName = Null;
    private String itemType = Null;
    private Long quantity = 0;

    public ItemsBean(){
    }
        public String getItemName(){
            return name;
        }
        public String getItemType(){
            return name;
        }
        public Long getQuantity(){
            return name;
        }
        public void String setItemName(String itemName){
            this.itemName = itemName;
        }
        public void String setItemType(String itemType){
            this.itemType = itemType;
        }
        public void Long setQuantity(Long quantity){
            this.quantity = quantity;
        }
}

public class Scene implaments java.io.Serializable{
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
        public void String setDescription(String description){
            this.description = description;
        }
        public void String setSymbol(String symbol){
            this.symbol = symbol;
        }
        public void Bool setIsBlocked(Bool isBlocked){
            this.isBlocked = isBlocked;
        }
}

public class Questions implaments java.io.Serializable{
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
        public void String setQuestion(String question){
            this.question = question;
        }
        public void String setAnswer(String answer){
            this.answer = answer;
        }
}

public class Map implaments java.io.Serializable{
    private String description = Null;

    public MapBean(){
    }
        public String getDescription(){
            return description;
        }
        public void String setDescription(String description){
            this.description = description;
        }
}

public class Location implaments java.io.Serializable{
    private Long branchID = 0;
    private Long roomID = 0;

    public LocationBean(){
    }
        public Long getBranchID(){
            return branchID;
        }
        public Long getRoomID(){
            return roomID;
        }
        public void Long setBranchID(Long branchID){
            this.branchID = branchID;
        }
        public void Long setRoomID(Long roomID){
            this.roomID = roomID;
        }
}

public class Inventory implements java.io.Serializable
    private Long totalQuantity = 0;
    private String itemList

    public InventoryBean(){
    }
        public String getitemList(){
            return itemList;
        }
        public String setitemList(){
            return itemList
        }
-------------------------------------------------------------------
TEMPLATE:

public class Name implaments java.io.Serializable{
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
