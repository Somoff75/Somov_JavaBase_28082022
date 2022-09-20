package com.hillel.somov.lessons.lesson8;

import java.util.Scanner;

public class Poker {

    public static void main(String[] args) {

        int cardsPlayer = 5; // Кількість карт, які потрібно роздати кожному гравцю
        int players ;

        String[] suits = {"\u2660", "\u2665", "\u2663", "\u2666"};
        String[] cardRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int n = suits.length * cardRank.length; // Підраховуємо загальну кількість карт

        for(; ; ){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter numbers of players");

            if(sc.hasNextInt()){                //Умова з використанням методу hasNextInt на те, чи є введене число цілочисельним (тру або фолс)
                players = sc.nextInt();         // Функція яка зчитує ввід з клавіатури та повертає те ж саме значення

                if(cardsPlayer*players <= n){  //Умова, що карт повинно вистачити всім гравцям.
                    break;                     //Якщо умова виконана перериваємо цикл.
                }else{
                    if(players == 0){          //Гравців не може бути 0
                        System.out.println("Try agan");
                        break;
                    }else if(players < 0 ){    //Гравців не може бути менше 0
                        System.out.println("Try agan");
                    }
                    else {
                        System.out.println("Too many players!");      // Умова не виконана, гравців більше ніж катр
                    }
                }
            } else {
                System.out.println("You have not entered a number!"); // Умова не виконана, бо ввели не цілочисельне число (букви, знаки... або мікс букв, знаків, цифр)
            }

        }
        String[] deck = new String[n];                                     //Проводимо ініціалізацію колоди
        for(int i = 0; i < cardRank.length; i++){                          //Запускаємо цикл для рангу карт
            for (int j =0; j < suits.length; j++){                         //Запускаємо цикл для масті карт
                deck [suits.length * i + j] = suits[j] + " " + cardRank[i];// Робимо масив для присвоєння всім рангам карти по масті

            }


        }

        for (int i = 0; i < n; i++){                         //В цьому циклі створюємо випадковий порядок карт у колоді (перемішуємо колоду)
            int g = i + (int)(Math.random() * (n - i));
            String variable = deck[g];
            deck[g] = deck[i];
            deck[i] = variable;

        }

        for (int i = 0; i < players * cardsPlayer; i++ ){    //Цикл роздачі карт гавцям
            System.out.println(deck[i]);                     //Роздаємо карти із згенерованої методом Math.random колоди
            if(i % cardsPlayer == cardsPlayer - 1){          //Пишемо умову що роздати потрібно по 5 карт (-1 в кінці) так як і починається з 0 - перший гравець отримає 6 карт.
                System.out.println();
            }
        }
    }
}
