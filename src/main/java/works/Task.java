package works;

public class Task {
    public static void main(String[] args) {


        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange(1));
        orangeBox.add(new Orange(2));


        System.out.println(orangeBox.getWeight()); // 3

        BoxApple<Apple> appleBox = new BoxApple<>();
        appleBox.add(new Apple(1));
        appleBox.add(new GoldenApple(2)); // допустимый вариант
        System.out.println(appleBox.getWeight()); // 3

        BoxApple<Apple> goldenAppleBox = new BoxApple<>();
        goldenAppleBox.add(new GoldenApple(5)); // допустимый вариант

        System.out.println(goldenAppleBox.getWeight()); // 5

        goldenAppleBox.moveTo(appleBox); // допустимый вариант


        Box<Orange> orangeBox2 = new Box<>();
        orangeBox.moveTo(orangeBox2);
        System.out.println(orangeBox.getWeight()); // 0
        System.out.println(orangeBox2.getWeight()); // 3
    }
}