class Dog:
    def __init__(self, name, color, age, weight):
        self.name = name
        self.color = color
        self.age = age
        self.weight = weight
    
    def tell(self):
        print('There is a ' + self.color + ', ' + self.age + ' years old, ' + self.weight + 'and its name is ' + self.name + '.')



dog = Dog('Adam', 'green', '13', '20')

dog.tell()