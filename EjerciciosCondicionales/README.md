# Ejercicios Condicionales

Este seccion contiene una colección de **24 ejercicios de programación con estructuras condicionales**, abordando temas como clasificación de edades, calculadoras simples, determinación de estaciones, clasificación de triángulos, simulaciones de notas y descuentos, conversión de unidades, evaluación de signos zodiacales, juegos como piedra, papel o tijera, y más. Cada ejercicio está diseñado para fortalecer la lógica de programación mediante el uso de **if-else, match y estructuras condicionales anidadas**, aplicando conceptos prácticos en resolución de problemas reales.

### ***Ejercicio 1: Clasificacion de edades***
Escribe un programa que solicite la edad de una persona e indique si es un:
- Niño (0-12 años)
- Adolescente (13-17 años)
- Adulto (18-59 años)
- Adulto mayor (60+ años)

### ***Ejercicio 2: Calculadora simple***
Implementa una calculadora que reciba dos números y una operación **( + , - , * , / )** e imprima el
resultado.
### ***Ejercicio 3: Simulador de notas***
Crea un programa que reciba una calificación (0-100) y determine:
- A si la nota está entre 90-100.
- B si la nota está entre 80-89.
- C si la nota está entre 70-79.
- D si la nota está entre 60-69.
- F si la nota está por debajo de 60.

### ***Ejercicio 4: Clasificación de triángulos***
Escribe un programa que solicite las longitudes de los tres lados de un triángulo e indique si el
triángulo es:
- ***Equilátero (todos los lados iguales)***
- ***Isósceles (dos lados iguales)***
- ***Escaleno (todos los lados diferentes)***

**Ejemplo de entrada:**
````bash
Ingrese el lado 1: 5
Ingrese el lado 2: 5
Ingrese el lado 3: 8
````
Ejemplo de salida:
````bash
El triángulo es Isósceles.
````

### ***Ejercicio 5: Calculadora de descuentos***
Escribe un programa que reciba el precio de un producto y el tipo de cliente **(A, B o C)**. Aplica un
descuento según el tipo:

- A: 30%
- B: 20%
- C: 10% Muestra el precio final después del descuento.

**Ejemplo de entrada:**
````bash
Ingrese el precio del producto: 100
Ingrese el tipo de cliente (A/B/C): B
````
**Ejemplo de salida:**
````bash
El precio final con descuento es: 80.0
````
### ***Ejercicio 6: Calculadora de tarifas de estacionamiento***
Crea un programa que calcule la tarifa de un estacionamiento basado en el número de horas:
- 1 hora o menos: $5
- 2-3 horas: $10
- 4 o más horas: $15
### ***Ejercicio 7: Conversor de temperatura***
Escribe un programa que solicite una temperatura y la unidad de origen (Celsius o Fahrenheit).
Convierte la temperatura a la unidad opuesta y muestra el resultado.

**Fórmulas:**
- De Celsius a Fahrenheit: (C * 9/5) + 32
- De Fahrenheit a Celsius: (F - 32) * 5/9

### ***Ejercicio 8: Cálculo de números pares e impares***
Solicita al usuario un número entero y muestra si es par o impar utilizando ``if-else``.
### ***Ejercicio 9: Determinador de estación del año***
Crea un programa que reciba un número de mes (1-12) y determine a qué estación pertenece:
- Primavera: marzo (3) a mayo (5)
- Verano: junio (6) a agosto (8)
- Otoño: septiembre (9) a noviembre (11)
- Invierno: diciembre (12) a febrero (2)

### ***Ejercicio 10: Sistema de recomendaciones de comida***

Escribe un programa que recomiende una comida según el clima ( soleado , lluvioso , frío ) y la
hora del día ( mañana , tarde , noche ). Usa match para manejar el clima y if para la hora.

### ***Ejercicio 11: Conversor de unidades***
Escribe un programa que convierta entre las siguientes unidades:
- Kilómetros a millas
- Celsius a Fahrenheit
- Kilogramos a libras

Utiliza match para elegir la conversión y if para verificar valores negativos.
### ***Ejercicio 12: Clasificación de años***
Crea un programa que determine si un año es:
- Bisiesto (divisible entre 4 pero no entre 100, excepto si también es divisible entre 400).
- Común.
### ***Ejercicio 13: Conversor de monedas***
Crea un programa que convierta un monto en dólares a otra moneda. Usa las siguientes tasas de
cambio:

