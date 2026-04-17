n = int(input())
temps = [int(i) for i in input().split()]

pref = [0] * (n + 1)
it = 1
soma = 0

for n in temps:
    soma += n
    pref[it] = soma
    it += 1

q = int(input())

for _ in range(q):
    x, y, m = map(int, input().split())
    
    if x >= pref[-1]:
        op1 = x
    
    else:
        op1 = pref[-1]
        
    op2 = pref[m] + y
    
    if op1 <= op2:
        print(op1)
    
    else:
        print(op2)
        



