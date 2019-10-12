package com.company;
public class Main
{
    public static void main(String[] args)
    {
        class Printer //Принтер
        {
            int paperamount = 0; //Начальная конфигурация: принтер без бумаги.
            int timeprinting = 60; //Печать происходит в течение 1 минуты.

            void print() //Кнопка "Печать"
            {
                if (paperamount==0) putinpaper(); //Печать без заправленной бумаги производиться не может.
                paperamount=paperamount+1; //Во время печати можно заправить ещё один лист.
                return; //Во время печати нажатием на кнопку «печать» ничего не производится.
            }
            void putinpaper() //Кнопка "Заправка бумаги"
            {
                if (paperamount>0)
                {
                    System.out.println("Бумага заправлена"); //Если бумага заправлена, то повторно заправляться не может.
                } else paperamount++;
            }
        }
    }
}

