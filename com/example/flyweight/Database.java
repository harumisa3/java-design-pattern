package com.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Database {

  // データベース内のデータを表すMap
  private static Map<String, Setting> database = new HashMap<>();

  // statigイニシャライザ(Classロードで一度だけ実行される)
  static {
    Setting userId = new Setting("userId", "ユーザID", "USER_ID");
    database.put("userId", userId);
    Setting password = new Setting("password", "パスワード", "PASSWORD");
    database.put("password", password);
  }

  // データを取得するメソッド
  public static Setting getSetting(String key) {
    return database.get(key);
  }

}