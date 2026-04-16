# n = 4 # number of jobs
# jobs = [["A", 1, 19], ["B", 2, 25], ["C", 2, 40], ["D", 3, 23]] # JobID, Deadline, Profit

n = int(input("Enter number of jobs: "))

jobs = []
for i in range(n):
    jobid, deadline, profit = input("Enter JobID, Deadline, Profit: ").split()
    jobs.append([jobid, int(deadline), int(profit)])

jobs.sort(key=lambda x: x[2], reverse=True)

slot = [False]*n
seq = []
tot_profit = 0

for i in range(n):
    for j in range(min(n, jobs[i][1])-1, -1, -1):
        if not slot[j]:
            slot[j] = True
            seq.append(jobs[i][0])
            tot_profit += jobs[i][2]
            break

print(f"Maximum Profit Sequence is: {seq}")
print(f"Maximum Profit is: {tot_profit}")
