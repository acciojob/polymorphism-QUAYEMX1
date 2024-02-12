package com.driver;

public class Main {
    public static void main(String[] args) {
      Product p=new Product();

      int ans=p.product(10,20);
      int ans1=p.product(1,2,3);
      double ans3=p.product(1.0,2.0);

      System.out.println(ans+" "+ans1+" "+ans3);
    }


    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }

    }
}