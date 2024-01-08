import com.example.bowling.BowlingEngine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingEngineTest {
    @Test
    public void testFromPDF() {
        // Given
        var engine = new BowlingEngine();

        assertEquals(
                133,
                engine.score(new int[]{1, 4, 4, 5, 6, 4, 5, 5, 10, 0, 1, 7, 3, 6, 4, 10, 2, 8, 6})

        );
    }

    @Test
    public void perfectGame() {
        // Given
        var engine = new BowlingEngine();

        // Theoretical maximum
        assertEquals(
                300,
                engine.score(new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10})

        );
    }

    @Test
    public void examplesFromTemplateLab() {
        // Given
        var engine = new BowlingEngine();

        assertEquals(
                179,
                engine.score(new int[]{5, 5, 4, 5, 8, 2, 10, 0, 10, 10, 6, 2, 10, 4, 6, 10, 10})

        );
        assertEquals(
                186,
                engine.score(new int[]{5, 5, 4, 0, 8, 1, 10, 0, 10, 10, 10, 10, 4, 6, 10, 10, 5})

        );
    }
}
