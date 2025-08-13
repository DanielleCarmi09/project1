public class TaskManager{
    private Task[] tasks;
    private int index;
    private final int FIRST_INDEX = 0;

    public TaskManager(Task[]tasks){
        this.tasks = tasks;
        index = FIRST_INDEX;
    }
    public void addTask(Task task){
        if(tasks[index+1]!=null) this.tasks[index+1] = task;
        else{
            Task[] newTasks = new Task[tasks.length*2];
            for(int i=0;i<this.tasks.length;i++){
                newTasks[i] = this.tasks[i];
            }
            newTasks[index+1] = task;
            this.tasks = newTasks;
        }
        index++;
    }

    public void printFiltered(TaskFilter taskFilter){
        for (int i=0; i<=index; i++){
            if(taskFilter.isFiltered(this.tasks[i])){
                System.out.println(this.tasks[i].getName());
            }
        }
    }

    public void deleteFilter(TaskFilter taskFilter){

    }
}