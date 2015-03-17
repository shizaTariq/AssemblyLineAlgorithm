### AssemblyLineAlgorithm
##Dynamic Programming
##Assembly line algorithm 
##Author: Shiza Tariq (01387)
Two assembly lines, 1 and 2, each with stations from 1 to n. ( for this i is 1 or 2 and j is number of stations)
A car chassis must pass through all stations from 1 to n in order (in any of the two assembly lines). i.e. it cannot jump from station i to station j if they are not at one move distance.
The car chassis can move one station forward in the same line, or one station diagonally in the other line. It incurs an extra cost, j to move to station j from line i. No cost is incurred for movement in same line.
It works by combining solutions to sub problems, it gives a solution in linear O(n) time.

##Methods 
findPath : returns the cost of shortest path
PrintStation : displays the path

##Test Cases
Different scenarios were taken as input in the two test cases and assert is used to find if they return the actual cost.
Gitlink : https://github.com/shizaTariq/AssemblyLineAlgorithm
