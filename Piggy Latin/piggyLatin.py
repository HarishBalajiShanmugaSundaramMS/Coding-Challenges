def pig_latin(text):
    say = " " 
    say2 = []
    words = text.split()
    for word in words:
        say2.append(word[1:]+word[0]+'ay')
    return say.join(say2)       # [ x for x in range(1,101) if x % 10 == 0 ]
print(pig_latin("hello how are you")) # Should be "ellohay owhay reaay ouyay"
print(pig_latin("programming in python is fun")) # Should be "rogrammingpay niay ythonpay siay unfay"

