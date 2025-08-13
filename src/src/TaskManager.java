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
        int count =0;
        for(int i=0; i<index+1;i++){
            if(!taskFilter.isFiltered(this.tasks[i])) count++;
        }
        Task[] newTasks = new Task[count+1];
        int index = 0;
        for(int i=0; i<tasks.length;i++){
            if(!taskFilter.isFiltered(this.tasks[i])){
                newTasks[index] =this.tasks[i];
                index++;
            }
        }
        this.tasks = newTasks;
        this.index = index;
    }

    public void setForFiltered(int newImportance, TaskFilter taskFilter){
        for(int i=0;i<index+1;i++){
            if(taskFilter.isFiltered(this.tasks[i])) this.tasks[i].setImportance(newImportance);
        }
    }
    public void setForNotFiltered(int newImportance, TaskFilter taskFilter){
        for(int i=0;i<index+1;i++){
            if(!taskFilter.isFiltered(this.tasks[i])) this.tasks[i].setImportance(newImportance);
        }
    }


}