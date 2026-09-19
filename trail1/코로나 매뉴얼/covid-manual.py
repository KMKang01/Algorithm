s1_c, s1_t = input().split(" ")
s2_c, s2_t = input().split(" ")
s3_c, s3_t = input().split(" ")

def is_corona(c, t):
    t = int(t)
    if c == "Y" and t >= 37:
        return "A"
    elif c == "N" and t >= 37:
        return "B"
    elif c == "Y" and t < 37:
        return "C"
    elif c == "N" and t < 37:
        return "D"

def is_danger(arr):
    count = 0
    for e in arr :
        if e == "A":
            count += 1
    
    if count >= 2:
        return True
    else:
        return False

arr = [is_corona(s1_c, s1_t), is_corona(s2_c, s2_t), is_corona(s3_c, s3_t)]
print("E" if is_danger(arr) else "N")