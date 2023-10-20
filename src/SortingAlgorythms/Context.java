package SortingAlgorythms;

public class Context {
    public SortingStrategy strategy;

    public Context(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void arrange(int[] input){
        strategy.sort(input);
    }
}
