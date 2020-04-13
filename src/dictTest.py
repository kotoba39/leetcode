lists = [1,3,4,5,6,7,9,2]

# 切片

print(lists[::-1])

# 函数reverse 对数组进行操作

lists.reverse()

print(lists)

# 函数reversed 返回一个迭代对象，需要list化

print(list(reversed(lists)))
