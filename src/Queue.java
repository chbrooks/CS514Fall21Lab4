public interface Queue<Type> {
    public void enqueue(Type t);

    public Type dequeue();

    public boolean isEmpty();

}
