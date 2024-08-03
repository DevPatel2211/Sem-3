# Decimal to Any Base

reverse_output = []


def dec2anybase(num):
    if base >= 11 & base <= 20:
        remainder = num % base
        quotient = int(num/base)
        if (remainder == 10):
            remainder = "A"
        elif (remainder == 11):
            remainder = "B"
        elif (remainder == 12):
            remainder = "C"
        elif (remainder == 13):
            remainder = "D"
        elif (remainder == 14):
            remainder = "E"
        elif (remainder == 15):
            remainder = "F"
        elif (remainder == 16):
            remainder = "G"
        elif (remainder == 17):
            remainder = "H"
        elif (remainder == 18):
            remainder = "I"
        elif (remainder == 19):
            remainder = "J"
        reverse_output.append(str(remainder))
        if (quotient != 0):
            dec2anybase(quotient)
        else:
            reverse_output.reverse()
            string1 = ''.join(reverse_output)
            print("Your desired output is:", string1)
    else:
        remainder = num % base
        reverse_output.append(str(remainder))
        quotient = int(num/base)
        if (quotient != 0):
            dec2anybase(quotient)
        else:
            reverse_output.reverse()
            string2 = ''.join(reverse_output)
            print("Your desired output is:", string2)


number = int(input("Enter a decimal number: "))
base = int(input("Enter the desired base for output: "))
dec2anybase(number)
