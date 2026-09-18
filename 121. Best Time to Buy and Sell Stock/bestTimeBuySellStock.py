from typing import List

class bestTimeBuySellStock:
    def maxProfit(self, prices: List[int]) -> int:
        l ,r = 0, 1 # left = buy, right = sell
        maxP = 0
        
        while r < len(prices):
            if prices[l] < prices[r]:
                profit = prices[r] - prices[l]
                maxP = max(maxP, profit)
            else:
                l = r
            r += 1
            
        return maxP
    
solution = bestTimeBuySellStock()

assert solution.maxProfit([7,1,5,3,6,4]) == 5
assert solution.maxProfit([7,6,4,3,1]) == 0