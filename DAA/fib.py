# without recursion
def fib(num):
    print("0, 1,", end=' ')
    a, b = 0, 1
    for i in range(2, num):
        print(f"{a+b},", end=' ')
        a, b = b, a+b

def recur_fib(num):
    def recur(n):
        if n == 0 or n == 1:
            return n
        return recur(n-2) + recur(n-1)
    
    for i in range(num):
        print(recur(i), end=', ')

if __name__ == "__main__":
    print(f"Without Recursion:")
    fib(10)
    print(f"\nWith Recursion:")
    recur_fib(10)
    