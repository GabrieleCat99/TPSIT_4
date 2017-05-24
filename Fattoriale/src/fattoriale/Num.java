
package fattoriale;

public class Num extends Thread{
    private int num;
    public Num(int x){
        this.num = x;
    }
    public void run(){
        int prod=1, i=1;
        while(i<=this.num){
            prod = prod * i;
            i = i+1;
        }
        System.out.println("Il fattoriale di " + this.num + " e': " + prod);
    }
}
