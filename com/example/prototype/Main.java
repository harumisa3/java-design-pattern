package com.example.prototype;

// import com.example.prototype.Item;
// import com.example.prototype.Manager;
import com.example.prototype.sub.Potion;
import com.example.prototype.sub.Sword;

public class Main {
  public static void main(String[] args) {

    // ================
    // 原型を生成
    // ================
    Manager manager = new Manager();

    // ポーション生成
    Potion redPotion = new Potion("赤のポーション");
    manager.register("redPotion", redPotion);

    Potion orangePotion = new Potion("オレンジのポーション");
    manager.register("orangePotion", orangePotion);

    // 剣の生成
    Sword copperSword = new Sword("銅の剣");
    manager.register("copperSword", copperSword);

    // ================
    // クローン生成
    // ================
    Item sword1 = manager.create("copperSword");
    sword1.get();
    sword1.use();

    Item potion1 = manager.create("redPotion");
    potion1.get();
    potion1.use();

    Item potion2 = manager.create("orangePotion");
    potion2.get();
    potion2.use();
  }
}