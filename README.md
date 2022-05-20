# Programador - CFP 36 

## Trayecto de formación continua :mortar_board:

### Enunciados de ejercicios :pencil2:

#### INICIO
1. Crear la clase Perro, la misma debe tener 3 atributos y el método ladrar() que muestre “Guau” por consola. Crear un objeto de esta clase y comprobar el funcionamiento

2. Crear la clase Auto con los atributos marca, modelo y kilometraje, elegir el tipo de dato adecuado para ellos. Además se debe crear el método estadoAuto() que depende el kilometraje muestre un mensaje:

0 km Esta nuevo
<10000km Poco usado
<100000km Usado
>100000km Bastante usado

Crear un objeto de esta clase y comprobar el funcionamiento

3. Crear la clase cuentaBancaria que tenga como atributo nombreTitular, tipoDeCuenta y saldo. Elegir el tipo de dato adecuado para cada uno de ellos. Además hacer el método extraer() que permita extraer dinero, si se puede. Crear un objeto de esta clase y comprobar el funcionamiento

4.Para la clase del ejercicio 1 crear un método constructor que solicite como parámetro uno de los atributos.	

5. Para la clase del ejercicio 2 crear el método constructor que solicite como parámetro los 3 atributos de la clase.

6. Crear una clase para calcular el área de un rectángulo.
Se necesita crear dos clases una para solicitar los datos y otra para realizar la operación.

7. Crear la clase Lavarropas con los atributos marca, modelo y kilos de lavado, elegir el tipo de dato adecuado para ellos. Además se debe crear el método TipodeRopa e imprimir el tipo seleccionado:
Tipos de Ropa:
1_Lana
2_Ropa Sucia
3_Economico
4_Ropa de Bebe

#### ENCAPSULAMIENTO

8. Tomar el ejercicio 7 y agregar clase programas los métodos : 
-Llenado
-Lavado
-Secado
Teniendo en cuenta el tipo de ropa seleccionada por el usuario, utilizar diferentes lavados.

9. Una nueva empresa de lavarropas solicita la clase  "Programas"  del ejercicio 8. Importar la clase y utilizar la clase sin cambiar ningún método.

10. Encapsular (poner todos sus atributos privados) la clase del ejercicio 1 y realizar los métodos getter y setter necesarios.

11. Encapsular la clase del ejercicio 3 y realizar los métodos getter y setter necesarios.

#### HERENCIA

12. Realizar una suma y resta  de dos valores ingresados por el usuario utilizando herencia. Crear dos paquetes uno con la clase mail y la otra con las operaciones. Crear una clase padre y dos hijas(resta, suma); luego con la clase principal mail llamar a esas clases.

13. Realizar un programa en  el cual exista una clase padre y 3 clases hijas. 
Vamos a simular que somos una compañía de soporte técnico en donde recibimos elementos electrónicos como celulares, tablet y joystick. El operador tiene que poder realizar la registración del elemento electrónico que ingreso , teniendo un ingreso de sus atributos por consola.
Atributos como :
Numero de cliente:
Elemento:(celular,tablet,jostick..)
Marca:
Modelo:
Batería: 3000ma  5hs,4000ma  9hs,7000ma  12hs
Defecto:

#### POLIMORFISMO

14. Crea una clase llamada Libro que guarde la información de cada uno de los libros de una biblioteca. La clase debe guardar el título del libro, autor, número de ejemplares del libro y número de ejemplares prestados. La clase contendrá los siguientes métodos:
Constructor por defecto.
Constructor con parámetros.
Métodos Setters/getters
Método préstamo que incremente el atributo correspondiente cada vez que se realice un préstamo del libro. No se podrán prestar libros de los que no queden ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en caso contrario.
Método devolución que decremente el atributo correspondiente cuando se produzca la devolución de un libro. No se podrán devolver libros que no se hayan prestado. Devuelve true si se ha podido realizar la operación y false en caso contrario.
Método toString para mostrar los datos de los libros. Este método se heredada de Object y lo debemos modificar (override) para adaptarlo a la clase Libro.
Escribe un programa para probar el funcionamiento de la clase Libro

