package com.shapes;

public class App{

    private static void drawRectangle(int n,int m){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||i==n)System.out.print("* ");
                else if(j==1||j==m)System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void drawRightTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n)System.out.print("* ");
                else if(j==1||j==i)System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void drawRegularTriangle(int height){
        for(int i=1;i<=height/2+1;i++){
            for(int j=1;j<=height;j++){
                if(i==1){
                    if(j==height/2+1)System.out.print("* ");
                    else System.out.print(" ");
                }
                else if(i==height/2+1)System.out.print("*");
                else if(j==height/2+i||j==height/2-i+2)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void drawRhomb(int n){
        int k=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n/2+1)System.out.print("*");
                else
                if(j==n/2+k+1||j==n/2-k+1)System.out.print("*");
                else System.out.print(" ");


            }
            if(i<=n/2)k++;else k--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawRectangle(6,4);
        System.out.println();
        drawRightTriangle(6);
        System.out.println();
        drawRegularTriangle(7);
        System.out.println();
        drawRhomb(7);
    }
}
