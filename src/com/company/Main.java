package com.company;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> PhoneBook = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();

            PhoneBook.put(name,phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(PhoneBook.containsKey(s)){
                System.out.println(s+ "="+PhoneBook.get(s));

        }
            else
            {
                System.out.println("Not found");
            }

        }  in.close();
    }}

