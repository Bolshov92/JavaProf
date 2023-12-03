package com.prof.algorithms;

public class BigO {

//     1 уровень сложности: Level 1
//         Какова временная сложность?
    void test1(int n)
    {
        if (n==1)
            return;
        for (int i=1; i<=n; i++)
            for (int j=1; j<=n; j++)                       // O(n^2)
                System.out.println("*");
        break;
    }
    void test2(int n)
    {
        int a = 0;
        for (i = 0; i < n; i++)                             //O(n^2)
            for (j = n; j > i; j--)
                a = a + i + j;

    }

//    Level 2
//          Какова временная сложность?
    void test3(int n)
    {
        int i, j, a = 0;
        for (i = n/2; i <=n; i++)
            for (j = 2; j <=n; j=j*2)                   // O(n log n)
                a=a+n/2;
    }
    void test4(int n)
    {
        int a = 0, i = n;
        while (i > 0) {                                 //O(log n)
            a += i;
            i /= 2;
        }
    }


}
