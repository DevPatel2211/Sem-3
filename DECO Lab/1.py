# def to_decimal(num, b):

#     converted = 0

#     for i in range(len(num)):

#         nnum = int(num[i])

#     converted += nnum * (b**i)


# return converted
# number = input("Enter number to be converted: ")
# nnumber = number[::-1]
# base = int(input("Enter base: "))
# a = to_decimal(nnumber, base)
# print("converted number is: ", a)
# def to_decimal(num, b):


# iconverted = 0
# fconverted = 0
# integerpart, fractionalpart = num.split('.')
# integerpart2 = integerpart[::-1]
# for i in range(len(integerpart2)):
# nnum = int(integerpart2[i])
# iconverted += nnum * (b**i)
# for i in range(1, len(fractionalpart) + 1):
# nnum = int(fractionalpart[i - 1])
# fconverted += nnum * (b**(-i))
# return iconverted + fconverted
# print("Convert Binary, Octal, Hexadecimal to DECIMAL")
# number = input("Enter number to be converted: ")
# base = int(input("Enter base: "))
# a = to_decimal(number, base)
# print("Converted number is:", a)
# def decimal_to_other(num, base):


# rarr = []
# while num >= base:
# rem = num % base
# rarr.append(rem)
# num = num//base
# rarr.append(num)
# str_num = ""
# for ele in rarr[::-1]:
# str_num += str(ele)
# return str_num
# print("Convert DECIMAL to Binary, Octal, Hexadecimal")
# number = int(input("Enter number to be converted: "))
# base = int(input("Enter base in which number to be converted: : "))
# print(decimal_to_other(number, base))
