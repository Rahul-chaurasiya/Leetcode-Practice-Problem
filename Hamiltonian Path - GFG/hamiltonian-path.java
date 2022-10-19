//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            int N = Integer.parseInt(input_line[0]);
            int M = Integer.parseInt(input_line[1]);
            
            input_line = read.readLine().trim().split("\\s+");
            ArrayList<ArrayList<Integer>> Edges = new ArrayList<ArrayList<Integer>>(); 
            for(int i = 0; i < M; i++){
                ArrayList<Integer> e = new ArrayList<Integer>();
                e.add(Integer.parseInt(input_line[2*i]));
                e.add(Integer.parseInt(input_line[2*i+1]));
                Edges.add(e);
            }
            Solution ob = new Solution();
            if(ob.check(N, M, Edges)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 

{ 

    boolean dfs(ArrayList<ArrayList<Integer>>adj, int i, int count, boolean [] visited)

    {

        if(count==visited.length-1)

        {

            return true;

        }

        visited[i] = true;

        count += 1;

        for(int j : adj.get(i))

        {

            if(!visited[j])

            {

                if(dfs(adj,j,count,visited))

                {

                    return true;

                }

            }

        }

        visited[i] = false;

        count--;

        return false;

    }

    boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) 

    { 

        // code here

        

       ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

       for(int i=0;i<N+1;i++)

       {

           adj.add(new ArrayList<Integer>());

       }

       for(ArrayList<Integer> list : Edges)

       {

           int x = list.get(0);

           int y = list.get(1);

           adj.get(x).add(y);

           adj.get(y).add(x);

       }

       

       boolean visited[] = new boolean[N+1];

       int count = 1;

       for(int i=1;i<=N;i++)

       {

           if(dfs(adj,i,count,visited)) return true;

       }

       

       return false;

    }

} 