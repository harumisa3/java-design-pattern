package com.example.bridge;

import java.util.ArrayList;
import java.util.List;

// MySQL用クラス
public class MysqlDbImpl extends DbImpl {

  @Override
  public void connect() {
    System.out.println("MySQLに接続しました");
  }

  @Override
  public List<Employee> findAllEmployee() {

    // DBに接続せずに、生成した一覧を返却します
    List<Employee> employeeList = new ArrayList<>();

    Employee yamada = new Employee("山田", 30);
    employeeList.add(yamada);

    Employee tanaka = new Employee("田中", 23);
    employeeList.add(tanaka);

    return employeeList;
  }

  @Override
  public void close() {
    System.out.println("MySQLとの接続をクローズしました");
  }
}