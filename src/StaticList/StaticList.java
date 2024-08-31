package StaticList;

public class StaticList {
    private int[] data;
    private int size;
    private int count;

    public StaticList(int size) {
        this.size = size;
        this.data = new int[size];
        this.count = 0;
    }

    public void clear() {
        this.data = new int[size];
        this.count = 0;
    }

    public void add(int data) {
        if (!isFull()) {
            this.data[count++] = data;
        } else {
            System.out.println("A lista está cheia.");
        }
    }

    public void add(int data, int pos) {
        if (!isFull() && pos >= 0 && pos < size) {
            for (int i = count; i > pos; i--) {
                this.data[i] = this.data[i - 1];
            }
            this.data[pos] = data;
            count++;
        } else {
            System.out.println("Posição inválida ou lista cheia.");
        }
    }

    public int remove(int pos) {
        if (pos >= 0 && pos < count) {
            int removedData = this.data[pos];
            for (int i = pos; i < count - 1; i++) {
                this.data[i] = this.data[i + 1];
            }
            count--;
            return removedData;
        } else {
            System.out.println("Posição inválida.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }

    public void setData(int data, int pos) {
        if (pos >= 0 && pos < count) {
            this.data[pos] = data;
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public int getData(int pos) {
        if (pos >= 0 && pos < count) {
            return this.data[pos];
        } else {
            System.out.println("Posição inválida.");
            return -1;
        }
    }

    public int getSize() {
        return count;
    }

    public int find(int data) {
        for (int i = 0; i < count; i++) {
            if (this.data[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public void printList() {
        for (int i = 0; i < count; i++) {
            System.out.print(this.data[i] + " ");
        }
        System.out.println();
    }
}
