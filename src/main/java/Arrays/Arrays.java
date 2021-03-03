package Arrays;


/*
 * Андрей Москвин
 * Зд к уроку №2
 */
public class Arrays {



    public static void main (String[] args){

        System.out.print("Задача №1: ");
        //Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int [] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i <10 ; i++) {
            if (array1[i] == 0) {
                array1[i] = 1;
            }else {
                array1[i] = 0;
            }
            System.out.print(array1[i]+" ");
        }
        System.out.println();

        System.out.print("Задача №2: ");
        //Задать пустой целочисленный массив размером 8.
         //С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int [] array2 = new int[8];
        for (int i = 0, j = 0; i <array2.length ; i++, j+=3) {
            array2[i] = j;
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        // Сначала сделал так, но отсекается 0.
        // Как запустить цикл с 0, а не сразу с 3?
        //int [] array3 = new int[8];
        //for (int i = 0, j = 0; i <array3.length ; i++) {
        //  array3[i] = j+=3;
        //  System.out.print(array3[i] + " ");
        //}

        System.out.print("Задача №3: ");
        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int [] array4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i <array4.length ; i++) {
            if (array4[i] < 6){
                array4[i] = array4[i] * 2;
            }
            System.out.print(array4[i] + " ");
        }
        System.out.println();

        System.out.print("Задача №4: ");
        System.out.println();
        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int [][] array5 = new int[3][3];
        for (int i = 0; i <array5.length ; i++) {
            for (int j = 0, a = array5[i].length; j <array5[i].length ; j++, a--) {
                if ((i == j) || i == (a - 1)){
                    array5[i][j] = 1;
                }
                System.out.print(array5[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.print("Задача №5:");
        System.out.println();
        //Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int [] array6 = {1, 15, 10, 3, 16, 8, 0};
        int max = array6[0];
        int min = array6[0];
        for (int i = 0; i <array6.length ; i++) {
            if (array6[i] > max){
                max = array6[i];
            }
            if (min > array6[i]){
                min = array6[i];
            }
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);

    }
}
