package com.company;

public class ConvertNumbers {

public int convertRimToArab(String rimNum){
     int result ;
    switch (rimNum) {
        case "I":
            result = 1;
            break;
        case "II":
            result = 2;
            break;
        case "III":
            result = 3;
            break;
        case "IV":
            result = 4;
            break;
        case "V":
            result = 5;
            break;
        case "VI":
            result = 6;
            break;
        case "VII":
            result = 7;
            break;
        case "VIII":
            result = 8;
            break;
        case "IX":
            result = 9;
            break;
        case "X":
            result = 10;
            break;

        case "XI":
            result = 11;
            break;
        case "XII":
            result = 12;
            break;
        case "XIII":
            result = 13;
            break;
        case "XIV":
            result = 14;
            break;
        case "XV":
            result = 15;
            break;
        case "XVI":
            result = 16;
            break;
        case "XVII":
            result = 17;
            break;
        case "XVIII":
            result = 18;
            break;
        case "XIX":
            result = 19;
            break;
        case "XX":
            result = 20;
            break;
        //            default:

        default:
            throw new IllegalStateException("Unexpected value: " + rimNum);
    }
    return result;
}

    public String convertingArabToRomeFromm10To100ForFirstArabDig(int num) {
        String result ;

        switch (num) {
            case 1:
                result = "X";
                break;
            case 2:
                result = "XX";
                break;
            case 3:
                result = "XXX";
                break;
            case 4:
                result = "XL";
                break;
            case 5:
                result = "L";
                break;
            case 6:
                result = "LX";
                break;
            case 7:
                result = "LXX";
                break;
            case 8:
                result = "LXXX";
                break;
            case 9:
                result = "XC";
                break;
            case 10:
                result = "C";
                break;
            case 50:
                result = "D";
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }
        return result;

    }
    public String convertArabToRimFirst(int num) {
        String result ;

        switch (num) {


            case 1:
                result = "X";
                break;
            case 2:
                result = "XX";
                break;
            case 3:
                result = "XXX";
                break;
            case 4:
                result = "XL";
                break;
            case 5:
                result = "L";
                break;
            case 6:
                result = "LX";
                break;
            case 7:
                result = "LXX";
                break;
            case 8:
                result = "LXXX";
                break;
            case 9:
                result = "XC";
                break;
            case 10:
                result = "C";
                break;
            case 50:
                result = "D";
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }
        return result;
    }public String convertArabToRimForSecondDig(int num) {
        String result ;

        switch (num) {
            case 1:
                result = "I";
                break;
            case 2:
                result = "II";
                break;
            case 3:
                result = "III";
                break;
            case 4:
                result = "IV";
                break;
            case 5:
                result = "V";
                break;
            case 6:
                result = "VI";
                break;
            case 7:
                result = "VII";
                break;
            case 8:
                result = "VIII";
                break;
            case 9:
                result = "IX";
                break;
            case 10:
                result = "X";
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + num);
        }
        return result;
    }
}
