class Scooter:
    def __init__(self, id: str = "S-001", nivelBateria: int = 100, estadoDisponible: bool = True):
        self.__id = id
        self.__nivelBateria = nivelBateria
        self.__estadoDisponible = estadoDisponible

    def get_id(self) -> str:
        return self.__id

    def get_nivelBateria(self) -> int:
        return self.__nivelBateria

    def get_estadoDisponible(self) -> bool:
        return self.__estadoDisponible

    def set_id(self, id: str) -> None:
        self.__id = id

    def set_nivelBateria(self, nivelBateria: int) -> None:
        self.__nivelBateria = nivelBateria

    def set_estadoDisponible(self, estadoDisponible: bool) -> None:
        self.__estadoDisponible = estadoDisponible

    def iniciarViaje(self):
        if self.__estadoDisponible and self.__nivelBateria >= 70:
            self.__estadoDisponible = False
            print(f"Scooter {self.__id} ha iniciado un viaje.")
        else:
            print(f"Scooter {self.__id} no puede iniciar un viaje.")

    def finalizarViaje(self):
        self.__estadoDisponible = True
        print(f"Scooter {self.__id} ha finalizado el viaje.")

    def llenarBateria(self, cantidad: int):
        if cantidad <= 99:
            self.__nivelBateria += cantidad
            print(f"Scooter {self.__id} ha sido cargado con {cantidad}%. Nivel de batería actual: {self.__nivelBateria}%.")
        else:
            print(f"La bateria ha sido cargada al 100%")