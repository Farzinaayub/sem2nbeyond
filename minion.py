def minion_game(string):
    kevin=0
    i=0
    stuart=0
    for i in range(len(s)):
        if s[i] in 'AEIOU':
            kevin+=(len(s)-i)
        else:
            stuart+=(len(s)-i)



    if(stuart>kevin):
        print("Stuart",stuart)
    elif(kevin>stuart):
        print("Kevin",kevin)
    else:
        print("Draw")
    return
        
                        
                        
#drivercode               
if __name__ == '__main__':
    s = input()
    
    minion_game(s)