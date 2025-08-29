## Preguntas Preliminares Laboratorio 3
### Integrantes
 Julian Arenas
 Tomas Ramirez


**A. Distinción clave** entre pruebas unitarias y pruebas de integración de extremo a extremo:
- Prueba unitaria: se centra en comprobar el funcionamiento de elementos o funciones individuales de manera aislada. 
  -   Por ejemplo: verificar que una función que suma dos números entregue el resultado adecuado.

- **Prueba de integración E2E** (de extremo a extremo): asegura que todo el proceso del sistema opere de manera efectiva, 
  desde el comienzo hasta el final, incluyendo la interacción con bases de datos, APIs, interfaces de usuario, etc. 
  - Por ejemplo: en Netflix, reproducir un video desde que el usuario inicia la reproducción hasta que se detiene, sin fallos.

**B. Objetivo de la Retrospectiva de Sprint en Scrum:**
- Es un encuentro en el que el grupo examina lo que funcionó bien, lo que no fue efectivo y las áreas de mejora.
 Es fundamental para la mejora continua puesto que facilita la adaptación de los procesos, incrementa la productividad 
 y disminuye los errores de un sprint a otro. Sin esta práctica, los problemas tienden a repetirse.

**C. Distinción entre Épica, Funcionalidad y Historia de Usuario (ejemplo en Netflix):**
- **Épica:** un gran objetivo o funcionalidad que se divide en características más pequeñas.
Ejemplo: “Optimizar la experiencia de visualización de videos”.

- **Funcionalidad:** una característica específica dentro de una épica.
Ejemplo: “Desarrollar un sistema de recomendaciones personalizadas”.

- **Historia de Usuario:** una tarea concreta y puntual desde la visión del usuario.
Ejemplo: “Como usuario, deseo que Netflix me sugiera películas en función de mi historial de reproducciones para descubrir nuevo contenido”.

**D. Cobertura de Código:**
- Evalúa qué proporción del código ha sido ejecutada a través de pruebas.
Alcanzar un 100% de cobertura no asegura que no existan errores, ya que se puede ejecutar el código completo sin probar todos los casos límite o combinaciones posibles.