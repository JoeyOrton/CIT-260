package modelLayer;

import java.io.Serializable;
import java.util.Objects;

public class Items implements Serializable{
    private String itemName = "Null";
    private String itemType = "Null";
    private int quantity = 0;

    public void Items(){
    }
        public String getItemName(){
            return itemName;
        }
        public String getItemType(){
            return itemType;
        }
        public int getQuantity(){
            return quantity;
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
