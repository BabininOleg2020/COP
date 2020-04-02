package com.company;

import java.util.Arrays;

public class Solution {
    private float[] floatAnswer = new float[3];
    private String[] data;
    private float[] floatArray;
    private float[] arrCheck;


    public void setData(String[] data) {
        this.data = data;
    }

    public String[] getData() {
        return data;
    }


    private float[] convertToFloatArray(String[] mass) {
        float[] floatData = new float[mass.length];
        float[] floatArray = new float[0];
        for (int i = 0; i < mass.length; i++) {
            int arrItem = Integer.parseInt(mass[i]);
            floatData[i] = arrItem;
        }
        arrCheck = floatData;
        Arrays.sort(arrCheck);
        if ((floatData.length > 100) || (floatData.length < 1)) {
            System.out.println("Вы ввели массив, длинна которого не соответсвуtет условиям задачи");
        } else if ((arrCheck[0] <= -100) || (arrCheck[arrCheck.length - 1] >= 100)) {
            System.out.println("Вы допустили ошибку при вводе элементов массива(-100<элемент<100)");
        } else {
            floatArray = floatData;
        }
        return floatArray;
    }

    private float[] valCounter(float[] floatArray) {
        float pos = 0, neg = 0, zero = 0;
        for (int i = 0; i < floatArray.length; i++) {
            if (floatArray[i] > 0) {
                pos++;
            } else if (floatArray[i] < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        floatAnswer[0] = pos / floatArray.length;
        floatAnswer[1] = neg / floatArray.length;
        floatAnswer[2] = zero / floatArray.length;
        return floatAnswer;


    }

    public void answer(){
        float[] preresult =  convertToFloatArray(this.data);
        float[] result =  valCounter(preresult);
        for(int i = 0; i<result.length; i++) {
            System.out.println(result[i]);

        }


    }


}

