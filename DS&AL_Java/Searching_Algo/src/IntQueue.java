public class IntQueue {
    private int max; // 큐 용량
    private int front; //첫 번쨰 요소 커서
    private int rear; // 마지막 요소 커서
    private int num; // 현재 데이터 수
    private int[] que; // 큐 봍체


    // 큐가 비어있음
    public class EmptyIntQueueExceoption extends RuntimeException {
        public EmptyIntQueueExceoption() {
        }
    }

    // 큐가 가득참
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {
        }
    }

    // 생성자
    public IntQueue(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max];
        } catch (OutOfMemoryError e) {
            max = 0;
        }
    }

    public int enque(int x) throws OverflowIntQueueException {
        if (num >= max)
            throw new OverflowIntQueueException();
        que[rear++] = x;
        num++;
        if (rear == max)
            rear = 0;
        return x;
    }

    public int deque() throws EmptyIntQueueExceoption {
        if (num <= 0)
            throw new EmptyIntQueueExceoption();
        int x = que[front++];
        num--;
        if (front == max)
            front = 0;
        return x;
    }

}
