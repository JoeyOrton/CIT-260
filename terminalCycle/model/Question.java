
import java.io.Serializable;
import java.util.Objects;

public class Questions implements Serializable{
    private String question = "Null";
    private String answer = "Null";

    public void Questions(){
    }

        public String getQuestion(){
            return question;
        }
        public String getAnswer(){
            return answer;
        }
        public void setQuestion(String question){
            this.question = question;
        }
        public void setAnswer(String answer){
            this.answer = answer;
        }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.question);
        hash = 83 * hash + Objects.hashCode(this.answer);
        return hash;
    }

    @Override
    public String toString() {
        return "Questions{" + "question=" + question + ", answer=" + answer + '}';
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
        final Questions other = (Questions) obj;
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        return true;
    }
}