# Bitacora de prompts
 
Laboratorio 06: Fundamentos de Ingenieria de Prompts.
 
Herramienta de IA usada: (escribe aqui cual usaste)
 
## Ejercicio 2: Tokens y ventana de contexto
 | Texto | Caracteres | Tokens |
|-------|------------|--------|
| Los estudiantes programan en Java. | 34 | 7 |
| The students program in Java. | 29 | 6 |
| desafortunadamente | 18 | 4 |


En el paso 4 se dio un contexto a la IA y una pregunta al respecto. En el paso 5 solo se hizo la pregunta, para comparar ambas respuestas con y sin contexto.


## Ejercicio 3: Temperatura
| Temperatura | % de BiblioTec | Nombres en los 5 intentos |
|-------------|----------------|---------------------------|
| 0 |100.0% |BiblioTec, BiblioTec, BiblioTec, BiblioTec, BiblioTec |
| 0.5 |65.3% |PrestaLibro, LibroYa, LibroYa, BiblioTec, BiblioTec |
| 1 |44.5% |BiblioTec, BiblioTec, BiblioTec, LibroYa, LibroYa |
| 1.8 |32.2% |LibroYa, NubeDeTinta, PrestaLibro, PrestaLibro, LectoGo |


Los nombres son cada vez mas creativos conforme va aumentando la temperatura.


## Ejercicio 4: Prompt vago vs estructurado


| Criterio | Prompt vago | Prompt estructurado |
|----------|-------------|---------------------|
| Menciona el objetivo del sistema |Si |Si |
| Menciona a los usuarios principales |No |Si |
| Tiene exactamente 3 funcionalidades |No |Si |
| Esta en 3 parrafos |No |Si |
| Lo usaria en un informe real |No |Si |


## Ejercicio 5: Anatomia de un prompt


| Componente | Texto de mi prompt |
|------------|--------------------|
| Rol | Actua como desarrollador de Java |
| Instruccion |Crea un programa en Java|
| Contexto |Para gestionar los productos de una tienda |
| Ejemplo |Usando una clase Producto con los atributos codigo, nombre, precio y stock |
| Formato |Usa este estilo para los metodos: getPrecio(), setPrecio(double precio)|


Nivel 1: Crea un programa simple para sumar dos números.


Nivel 2: Pide especificar un tipo de programa.


Nivel 3: Crea un programa con más funciones.


Nivel 4: Muestra la organización del programa y aplica encapsulamiento.


Nivel 5: Muestra la estructura de la clase y nos da el código con comentarios de guía.


## Ejercicio 6: Del prompt basico al profesional


| Qué revisar | Cumple Si/No|
|------------|--------------|
| ¿Está escrito en java y usa swing?|Si|
|¿Pide correo y contraseña?|Si|
|¿Explica el funcionamiento antes o despues del código?|No|
|¿El código esta organizado en clases?|Si|
|¿Valida los datos que ingresa el usuario?|Si|


```text
Actua como desarrollador Java. Crea un ejemplo de login para una
aplicacion de escritorio utilizando Swing. El usuario debe ingresar
correo y contrasena. Explica brevemente el funcionamiento y presenta
el codigo organizado por clases. Mejora el codigo anterior con estas restricciones: no uses librerias
externas, valida que el correo contenga @ y que la contrasena tenga
al menos 8 caracteres, y muestra los mensajes con JOptionPane.
```


- [Bitacora de prompts](prompts/BITACORA.md)
