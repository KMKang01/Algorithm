n = int(input())
arr = ["John", "Tom", "Paul", "Sam"]
while n <= 4:
    print(arr[n-1])
    n = int(input())
    if n >= 5 :
        print("Vacancy")
        break