package modelLayer;


import java.io.Serializable;
import java.util.Objects;






public class Location implements Serializable{

    public static void setVisit(boolean b) {
        boolean visited = b;
    }

    
    String roomName = null;
    String roomDesc = null;
    
    public static void setRow(int col) {
        int columns = col;
    }

    public static void setCol(int irows) {
        int rows = irows;
    }
//    private int branchID = 0;
//    private int roomID = 0;
   
    
//    public void Location(String roomName, String roomDesc){
//        this.roomName = roomName;
//        this.roomDesc = roomDesc;
//    }
    
//    public void Location(){
//    }
//    public void makeRoom(String roomName, String roomDesc, int roomX, int roomY){
//        Location nLocal = new Location();
//        nLocal.roomName = roomName;
//        nLocal.roomDesc = roomDesc;
//        nLocal.roomX = roomX;
//        nLocal.roomY = roomY;
//    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//        public int getBranchID(){
//            return branchID;
//        }
//        public int getRoomID(){
//            return roomID;
//        }
//        public void setBranchID(int branchID){
//            this.branchID = branchID;
//        }
//        public void setRoomID(int roomID){
//            this.roomID = roomID;
//        }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 13 * hash + this.branchID;
//        hash = 13 * hash + this.roomID;
//        return hash;
//    }
//
//    @Override
//    public String toString() {
//        return "Location{" + "branchID=" + branchID + ", roomID=" + roomID + '}';
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
//        final Location other = (Location) obj;
//        if (this.branchID != other.branchID) {
//            return false;
//        }
//        if (this.roomID != other.roomID) {
//            return false;
//        }
//        return true;
//    }

    public Location(int numOfRows, int numOfCol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}