package qa.meerim.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Task implements Serializable {
    // add fields for tasks
    private String text;
    // a field indicating if a task is completed
    private boolean isCompleted;
    // creation datetime

    // completion datetime

    // create getters and setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        if (text.length() == 0) {
            throw new IllegalArgumentException("The task text cannot be empty");
        } else {
            this.text = text;
        }
    }

    @JsonProperty(value = "isCompleted")
    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
