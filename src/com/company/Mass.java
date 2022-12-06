package com.company;

public class Mass {
    int size = 7;
    int[] a = new int[size];

    public void method() {
        if (size % 2 == 1) {
            for (int i = size / 2; i >= 0; i--) {
                for (int j = 0; j < 1; j++) {
                    System.out.println(a[j] = i);
                }
            }
            for (int i = 1; i <= size / 2; i++) {
                for (int j = 0; j < 1; j++) {
                    System.out.println(a[j] = i);
                }
            }
        }
    }
//    public void method2(){
//        if (size % 2 == 1){
//            for (int j = 0; j <a.length; j++) {
//                for (int i = size/2; i<=size/2 ; i--) {
//                    if (j<=size/2){
//                        System.out.println(a[j]=i);
//
//                    }
//                    else {
//                        System.out.println(a[j]=i);
//                        i++;
//                    }
//                }
//            }
//        }
//    }
}
