# jua-esteban-cortes-rojas-parcial-2-ads

1) Es un programa dividido en dos partes, la primer parte es un traductor de numeros, que al escribirlos en palabras (uno,dos,tres,...) los pasa a numeros enteros (1,2,3,...) estos se pueden escribir seguidos y deben contener un espacio entre cada palabra, en caso de que el usuario ingrese un entero en lugar de un String, el codigo no se va a dañar y va a almacenar ese numero como un string al momento de traducirlo volvera a ser el numero anterior puesto que este no pudo ser traducido y el valor guardado no cambiara, ademas e mostrarnos como se guarda en una matriz tambien nos lo muestra de forma separada y organizada en vertical, tambien al separar los numeros nos sirve de calculadora para realizar diferentes operaciones tanto basicas(sumar, restar, multiplicar, dividir) se pueden realizar operaciones mas complejas como lo son potencias o raices.
2) Bridge
a) al querer separar las operaciones de los calculos, bridge brinda una buena solucion para esto, ya que si queremos podemos añadir mas clases por ejemplo de operaciones, y esto a su vez conectarlo con los calculos, en el caso de este codigo tenemos operaciones basicas, y adicional a esto se crea otra sub clase llamada operaciones avanzadas, si el usuario quisiera añadir una sub clase a calculos por ejemplo, pendiente, puede conectar esta sub clase a operaciones basicas para poder crear el objeto pendiente a partir de operaciones basicas, y si se necesita algo mas complejo por ejemplo pitagoras, este necesitaria usar la sub clase operaciones avanzadas.
b) parcial.java : lineas 1-46, 96-97, 106-107
calcular.java : todo el codigo
calculo.java : todo el codigo
operaciones.java : todo el codigo
operacionesBasicas.java : todo el codigo
operacionesAvanzadas.java : todo el codigo

3)interpreter
a) ya que se queria hacer una traduccion de palabras a numeros enteros, interpreter es la mejor solucion para esto, puesto que este patron se enfoca especificamente a interpretar lo que el usuario quiera, y traducirlo al lenguaje del programa para hacer uso de este, en nuestro caso se uso en las palabras simples como lo son numeros del 0 al 9 y adicional a esto en palabras simples como son mas o menos.
b) parcial.java : lineas 48-95, 100-103
context.java : todo el codigo
IExpression.java : todo el codigo
