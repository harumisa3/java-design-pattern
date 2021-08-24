package com.example.flyweight;

import java.util.EventListener;

public class Setting {

  // キー
  private String key;

  // 設定値
  private String japaneseValue;

  // 設定値
  private String englishValue;

  // コンストラクタ
  public Setting(String key, String japaneseValue, String englishValue) {
    super();
    this.key = key;
    this.japaneseValue = japaneseValue;
    this.englishValue = englishValue;
  }

  // =======================
  // 各種getter
  // =======================
  public String getJapaneseValue() {
    return this.japaneseValue;
  }

  public String getEnglishValue() {
    return this.englishValue;
  }
}