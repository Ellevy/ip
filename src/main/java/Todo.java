public class Todo extends Task {
    /**
     * Initializes a newly created todo-task object with a description.
     * @param description Description of the task
     */
    public Todo(String description) {
        super(description);
    }

    /**
     * Converts this object to a string that represents the todo-task
     * @return A string representing whether the todo-task is done and the todo-task description
     */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}