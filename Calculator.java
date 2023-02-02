package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = reader.readLine();
            char[] chars = line.toCharArray();
            ConvertNumbers rimNums = new ConvertNumbers();
            String rimFirst;
            String rimSecond;
            int result;
            int arabFirst;
            int arabSecond;
            int firstDigOfTheFirstNum;
            int secondDigOfTheFirstNum;
            int firstDigOfTheSecondNum;
            int secondDigOfTheSecondNum;
            String firstDigOfTheFirstRimNum;
            String secondDigOfTheFirstRimNum;
            String firstDigOfTheSecondRimNum;
            String secondDigOfTheSecondRimNum;

            for (int i = 0; i < chars.length; i++) {

                if (line.matches(".*\\d+.*")) {

                    if (chars[i] == '-') {
                        arabFirst = Integer.parseInt(line.substring(0, i));
                        arabSecond = Integer.parseInt(line.substring(i + 1, line.length()));
                        result = arabFirst - arabSecond;
                        System.out.println(result);
                        break;
                    }
                    if (chars[i] == '*') {
                        arabFirst = Integer.parseInt(line.substring(0, i));
                        arabSecond = Integer.parseInt(line.substring(i + 1, line.length()));

                        //если число двухзначное, то узнаём из каких цифр остоит первое цисло
                        if(line.substring(0,i).length() >=2){
                            firstDigOfTheFirstNum = Integer.parseInt(line.substring(0,1));
                            secondDigOfTheFirstNum = Integer.parseInt(line.substring(1,2));
                            System.out.println(firstDigOfTheFirstNum+" , " + secondDigOfTheFirstNum);
                        }

                        //если второе число двухзначное, то узнаём из каких цифр остоит второе цисло
                        if(line.substring(i + 1, line.length()).length() >= 2){
                            String s  = line.substring(i + 1, line.length()).substring(0,1);
                            firstDigOfTheSecondNum = Integer.parseInt(s);
                            String s2  = line.substring(i + 1, line.length()).substring(1,2);
                            secondDigOfTheSecondNum = Integer.parseInt(s2);
                            System.out.println(firstDigOfTheSecondNum+" , " + secondDigOfTheSecondNum);
                        }
                        result = arabFirst * arabSecond;
                        System.out.println(result);
                        break;
                    }
                    if (chars[i] == '/') {
                        arabFirst = Integer.parseInt(line.substring(0, i));
                        arabSecond = Integer.parseInt(line.substring(i + 1, line.length()));
                        result = arabFirst / arabSecond;
                        System.out.println(result);

                    }  if (chars[i] == '+') {
                        arabFirst = Integer.parseInt(line.substring(0, i));
                        arabSecond = Integer.parseInt(line.substring(i + 1, line.length()));
                        result = arabFirst + arabSecond;
                        System.out.println(result);
                        break;
                    }

                }
                if (chars[i] == '+') {
                    rimFirst = line.substring(0, i);
                    rimSecond = line.substring(i + 1, line.length());

                    arabFirst = rimNums.convertRimToArab(rimFirst);
                    arabSecond = rimNums.convertRimToArab(rimSecond);
                    result = arabFirst + arabSecond;

                    if(result > 10) {
                        if(result ==100){
                            System.out.println("C");
                            break;
                        }

                        String strResult = String.valueOf(result);
                        String firstResultDig = strResult.substring(0,1);
                        String secondResultDig = strResult.substring(1,2);
                        int firstNum = Integer.parseInt(firstResultDig);
                        int secondNum = Integer.parseInt(secondResultDig);
                        if(secondNum==0){
                            rimSecond = "";
                        } else {
                            rimSecond = rimNums.convertArabToRimForSecondDig(secondNum);
                        }
                        rimFirst = rimNums.convertArabToRimFirst(firstNum);
                        System.out.println(rimFirst+rimSecond);
                        break;
                    }
                    String res = rimNums.convertArabToRimForSecondDig(result);
                    System.out.println(res);
                    break;

                }
                if (chars[i] == '-') {
                    rimFirst = line.substring(0, i);
                    rimSecond = line.substring(i + 1, line.length());

                    arabFirst = rimNums.convertRimToArab(rimFirst);
                    arabSecond = rimNums.convertRimToArab(rimSecond);
                    result = arabFirst - arabSecond;

                    if(result > 10) {
                        if(result == 100){
                            System.out.println("C");
                            break;
                        }

                        String strResult = String.valueOf(result);
                        String firstResultDig = strResult.substring(0,1);
                        String secondResultDig = strResult.substring(1,2);
                        int firstNum = Integer.parseInt(firstResultDig);
                        int secondNum = Integer.parseInt(secondResultDig);
                        if(secondNum==0){
                            rimSecond = "";
                        } else {
                            rimSecond = rimNums.convertArabToRimForSecondDig(secondNum);
                        }
                        rimFirst = rimNums.convertArabToRimFirst(firstNum);
                        System.out.println(rimFirst+rimSecond);
                        break;
                    }
                    String res = rimNums.convertArabToRimForSecondDig(result);
                    System.out.println(res);
                    break;
                }
                if (chars[i] == '*') {

                    rimFirst = line.substring(0, i);
                    rimSecond = line.substring(i + 1, line.length());

                    arabFirst = rimNums.convertRimToArab(rimFirst);
                    arabSecond = rimNums.convertRimToArab(rimSecond);
                    result = arabFirst * arabSecond;

                    if(result > 10) {
                        if(result ==100){
                            System.out.println("C");
                            break;
                        }

                    String strResult = String.valueOf(result);
                    String firstResultDig = strResult.substring(0,1);
                    String secondResultDig = strResult.substring(1,2);
                    int firstNum = Integer.parseInt(firstResultDig);
                    int secondNum = Integer.parseInt(secondResultDig);
                    if(secondNum==0){
                        rimSecond = "";
                    } else {
                        rimSecond = rimNums.convertArabToRimForSecondDig(secondNum);
                    }
                    rimFirst = rimNums.convertArabToRimFirst(firstNum);
                        System.out.println(rimFirst+rimSecond);
                        break;
                    }
                   String res = rimNums.convertArabToRimForSecondDig(result);
                    System.out.println(res);
                    break;

                }
                if (chars[i] == '/') {

                    rimFirst = line.substring(0, i);
                    rimSecond = line.substring(i + 1, line.length());

                    arabFirst = rimNums.convertRimToArab(rimFirst);
                    arabSecond = rimNums.convertRimToArab(rimSecond);
                    result = arabFirst / arabSecond;

                    if(result > 10) {
                        if(result ==100){
                            System.out.println("C");
                            break;
                        }

                        String strResult = String.valueOf(result);
                        String firstResultDig = strResult.substring(0,1);
                        String secondResultDig = strResult.substring(1,2);
                        int firstNum = Integer.parseInt(firstResultDig);
                        int secondNum = Integer.parseInt(secondResultDig);
                        if(secondNum==0){
                            rimSecond = "";
                        } else {
                            rimSecond = rimNums.convertArabToRimForSecondDig(secondNum);
                        }
                        rimFirst = rimNums.convertArabToRimFirst(firstNum);
                        System.out.println(rimFirst+rimSecond);
                        break;
                    }
                    String res = rimNums.convertArabToRimForSecondDig(result);
                    System.out.println(res);
                    break;
                }

            }
        }
        }

}
