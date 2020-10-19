package com.pbo;

class Player{
    String name;
    double health;
    int level;
    //objek member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }
    void attack(Player opponents){
        double attackpower = this.weapon.attackpower;
        System.out.println(this.name + " attacking " + opponents.name + " attacking power " + attackpower);
        opponents.defence(attackpower);
    }
    void defence(double attackpower){
        //akan mengambil damage
        double damage;
        if (this.armor.defencepower < attackpower){
            damage = attackpower - this.armor.defencepower;
        } else {
            damage = 0;
        }
        health -= damage;
        System.out.println(this.name + " gots damage " + attackpower);

    }
    void equipweapon(Weapon weapon){
        this.weapon = weapon;
    }
    void  equiparmor(Armor armor){
        this.armor = armor;
    }
    void display(){
        System.out.println("Name : " + this.name);
        System.out.println("health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}
class Weapon{
    double attackpower;
    String name;

    Weapon(String name, double attackpower){
        this.name = name;
        this.attackpower = attackpower;
    }
    void display(){
        System.out.println("Weapon : " + this.name + "Attack : " + this.attackpower);
    }
}
class Armor{
    double defencepower;
    String name;

    Armor(String name, double defencepower){
        this.name = name;
        this.defencepower = defencepower;

    }
    void display(){
        System.out.println("Armor : " + this.name + "Defence : " + this.defencepower);
    }
}
public class latihan {
    public static void main(String[] args){
        //membuat objek player
        Player player1 = new Player("ucup", 100);
        Player player2 = new Player("otong", 100);
        //Membuat objek weapon
        Weapon pedang = new Weapon("pedang", 15);
        Weapon ketapel = new Weapon("ketapel", 1);
        //membuat objek armor
        Armor bajubesi = new Armor("bajubesi", 10);
        Armor kaos = new Armor("kaos", 0);
        //player1
        player1.equipweapon(pedang);
        player1.equiparmor(bajubesi);
        player1.display();

        //player2
        player2.equipweapon(ketapel);
        player2.equiparmor(kaos);
        player2.display();

        System.out.println("\nPERTEMPURAN");
        System.out.println("\nEpisode - 1\n");
        player1.display();
        player2.display();
        player1.attack(player2);
        System.out.println("\nEpisode - 2\n");
        player1.display();
        player2.display();
        player2.attack(player1);

    }
}
