package qa.meerim.models;

public class Task {
    // add fields for tasks
    private String text;
    // a field indicating if a task is completed
    private boolean isCompleted;
    // creation datetime

    // completion datetime

    // create constructor that accepts 1 parameter - String text
    public Task(String text) {
        setText(text);
        setIsCompleted(false);
    }

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

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }
}
