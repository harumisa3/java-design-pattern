package com.example.adapter;

public class PrintAdapter extends Show implements Print {

  // 画面に文字を表示するメソッド
  public void printStr(String str) {

    System.out.println("===============");
    showStr(str);
    System.out.println("===============");
  }

  // 入力された数値を表示するメソッド
  public void printNumber(int value) {

    System.out.println("---------");
    showNumber(value);
    System.out.println("---------");
  }
}