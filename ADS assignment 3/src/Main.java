import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

interface MyList<T> extends Iterable<T> {
    void add(T item);
    void set(int index, T item);
    void add(int index, T item);
    void addFirst(T item);
    void addLast(T item);
    T get(int index);
    T getFirst();
    T getLast();
    void remove(int index);
    void removeFirst();
    void removeLast();
    void sort();
    int indexOf(Object object);
    int lastIndexOf(Object object);
    boolean exists(Object object);
    Object[] toArray();
    void clear();
    int size();
}

class MyArrayList<T> implements MyList<T> {
    private ArrayList<T> list;

    public MyArrayList() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(T item) {
        list.add(item);
    }

    @Override
    public void set(int index, T item) {
        list.set(index, item);
    }

    @Override
    public void add(int index, T item) {
        list.add(index, item);
    }

    @Override
    public void addFirst(T item) {
        list.add(0, item);
    }

    @Override
    public void addLast(T item) {
        list.add(item);
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public T getFirst() {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.get(0);
    }

    @Override
    public T getLast() {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.get(list.size() - 1);
    }

    @Override
    public void remove(int index) {
        list.remove(index);
    }

    @Override
    public void removeFirst() {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        list.remove(0);
    }

    @Override
    public void removeLast() {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        list.remove(list.size() - 1);
    }

    @Override
    public void sort() {
        // Sorting logic here
    }

    @Override
    public int indexOf(Object object) {
        return list.indexOf(object);
    }

    @Override
    public int lastIndexOf(Object object) {
        return list.lastIndexOf(object);
    }

    @Override
    public boolean exists(Object object) {
        return list.contains(object);
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return list.iterator();
    }
}

class MyLinkedList<T> implements MyList<T> {
    private LinkedList<T> list;

    public MyLinkedList() {
        this.list = new LinkedList<>();
    }

    @Override
    public void add(T item) {
        list.add(item);
    }

    @Override
    public void set(int index, T item) {
        list.set(index, item);
    }

    @Override
    public void add(int index, T item) {
        list.add(index, item);
    }

    @Override
    public void addFirst(T item) {
        list.addFirst(item);
    }

    @Override
    public void addLast(T item) {
        list.addLast(item);
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }

    @Override
    public T getFirst() {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.getFirst();
    }

    @Override
    public T getLast() {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return list.getLast();
    }

    @Override
    public void remove(int index) {
        list.remove(index);
    }

    @Override
    public void removeFirst() {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        list.removeFirst();
    }

    @Override
    public void removeLast() {
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        list.removeLast();
    }

    @Override
    public void sort() {
    }

    @Override
    public int indexOf(Object object) {
        return list.indexOf(object);
    }

    @Override
    public int lastIndexOf(Object object) {
        return list.lastIndexOf(object);
    }

    @Override
    public boolean exists(Object object) {
        return list.contains(object);
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return list.iterator();
    }
}

class MyStack<T> {
    private MyArrayList<T> list;

    public MyStack() {
        this.list = new MyArrayList<>();
    }
}

class MyQueue<T> {
    private MyLinkedList<T> list;

    public MyQueue() {
        this.list = new MyLinkedList<>();
    }
}

class MyMinHeap<T extends Comparable<T>> {
    private MyArrayList<T> list;

    public MyMinHeap() {
        this.list = new MyArrayList<>();
    }
}
