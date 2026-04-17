def int_to_fat(num):
    temp_n = num
    out = ""
    
    while True:
        out += str(temp_n % 2)
        
        temp_n = temp_n // 2

        if temp_n == 1:
            out += str(temp_n)
            break
    
    out = out + ("0" * (32 - len(out)))
    
    return out

def bin_to_int(num):
    pass

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
            
