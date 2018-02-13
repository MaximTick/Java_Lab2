package com.company;

import by.belstu.it.Tickhonovich.basejava.WrapperString;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //TODO
        WrapperString wrapperString = new WrapperString("Jack");
        //wrapperString.replace('9', '3');
        WrapperString wrapperString1 = new WrapperString("rt"){
            public  void replace(char oldchar, char newchar) {
                char old = '4';
                char newc = '2';
                char temp;
                oldchar = old;
                newchar = newc;
                temp = old;
                oldchar = newc;
                newchar = temp;
                System.out.println(oldchar + " " + newchar);
            }
           public void delete(char newchar){
               System.out.println(newchar);
            }
        };
    wrapperString1.replace('3','5');
    wrapperString.replace('3','1');
/**@return какое - нибудь значение
 * @throws ошибка
 * @param args
 * */
    }
}
