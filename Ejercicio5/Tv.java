package Ejercicio5;

public class Tv {
    private int channel;
    private int volumenLevel;
    private boolean on;

    public Tv(){
        this.channel = 1;
        this.volumenLevel = 1;
        this.on = false;
    }
    public void turnOn(){
        this.on = true;
        System.out.println("la televisión está encendida");

    }

    public void turnOff(){
        this.on = false;
        System.out.println("La televisión está apagada");
    }

    public void setChannel(int newChannel){
        
        
    }
    public void channelUp(){
        if (this.on && this.channel < 100){
            channel++;
            System.out.println("Canal" + this.channel);
        } else if (this.on && this.channel == 100){
            this.channel = 1;
            System.out.println("Canal" + this.channel);
        }else {
            System.out.println("la televisión no esta encendida");
        }
    }
    public void channelDown(){
        if (this.on && this.channel < 100){
            channel--;
            System.out.println("canal" + this.channel);
        } else if {}
        }

    }
    public void volumenUp(){

    }
    public void volumenDown(){

    }


    
}