15. Crear un programa que realice dos operaciones (Suma y Resta). Tomando la estructura de el ejercicio 11 de herencia pero aplicando metodos de ppolimorfismo para llamar al metodo operaciones segun de que clase hija sea llamado

16. Tomar el ejercicio 15 y agregar dos operaciones mas utilizando polimorfismo con lógica en el ingreso de los valores, para que no den negativos. Ver el tipo de dato de los atributos que en el ejercicio están como enteros

#### SWING

17. Crear un programa que genere un formulario utilizando la librería swing. Poner un titulo a el formulario y no permitir la modificación de tamaño.

18. Generar un progrma que genere un form con un label con un mensaje centrado en el form.

19. Crear un programa que contenga tres botones y un  label indiquen que botones se presionaron. Utilizar la librería swing

20. Desarrollar un formulario con el titulo "Saludos", utilizando la librería Swing.
Dentro del formulario debe estar incorporado un TextField, en donde se debe incorporar el nombre.
Acción sobre el texto es con lo incorporado en el textfiled sacar ventana emergente con saludo al usuario

21. Crear un formulario con 2 caja de texto cada una con sus etiquetas (valor 1 y valor2) un botón con la acción de sumar y una etiqueta de resultado

22. Tomar el ejercicio 21 y agregar la operación resta

23. Se necesita crear un formulario que contenga un combobox y una etiqueta con un listado de colores. Cuando se seleccionen se cambie el titulo y la etiqueta tenga el nombre de lo seleccionado.

24. Tomar el ejercicio 23 y por cada color que seleccione modifique el fondo de el formulario

#### INTERFACES GRÁFICAS JFRAME

25. CALCULADORA FTP36Tomar el ejercicio realizado en clase y agregar las operaciones , multiplicación, división , porcentaje.
Se adjunta modelo de la calculadora.

26. Crear un proyecto con JFRAME que calcule las tipo de monedas (Dolar,Euro y Real). 
La selección de la moneda debe permitir seleccionarla a través de un combobox. El numero a convertir debe poder ingrearse dede un textfileld.
Además debe contar con el nombre y logotipo del banco

Nota: Este ejercicio toma el valor (pesos argentinos) y nos dice cuanto seria en dolares

27. Tomar el ejercicio N° 26 y agregarle 4 etiquetas :

Dos con la descripción :
- Impuestos pais 
- Retención de afip

y los otros dos con los cálculos:
- Impuestos pais  (Al valor de la cotización de la moneda sumar 30% y mostrar)
- Retención de afip   (Al valor de impuesto pais sumar 35% y mostrar)

28. Se debe tener 3 jframe y crear en cada uno de ellos dos botones y un label. El label debe indicar el nombre del jframe que estamos y los botones llevarlo al jframe que indique por ejemplo : en el form1  tendremos el boton del form3 y el del form2

29. Crear un formlario de login en donde contenga:
-Comobox
-1 label donde se muestre la imagen del usuario que va acceder
-Dos botones uno de ingreso y el otro de salir
-Una caja de texto en donde se introduzca la contraseña.
-Check Box "Cambio de Contraseña"

Funcionalidad:
_Al presionar ingreso 
debe validar el usuario seleccionado y la contraseña guardada con la escrita en la caja de texto. Si es correcto abrir otro formulario con una imagen de un ok. Si es incorrecta mostrar otro formulario indicando que lo vuelva a intentar.
_Si esta presionado el checkbox entonces y se presiono el ingresar abra un jform con una leyenda para que se ingrese el mail y un botón  que diga enviar pero en la funcionalidad solo salga.

_Al presionar salir debe salir
Se debe verificar la contraseña según el usuario para acceder. Debe llamar a otro formulario y hacerlo visible

#### Resultados :wrench:

Para verificar los resultados puede ejercutar el programa y verificar el funcionamiento del mismo.

Algunos ejercicios fueron unificados para optimizar los resultados

## Autor :black_nib:

**Federico Mamoris** 

### A su consideración :gift:

* Comenta a otros sobre este proyecto :mega:
* Invita una cerveza :beer: o un café :coffee: a alguien del equipo. 
* Muchas gracias por tomarse el tiempo de ver el repositorio :grin:.


---
:hammer_and_wrench: con :hearts: por [fgmamoris](https://github.com/fgmamoris) :blush:
