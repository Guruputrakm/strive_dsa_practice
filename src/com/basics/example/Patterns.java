package com.basics.example;

public class Patterns {
    public static void main(String[] args) {
        Patterns patterns = new Patterns();
        /*patterns.first(5);
        System.out.println();
        patterns.second(5);
        System.out.println();
        patterns.third(5);
        System.out.println();
        patterns.fourth(5);
        System.out.println();
        patterns.fifth(5);
        System.out.println();
        patterns.sixth(5);
        System.out.printf("\n");
        patterns.seventh(5);
        System.out.printf("\n");
        patterns.eighth(5);
        System.out.printf("\n");
        patterns.seventh(6);
        patterns.eighth(6);
        System.out.println();
        patterns.ninth(5);
        System.out.println();
        patterns.tenth(5);
        System.out.println();
        patterns.eleventh(5);*/
        //patterns.eighth(25);

        //patterns.ninth(5);

        /*System.out.printf("\n");
        patterns.eleventh(5);
        System.out.println();
        patterns.twelth(10);
        System.out.println();*/
        patterns.thirteenth(5);
        System.out.println();
        patterns.forthteenth(5);
        System.out.println();
        patterns.fifteenth(5);
        System.out.println();
        patterns.sixteenth(5);
        System.out.println();
        patterns.print17(10);
        System.out.println();
        patterns.print18(5);
        System.out.println();
        patterns.print19(5);
        System.out.println();
        patterns.print19_1(5);
        System.out.println();
        patterns.print20(5);
        System.out.println();
        patterns.pattern15(5);
        System.out.println();
        patterns.print21(5);
    }

