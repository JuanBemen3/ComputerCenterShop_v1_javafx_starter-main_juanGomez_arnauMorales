
# ComputerCenterShop — práctica integradora RA2

> **Plantilla del equipo.** Copiad este archivo en vuestro repositorio de trabajo y completadlo a medida que avancéis. No incluye soluciones de código: las decisiones, pruebas y explicaciones deben ser vuestras.

## Ficha del equipo

- Integrantes: Juan Gomez y Arnau Morales
- Repositorio compartido: (https://github.com/JuanBemen3/ComputerCenterShop_v1_javafx_starter-main_juanGomez_arnauMorales.git)
- Rama de trabajo habitual: Cada uno tenemos una rama con nuestro nombre, un rama main donde ira el merge y la rama master
la cual sera la principal ya que ahi se subira despues de comprobar que no haya errores
- Fecha de inicio: 2026-11-17
- Última actualización: **[AAAA-MM-DD]**

## Propósito del proyecto

En esta práctica desarrollamos una aplicación Java que accede a una base de datos relacional con JDBC. Trabajamos sobre el proyecto *starter* indicado por el profesorado y utilizamos el backlog RA2 para organizar las tareas, los commits, las pruebas y las decisiones técnicas.

El repositorio debe mostrar el proceso de trabajo real del equipo. No se trata únicamente de conseguir una aplicación que se ejecute: también hay que poder explicar qué se ha cambiado, cómo se ha comprobado y por qué la decisión corresponde a cada *issue*.

## Punto de partida

- Repositorio *starter* utilizado:https://github.com/Bemen3-LLHB/ComputerCenterShop_v1_javafx_starter
- Gestor de base de datos relacional utilizado: H2
- Conector utilizado: JDBC
- Entorno de desarrollo: Eclipse
- Comando o acción que utilizamos para comprobar la ejecución: mvn javafx:run

> No incorporéis ORM, Hibernate, ObjectDB, MongoDB, servicios externos ni persistencia principal en archivos. Estos elementos no forman parte de RA2.

## Cómo trabajamos cada *issue*

1. Leemos el objetivo y los criterios de aceptación de la *issue*.
2. Acordamos qué debe cambiar y quién inicia el trabajo.
3. Hacemos cambios pequeños y comprensibles, con *commits* que expliquen la decisión.
4. Probamos el comportamiento esperado y guardamos una evidencia.
5. Actualizamos este README con el resultado, la prueba y el enlace al *commit* o a la *pull request*.
6. Cerramos la *issue* únicamente cuando el equipo puede explicar individualmente la solución aplicada.

## Progreso del backlog

Marcamos una tarea cuando la prueba y el rastro en el repositorio estén recogidos. Los enlaces apuntan al enunciado, no a una solución.

### M1 · Base JDBC operativa

- [ ] [RA2-ISSUE-01 · Preparar el proyecto JDBC](issues/RA2-ISSUE-01-preparar-projecte-jdbc.md)
- [ ] [RA2-ISSUE-02 · Conector, URL y conexión](issues/RA2-ISSUE-02-revisar-connector-url-connexio.md)
- [ ] [RA2-ISSUE-03 · Estructura relacional](issues/RA2-ISSUE-03-crear-estructura-relacional.md)

### M2 · Operaciones relacionales principales

- [ ] [RA2-ISSUE-04 · Inserción de datos](issues/RA2-ISSUE-04-inserir-producte-preparedstatement.md)
- [ ] [RA2-ISSUE-05 · Actualización de stock](issues/RA2-ISSUE-05-actualitzar-estoc.md)
- [ ] [RA2-ISSUE-06 · Eliminación controlada](issues/RA2-ISSUE-06-eliminar-producte-controlat.md)
- [ ] [RA2-ISSUE-07 · Consultas y resultados](issues/RA2-ISSUE-07-consultar-inventari-resultset.md)

### M3 · Robustez JDBC

- [ ] [RA2-ISSUE-08 · Cierre de recursos](issues/RA2-ISSUE-08-tancar-recursos.md)
- [ ] [RA2-ISSUE-09 · Transacciones](issues/RA2-ISSUE-09-transaccio-commit-rollback.md)
- [ ] [RA2-ISSUE-10 · Procedimiento con parámetros](issues/RA2-ISSUE-10-procediment-parametres.md)
- [ ] [RA2-ISSUE-11 · Errores de conexión y operaciones](issues/RA2-ISSUE-11-errors-connexio-recursos.md)

### M4 · Documentación y cierre

- [ ] [RA2-ISSUE-12 · Documentar la ejecución y la configuración](issues/RA2-ISSUE-12-documentar-execucio-configuracio.md)
- [ ] [RA2-ISSUE-13 · Preparar la entrega de la práctica](issues/RA2-ISSUE-13-lliurament-practica-integradora.md)

## Registro de trabajo

Duplicad este bloque para cada *issue* que completéis. Escribid con vuestras propias palabras y enlazad únicamente pruebas y *commits* de vuestro repositorio.

### RA2-ISSUE-XX · [título de la *issue*]

- Estado: **pendiente | en curso | comprobado**
- Persona que la ha iniciado: **[nombre]**
- Problema inicial: **[qué no funcionaba o qué faltaba]**
- Decisión aplicada: **[qué habéis decidido hacer y por qué]**
- Cambios realizados: **[archivos o partes del proyecto modificadas]**
- Prueba realizada: **[caso que habéis probado y resultado observado]**
- Evidencia: **[enlace a captura, registro, vídeo breve o apartado del repositorio]**
- *Commit* o *pull request*: **[enlace o identificador]**
- Explicación individual: **[qué puede explicar cada integrante sobre esta tarea]**
- Uso de IA, si lo ha habido: **[consulta realizada, ayuda recibida y comprobación propia]**

## Pruebas que debemos poder repetir

| Caso que comprobamos | Datos o condiciones iniciales | Resultado observado | Evidencia |
| --- | --- | --- | --- |
| Arranque del proyecto | **[completad]** | **[completad]** | **[enlace]** |
| Operación de modificación | **[completad]** | **[completad]** | **[enlace]** |
| Consulta de datos | **[completad]** | **[completad]** | **[enlace]** |
| Caso de error controlado | **[completad]** | **[completad]** | **[enlace]** |
| Operación agrupada o transacción | **[completad]** | **[completad]** | **[enlace]** |

## Decisiones y dudas del equipo

| Fecha | *Issue* | Decisión o duda | Cómo se ha resuelto | Referencia |
| --- | --- | --- | --- | --- |
| **[AAAA-MM-DD]** | **[RA2-ISSUE-XX]** | **[completad]** | **[completad]** | **[enlace]** |

## Uso responsable de IA

El nivel previsto es **IA-1**: podéis utilizar herramientas de IA como apoyo para entender conceptos, formular hipótesis o revisar una explicación. No sustituyen las pruebas del proyecto ni la explicación individual.

Si habéis hecho uso de ellas, anotad en la *issue* correspondiente qué habéis preguntado, qué habéis contrastado con el proyecto y qué decisión final habéis tomado. No peguéis una respuesta de IA como si fuera una prueba de funcionamiento.

## Antes de dar la práctica por preparada

- [ ] Las *issues* P0 tienen un resultado comprobado o una incidencia explicada.
- [ ] El repositorio contiene *commits* que permiten seguir el trabajo del equipo.
- [ ] Las pruebas de funcionamiento tienen evidencias enlazadas.
- [ ] Las decisiones sobre el conector, las consultas, los recursos, las transacciones y los procedimientos están explicadas con palabras propias.
- [ ] Ambos integrantes pueden defender individualmente las decisiones técnicas del repositorio.
- [ ] El README no incluye soluciones copiadas ni contenido fuera del alcance de RA2.

---

*Esta plantilla es un apoyo para documentar el trabajo. Lo que acredita el proceso es el repositorio del equipo, con sus cambios, pruebas, decisiones y explicaciones.*
