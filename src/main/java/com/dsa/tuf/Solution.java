package com.dsa.tuf;

class Solution {
    public void whichWeekDay(int day) {
        if (day < 1 || day > 7) {
            System.out.println("Invalid");
            return;
        }

        String weekday = null;

        switch (day) {
            case 1:
                weekday = "Monday";
                break;
            case 2:
                weekday = "Tuesday";
                break;
            case 3:
                weekday = "Wednesday";
                break;
            case 4:
                weekday = "Thursday";
                break;
            case 5:
                weekday = "Friday";
                break;
            case 6:
                weekday = "Saturday";
                break;
            case 7:
                weekday = "Sunday";
                break;
        }
        System.out.println(weekday);
    }
}