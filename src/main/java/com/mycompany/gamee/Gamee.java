
package com.mycompany.gamee;
public class Gamee{
   
    public static void main(String[] args) {
        //buat objek Hero
        Player hero = new Player();
        
        //memberi nilai atribut
        hero.name = "Davtio";
        hero.speed = 50;
        hero.damage = 40;
        hero.armor = 20;
        hero.healthPoint= 100;
        
        //Membuat objek enemy
        Player Enemy = new Player();
        
        //Memberi nilai atribut
        Enemy.nameE = "Akmal";
        Enemy.speedE = 60;
        Enemy.damageE = 35;
        Enemy.armorE= 15;
        Enemy.healthPointE = 100; 
        
        
        hero.run();
        hero.attack(Enemy.nameE);
        Enemy.defenseE(Enemy.armorE, hero.damage, Enemy.healthPointE);
        Enemy.attackE(hero.name);
        hero.defense(hero.armor, Enemy.damageE, hero.healthPoint);
        Enemy.runE();
      
        if(hero.isDead()){
            System.out.println("Game Over");
        }
    }
        
}

