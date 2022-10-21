//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int top = 0, bottom = R-1;
        int left = 0, right = C-1;
        
        int dir = 0;
        
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                while(left <= right && top <= bottom){
                    
                    if(dir == 0){       //Left Direction
                        for(int z=left; z<=right; z++){
                            list.add(a[top][z]);
                        }
                        top++;
                    }
                    if(dir == 1){       //Down Direction
                        for(int z=top; z<=bottom; z++){
                            list.add(a[z][right]);
                        }
                        right--;
                    }
                    if(dir == 2){       //Right Direction
                        for(int z=right; z>=left; z--){
                            list.add(a[bottom][z]);   
                        }
                        bottom--;
                    }
                    if(dir == 3){       //Up Direction
                        for(int z=bottom; z>=top; z--){
                            list.add(a[z][left]);
                        }
                        left++;
                    }
                    
                    dir = (dir+1)%4;
                }
            }
        }
        Collections.reverse(list);
        int ans[] = new int[list.size()];
        int x = 0;
        for(int i : list){
            ans[x++] = i;
        }
        return ans;
    }
}