package modelLayer;


import java.io.Serializable;
import java.util.Objects;

public class Map implements Serializable{
    
    private Location[][] gameLocations = new Location[5][5];
    private String description = "Null";
    String room00 = "This a room Name";
        String roomDesc00 = "Le Description";
        int roomX00 = 0;
        int roomY00 = 0;
    public void Map(){
        
        gameLocations[0][0].makeRoom(room00 , roomDesc00, roomX00, roomY00);
//        gameLocations[1][0].makeRoom(room10 , roomDesc10);
//        gameLocations[2][0].makeRoom(room20 , roomDesc20);
//        gameLocations[3][0].makeRoom(room30 , roomDesc50);
//        gameLocations[4][0].makeRoom(room40 , roomDesc50);
//        gameLocations[5][0].makeRoom(room50 , roomDesc50);
//        gameLocations[0][1].makeRoom(room01 , roomDesc01);
//        gameLocations[1][1].makeRoom(room11 , roomDesc11);
//        gameLocations[2][1].makeRoom(room21 , roomDesc21);
//        gameLocations[3][1].makeRoom(room31 , roomDesc31);
//        gameLocations[4][1].makeRoom(room41 , roomDesc51);
//        gameLocations[5][1].makeRoom(room51 , roomDesc51);
//        gameLocations[0][2].makeRoom(room02 , roomDesc02);
//        gameLocations[0][0].makeRoom(room12 , roomDesc12);
//        gameLocations[0][0].makeRoom(room22 , roomDesc22);
//        gameLocations[0][0].makeRoom(room32 , roomDesc32);
//        gameLocations[0][0].makeRoom(room42 , roomDesc42);
//        gameLocations[0][0].makeRoom(room52 , roomDesc52);
//        gameLocations[0][0].makeRoom(room03 , roomDesc03);
//        gameLocations[0][0].makeRoom(room13 , roomDesc13);
//        gameLocations[0][0].makeRoom(room23 , roomDesc23);
//        gameLocations[0][0].makeRoom(room33 , roomDesc33);
//        gameLocations[0][0].makeRoom(room43 , roomDesc43);
//        gameLocations[0][0].makeRoom(room53 , roomDesc53);
    }
        public String getDescription(){
            return description;
        }
//        public void setDescription(String description){
//            this.description = description;
//        }
    
        public Location getLocation(){
            return gameLocations[roomX00][roomY00];
        }
        public Location setLocation(int x, int y) {
            return gameLocations[x][y];
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 23 * hash + Objects.hashCode(this.description);
//        return hash;
//    }
//
//    @Override
//    public String toString() {
//        return "Map{" + "description=" + description + '}';
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
//        final Map other = (Map) obj;
//        if (!Objects.equals(this.description, other.description)) {
//            return false;
//        }
//        return true;
//    }
}