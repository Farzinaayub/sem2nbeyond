
def digitsum(n):
    dsum=0
    for ele in str(n):
        dsum += int(ele)
    return dsum
#initailising list
List=[1,35,5,256,6,8,4]
newlist=[digitsum(i) for i in List if i & 1]
print(newlist)