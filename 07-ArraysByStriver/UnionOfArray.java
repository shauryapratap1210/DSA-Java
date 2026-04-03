import java.util.*;
class UnionOfArray {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {

       /* BRUTE FORCE AS O(n1logn)+O(n2logn)+O(n1+n2)

       Set<Integer> st=new TreeSet<>();//Create Set

       //Iteration in First array
       for(int num:a){
           st.add(num);
       }

       //Iteration in Second Array
       for(int num:b){
           st.add(num);
       }

       return new ArrayList<>(st); //Return Array

       */
       /* Array ke liye
       int m=a.length; //Length of array a
       int n=b.length; //Length of array b

       //Pointers for both array
       int i=0;
       int j=0;

       int temp[]=new int[m+n]; // New array
       int k=0; //Pointer of new array

       //Iterate through array and insert non duplicates in third array
       while(i<m && j<n){
           if(a[i]>b[j]){
               if(k==0||temp[k-1]!=a[i]){
                   temp[k++]=a[i];

               }
                 i++;
           }
           else if(a[i]<b[j]){
               if(k==0||temp[k-1]!=b[j]){
                   temp[k++]=b[j];

               }
               j++;
           }
           else{
               if(k==0||temp[k-1]!=a[i]){
                   temp[k++]=a[i];

               }
               i++;
               j++;
           }
       }

       //If a array elemnts end
       while(i<m){
           if(k==0||temp[k-1]!=a[i]){
               temp[k++]=a[i];
           }
           i++;
       }

       //if b array elements end
       while(j<n){
           if(k==0||temp[k-1]!=b[j]){
               temp[k++]=b[j];
           }
           j++;
       }

       return Arrays.copyOf(temp,k);
       */




        int m = a.length;
        int n = b.length;

        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        // Main loop
        while(i < m && j < n){
            if(a[i] < b[j]){
                if(list.size() == 0 || list.get(list.size()-1) != a[i]){
                    list.add(a[i]);
                }
                i++;
            }
            else if(a[i] > b[j]){
                if(list.size() == 0 || list.get(list.size()-1) != b[j]){
                    list.add(b[j]);
                }
                j++;
            }
            else{
                if(list.size() == 0 || list.get(list.size()-1) != a[i]){
                    list.add(a[i]);
                }
                i++;
                j++;
            }
        }

        // Remaining a[]
        while(i < m){
            if(list.size() == 0 || list.get(list.size()-1) != a[i]){
                list.add(a[i]);
            }
            i++;
        }

        // Remaining b[]
        while(j < n){
            if(list.size() == 0 || list.get(list.size()-1) != b[j]){
                list.add(b[j]);
            }
            j++;
        }

        return list;
    }

}








