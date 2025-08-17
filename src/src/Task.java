public class Task{
    private String name;
    private boolean completed;
    private int importance;
    public Task(String name, boolean completed, int importance){
        this.name = name;
        this.completed = completed;
        this.importance = importance;
    }
    public String getName() { return  this.name;}
    public void setCompleted(boolean completed){ this.completed = completed;}
    public void setImportance(int importance){ this.importance = importance;}
}