package com.mycompany.gamee;

public class Player {
    //atribut
    String name, nameE;
    int speed, speedE, healthPoint=100, damage, armor=20, healthPointE, armorE=15, damageE;
     
    //menthod lari
    void run(){
        System.out.println(name + " is running...");
        System.out.println("Speed: " + speed);
    }
    //menthod menyerang (hero)
    void attack (String nameE){
        
        System.out.println(name + " Is Attacking " +nameE);
        System.out.println("Damage : " + damage);
    }
    //menthod bertahan (hero)
    void defense (int armor, int damageE, int healthPointE){
        System.out.println(name + " Is Defending");
        System.out.println("Armor : " + armor);
        System.out.println("damage masuk : " +(damageE-armor));
        System.out.println("Sisa HP Hero :" + (healthPoint -(damageE-armor)));
    }
    //menthod lari (enemy)
    void runE(){
        System.out.println(nameE + " Kaburrr");
        System.out.println("Speed: " + speedE);
    }
    //menthod menyerang (enemy)
    void attackE (String name){
        System.out.println(nameE + " Is Attacking "+name);
        System.out.println("Damage : " + damageE);   
    }
    //menthod bertahan (enemy)
    void defenseE (int armorE, int damage, int healthPointE){
        System.out.println(nameE + " Is Defending ");
        System.out.println("Armor : " + armorE);
        System.out.println("damage masuk : "+(damage-armorE));
        System.out.println("Sisa HP Musuh : " + (healthPointE -(damage-armorE)));
    }
    //menthod isDead
    boolean isDead(){
        if(healthPoint<=0) return true;
          return false;
    }
}

