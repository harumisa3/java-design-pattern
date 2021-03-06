package com.example.bridge;

public class Employee {

  // 名前
  private String name;

  // 年齢
  private int age;

  // コンストラクタ
  public Employee(String name, int age) {
    super();
    this.name = name;
    this.age = age;
  }

  // 名前のgetter
  public String getName() {
    return this.name;
  }

  // 名前のSetter
  public void setName(String name) {
    this.name = name;
  }

  // 年齢のgetter
  public int getAge() {
    return this.age;
  }

  // 年齢のsetter
  public void setAge(int age) {
    this.age = age;
  }

  // toString メソッド
  @Override
  public String toString() {
    return "Employee [name=" + name + "age=" + "]";
  }

}