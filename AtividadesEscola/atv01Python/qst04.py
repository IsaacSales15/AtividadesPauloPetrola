while(True):
    hora = int(input("Digite a hora atual: "))

    if hora >= 5 and hora <= 11:
        print("Bom dia!")
    elif hora >= 12 and hora <= 18:
        print("Boa tarde!")
    elif hora >= 19 and hora <= 23:
        print("Boa noite!")
    elif hora <= 4 or hora >= 24:  
        print("Vai dormir, seu fela!") 