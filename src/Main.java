public class Main {
    public static void main(String[] args) {
        //Задание 1
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double[] numbers2 = {1.57, 7.654, 9.986};
        int[] weight = {82, 87, 92, 90, 87, 85, 86};
        //Задание 2
        for (int i = 0; i < numbers.length; i++) {
            if (i <= 1) {
                System.out.print(numbers[i] + ", ");
            } else if (i == 2) {
                System.out.println(numbers[i]);
            }
        }
        for (int a = 0; a < numbers2.length; a++) {
            if (a < numbers2.length - 1) {
                System.out.print(numbers2[a] + ", ");
            } else if (a < numbers2.length) {
                System.out.println(numbers2[a]);
            }
        }
        for (int b = 0; b < weight.length; b++) {
            if (b < weight.length - 1) {
                System.out.print(weight[b] + ", ");
            } else if (b < weight.length) {
                System.out.println(weight[b]);
            }
        }
        //Задание 3
        for (int c = numbers.length - 1; c >= 0; c--) {
            if (c > 0) {
                System.out.print(numbers[c] + ", ");
            } else if (c == 0) {
                System.out.println(numbers[c]);
            }
        }
        for (int x = numbers2.length - 1; x >= 0; x--) {
            if (x > 0) {
                System.out.print(numbers2[x] + ", ");
            } else if (x == 0) {
                System.out.println(numbers2[x]);
            }
        }
        for (int q = weight.length - 1; q >= 0; q--) {
            if (q > 0) {
                System.out.print(weight[q] + ", ");
            } else if (q == 0) {
                System.out.println(weight[q]);
            }
        }
        //Задание 4
        for (int w = 0; w < numbers.length; w++) {
            if (w < numbers.length - 1 && numbers[w] % 2 != 0) {
                numbers[w] = numbers[w] + 1;
                System.out.print(numbers[w] + ", ");
            } else if (w < numbers.length && numbers[w] % 2 != 0){
                numbers[w] = numbers[w] + 1;
                System.out.println(numbers[w]);
            }
        }
    }
}