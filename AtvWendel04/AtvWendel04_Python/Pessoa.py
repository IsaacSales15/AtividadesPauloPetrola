from datetime import datetime

class Pessoa:
    def __init__(self, name, birth_date):
        self.name = name
        self.birth = datetime.strptime(birth_date, '%Y-%m-%d')
        self.calc_age()

    def calc_age(self):
        now = datetime.now()
        age = now.year - self.birth.year - ((now.month, now.day) < (self.birth.month, self.birth.day))
        self.age = age

    def get_age(self):
        return self.age

    def hello(self):
        times = ""
        hour = datetime.now().hour

        if 5 <= hour <= 11:
            times = "dia"
        elif 12 <= hour <= 18:
            times = "tarde"
        elif 19 <= hour <= 23:
            times = "noite"
        elif 0 <= hour <= 4:
            times = "madrugada"

        return f"Boa {times}, me chamo {self.name}, mas meu apelido é {self.surname}, tenho {self.get_age()} anos."
