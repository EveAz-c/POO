carro_1 = Carro()

# Carro 2: Usamos el constructor con parámetros
carro_2 = Carro("Negro", 2026, "XV-777")

# Imprimimos para comprobar que los getters funcionan
print("CARRO 1 (Constructor vacío):")
print(f"Color: {carro_1.get_color()} | Año: {carro_1.get_año()} | Serie: {carro_1.get_serie()}\n")

print("CARRO 2 (Constructor con parámetros):")
print(f"Color: {carro_2.get_color()} | Año: {carro_2.get_año()} | Serie: {carro_2.get_serie()}")