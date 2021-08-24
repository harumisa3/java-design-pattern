package com.example.flyweight;

public class Main {
  public static void main(String[] args) {
    SettingFactory factory = SettingFactory.getFactory();

    // 設定値の取得
    Setting userId = factory.getSetting("userId");
    System.out.println(userId.getJapaneseValue());
    System.out.println(userId.getEnglishValue());

    // 改行
    System.out.println();

    // 取得二回目
    Setting userId2 = factory.getSetting("userId");
    System.out.println(userId2.getJapaneseValue());
    System.out.println(userId2.getEnglishValue());

    // 改行

    // 設定値の取得(パスワード)
    Setting password = factory.getSetting("password");
    System.out.println(password.getJapaneseValue());
    System.out.println(password.getEnglishValue());
  }
}