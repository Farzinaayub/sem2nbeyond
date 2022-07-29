class Hello:
    def __init__(self,name):
        self.name=name
    def say_hello(self):
        print()
        print("Hello, My name is ",self.name,".","I'm practicing python")
        print()
s=Hello('Farzeena')
s.say_hello()