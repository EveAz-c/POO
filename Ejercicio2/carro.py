class Carro:

    def __init__(self, color: str = "Sin definir", año: int = 0, serie: str = "0000-0000"):

        self.__color = color
        self.__año = año
        self.__serie = serie

    def get_color(self) -> str:
        return self.__color
        
    def get_año(self) -> int:
        return self.__año
        
    def get_serie(self) -> str:
        return self.__serie

    def set_color(self, color: str):
        self.__color = color
        
    def set_año(self, año: int):
        self.__año = año
        
    def set_serie(self, serie: str):
        self.__serie = serie

