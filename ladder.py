def int_to_fat(num):
    temp_n = num
    out = [0] * 3
    it = -1
    
    while True:
        if temp_n % 2 == 1:
            out[it] = 1
            it -= 1
        
        temp_n = temp_n // 2

        if temp_n == 1:
            out[it] = 1
            break
    
    return out

print(int_to_fat(6))


'''
while True:
    try:
        n1, n2 = map(int, input().split())
        
        temp_n1 = int_to_fat(n1)
        temp_n2 = int_to_fat(n2)
        
        out = ""
    
    except EOFError:
        break
'''
            
