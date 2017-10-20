//menus go here
import java.io.Serializable;
import java.util.Objects;

public class Game implements Serializable{
    private String characterSaveData = "Null";

    public void Game(){
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
