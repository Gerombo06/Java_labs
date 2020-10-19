public class SharedObject {
    private volatile int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void inc() {
        counter++;
    }

    public void dec() {
        counter--;
    }
}
