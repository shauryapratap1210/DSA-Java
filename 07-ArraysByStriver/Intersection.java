import java.util.*;

class Intersection {
    public ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        
        /* BRUTE FORCE: O(n1*n2)
        ArrayList<Integer> list = new ArrayList<>();
        int visited[] = new int[arr2.length];
        
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                
                if(arr1[i] == arr2[j] && visited[j] == 0){
                    list.add(arr1[i]);
                    visited[j] = 1;
                    break;
                }
                
                if(arr1[i]<arr2[j]){
                    break;
                }
            }
        }
        return list;
        */

        //Two Pointer:OPTIMAL SOLUTION :O(N1+N2)
        ArrayList<Integer>list=new ArrayList<>(); //ArrayList Creation
        int i=0;
        int j=0;
        int m=arr1.length;
        int n=arr2.length;
        while(i<m &&j<n){
            if(arr1[i]<arr2[j]){
                i++;
            }

            else if(arr2[j]<arr1[i]){
                j++;
            }

            else{
                if(list.size() == 0 || list.get(list.size()-1) != arr1[i])//Duplicate avoid krne ke liye
                {
                    list.add(arr1[i]);

                }
                i++;
                j++;

            }
        }
        return list;
    }
}