package duke;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Contains Deadlines, a subclass of Task
 */
public class Deadline extends Task{
    private final String taskType = "[D]";
    private LocalDate byTime;

    /**
     * Constructor for Deadline
     * @param String description of deadline
     * @param String by, which is a LocalDate
     */
    public Deadline(String description, String by) {
        super(description);
        this.byTime = LocalDate.parse(by);
    }

    /**
     *
     * @return String of task description and formatted time
     */
    @Override
    public String toString() {
        return taskType + super.toString() + " (by: "
                + DateTimeFormatter.ofLocalizedDate((FormatStyle.FULL)).format(this.byTime) + ")";
    }
}
