package com.s1;

public class Robot {
    private int x;
    private int y;
    private String direction;

    //mi generer constructeur automatique => Alt + insert

    //Constructeur de la classe Robot
    public Robot(int ix, int iy, String idirection) {
        this.x = ix;
        this.y = iy;
        this.direction = idirection;
    }

    // methode avancer
    public void avancer(){
        switch (this.direction){
            case "est" -> this.x++;
            case "ouest" -> this.x--;
            case "nord" -> this.y++;
            case "sud" -> this.y--;
            default -> throw new IllegalStateException("Unexpected value: " + this.direction);
        }
    }

    // methode tourner
    public void tourner(String sense){
        switch (this.direction){
            case "nord" -> {
                if (sense.equals("droite")){this.direction = "est";}
                if (sense.equals("gauche")){this.direction = "ouest";}
            }
            case "est" -> {
                if (sense.equals("droite")){this.direction = "sud";}
                if (sense.equals("gauche")){this.direction = "nord";}
            }
            case "sud" -> {
                if (sense.equals("droite")){this.direction = "ouest";}
                if (sense.equals("gauche")){this.direction = "est";}
            }
            case "ouest" -> {
                if (sense.equals("droite")){this.direction = "nord";}
                if (sense.equals("gauche")){this.direction = "sud";}
            }
        }

    }

    // méthode afficher
    public void showRobot(){ System.out.println("x = " + this.x + " y = " + this.y + " Direcion : "+ this.direction); }

    //Classe pour l'éxécution du programme
    public static void main(String[] args) {
        Robot bemax = new Robot(0,0,"nord");
        bemax.showRobot();
        bemax.avancer();
        bemax.avancer();
        bemax.showRobot();
        bemax.tourner("droite");
        bemax.avancer();
        bemax.showRobot();
        bemax.tourner("gauche");
        bemax.avancer();
        bemax.showRobot();
    }
}
