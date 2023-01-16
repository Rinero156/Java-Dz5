package ru.netology.sqr;

public class SQRService {
    public int searchForSquares(int beginningRange, int endRange) {
        int i = 10;
        int y = 0;
       do {
           i++;
           if (beginningRange <= i * i && i * i <= endRange) {
               y++;
           }
           } while (i <= 99); {
           return y;
        }

       }
    }

