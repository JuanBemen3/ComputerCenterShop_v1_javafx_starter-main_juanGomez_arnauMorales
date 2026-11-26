# ComputerCenterShop — práctica integradora RA2

> **Plantilla del equipo.** Copiad este archivo en vuestro repositorio de trabajo y completadlo a medida que avancéis. No incluye soluciones de código: las decisiones, pruebas y explicaciones deben ser vuestras.

## Ficha del equipo

- Integrantes: Juan Gomez y Arnau Morales
- Repositorio compartido: (https://github.com/JuanBemen3/ComputerCenterShop_v1_javafx_starter-main_juanGomez_arnauMorales.git)
- Rama de trabajo habitual: Cada uno tenemos una rama con nuestro nombre, un rama main donde ira el merge y la rama master
la cual sera la principal ya que ahi se subira despues de comprobar que no haya errores

- Fecha de inicio: 2026-11-17
- Última actualización: 2026-11-19

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

- [X] [RA2-ISSUE-01 · Preparar el proyecto JDBC](issues/RA2-ISSUE-01-preparar-projecte-jdbc.md)
- [X] [RA2-ISSUE-02 · Conector, URL y conexión](issues/RA2-ISSUE-02-revisar-connector-url-connexio.md)
- [X] [RA2-ISSUE-03 · Estructura relacional](issues/RA2-ISSUE-03-crear-estructura-relacional.md)

### M2 · Operaciones relacionales principales

- [X] [RA2-ISSUE-04 · Inserción de datos](issues/RA2-ISSUE-04-inserir-producte-preparedstatement.md)
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

Creacion del primer proyecto en javaFX, hemos clonado el repositorio started y creado un proyecto en base al repositorio clonado, se han hecho las ramas para cada integrante del equipo junto a una mas para probar los merge y la master que sera la principal para la ajecucion correcta del programa, se ha hecho la creacion del readme y subida al proyecto mediante un commit.

### RA2-ISSUE-01 · RA2-ISSUE-01 - Preparar projecte JDBC local #2

- Estado: comprobado
- Persona que la ha iniciado: Juan
- Problema inicial: No ha habido problema, solo de clono el repositorio y se ejecuto en local
- Decisión aplicada: Ninguna ya que no hubo problema
- Cambios realizados: Solo dentro del maven hicimos el update proyec y luego el clean javafx:_run
- Prueba realizada: No se han realizado cambios
- Evidencia: **[enlace a captura, registro, vídeo breve o apartado del repositorio]**
- *Commit* o *pull request*: 6a4fca15c44e8395ed2a0ed2981574d271d66d39
- Explicación individual: Clonamos el repositorio y creamos las ramas, verificamos la ejecuntion correcta hasta el inicio de la issue 2.
- Uso de IA, si lo ha habido: No se uso ia

### RA2-ISSUE-02 · [Implementar connector, URL i connexio]

- Estat: comprovat
- Persona que l'ha iniciat: Arnau
- Problema inicial: No teníem connexió JDBC amb H2
- Decisió aplicada: Hem implementat DriverManager amb connection "conn"
- Canvis fets: Hem afegit al fitxer ProductDaoImplJDBC.java a la línia 25 la connexió: conn = DriverManager.getConnection(DEFAULT_DB_URL, DEFAULT_USER, DEFAULT_PASSWORD); hem comentat el throw pending perquè mostri el missatge d'error
- Prova realitzada: Hem tancat completament el projecte, hem guardat els canvis i, en obrir el projecte de nou, hem premut el botó connectar per veure que no apareix el missatge d'error ISSUE 02
- Evidència: **[enllaç a captura, registre, vídeo breu o apartat del repositori]**
- *Commit* o *pull request*: 9448c67 (Commit ISSUE02 completat)
- Explicació individual: En l'Issue 02 ens assegurem d'implementar correctament el projecte amb el gestor de bases de dades
- Ús d'IA, si n'hi ha hagut: No ha calgut, la resposta era a la pròpia activitat

## Registro de trabajo

Duplicad este bloque para cada *issue* que completéis. Escribid con vuestras propias palabras y enlazad únicamente pruebas y *commits* de vuestro repositorio.

### RA2-ISSUE-03 · [Implementar estructura relacional]

- Estado: comprobado
- Persona que la ha iniciado: Arnau
- Problema inicial:  Faltava implementar la creació de les taules products i inventory_history a la base de dades H2.
- Decisión aplicada: Utilitzar Statement i sentències SQL CREATE TABLE IF NOT EXISTS per crear les taules sense eliminar-les si ja existeixen. També afegir els productes inicials amb INSERT INTO.
- Cambios realizados: S'ha modificat el fitxer src/dao/ProductDaoImplJDBC.java, concretament el mètode initSchema(). S'han afegit les sentències SQL per crear les dues taules i inserir tres productes inicials.
- Prueba realizada: Hem tancat completament el projecte, hem guardat els canvis i, en obrir el projecte de nou, hem premut el botó connectar per veure que no apareix el missatge d'error ISSUE 03
- Evidencia: **[enlace a captura, registro, vídeo breve o apartado del repositorio]**
- *Commit* o *pull request*:  (Commit ISSUE03 completat)
- Explicación individual: He creat les taules products i inventory_history amb SQL, utilitzant Statement per executar les consultes i INSERT INTO per afegir els productes inicials.
- Uso de IA, si lo ha habido: No ha calgut

### RA2-ISSUE-04 · [Inserir producte amb PreparedStatement]

- Estado: comprobado.
- Persona que la ha iniciado: Arnau
- Problema inicial: Faltava implementar la inserció de productes a la base de dades H2.
- Decisión aplicada: Utilitzar PreparedStatement per inserir les dades del producte mitjançant paràmetres.
- Cambios realizados: S'ha implementat el mètode insertProduct() del fitxer ProductDaoImplJDBC.java i s'ha utilitzat executeUpdate() per retornar el nombre de files afectades.
- Prueba realizada: Hem inserit un producte des de la interfície gràfica i l'aplicació ha mostrat el missatge "Producte inserit".
- Evidencia: **[captura](capturas_issues/issue4.png)**
- *Commit* o *pull request*: (Commit ISSUE04 completat)
- Explicación individual: He utilitzat PreparedStatement per inserir productes sense concatenar els valors a la sentència SQL i retornar el nombre de files afectades.
- Uso de IA, si lo ha habido: Hem utilitzat ChatGPT com a suport per implementar el mètode i preparar la comprovació amb H2 Shell.

### RA2-ISSUE-05 · [Actualitzar estoc amb PreparedStatement]

- Estado: comprobado.
- Persona que la ha iniciado: Arnau
- Problema inicial: Faltava implementar l'actualització de l'estoc i la disponibilitat dels productes.
- Decisión aplicada: Utilitzar PreparedStatement amb una sentència UPDATE per modificar l'estoc i la disponibilitat segons el nom del producte.
- Cambios realizados: S'ha implementat el mètode updateStock() del fitxer ProductDaoImplJDBC.java. Si l'estoc és superior a zero, la disponibilitat és true; en cas contrari, és false.
- Prueba realizada: Hem utilitzat la interfície gràfica per modificar l'estoc i H2 Shell per consultar les dades del producte abans i després de l'actualització.
- Evidencia: **[captura](capturas_issues/issue5.png)**
- *Commit* o *pull request*: (Commit ISSUE05 completat)
- Explicación individual: He utilitzat una sentència UPDATE amb paràmetres per actualitzar l'estoc i la disponibilitat. El mètode executeUpdate() retorna el nombre de files afectades.
- Uso de IA, si lo ha habido: No ha calgut.

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
