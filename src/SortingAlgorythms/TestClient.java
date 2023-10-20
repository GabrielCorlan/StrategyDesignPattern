package SortingAlgorythms;

public class TestClient {
    public static void main(String[] args) {

        int[] numbers = {12, 15, 32, 8, 4};

        Context ctx = new Context(new BubbleSort());
        ctx.arrange(numbers);

        ctx = new Context(new InsertionSort());
        ctx.arrange(numbers);

        ctx = new Context(new MergeSort());
        ctx.arrange(numbers);

        ctx = new Context(new QuickSort());
        ctx.arrange(numbers);
    }

}
