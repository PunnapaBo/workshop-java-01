import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularBufferTest {

    @Test
    @DisplayName("buffer size must be 10")
    public void create_buffer_with_default_size(){
        CircularBuffer circularBuffer = new CircularBuffer();
        circularBuffer.create(5);
        int size = circularBuffer.getSize();

        assertEquals(10,size);
    }
}