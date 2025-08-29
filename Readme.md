# LABORATORIO 3: TDD – Pruebas de Software – Agilismo y Scrum – Análisis de Requerimientos
**Integrantes**
- Julian Eduardo Arenas Alfonso
- Ramirez Alvarez Tomas Felipe

- **Grupo 2 DOSW**

**Nombre de la rama**
feature/laboratorio3_ramirez_arenas_2025-2

**Evidencias de que compilo**
compila con mvn clean compile

![img_1.png](img_1.png)

Compila con mvn test

![img_2.png](img_2.png)
![img_3.png](img_3.png)
![img_4.png](img_4.png)

 
estudiante 2
----mvn clean compile
![img_5.png](img_5.png)
![img_6.png](img_6.png)
---- mvn test
![img_7.png](img_7.png)
![img_8.png](img_8.png)

# Reto 1

Identifiquen reglas de negocio:
- Los números de cuenta deben tener exactamente 10 dígitos.
- Los dos primeros números corresponden a un banco registrado.
- No debe tener letras ni caracteres especiales las cuentas.
- El sistema debe permitir crear y validar las cuentas de los clientes.
- El sistema debe permitir consultar el saldo de una cuenta.
- El sistema debe permitir realizar depósitos a cuentas válidas.

Definan las funcionalidades principales:
- Crear cuenta bancaria válida.
- Validar número de cuenta según reglas del negocio.
- Consultar saldo de una cuenta bancaria.
- Realizar depósito en una cuenta.
-Verificar que las cuentas esten en los bancos registrados.

Escriban los actores principales:
- **Cliente:** Persona que crea y gestiona cuentas bancarias.
- **Sistema:** Componente automático que gestiona las operaciones.
- **Administrador:** Verifica que los bancos esten registrados en el sistema.

Documenten las precondiciones necesarias para el sistema:
- Deben existir bancos válidos registrados en el sistema como por ejemplo 01 que es siendo Bancolombia y 02 que es davivienda y demas.
- El sistema debe tener persistencia  en memoria y base de datos para almacenar cuentas.
- Las cuentas deben crearse sólo si cumplen con las reglas de negocio.
- Debe existir un mecanismo para verificar que una cuenta es válida antes de realizar operaciones como consulta o depósito.