    public void print21(int n) {
        for (int i =0; i< n; i++) {
            for (int j =0; j<n ;j++) {
                if(i ==0 || j == 0|| i == n-1 || j == n-1) {
                    System.out.print("*");
                }else {
                    System.out.print (" ");
                }

            }
            System.out.println();
        }
    }
    public void pattern15(int n) {
        int symtry = (2*n -1);
        for (int i =1; i<= symtry; i++) {
            //start
            int stars = i;
            if (i >= n) {
                stars = 2 * n - i;
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void print20(int n) {
        int initialVal = 2*n-2;
        int symtry = (2*n -1);
        for (int i =1; i<= symtry; i++){
            //start
            int stars = i;
            if(i >= n ) {
                stars = 2*n-i;
            }
            for (int j =0; j<stars; j++){
                System.out.print("*");
            }
            //space
            for (int j =0; j<=initialVal;j++){
                System.out.print(" ");
            }
            //star
            for (int j =0; j<stars; j++){
                System.out.print("*");
            }
            if(i < n) {
                initialVal -= 2;
            }else {
                initialVal += 2;
            }
            System.out.println();
        }
    }
    public void print19_1(int n) {
        int initialSpace = 0;
        for (int i =0; i<n ;i++) {
            for (int j =0; j<n-i; j++){
                System.out.print("*");
            }
            for (int j =0; j<initialSpace; j++){
                System.out.print(" ");
            }
            for (int j =0; j<n-i; j++){
                System.out.print("*");
            }
            initialSpace  += 2;
            System.out.println();
        }
        initialSpace = 8;
        for (int i =0; i<n ;i++) {
            for (int j =0; j<i+1; j++){
                System.out.print("*");
            }
            for (int j =0; j<initialSpace; j++){
                System.out.print(" ");
            }
            for (int j =0; j<i+1; j++){
                System.out.print("*");
            }
            initialSpace  -= 2;
            System.out.println();
        }
    }
    public void print19(int n) {
        int inSpace = 0;
        for (int i =0; i< n; i++){
            //star
            for (int j =0; j< n-i; j++){
                System.out.print("*");
            }
            //space
            for (int k =0;k< inSpace; k++) {
                System.out.print(" ");
            }
            //stars
            for (int j =0; j< n-i; j++){
                System.out.print("*");
            }
            inSpace += 2;
            System.out.println();
        }
        inSpace =8;
        for (int i =0; i<n; i++){
            //star
            for (int j =0; j<=i; j++){
                System.out.print("*");
            }
            //space
            for (int k =0;k< inSpace; k++) {
                System.out.print(" ");
            }
            //stars
            for (int j =0; j<=i; j++){
                System.out.print("*");
            }
            inSpace -= 2;
            System.out.println();
        }

    }
    public void print18(int n) {
        for (int i =0; i< n; i++){
            for (int c ='E'-i; c<='E'; c++) {
                System.out.print((char) c+" ");
            }
            System.out.println();
        }

        /*int ch =  69;
        for (int i =0; i<n ;i++) {
            int var = ch;
            for (int j =0;j<=i;j++) {
                System.out.print((char) var+" ");
                var++;
            }
            ch = ch -1;
            System.out.println();
        }*/
    }
    public void print17(int n) {
        /*
        * formula [n-i-1, 2*i+1, n-i-1]
        * if(row < 2*i-1/2) ch++
        * else ch--
        * */
        //outer loop
        for (int i =0; i<n;i++){
            //space
            for (int j =0; j<=n-i-1; j++){
                System.out.print(" ");
            }
            //alphabets
            int alp = 2*i+1;
            int ch = 65;
            for (int k =0; k<2*i+1; k++){
                System.out.print((char) ch);
                if(k < alp/2) {
                    ch++;
                }else {
                    ch--;
                }

            }
            //Space
            for (int j =0; j<=n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public void sixteenth(int n) {
    /*    int ch = 65;
        for (int i =0; i<n ; i++) {
            for (int j =0;j<=i;j++) {
                System.out.print((char) ch);
            }
            ch = ch+1;
            System.out.println();
        }*/

        for (int i =0; i<n; i++) {
            int latter = 65 +i;
            for (int j =0; j<=i;j++) {
                System.out.print((char) latter);
            }
            System.out.println();
        }

    }
    public void fifteenth(int n) {
    /*    for (int i =n; i>0;i--) {
            char latter = 'A';
            for (int j =i;j>0;j--){
            //for (int j =0;j<i; j++) {
                System.out.print(latter);
                int val = latter;
                val++;
                latter = (char) val;
            }
            System.out.println();
        }*/

        for (int i =0; i<n; i++) {
            for (char c = 'A';c <= 'A'+(n-i-1); c++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public void forthteenth(int n) {

        for (int i =0; i<n; i++) {
            char latter = 'A';
            for (int j =0; j<=i; j++) {
                System.out.print(latter+" ");
                int num = latter;
                num = num+1;
                latter = (char) num;
            }
            System.out.println();
        }
    }
    public void thirteenth(int n) {
        int count =1;
        for (int i=0;i<n;i++) {
            for (int j =0; j<=i; j++){
                System.out.print(count++ +" ");
            }
            System.out.println();
        }
    }
    public void first(int n){
        for (int i =0; i<n; i++){
            for (int j =0; j<n ;j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    public void second(int n ) {
        for (int i =0; i<n ;i++) {
            for (int j =0; j<=i;j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    public void third(int n) {
        for (int i =1; i<=n; i++) {
            for(int j =1; j<=i; j++){
                System.out.printf(j+" ");
            }
            System.out.println();
        }
    }
    public void fourth(int n) {
        for (int i =1; i<=n; i++) {
            for (int j =1; j<=i;j++) {
                System.out.printf(i+" ");
            }
            System.out.println();
        }
    }
    public void fifth(int n) {
        for (int i =0; i<n; i++) {
            for (int j =0; j<n-i+1; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    public void sixth(int n) {
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++) {
                System.out.printf(j+" ");
            }
            System.out.println();
        }
    }

    /*
    * pattern is
    * [space, start, space]
    * [4, 1, 4]
    * [3, 3, 3]
    * [2, 5, 2]
    * [1, 7, 1]
    * [0, 9, 0]
    *
    * so the formula is
    * [n-i-1, 2*i+1, n-i-1]
    * */
    public void seventh(int n) {
        for (int i =0; i<n; i++) {
            for (int j =0; j<=n-i-1; j++){
                System.out.printf(" ");
            }
            for (int k =0; k<2*i+1; k++) {
                System.out.printf("*");
            }
            for (int l=0;l<=n-i-1; l++){
                System.out.printf(" ");
            }
            System.out.println();
        }
    }
    public void eighth(int n) {
        int temp = 0;
        for (int i =0; i< n ; i++){
            System.out.printf(" ");
            for (int j =0; j<i; j++) {
                System.out.printf(" ");
            }
            for (int k = 0; k< (2*n-(2*i+1)); k++) {
                System.out.printf("*");
            }
           /* for (int k  =0; k<n-temp; k++) {
                System.out.printf("*");
                temp-=2;
            }*/
            for (int l =0; l<i; l++){

                System.out.printf(" ");
            }
            System.out.printf("\n");
        }
    }
    public void ninth(int n) {
        this.seventh(n);
        this.eighth(n);
    }

    public void tenth(int n) {
        for (int i =0; i< 2*n-1; i++){
            int stars = i;
            if (i > n) stars = 2*n-i;
            for (int j =0; j<stars; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }

    /*public void tenth(int n) {
        this.second(n);
        this.fifth(n);
    }*/
    /*public void eleventh(int n) {
        int temp = 1;
        for (int i =0; i< n; i++){
            int secTemp = temp;
            for (int j =0; j<=i; j++){
                System.out.printf(secTemp+" ");
                secTemp = secTemp == 0? 1:0 ;
            }
            System.out.println();
            temp = (temp == 0) ?1:0;
        }
    }*/
    public void eleventh(int n) {
        int tempVal = 1;
        for (int i=0; i<n ;i++) {
            tempVal = (i % 2 ==0 ) ? 1 :0;
          /*  if(i/2 ==0 ) {tempVal =1;}  // to define the initial value of each new row
            else {tempVal =0;}*/
            for (int j =0; j<=i;j++)  {
                System.out.printf(""+tempVal);
                tempVal = 1-tempVal; // this is flip logic to change the value next value in the same row
            }
            System.out.println();
        }
    }

    public void twelth(int n) {
        int space = 2 * (n-1);
        for (int i =1; i<=n; i++) {
            //number
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            //space
            for (int k = 0;k<space;k++) {
                System.out.printf(" ");
            }
            //number
            for (int j =i;j>=1;j--) {
                System.out.print(j);
            }
            System.out.println();
            space = space-2;
        }
    }
}
