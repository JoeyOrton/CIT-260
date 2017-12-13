package modelLayer;


import java.io.Serializable;
import java.util.Objects;

public class Scene implements Serializable{
    private String description = "Null";
    private String symbol = "Null";
    private String isBlocked = "Null";

    public void Scene(){
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

        
        
        
        
//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 83 * hash + Objects.hashCode(this.description);
//        hash = 83 * hash + Objects.hashCode(this.symbol);
//        hash = 83 * hash + Objects.hashCode(this.isBlocked);
//        return hash;
//    }
//
//    @Override
//    public String toString() {
//        return "Scene{" + "description=" + description + ", symbol=" + symbol + ", isBlocked=" + isBlocked + '}';
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
//        final Scene other = (Scene) obj;
//        if (!Objects.equals(this.description, other.description)) {
//            return false;
//        }
//        if (!Objects.equals(this.symbol, other.symbol)) {
//            return false;
//        }
//        if (!Objects.equals(this.isBlocked, other.isBlocked)) {
//            return false;
//        }
//        return true;
//    }
}