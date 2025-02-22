package duke.task;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for Deadline class
 */
public class DeadlineTest {
    /**
     * This checks whether the deadline string is valid
     */
    @Test
    public void checkDeadlineString(){
        Deadline deadline = new Deadline("event project meeting",
                "2023-01-28");
        assertEquals("[D][ ] event project meeting (by: Saturday, January 28, 2023)",
                deadline.toString());
    }
}
