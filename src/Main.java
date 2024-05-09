public class Main {
    public static void main(String[] args) {
        System.out.println( " Переменные. Урок 2.");
        System.out.println("Задача 1");
        //1
        int a = 2147483647;
        System.out.println("Значение примитивной переменной int с типом целочисленные равно "
                +a);
        //2
        byte b = 127;
        System.out.println("Значение примитивной " +
                "переменной byte с типом " +
                "целочисленные равно "
               +b);
        //3
        short s = 32767;
        System.out.println("Значение примитивной переменной short с типом целочисленные равно "
         + s);
        //4
        long d = 9L;
        System.out.println("Значение примитивной переменной long с типом целочисленные равно "
        + d);
        //5
        float f = 3.4f;
        System.out.println("Значение примитивной переменной float " +
                "с типом с плавающей точкой равно " + f);
        //6
        double g = 1.70;
        System.out.println("Значение примитивной переменной double с типом " +
                "с плавающей точкой равно " + g);

        System.out.println("Задача 2");
        //1
        double c = 27.12;
        System.out.println(c + " double");
        //2
        long n = 987678965549L;
        System.out.println(n + " long");
        //3
        float k = 2.786f;
        System.out.println(k + " float");
        //4
        short r = 569;
        System.out.println(r + "short");
        //5
        short j = -159;
        System.out.println(j + " shout");
        //6
        short o = 27897;
        System.out.println(o + " short");
        //7
        byte u = 67;
        System.out.println(u + " byte");

        System.out.println("Задача 3");

        byte lP = 23;
        System.out.println("У Людмилы Павловны " + lP + " ученика");
        byte aC = 27;
        System.out.println("У Анны Сергеевны " + aC + " ученика");
        byte eA = 30;
        System.out.println("У Екатерины Андреевны " + eA + " учеников");
        short paper = 480;
        System.out.println("Закупили на три класса бумаги " + paper +  " листов");
        System.out.println("Три учительницы закупили все вместе 480 листов бумаги" +
                " на все три класса. Посчитайте, сколько достанется листов каждому ученику.");
        int students = lP + aC + eA;
        System.out.println("всего " + students + " учеников");
        int oneStudent = paper/students;
        System.out.println("На каждого ученика рассчитано " + oneStudent + " листов бумаги");

        System.out.println("Задача 4");

        byte as = 16;
        byte gf = 2;

        System.out.println("Производительность машины для изготовления бутылок- " + as +
                " бутылок за "+ gf + " минуты");
        System.out.println("Какая производительность машины будет:");
        byte one = 20;
        System.out.println("за " + one + " минут");
        short two = 24*60;
        System.out.println(two + " в сутки" );
        int three = 24*3*60;
        System.out.println(three + " за три дня");
        int four = 30*24*60;
        System.out.println(four + " за один месяц");
        //1
        int oneBottle = one/gf*as;
        System.out.println("За " + one + " минут машина произвела "
                + oneBottle + " штук бутылок");
        //2
        int twoBottle = two/gf*as;
        System.out.println("За одни сутки машина произвела "
                + twoBottle + " штук бутылок");
        //3
        int threeBottle = three/gf*as;
        System.out.println("За 3 дня машина произвела " + threeBottle + " штук бутылок");
        //4
        int fourBottle = four/gf*as;
        System.out.println("За 1 месяц машина произвела "
                + fourBottle + " штук бутылок");

        System.out.println("задача 5");
        int totalPaint = 120;
        System.out.println("На ремонт школы нужно " + totalPaint +
                " банок краски двух цветов: белой и коричневой. ");
        byte oneClassPaint = 2+4;
        System.out.println(" На один класс уходит " +
                "2 банки белой и 4 банки коричневой краски. Всего - "  + oneClassPaint +
                " банок краски.");
        int cl = totalPaint/oneClassPaint;
        System.out.println("Всего " + cl + " классов");
        int brown = cl*4;
        int white = cl*2;
        System.out.println("В школе, где " +cl + " классов, нужно " + white +
                " банок белой краски и " + brown + " банок коричневой краски.");
        System.out.println("Задание 6");

        int banana = 5*80;
        int milk = (200/100)*105;
        int iceCream = 2*100;
        int eggs = 4*70;
        int totalWeight = banana+milk+iceCream+eggs;
        System.out.println("Вес спортзавтрака составит " + totalWeight+ " грамм");
        float totalWeightKg = (totalWeight/1000f);
        System.out.println("Вес спортзавтрака составит " + totalWeightKg + " килограмм");
        System.out.println("Задача 7");
        int weightAtle = 7*1000;
        int weight250 = weightAtle/250;
        int weight500 = weightAtle/500;
        int weightCp = (weight250+weight500)/2;
        System.out.println("В среднем, чтобы добиться результата похудения, спортсмену" +
                " может понадобиться " + weightCp + " день.");

        System.out.println("Задача 8");
        //1

        int m = 67760;
        System.out.println(m + " получает в месяц");
        int ma = m/100*10;
        System.out.println(ma + " прибавка в месяц");
        int mash = (ma+m)*12;
        System.out.println(mash + " с прибавкой за год");
        int masha = (mash-m*12);
        System.out.println( " Маша теперь получает за год "  + mash + " рублей. Годовой доход " +
                "вырос на " + masha + " рублей.");

        //2
        int den = 83690;
        System.out.println(den + " получает в месяц");
        float deni = den/100f*10;
        System.out.println(deni + " прибавка в месяц");
        double denis = (deni+den)*12;
        System.out.println(denis + " с прибавкой за год");
        double deniss = denis-den*12;
        System.out.println(  "Денис теперь получает за год "  + denis + " рублей. Годовой " +
                "доход вырос на " + deniss + " рублей.");

        //3
        int kr = 76230;
        System.out.println(kr + " получает в месяц");
        float kri = kr/100f*10;
        System.out.println(kri + " прибавка в месяц");
        double kris = (kr+kri)*12;
        System.out.println(kris + " с прибавкой за год");
        double krist = kris-kr*12;
        System.out.println( "Кристина теперь получает за год " + kris + " рублей. Годовой" +
                " доход вырос на "  + krist + " рублей.");
    }
}