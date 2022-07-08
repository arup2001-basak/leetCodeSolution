// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String[] nk = br.readLine().trim().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            Solution sln = new Solution();
            ArrayList<ArrayList<Integer>> ans = sln.fourSum(a, k);
            for (ArrayList<Integer> v : ans) {
                for (int u : v) {
                    System.out.print(u + " ");
                }
                System.out.print("$");
            }
            if (ans.isEmpty()) {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// k : the quadruple sum required

class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] a, int k){
        ArrayList<ArrayList<Integer>> h= new ArrayList<ArrayList<Integer>>();
        Arrays.sort(a);
        int n = a.length;
        for(int i=0; i<n-3; i++){
            int p=a[i];
            for(int j=i+1; j<n-2; j++){
                int q=a[j];
                int l=j+1 , r=n-1;
                while(l<r){
                    int sum = p+q+a[l]+a[r];
                    if(sum==k){
                        ArrayList<Integer> ar = new ArrayList<Integer>();
                        ar.add(p);
                        ar.add(q);
                        ar.add(a[l]);
                        ar.add(a[r]);
                        Collections.sort(ar);
                        if(!h.contains(ar)) h.add(ar);
                        l++;
                        r--;
                    }
                    else if(sum>k) r--;
                    else l++;
                }
            }
        }
        return h;
    }
}