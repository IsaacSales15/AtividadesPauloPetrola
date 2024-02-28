from Calc import Calculo

n1 = int(input("Coloque o primeiro número: "))
n2 = int(input("Coloque o segundo número: "))
op = input("Coloque a operação: ")

cal = Calculo()
cal.Soma(n1,n2)
cal.Operacao(op, n1, n2)
hora = cal.Hora()
print(hora)