package Numbah;

public class IntVector implements IntList {
    private int[] numbers;
    private int size = 0;

    public IntVector() {
        numbers = new int[20];
    }

    @Override
    public void add(int number) {
        if (size == numbers.length) {
            int newLength = numbers.length * 2;
            int[] newArray = new int[newLength];

            for (int i = 0; i <= size; i++) {
                newArray[i] = numbers[i];
            }
            numbers = newArray;
        }

        numbers[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("This item does not exist!");
        }
        return numbers[id];
    }

    public int getSize() { return size; }
}
