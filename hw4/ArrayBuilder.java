public class ArrayBuilder<T extends Comparable<T>> {

    private Object[] arrayData;
    private int size = 1;
    private int length = 0;

    public ArrayBuilder() {
        arrayData = new Object[1];
    }


    public ArrayBuilder(T[] arr){
        this.arrayData = new Object[arr.length+1];
        for (int i = 0; i<arr.length; i++){
            this.arrayData[i] = arr[i];
            this.size = arr.length+1;
            this.length = arr.length;
        }
    }

    public Object[] getArrayData() {
        return arrayData;
    }

    public int getSize() {
        return size;
    }

    public int getLength() {
        return length;
    }

    public void printArray(){
        for (Object elem: arrayData) {
            if (elem!=null){
                System.out.printf("%s ",elem);
            }
        }
        System.out.println();
    }

    public int findElement(T element){
        for (int i =0; i<getSize(); i++){
            if (arrayData[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    public boolean ifElementInList(T element){
        for (int i =0; i<getSize(); i++){
            if (arrayData[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    public void replace(int index, T value) {
        if (getSize()-1 >= index) {
            arrayData[index] = value;
        }
    }

    public void add(T value) {

        arrayData[getSize()-1] = value;
        incrementCapacity(getSize() + 1);
    }
    private void incrementCapacity(int i) {
        Object[] newArray = new Object[i];

        for (int  j= 0; j< getSize(); j++){
            newArray[j] = arrayData[j];
        }
        this.arrayData = newArray;
        this.length +=1;
        this.size +=1;
    }


    public void removeByIndex(int index) {
        if (getLength() >= index) {
            arrayData[index] = null;
        }
        decrementCapacity(getLength()-1);
    }

    public void removeByData(T data) {
        boolean flag = false;
        if (getLength() >= 0) {
            for (int i=0; i< getLength(); i++){
                if (arrayData[i].equals(data)){
                    arrayData[i] = null;
                    flag = true;
                }
            }
        }
        if (flag) {
            decrementCapacity(getLength() - 1);
        }
    }

    private void decrementCapacity(int size){

        Object[] newArray = new Object[getLength() - 1];
        int index = 0;

        for (Object element: arrayData){
            if (element!=null){
                newArray[index] = element;
                index++;
            }
        }
        this.arrayData = newArray;
        this.length -=1;
        this.size -=1;
    }

    public T max(T[]arr){
        T result = (T) arr[0];
        for (T element: (T[]) arr) {
            if (element.compareTo(result) > 0){
                result = element;
            }
        }return result;
    }

    public T min(T[]arr){
        T result = (T) arr[0];
        for (T element: (T[]) arr) {
            if (element.compareTo(result) < 0){
                result = element;
            }
        }return result;
    }


    public Integer sum(T[]arr){
        Integer result = 0;
        for (T element: (T[]) arr) {
            result+= (Integer) element;
        }
        return result;
    }

    public Integer multiplication(T[]arr){
        Integer result = 1;
        for (T element: (T[]) arr) {
            result*= (Integer) element;
        }
        return result;
    }


    private T[] bubbleSorted(T[] arr){

        for (int i = 0; i < arr.length -1; i++){
            for (int j = 0; j < arr.length -1 - i; j++){
                if (arr[j].compareTo(arr[j+1]) > 0){
                    swap(arr, j);
                }
            }
        }
        return arr;
    }

    private void swap(T[] array, int j) {
        T temp = array[j];
        array[j] = array[j +1];
        array[j +1] = temp;
    }


    public void insertionSort(T[] arr) {
        int j;
        for (int i = 1; i < arr.length; i++) {
            T swap = arr[i];
            for (j = i; j > 0 && swap.compareTo(arr[j - 1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = swap;
        }
    }

    public void selectionSort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int pos = i;
            T min = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(min) < 0) {
                    pos = j;
                    min = arr[j];
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;
        }
    }


}

