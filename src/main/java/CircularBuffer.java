public class CircularBuffer {


    private String[] array;
    private int capacity = 0;
    private int size = 0;
    private int writePointer = 0;
    private int readPointer = 0;

    public CircularBuffer(int capacity){
        this.capacity = capacity;
        array = new String[capacity];
    }

    public void create(){
        create(10);
    }
    public void create(int capacity){
        new CircularBuffer(capacity);
    }

    public void write(Object element)    {

    }
    public String read(){



        return "";
    }

    public int getSize(){
        return size;
    }


}
