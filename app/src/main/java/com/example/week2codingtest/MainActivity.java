package com.example.week2codingtest;

import java.util.Arrays;

// problem 3 source code

class Generics<T> {
    private int i=0;
    private Object obj[];
    private T t;

    public Generics(int i, Object[] obj, T t) {
        this.i = i;
        this.obj = obj;
        this.t = t;
    }

    public Generics()
    {
        obj=new Object[5];
    }
    public void add(T t)
    {
        this.t=t;
        if(i==obj.length-1)
        {

            obj= Arrays.copyOf(obj, obj.length+(obj.length/2));
            System.out.println(obj.length);
        }
        obj[i]=this.t;
        i++;
    }
    public Object get(int i)
    {
        if(obj[i]!=null)
        {
            return obj[i];
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException("index:"+i);
        }
    }
    public String toString()
    {
        String temp="";
        for(Object ob:obj)
        {
            if(ob!=null)
            {
                temp=temp+ob+',';
            }
        }
        String temp1=temp.substring(0, temp.length()-1);
        return "["+temp1+"]";
    }

    public static void main(String[] args) {

        Generics<Integer> genList=new Generics<Integer>();
        Generics<String> gen1List=new Generics<String>();
        genList.add(11);
        genList.add(22);
        genList.add(33);
        gen1List.add("Harris");
        gen1List.add("Donovan");
        System.out.println(genList+"  "+gen1List);
    }
}
