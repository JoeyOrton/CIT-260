package CIT-260.terminalCycle.model;

import java.io.Serializable;
import java.util.Objects;

public class NPC implements Serializable{
    private String NPCName = "Null";
    private String NPCType = "Null";
    private String NPCDecription = "Null";
    private int enemyAttack = 5;
    private int enemyDefence = 5;
    private int enemyCombatModifier = 1;
    
    public String getNPCName() {
        return NPCName;
    }
    public void setNPCName(String NPCName) {
        this.NPCName = NPCName;
    }
    public String getNPCType() {
        return NPCType;
    }
    public void setNPCType(String NPCType) {
        this.NPCType = NPCType;
    }
    public String getNPCDecription() {
        return NPCDecription;
    }
    public void setNPCDecription(String NPCDecription) {
        this.NPCDecription = NPCDecription;
    }
    public int getEnemyAttack() {
        return enemyAttack;
    }
    public void setEnemyAttack(int enemyAttack) {
        this.enemyAttack = enemyAttack;
    }
    public int getEnemyDefence() {
        return enemyDefence;
    }
    public void setEnemyDefence(int enemyDefence) {
        this.enemyDefence = enemyDefence;
    }
    public int getEnemyCombatModifier() {
        return enemyCombatModifier;
    }
    public void setEnemyCombatModifier(int enemyCombatModifier) {
        this.enemyCombatModifier = enemyCombatModifier;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.NPCName);
        hash = 89 * hash + Objects.hashCode(this.NPCType);
        hash = 89 * hash + Objects.hashCode(this.NPCDecription);
        hash = 89 * hash + this.enemyAttack;
        hash = 89 * hash + this.enemyDefence;
        hash = 89 * hash + this.enemyCombatModifier;
        return hash;
    }

    @Override
    public String toString() {
        return "NPC{" + "NPCName=" + NPCName + ", NPCType=" + NPCType + ", NPCDecription=" + NPCDecription + ", enemyAttack=" + enemyAttack + ", enemyDefence=" + enemyDefence + ", enemyCombatModifier=" + enemyCombatModifier + '}';
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
        final NPC other = (NPC) obj;
        if (this.enemyAttack != other.enemyAttack) {
            return false;
        }
        if (this.enemyDefence != other.enemyDefence) {
            return false;
        }
        if (this.enemyCombatModifier != other.enemyCombatModifier) {
            return false;
        }
        if (!Objects.equals(this.NPCName, other.NPCName)) {
            return false;
        }
        if (!Objects.equals(this.NPCType, other.NPCType)) {
            return false;
        }
        if (!Objects.equals(this.NPCDecription, other.NPCDecription)) {
            return false;
        }
        return true;
    }
}
