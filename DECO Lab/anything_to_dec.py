# Any Base to Decimal


base1 = int(input("Enter initial base: "))
number = input("Enter the number: ")
if base1 == 16:
    dict = {"0": 0, "1": 1, "2": 2, "3": 3,
            "4": 4, "5": 5, "6": 6, "7": 7,
            "8": 8, "9": 9, "A": 10, "B": 11,
            "C": 12, "D": 13, "E": 14, "F": 15}
    output = 0
    j = 1
    for term in number:
        output = output + dict[term](16*(len(number)-j))
        j = j+1
    print("The number in decimal is: ", output)
else:
    output = 0
    j = 1
    for i in number:
        if (int(i) > base1):
            print("Enter a valid number")
        output = output + int(i)(base1*(len(number)-j))
        j = j+1
    print("The number in decimal is: ", output)
