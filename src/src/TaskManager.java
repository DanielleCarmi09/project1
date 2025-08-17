public class TaskManager{

    private Task[] tasks;
    private int size;
    private final int FIRST_SIZE = 0;

    public TaskManager(Task[]tasks){
        this.tasks = tasks;
        this.size = FIRST_SIZE;
    }
    public void addTask(Task task){
        if(tasks[this.size+1]!=null) this.tasks[this.size+1] = task;
        else{
            Task[] newTasks = new Task[tasks.length*2];
            for(int i=0;i<this.tasks.length;i++){
                newTasks[i] = this.tasks[i];
            }
            newTasks[this.size+1] = task;
            this.tasks = newTasks;
        }
        this.size++;
    }

    public void printFiltered(TaskFilter taskFilter){
        for (int i=0; i<this.size+1; i++){
            if(taskFilter.isFiltered(this.tasks[i])){
                System.out.println(this.tasks[i].getName());
            }
        }
    }

    public void deleteFilter(TaskFilter taskFilter){
        int count =0;
        for(int i=0; i<this.size+1;i++){
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
        this.size = index;
    }

    public void setForFiltered(int newImportance, TaskFilter taskFilter){
        for(int i=0;i<this.size+1;i++){
            if(taskFilter.isFiltered(this.tasks[i])) this.tasks[i].setImportance(newImportance);
        }
    }
    public void setForNotFiltered(int newImportance, TaskFilter taskFilter){
        for(int i=0;i<this.size+1;i++){
            if(!taskFilter.isFiltered(this.tasks[i])) this.tasks[i].setImportance(newImportance);
        }
    }

}