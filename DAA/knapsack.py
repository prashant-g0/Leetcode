def knapsack(wt, pro, cap):
    n = len(wt)
    
    object = [[wt[i], pro[i]] for i in range(n)]
    object.sort(key=lambda x: x[1]/x[0], reverse=True)
    
    remaining = cap
    res = 0.0
    for w, p in object:
        if w <= remaining:
            remaining -= w
            res += p
        else:
            res += (1.0*p/w)*remaining
            break
    
    return res
            

n = int(input("Enter number of objects: "))
weight = list(map(int, input(f"Enter {n} weight: ").split()))
profit = list(map(int, input(f"Enter {n} profit: ").split()))
cap = int(input("Enter capacity: "))

res = knapsack(weight, profit, cap)
print(f"Profit: {res:.2f}")

# Input
# Enter number of objects: 7
# Enter 7 weight: 2 3 5 7 1 4 1
# Enter 7 profit: 10 5 15 7 6 18 3
# Enter capacity: 15
# Profit: 55.333333333333336