package com.example.bridge;

import java.util.List;

public abstract class DbImpl {

  // DB接続メソッド
  public abstract void connect();

  // 従業員一覧を取得するメソッド
  public abstract List<Employee> findAllEmployee();

  // DBクローズメソッd
  public abstract void close();
}