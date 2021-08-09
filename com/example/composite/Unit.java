package com.example.composite;

public abstract class Unit {

  // 名前を取得するメソッド
  public abstract String getName();
  
  // 一覧を表示するメソッド
  public abstract void printList(String prefix);

  // Unitを追加するメソッド
  protected void add(Unit unit){}

  // 一覧表示の際に使用する
  @Override
  public String toString() {
    return getName();
  }

}