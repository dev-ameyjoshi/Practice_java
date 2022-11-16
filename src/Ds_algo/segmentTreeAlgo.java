package Ds_algo;

//Two operations --> to increment range by value and
// to find the minimum over the range

interface QueryInterface{
    public void increment(int i , int j, int value);
    public int minimum(int i, int j);
}

//since interface requires its methods to be declared in public in implemented interface class.

class RangeSlow implements QueryInterface
{
    int [] arr;
    public RangeSlow(int n){
        arr = new int [n];
    }
    public void increment(int i,int j,int val){
       for(int k=i;k<=j;k++){
           arr[k] += val;
       }
    }
    public int minimum(int i, int j) {
        int res = arr[i];
        for (int k = i + 1; k <= j; k++)
            res = Math.min(res, arr[k]);

            return res;


    }

}

class SegmentTree implements QueryInterface{
    int n;
    int [] lo,hi,min,delta;
    //low and high end of the range -> will tell us
    // for every single node id , what is the range  its responsible for in the node.
    //min -> to keep track of range minimum.
    //delta-> change to push down through the children main

    public SegmentTree(int n)
    {
        this.n = n;
        lo = new int[4*n+1];//how big do I make this array, in BST we have n-1 internal nodes.
        hi = new int[4*n+1];
        min = new int[4*n+1];//min over entire sub tree range
        delta = new int[4*n+1];//value to be pushed down to children nodes
        init(1,0,n-1);

    }
    public void increment(int a,int b,int val){
       increment(1,a,b,val); //Gives current node id for segment trees
    }
    public int minimum(int a , int b){
        return minimum(1,a,b);

    }
    void init(int i,int a,int b){
        //range I am trying to initialise and the node I am currently on.
        lo[i] = a;
        hi[i] = b;
        if(a == b) {//when we run out of leaf nodes.
            return;
        }
            int m = (a+b)/2;
            init(2*i,a,m);
            init(2*i+1,m+1,b);



    }
// Two helper functions prop(propagation)  and update
    void prop(int i)
    {
         delta[2*i] += delta[i]; // for left child
         delta[2*i+1] += delta[i];//for right child
         delta[i] += 0;
    }
    void update(int i){
        min[i] = Math.min(min[2*i]+delta[2*i+1],min[2*i+1] + delta[2*i+1]);
        //if u want it to be max , just change it to Math.max
        //left child and right child respectively and adding the change delta to it.

    }


    //functions to take in node ID's
    void increment(int i,int a, int b, int val){
        if( b < lo[i]|| hi[i]<a){
           return;
            //           lo[i]   =   a;      lo[i]=   a;
            //              \                       /             when the range u have is not in the given interval
            //        hi[i] = b;                hi[i] = b;
        }
        if(a <= lo[i] && hi[i] <= b){
            delta[i] +=val; // when the value is completely in the range
            return;
        }
        //Lazy change that needs to be pushed down the tree.(maybe lazy propagation.)
        //And also a recursion to call the increment function again.
        prop(i);
        increment(2*i,a,b,val); //For the left and right child respectively.
        increment(2*i+1,a,b,val);
        update(i);
        // we have climbed down the subtree and now when we want to know the min of the subtree
        // we perform the update method to get the minimum of the entire range
        // and store the aggregate of the entire min of the subtree.



    }
    int minimum(int i, int a,int b){
        if(b<lo[i] || hi[i] < a) //outside range case
            return Integer.MAX_VALUE;
        if(a<=lo[i] && hi[i] <=b)//complete range cover case
            return min[i] + delta[i];
        prop(i); //we get the partial covered case again hence we call the prop function
        int minLeft = minimum(2*i,a,b);
        int minRight = minimum(2*i+1,a,b);

        update(i);
        return Math.min(minLeft,minRight);
    }

}
//Circular RMQ problem on codeforces
public class segmentTreeAlgo {
    public static void main(String[] args) {
        int arr[] = {1,3,2,7,9,11};
        int n =arr.length;

        segmentTreeAlgo tree = new segmentTreeAlgo();

    }
}
