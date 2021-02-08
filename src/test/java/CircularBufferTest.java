import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularBufferTest {

    CircularBuffer circularBuffer = new CircularBuffer();

    @Test
    public void read_buffer_2_round() throws Exception {
        circularBuffer.create(2);
        circularBuffer.write("A");
        circularBuffer.write("B");

        assertEquals("A", circularBuffer.read());
        assertEquals("B", circularBuffer.read());
        assertEquals("A", circularBuffer.read());
        assertEquals("B", circularBuffer.read());

    }
	@Test
    public void write_A_B_and_reader_A_B_then_buffer_is_empty() throws Exception {
        circularBuffer.create();
		circularBuffer.write("A");
		circularBuffer.write("B");
		circularBuffer.read();
		circularBuffer.read();

        assertTrue(circularBuffer.isEmpty());
        
    }
	@Test
    public void write_A_B_should_read_A_B() throws Exception {
        circularBuffer.create();
		circularBuffer.write("A");
		circularBuffer.write("B");
		    

        assertEquals("A",circularBuffer.read());
        assertEquals("B",circularBuffer.read());
    }
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
    @Test
    @DisplayName("after buffer is created then buffer should be empty")
    public void after_created_should_be_empty(){
        boolean isEmpty = circularBuffer.isEmpty();
        assertTrue(isEmpty);
    }
}