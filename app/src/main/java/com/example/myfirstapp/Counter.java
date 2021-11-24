package com.example.myfirstapp;

public class Counter {
   private int luku = 0;

    public int min;
    public int max;
    public int start;
    public int step;


    public Counter(){
        this.max = 100;
        this.min = -100;
        this.start = 0;
        this.step = 1;
    }

    public Counter(int max, int min, int start, int step){
        this.max = max;
        this.min = min;
        this.start = start;
        this.step = step;
    }

    public void add(){
        if (luku + step < max){
            luku += step;
        }
        else {
            luku = max;
        }
    }

    public void take(){
        if (luku - step > min){
            luku -= step;
        }else {
            luku = min;
        }
    }

    public void zero(){
        luku = start;
    }

    public int getLuku() {
        return luku;
    }
}
