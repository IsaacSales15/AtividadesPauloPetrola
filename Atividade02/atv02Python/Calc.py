from datetime import datetime

class Calculo:
    # Questão 1
    def Soma(self, n1, n2):
        self.n1 = n1
        self.n2 = n2
        
        print(f"O resultado da soma é: {(n1 + n2)}")

    # Questão 2     
    def Operacao(self, op, n1, n2):
        self.op = op
        self.n1 = n1
        self.n2 = n2
        
        if op == "+":
            return n1 + n2
        elif op == "-":
            return n1 - n2
        elif op == "*":
            return n1 * n2
        elif op == "/":
            return n1 / n2
        else:
            return "Operação inválida"

#Questão 3 
    def Hora(self):
        horaAtual = datetime.now().hour
        
        if horaAtual >= 5 and horaAtual < 12:
            return "Bom dia!"
        elif horaAtual >= 12 and horaAtual < 18:
            return "Boa tarde!"
        elif horaAtual >= 19 and horaAtual < 24:
            return "Boa noite!"
        else:
            return "Vai dormir, seu fela!"
