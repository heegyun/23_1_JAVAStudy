package my.day08;

import java.util.ArrayList;

public class RPGTest {
    public static void main(String[] args) {

        ArrayList<Novice> novices = new ArrayList<Novice>();

        // wizard 객체 생성
        Wizard wizard = new Wizard();
        wizard.name = "간달프";
        wizard.hp = 100;
        wizard.mp = 80;
        wizard.punch();
        wizard.fireball();
        wizard.speed=2;
        wizard.move();
        // knight 객체 생성
        Knight knight = new Knight();
        knight.name = "킹아서";
        knight.hp = 150;
        knight.stamina = 70;
        knight.punch();
        knight.slash();
        knight.speed = 3;
        knight.move();
       Wizard wizard2=new Wizard();
       Knight knight2 = new Knight();

        novices.add(wizard);
        novices.add(knight);
        novices.add(wizard2);
        novices.add(knight2);

        for (Novice n : novices){
            if(n instanceof Wizard){
                ((Wizard) n).fireball();
            }else if(n instanceof Knight){
                ((Knight) n).slash();
            }
        }



    }
}
