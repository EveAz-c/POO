
class Usuario:
    def __init__(self, nombre: str = "Sin definir", saldo: float = 0):
        self.__nombre = nombre
        self.__saldo = saldo
        
    def get_nombre(self):
        return self.__nombre

    def get_saldo(self):
        return self.__saldo 
    def set_nombre(self, nombre: str):

        self.__nombre = nombre

    def set_saldo(self, saldo: float):
        self.__saldo = saldo

    def agregarSaldo(self, monto: float):
        self.__saldo += monto

    def rentarScooter(self, scooter):
        if scooter.get_estadoDisponible() and self.__saldo >= 10 and scooter.get_nivelBateria() >= 70:
            self.__saldo -= 10
            scooter.set_estadoDisponible(False)
            print(f"{self.__nombre} ha rentado el scooter {scooter.get_id()}.")
        else:
            print(f"{self.__nombre} no puede rentar el scooter {scooter.get_id()}.")