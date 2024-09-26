package com.melion.memento.ushtrime.albinabazi;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Document dc = new Document();

        String p1 = "permbajtja e pare 1";
        String p11 = "stili i pare 1";
        int p111 = 1;

        dc.ndryshoPermbajtjen(p1);
        dc.ndryshostiliIShkronjave(p11);
        dc.ndryshoPermasaEShkronjave(p111);

        String p2 = "permbajtja e dyte 2";
        String p22 = "stili i dyte 2";
        int p222 = 2;

        dc.ndryshoPermbajtjen(p2);
        dc.ndryshostiliIShkronjave(p22);
        dc.ndryshoPermasaEShkronjave(p222);

        String p3 = "permbajtja e tret 3";
        String p33 = "stili i tret 3";
        int p333 = 3;

        dc.ndryshoPermbajtjen(p3);
        dc.ndryshostiliIShkronjave(p33);
        dc.ndryshoPermasaEShkronjave(p333);

        System.out.println("--------------------------------------------------");
        dc.undu();
        System.out.println("--------------------------------------------------");
        dc.undu();
        System.out.println("--------------------------------------------------");
        dc.undu();
        System.out.println("--------------------------------------------------");


        /* 
        Scanner sc = new Scanner(System.in);
        Document dc = new Document();
        boolean vazhdo = true;

        while(vazhdo){
            System.out.print("content: ");
            String content = sc.nextLine();
            System.out.print("fontName: ");
            String fontName = sc.nextLine();
            System.out.print("fontSize: ");
            int fontSize = sc.nextInt();
            
            dc.ndryshoPermbajtjen(content);
            dc.ndryshostiliIShkronjave(fontName);
            dc.ndryshoPermasaEShkronjave(fontSize);

            sc.nextLine();

            System.out.println("A deshironi ta riktheni siq ishte me par? (PO/JO)");
            String opsioni1 = sc.nextLine();

            while (opsioni1.equalsIgnoreCase("po")){
                dc.undu();

                System.out.println("A deshironi ta riktheni siq ishte me par? (PO/JO)");
                opsioni1 = sc.nextLine();
            }

        
            System.out.println("A deshironi te vazhdoni ne nje document te ri? (PO/JO)");
            String opsioni2 = sc.nextLine();

            if( opsioni2.equalsIgnoreCase("PO")){
                dc=new Document();
            } else {
                vazhdo = false;
            }
        
        }
        */
    }
}