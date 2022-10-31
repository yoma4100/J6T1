package ru.netology.sqr;

public class SQRService {
    public int sqrfinder(int lowerRangeLimit, int higherRangeLimit) {
        //int i = 10;
        int count = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerRangeLimit && i * i <= higherRangeLimit) {
                count++;
            }
        }

/*       while (i <= 99) {
            if (i * i >= lowerRangeLimit && i * i <= higherRangeLimit) {
                count++;
                i++;
            } else {
                i++;
            }
        }*/
        return count;
    }
}