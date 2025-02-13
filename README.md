# Ejercicios Java

## Descripción
Este repositorio contiene una colección de ejercicios de Java realizados durante el taller de Java.

Realizados por ***Ayelmer Corzo***.

## Estructura del Repositorio

### Nivel 0
- **Ejercicio 1: ¡Hola, Java!**: Escribe un programa que imprima en consola "¡Hola, Java!".
- **Ejercicio 2: Declaración de Variables**: Declara una variable de cada tipo primitivo (int, double, char, boolean) e imprime sus valores.
- **Ejercicio 3: Entrada de Datos con Scanner**: Pide al usuario que ingrese su nombre y edad, luego muestra un mensaje con la información capturada.

### Nivel 1 - Estructuras de control
- **Ejercicio 4: Condiciones IF/ELSE**: Pide al usuario un número y determina si es par o impar.
- **Ejercicio 5: Estructuras Repetitivas (For)**: Muestra los números del 1 al 10 usando un for.
- **Ejercicio 6: Tablas de Multiplicar con While**: Pide un número al usuario y muestra su tabla de multiplicar del 1 al 10 usando while.
- **Ejercicio 7: Adivina el Número (Random)**: Genera un número aleatorio entre 1 y 100 y permite al usuario adivinarlo.

### 🏆 Ejercicio: Subcadena
- **Ejercicio 8:**
    #### 📌 Enunciado
    Dada una cadena, `s`, y dos índices, `start` y `end`, imprime una subcadena que contenga todos los caracteres en el rango inclusivo de `start` a `end - 1`. Encontrarás útil el método `substring` de la clase `String` para completar este desafío.
    #### Formato de Entrada
    - La primera línea contiene una única cadena `s`.
    - La segunda línea contiene dos enteros separados por un espacio, que representan los valores respectivos de `start` y `end`.
    #### Restricciones
    - 1 ≤ |s| ≤ 100 (La longitud de `s` está entre 1 y 100).
    - 0 ≤ start < end ≤ n (Los índices están dentro del rango de la cadena).
    - La cadena `s` solo contiene letras del alfabeto inglés (es decir, [a-zA-Z]).

### 🏆 Ejercicio: Generar la Tabla de Amortización de un Préstamo Bancario
#### 📌 Enunciado
Escribe un programa en Java que solicite al usuario los siguientes datos para un préstamo bancario:
- Monto del préstamo (en pesos).
- Tasa de interés anual (en porcentaje).
- Plazo del préstamo (en años).

El programa debe calcular y mostrar una tabla de amortización, indicando para cada mes:
1. Número de cuota.
2. Saldo inicial.
3. Cuota fija mensual.
4. Interés pagado.
5. Capital pagado.
6. Saldo pendiente.

El cálculo se basa en la siguiente fórmula de cuota fija (método francés):

<p align="center">
        <img src="https://latex.codecogs.com/png.latex?{\color{Yellow}C%20-%20%5Cfrac%7BP%20%5Ctimes%20R%7D%7B1%20-%20(1%20%2B%20r)%5E%7B-n%7D%7D" alt="Ecuación" style="background-color:white;">
</p>

Donde:
- **C** = Cuota fija mensual.
- **P** = Monto del préstamo.
- **r** = Tasa de interés mensual (tasa anual / 12 * 100).
- **n** = Número total de pagos (años * 12).

### 🏆 Ejercicio: Cálculo de Intereses Compuestos sobre una Inversión
#### 📌 Enunciado
Escribe un programa en Java que permita calcular el crecimiento de una inversión con interés compuesto durante un periodo determinado.

El usuario debe ingresar:
- Monto inicial de inversión (en pesos).
- Tasa de interés anual (en porcentaje).
- Número de años de inversión.
- Frecuencia de capitalización (mensual, trimestral, semestral o anual).

El programa debe calcular y mostrar el crecimiento de la inversión año tras año, indicando:
1. **Año.**
2. **Capital inicial.**
3. **Interés ganado en el año.**
4. **Nuevo saldo después del interés.**

#### 📚 Fórmula del Interés Compuesto

<p align="center">
        <img src="https://latex.codecogs.com/png.latex?{\color{Yellow}A%20%3D%20P%20%5Ctimes%20%5Cleft(1%20%2B%20%5Cfrac%7Br%7D%7Bn%7D%5Cright)%5E%7Bn%20%5Ctimes%20t%7D" style="background-color:white;">
</p>

Donde:
- **A** = Monto final de la inversión.
- **P** = Capital inicial.
- **r** = Tasa de interés anual expresada en decimal (tasa anual / 100).
- **n** = Número de veces que se capitaliza por año.
- **t** = Número de años.

### 🏆 Ejercicio: Simulación de Depósitos en una Cuenta Bancaria con Intereses
#### 📌 Enunciado
Escribe un programa en Java que permita simular la evolución del saldo en una cuenta de ahorros con depósitos periódicos y acumulación de intereses.

El usuario debe ingresar:
- Saldo inicial de la cuenta (en pesos).
- Cantidad fija de depósito mensual.
- Tasa de interés anual (en porcentaje).
- Número de meses de simulación.

El programa debe calcular y mostrar la evolución del saldo mes a mes, considerando que:
- Cada mes se suma el depósito al saldo de la cuenta.
- Luego, el saldo total genera interés mensual, según la fórmula:
<p align="center">
        <img src="https://latex.codecogs.com/png.latex?{\color{Yellow}Interes\%20Mensual\%20=%20\frac{TasaAnual}{12}%20\times%20Saldo\%20Actual" style="background-color:white;">
</p>

El programa imprimirá una tabla con:
1. Número de mes.
2. Saldo inicial.
3. Depósito realizado.
4. Interés generado.
5. Nuevo saldo.

## Requisitos
- Java Development Kit (JDK) 8 o superior.
- Un IDE de Java como IntelliJ IDEA, Eclipse, o NetBeans.

## Cómo Ejecutar los Ejercicios
1. Clona este repositorio en tu máquina local.

```bash
git clone https://github.com/AyelmerCorzoB/EjerciciosJava.git
```
2. Abre el proyecto en tu IDE de preferencia.
3. Navega al ejercicio que deseas ejecutar.
4. Compila y ejecuta el archivo `.java` correspondiente.

## Contribuciones
Las contribuciones son bienvenidas. Por favor, sigue los siguientes pasos:
1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-caracteristica`).
3. Realiza tus cambios y haz commit (`git commit -am 'Añadir nueva característica'`).
4. Sube tus cambios (`git push origin feature/nueva-caracteristica`).
5. Abre un Pull Request.


