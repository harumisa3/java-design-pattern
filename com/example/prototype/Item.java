package com.example.prototype;

public interface Item extends Cloneable {

  // アイテムを獲得するメソッド
  public void get();

  // アイテムを使うメソッド
  public void use();

  // クローンを生成するメソッド
  public Item createClone();
}