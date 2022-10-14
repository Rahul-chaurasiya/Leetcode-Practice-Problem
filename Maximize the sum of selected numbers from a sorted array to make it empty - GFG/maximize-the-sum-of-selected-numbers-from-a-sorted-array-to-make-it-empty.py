#User function Template for python3

class Solution:
    
    def maximizeSum (self,l, n) : 

        #Complete the function

        i=n-1

        ans=0

        c=0 #freq of current element

        while i>=0:

            if i!=n-1:

                if l[i]!=l[i+1]:

                    j=i+1

                    while i>=0 and c>0 and l[i]+1==l[j]:

                        i-=1

                        c-=1

                    c=0

            if i<0:

                break

            ans+=l[i]

            i-=1

            c+=1

        return ans



#{ 
 # Driver Code Starts
#Initial Template for Python 3


for _ in range(0,int(input())):
    n = int(input())
    arr = list(map(int, input().strip().split()))
    arr.sort()
    ob=Solution()
    
    ans = ob.maximizeSum(arr, n)
    print(ans)

    





# } Driver Code Ends