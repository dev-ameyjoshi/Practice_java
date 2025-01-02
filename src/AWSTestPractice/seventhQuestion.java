package AWSTestPractice;

import java.util.Set;
//import java.util.*;
import java.util.HashSet;
public class seventhQuestion {
    public static long getMinimumCost(int [] parcels,int k){
        Set<Integer> collectionParcels =  new HashSet<>();

        long minCost = 0;
        k -= parcels.length;
        int currW = 1;

        for(int parcel : parcels){
            collectionParcels.add(parcel);
        }

        while(k > 0){
            if(!collectionParcels.contains(currW)){
                minCost+= currW;
                k--;
            }
            currW++;
        }
        return minCost;
    }
    public static void main(String[] args) {
        int [] parcels = {2,3,6,10,11};
        int k = 9;
        int n = parcels.length;
        long result = getMinimumCost(parcels,k);
        System.out.println(result);
    }
}
