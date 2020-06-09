# Lab 5 delite insentences from letter a to letter b
import re

text = "I think all people like holidays, because they don’t work and have a good time. They can visit their friends\
 and relatives, invite guests and have a lot of fun. There are many different holidays. On the first of January we\
celebrate New Year. On the seventh of January and the twenty-fifth of December we have Christmas. The twenty-third of \
February is the Day of the Defenders of the Motherland or the Army Day. On the eighth of March we congratulate our \
mothers, grandmothers, sisters and all the women with their holiday. Then comes Easter and Radonitsa. The first of May \
is the Labour Day. The ninth of May is Victory Day. The third of July is Independence Day. Then comes the seventh of \
November, the day of the October Revolution and so on.But our favourite holidays are Christmas and New Year. They are \
full of magic, presents and hopes.Every year we have a New Year tree and decorate it with toys, tinsel and coloured \
lights. We send and get many greeting cards. We buy and give presents to our dearest and nearest. I like to get \
presents. Last year my parents gave me a wonderful game and many tasty things as a present. Next year I would like to \
get a puppy, because I like pets and I want to take care of somebody. Puppies are so charming. I’m going to make \
something with my own hands for my Mum, Dad, Granddad and Granny.We usually have a holiday supper with many tasty \
things. When the clock strikes twelve the grown-ups drink a toast to the New Year and wish «Happy New Year» to each \
other. Then we dance, sing songs, watch holiday TV or go for a walk and play games. I think it is the best holiday."


first_l = str(input("write first letter:"))
second_l = str(input("write second letter:"))


class Sentence:

    def __init__(self, a, b, t):
        self.first_l = str(a)
        self.second_l = str(b)
        self.sentences = t
        self.b = 0
        self.answer = ""
        self.search()

    def search(self):
        result = []
        s = ""
        for i in self.sentences:
            t = re.findall('[' + self.first_l + '].*[' + self.second_l + ']', i)
            if t:
                k = (i.split(t[0]))
                result.append(k[0] + ".")
            else:
                result.append(i + ".")
        s = s.join(result)
        print(s)


class Text:

    def __init__(self, t, a, b):
        self.a = a
        self.b = b
        self.sentences = t.split(".")

        Sentence(self.a, self.b, self.sentences)


f = Text(text, first_l, second_l)