package modelLayer;

//menus go here
import java.io.Serializable;
import java.util.Objects;
import modelLayer.Actor;

public class Game implements Serializable{
    private String characterSaveData = "Null";
    private Actor nActor;
    private Map aMap;

    public void Game(){
    }
        public String getCharacterSaveData(){
            return characterSaveData;
        }
        public void setCharacterSaveData(String characterSaveData){
            this.characterSaveData = characterSaveData;
        }

    public void setActor(Actor curActor){
        nActor = curActor; 
    }
    public Actor getActor(){
        return nActor;
    }
    public Map getMap(){
        return aMap;
    }
    public void setMap(Map bMap){
        aMap = bMap;
    }
    
    
    
    
    
    
        
        
//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 37 * hash + Objects.hashCode(this.characterSaveData);
//        return hash;
//    }
//
//    @Override
//    public String toString() {
//        return "Game{" + "characterSaveData=" + characterSaveData + '}';
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Game other = (Game) obj;
//        return Objects.equals(this.characterSaveData, other.characterSaveData);
//    }
}
