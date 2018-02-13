package by.belstu.it.Tickhonovich.basejava;

import java.io.UnsupportedEncodingException;
import java.math.*;
import java.util.Random;

import  static java.lang.Math.*;
public class JavaTest {
    final int integerconst = 10;
    public final  int pfint = 100;
    public  static final int psfint = 1000;
    public static void main(String[] args) {
        char ch = 's';
        int in = 56;
        short sh = 23;
        long lg = 123;
        byte bt =  112;
        double dob  = 12.44;
        boolean bool = true;
        boolean bool2 = false;
        String str = "belstu";
       /* str + in;
        str + ch;
        str + dob;
        bt = bt + in;
        int k = dob + lg;*/
        long log = in + 2147483647;
        System.out.println(log);

        //static int sint;
        boolean b;
        b = bool2 && bool;
        b = bool^bool2;
        //b = bool + bool2;
        long ttt = 2147483647;
        long  lgtype;
        long t = 0x7fff_ffff_fffL;
        long t1 = 0x7fff_ffff_fffL;
         double dobl = Float.intBitsToFloat(0x7F800000);
        double dobl1 = Float.intBitsToFloat(0xFF800000);
        System.out.println(dobl + "   "+ dobl1);

        System.out.println(Math.PI);
        System.out.println(Math.E);

        double p = Math.round(Math.PI);
        double e = Math.round(Math.E);
        double min = Math.min(p,e);
        System.out.println(min);
       double arand = 0;
       double brand = 1;
       double random_number = arand + (Math.random() * brand);
        System.out.println("Random " + random_number);


        Integer iiii = new Integer(100);
        Integer iii = new Integer(2);
        Boolean bclass = new Boolean(bool);
        Character character = new Character('c');
        Short shor = new Short(sh);
        Long lon = new Long(lg);
        Double doubl = new Double(dob);
        Double dddd = doubl + log;
        Integer fsd = iiii << iii;
        System.out.println(fsd);

        System.out.println(Long.MIN_VALUE + "  " + Long.MAX_VALUE);
        System.out.println(Double.MIN_VALUE + "  " + Double.MAX_VALUE);

        Integer ifg = 9; //автоупаковка
        int fgh = 0;
        fgh = new Integer(9); //распаковка
        Byte byt1 = 12;
        byte bbb = 0;
        bbb = new Byte(byt1);

        int parse = Integer.parseInt("9");
        String hex = Integer.toHexString(15);
        System.out.println(hex);

        System.out.println(Integer.compare(100, 101));
        String result = Integer.toString(15, 16);
        System.out.println(result);

        int tyu = 15;
        System.out.println("Namber of one bits " + Integer.bitCount(127));
        System.out.println("Binary = " + Integer.toBinaryString(tyu));
        System.out.println(Double.isNaN(Math.sqrt(-16)));

        //TODO f)

        /**преобразование числа с помощью конструктора
         * */
        try{
            Integer int1 = new Integer("565");
            System.out.println(int1);
        }
        catch (NumberFormatException ex){
            System.err.println("Неверный формат строки");
        }
        /**С использованием метода valueOf класса Integer*/
            try {
                String s34 = "2345";
                Integer int34 = Integer.valueOf(s34);
                System.out.println("С использованием метода valueOf " + int34);
            }
            catch (NumberFormatException ex){
                System.err.println(ex.getMessage() + "Неверный формат строки");
            }

            /**Parse*/
            int integer1 = 0;
            String string1 = "100";
            try{
                integer1 = Integer.parseInt(string1);
                System.out.println(integer1);
            }
            catch (NumberFormatException ex){
                System.err.println("Неверный формат строки");
            }

            String string2017 = "2017";
            byte[] i2017 = string2017.getBytes();
            System.out.println("Перевод строки в массив байтов " + i2017);

        //массив байтов переводим обратно в строку
        try {
            String stroka = new String(i2017, "utf-8");
            System.out.println("обратно " + stroka);
        }
        catch (UnsupportedEncodingException exep){
            exep.printStackTrace();
        }

        String strochka = "true";
        Boolean b1 = Boolean.valueOf(strochka);
        Boolean b2 = Boolean.parseBoolean(strochka);
        System.out.println(b1 && b2);

        //сравнение строк
            String h1 = "12345";
            String h2 = "12345";
            String h3 = "23456";

        System.out.println("Сравнение через == " + h1 == h2);
        System.out.println("equals " + h1.equals(h3));
          System.out.println("CompareTo " + h2.compareTo(h3));

        String Strsplit =  new String("Разделяем эту строку на слова");
        for(String retval : Strsplit.split(" ")){
            System.out.println(retval);
        }

        String name = "Это очередная строка ";
        System.out.println(name.contains("строка"));
        System.out.println("Хэш-код для строки name " + name.hashCode());
        System.out.println("indexof " + name.indexOf('о'));
        System.out.println("Length " + name.length());
        System.out.println("Replace " + name.replace('а', 'Ы'));


        char[][] c1 = null;
        char[] c2[];
        char c3 [][];
        c1 = new char[3][];


    }
}
