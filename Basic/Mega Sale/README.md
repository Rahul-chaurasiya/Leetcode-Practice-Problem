<h2><a href="https://practice.geeksforgeeks.org/problems/mega-sale1431/1">Mega Sale</a></h2><h3>Difficulty Level : Basic</h3><hr><div class="problems_problem_content__Xm_eO" bis_skin_checked="1"><p><span style="font-size:18px">Mr. Geek is a greedy seller. He has a stock of <strong>N</strong> laptops which comprises of both useful and useless laptops. Now, he wants to organize a sale to clear his stock of useless laptops. The prices of <strong>N</strong> laptops are <strong>A</strong><sub><strong>i</strong> </sub>each consisting of positive and negative integers (-ve denoting useless laptops). In a day, he can sell atmost <strong>M</strong> laptops. Mr. Geek being a greedy seller want to earn <strong>maximum profit</strong> out of this sale. So, help him maximizing his profit by selling useless laptops.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px">N=4, M=3</span>
<span style="font-size:18px">A[] = {-6, 0, 35, 4}
<strong>Output:</strong></span>
<span style="font-size:18px">6
<strong>Explanation:</strong></span>
<span style="font-size:18px">Geek sells the laptops with price -6 and
earns Rs. 6 as profit.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N=5, M=10
A[] = {1, -2, -3, -4, 5}
<strong>Output:</strong></span><span style="font-size:18px">
9
<strong>Explanation:</strong></span><span style="font-size:18px">
Geek sells the laptops with price -2,
-3 and -4 and earns Rs. 9 as profit.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>maxProfit()</strong>&nbsp;which takes the array <strong>A[]</strong>, its size <strong>N</strong><strong> </strong>and<strong> </strong>an integer <strong>M </strong>as inputs and returns the maximum profit Mr. Geek can earn in a single day.</span><br>
<br>
&nbsp;</p>

<p><strong><span style="font-size:18px">Expected time Complexity: </span></strong><span style="font-size:18px">O(NlonN)</span><br>
<strong><span style="font-size:18px">Expected time Complexity: </span></strong><span style="font-size:18px">O(1)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 ≤ N ≤ 10<sup>5</sup><br>
1 ≤ M ≤ 10<sup>5</sup><br>
-10<sup>6 </sup>≤ A<sub>i</sub> ≤ 10<sup>6</sup></span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Sorting</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;