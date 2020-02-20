
# ?================================================
# ? Title: First Reccuring Character in a String
# ? Author: HarishBalaji ShanmugaSundaram
# ?================================================

word = 'LEARN PYTHON PROGRAMMING'
count = 0

class my_dictionary(dict):
    def __init__(self):
        self = dict()

    def add(self, key, value):
        self[key] = value

try:
    dict_obj = my_dictionary()
    length = len(word)
    onetoten = range(0, length)
    if length > 1:
        for i in onetoten:
            if word[i] not in dict_obj:
                count = count+1
                dict_obj.add(word[i], count)
            else:
                break
    print('First Reccuring Character: '+word[count])
except IndexError:
    print('No Recurring Character Found')
