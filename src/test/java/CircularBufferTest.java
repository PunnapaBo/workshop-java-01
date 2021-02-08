import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularBufferTest {

    CircularBuffer circularBuffer = new CircularBuffer();

    @Test
    @DisplayName("buffer size must be 10")
    public void create_buffer_with_default_size(){
        circularBuffer.create();
        int size = circularBuffer.getSize();

        assertEquals(10,size);
    }
    @Test
    @DisplayName("buffer size must be 5")
    public void create_buffer_with_specified_size_5(){
        circularBuffer.create(5);
        int size = circularBuffer.getSize();

        assertEquals(5,size);
    }
}