scooter_1 = Scooter()
scooter_2 = Scooter("S-002", 50, True)

usuario_1 = Usuario()
usuario_2 = Usuario("Juan", 50)

print ("USUARIO 1 (Constructor vacío):")
print (f"Nombre: {usuario_1.get_nombre()}, Saldo: {usuario_1.get_saldo()}")

print("USUARIO 2 (Constructor con parámetros):")
print (f"Nombre: {usuario_2.get_nombre()}, Saldo: {usuario_2.get_saldo()}")

print ("SCOOTER 1 (Constructor vacío):")
print (f"ID: {scooter_1.get_id()}, Nivel de Batería: {scooter_1.get_nivelBateria()}, Disponible: {scooter_1.get_estadoDisponible()}")

print ("SCOOTER 2 (Constructor con parámetros):")
print (f"ID: {scooter_2.get_id()}, Nivel de Batería: {scooter_2.get_nivelBateria()}, Disponible: {scooter_2.get_estadoDisponible()}")