n = int(input())
i = 1
while i <= n:
    # 3의 배수인 경우
    if i % 3 == 0:
        print(0, end=" ")
    else:
    # 3의 배수가 아닌 경우
        tmp = i
        flag = False
        while tmp > 0:
            # print(tmp)
            if tmp % 10 == 3 or tmp % 10 == 6 or tmp % 10 == 9 :
                flag = True
                break
            tmp //= 10
        if flag:
            # 3의 배수가 아니면서 3, 6, 9가 들어가는 경우
            print(0, end=" ")
        else:
            # 3의 배수가 아니면서 3, 6, 9가 없는 경우
            print(i, end=" ")

    i += 1