public class MyQueue<T> {
    //создаем ноды
    private MyNode<T> front;
    private MyNode<T> rear;
    private int size;
    public int getSize() {
        return size;
    }

    //конструктор
    public MyQueue(){
        front = null;
        rear = null;
        size = 0;
    }
    //создаем функцию isEmpty
    public boolean isEmpty(){
        return front == null;
    }
    //создаем функцию добавляющую элемент
    public void enqueue(T element){
        MyNode<T> newNode = new MyNode<>(element);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    //функция возвращающая первый объект и удаляющая его из очереди
    public T dequeue(){
        if(isEmpty()){
            return null;
        }
        T data = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        size--;
        return data;
    }
    //функция возвращаюащя перви элемент, но ничего не удаляющая
    public T peek(){
        if(isEmpty()){
            return null;
        }
        return front.data;
    }
    //функция которая все удаляет
    public void clear(){
        front = null;
        rear=null;
    }




}
