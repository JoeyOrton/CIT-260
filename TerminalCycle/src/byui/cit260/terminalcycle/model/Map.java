
import java.io.Serializable;
import java.util.Objects;

public class Map implements Serializable{
    private String description = "Null";

    public void Map(){
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