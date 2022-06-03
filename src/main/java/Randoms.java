import java.util.Random;

public class Randoms implements Iterable<Integer> {
    int min;
    int max;

    protected Random random = new Random();

    public Randoms(int min, int max) {

        if (max >= min) {
            this.min = min;
            this.max = max;
        } else {
            this.min = max;
            this.max = min;
        }
    }

    @Override
    public Iterator iterator() {
        return new Iterator(min);
    }

    public class Iterator implements java.util.Iterator<Integer> {
        int actual;

        Iterator(int actual) {
            this.actual = actual;
        }

        @Override
        public boolean hasNext() {
            return actual <= max;
        }

        @Override
        public Integer next() {
            return random.nextInt(max - min + 1) + min;
        }
    }
}