package college;

import java.util.Scanner;
import java.io.*;
import java.util.*;


 public class assignment1 {
    private int V;
    private LinkedList<Integer> adj[];


    assignment1(int v) {
        V = v;
        adj = new LinkedList[v];

        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

        void addEdge(int v,int w)
        {
            adj[v].add(w);

        }


        void BFS(int s)
        {
            boolean visited[] = new boolean[V];

            LinkedList<Integer> queue = new LinkedList<Integer>();

            visited[s] = true;
            queue.add(s);

            while(queue.size() != 0)
            {
                s = queue.poll();
                System.out.print(s+" ");


                Iterator<Integer> i = adj[s].listIterator();
                while(i.hasNext())
                {
                    int n = i.next();
                    if (!visited[n])
                    {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }

    public static void main(String[] args) {
        //Problem1 - Sum of two numbers

//        int num1 , num2,sum;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter First Number:");
//        num1 = sc.nextInt();
//
//
//        System.out.println("Enter the Second Number:");
//        num2 = sc.nextInt();
//
//        sc.close();
//        sum = num1+num2;
//        System.out.println("Enter the sum of two numbers: "+sum);

        //Problem 2 - Matrix Problem - Upper Triangular Matrix
//        int rows,columns;
//        int a[][] = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//
//        };
//
//        rows = a.length;
//        columns = a[0].length;
//
//        if (rows != columns) {
//            System.out.println("Matrix should be square matrix");
//
//        }
//        else {
//            System.out.println("Upper Triangular matrix:");
//            for (int i = 0;i<rows;i++) {
//                for (int j = 0;j<columns;j++) {
//                    if (i > j) {
//                        System.out.print("0 ");
//                    }else{
//                        System.out.print(a[i][j]+ " ");
//                    }
//
//                }
//                System.out.println();
//            }
//        }

        //Problem 3 - BFS in graph

        assignment1 g = new assignment1(4);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);

        System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");

        g.BFS(2);



    }
}
