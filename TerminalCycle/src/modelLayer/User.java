package modelLayer;


import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable{
    private String name = "Null";
    private String saveGame = "Null";

        public void User(){
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