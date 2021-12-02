package lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Задание1
        String[] arr = {"red", "white", "black", "blue", "orange"};
        System.out.println(Arrays.toString(arr));
        swap(arr, 2,4);
        System.out.println(Arrays.toString(arr));
        //Задание2
        List<String> arrList = converter(arr);
        System.out.println(arrList.getClass());
        //Задание3
        Box<Apple> appleBox = new Box<>(new Apple(), new Apple(), new Apple(),new Apple(), new Apple());

        Box<Orange> oranges = new Box<>(new Orange(), new Orange(), new Orange());

        System.out.println(appleBox.compare(oranges));

        Box<Orange> orangeBox = new Box<>(new Orange());

        System.out.println(oranges.getWeight());
        oranges.movingFruit(orangeBox);
        System.out.println(orangeBox.getWeight());
        System.out.println(oranges.getWeight());
    }

    public static void swap (String[] arr, int indexi,int indexj) {
        String temp = arr[indexi];
        arr[indexi] = arr[indexj];
        arr[indexj] = temp;
    }
    public static List converter (String[] arr) {
        return Arrays.asList(arr);
    }

}
