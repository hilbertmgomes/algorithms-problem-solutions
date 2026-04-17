n = int(input())

for _ in range(n):
    
    c, k = map(int, input().split())
    
    ass = input()
    count = 0
    found = False
    
    for char in ass:
        if char == "0":
            count += 1
            
            if count == k + 1:
                print("yes")
                found = True
                break
        
        else:
            count = 0
        
    if not found:
        print("no")