- Euros: 0.85
- Pesos Colombianos: 4100
- Yenes: 110

Utiliza match para manejar las conversiones.

### ***Ejercicio 14: Calculador de IMC***
Crea un programa que calcule el Índice de Masa Corporal (IMC) y clasifique el resultado según las
categorías:
- Menos de 18.5: Bajo peso
- 18.5 a 24.9: Peso normal
- 25 a 29.9: Sobrepeso
- 30 o más: Obesidad
### ***Ejercicio 15: Juego de piedra, papel o tijera***
Crea un programa que permita a dos jugadores ingresar sus elecciones ( piedra , papel o
tijera ) y determine quién gana o si hay empate.
### ***Ejercicio 16: Clasificación de números según ***divisibilidad
Crea un programa que solicite un número entero y determine:
- Si es divisible por 2 y por 3.
- Si es divisible solo por 2.
- Si es divisible solo por 3.
- Si no es divisible por ninguno de los dos.

### ***Ejercicio 17: Clasificación por niveles de velocidad***
Escribe un programa que solicite la velocidad de un vehículo (en km/h) y clasifique:
- 0-20 km/h : Muy lento
- 21-60 km/h : Moderado
- 61-120 km/h : Rápido
- Más de 120 km/h : Muy rápido
### ***Ejercicio 18: Determinación de rango etario***
Crea un programa que solicite la edad de una persona y determine:
- Si es un bebé (0-2 años).
- Si es un niño (3-12 años).
- Si es un adolescente (13-17 años).
- Si es un adulto (18-64 años).
- Si es un adulto mayor (65 años o más).
### ***Ejercicio 19: Simulador de alarma de peligro***
Crea un programa que solicite la cantidad de sensores activados y el nivel de alerta:
- ``1-2 sensores``: Alerta baja.
- ``3-5 sensores``: Alerta media.
- ``6 o más sensores``: Alerta alta.
### ***Ejercicio 20: Identificación del trimestre***
Crea un programa que reciba el número de un mes (1-12) y determine a qué trimestre del año
pertenece:
- ``1-3 :``   Primer trimestre.
- ``4-6 :``   Segundo trimestre.
- ``7-9 :``   Tercer trimestre.
- ``10-12 :`` Cuarto trimestre.

### ***Ejercicio 21: Clasificación de figuras geométricas***
Crea un programa que reciba el número de lados de una figura geométrica y clasifique:
- 3 lados : Triángulo.
- 4 lados : Cuadrado o rectángulo.
- 5 lados : Pentágono.
- 6 lados : Hexágono.
- Otros: Figura no soportada.
### ***Ejercicio 22: Evaluación de signos del zodiaco***
Crea un programa que reciba un mes (1-12) y un día (1-31) y determine el signo zodiacal de la
persona.

**Condiciones para los signos del zodiaco**
| Signo | fecha |
|-------|-------|
|Aries | 21 de marzo - 19 de abril|
|Tauro | 20 de abril - 20 de mayo|
|Géminis | 21 de mayo - 20 de junio|
|Cáncer | 21 de junio - 22 de julio|
|Leo |23 de julio - 22 de agosto|
| Virgo |23 de agosto - 22 de septiembre|
| Libra |23 de septiembre - 22 de octubre|
| Escorpio |23 de octubre - 21 de noviembre|
| Sagitario |22 de noviembre - 21 de diciembre|
| Capricornio |22 de diciembre - 19 de enero|
| Acuario |20 de enero - 18 de febrero|
| Piscis | 19 de febrero - 20 de marzo|
### ***Ejercicio 23: Conversor de edades caninas***
Escribe un programa que convierta la edad de un perro a años humanos:
- Los dos primeros años del perro equivalen a 10.5 años humanos cada uno.
- Cada año adicional equivale a 4 años humanos.

### ***Ejercicio 24: Clasificación por índice de contaminación***
Crea un programa que reciba el índice de calidad del aire (ICA) y determine la categoría
correspondiente:
- 0-50: Bueno
- 51-100: Moderado
- 101-150: No saludable para grupos sensibles
- 151-200: No saludable
- 201-300: Muy no saludable
- 301+: Peligroso