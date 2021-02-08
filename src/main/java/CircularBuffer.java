import java.util.Arrays;

public class CircularBuffer {


    public static final int DEFAULT_SIZE = 10;
    private String[] array;
//    private int capacity = 0;
    private int size = 0;
    private int writePointer = 0;
    private int readPointer = 0;



    public void create(){
        create(DEFAULT_SIZE);
    }
    public void create(int size){
        this.size = size;
        array = new String[size];
    }

    public void write(String element) throws Exception {
        if(writePointer == size){
            writePointer = 0;
            throw new Exception("Full Buffer");
        }
        array[writePointer++] = element;

    }
    public String read() throws Exception {
        if(getSize() == 0){
            throw new Exception("Empty Buffer");
        }
        if(readPointer == size){
            readPointer = 0;
        }
	

        return array[readPointer++];
    }

    public int getSize(){
        return size;
    }


    public boolean isEmpty() {
        return writePointer-readPointer == 0;

    }
}
