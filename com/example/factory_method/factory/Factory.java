package com.example.factory_method.factory;

public abstract class Factory {

  //Productを生成して登録するメソッド
  public final Product create(String serialNumber){

    //Productの生成
    Product product = create(serialNumber);

    //Productの登録
    registerProduct(product);

    return product;
  }

  protected abstract Product createProduct(String serialNumber);

  protected abstract void registerProduct(Product product);
}