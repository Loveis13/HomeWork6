public class Main {
    public static void main(String[] args) {
        /// task1
        for (int i = 0; i <= 10;i = i + 1){
            System.out.println(i);

            ///task2

            for (int b = 10; b >= 1; b = b -1){
                System.out.println(b);


                /// task 3

                for (int c = 17; c>= 0; c--)
                if (c % 2 ==0){
                    System.out.println(c);
                }
                /// task 4
                for (int m = 10; m>= -10; m--){
                    System.out.println(m);
                }
                /// task 5
                for (int g = 1904; g < 2096; g = g + 4){
                    System.out.println(" высокостный год " + g );
                }
                /// task 6
                for (int h = 7; h < 98; h = h  + 7){
                    System.out.println(h);
                }

                /// task 7
                for (int o = 1; o < 512; o = o  * 2){
                    System.out.println(o);
                }
                /// task 8
                int save = 29000;
                int total = 0;
                for (int G= 0; G < 12; G++){
                    total = total + save;
                    System.out.println(" Месяц " + G + " сумма накоплений равна " + total + " рублей ");
                }
                System.out.println(total);

                /// task 9
                int salary = 29000;
                double totall = 0;

                int salaryWithPenny = salary * 100;
                int totalWithPenny = 0;
                for (int u = 0; u < 12; u++) {
                    totalWithPenny = totalWithPenny + totalWithPenny / 100;
                    totalWithPenny = totalWithPenny + salaryWithPenny;

                    totall = totalWithPenny / 100.;
                    System.out.println("Месяц " + u + " сумма накоплений равна " + totall + "рублей");
                }
                System.out.println(totall);


                /// task 10
                int number = 1;
                System.out.println(number + " ");
                for (int m = 0; m<9;m++){
                    number = number * 2;
                    System.out.println(number + " ");
                }
                System.out.println();





            }
        }
    }
}