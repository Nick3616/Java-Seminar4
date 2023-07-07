import java.util.LinkedList;

public class Task2<T> {
    private LinkedList<T> queue;
    public static void main(String[] args) {
        Task2<Integer> queue = new Task2<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Первый элемент: " + queue.first());
        System.out.println("Удаленный элемент: " + queue.dequeue());
        System.out.println("Первый элемент: " + queue.first());
    }
    
    public Task2() {
        queue = new LinkedList<>();
    }

    public void enqueue(T element) {
        queue.addLast(element);
    }

    public T dequeue() {
        return queue.removeFirst();
    }

    public T first() {
        return queue.getFirst();
    }
}