# Validacio RA2 JavaFX starter

## Estat

Variant starter creada el 2026-08-17 sense modificar sidecar.

Ruta:

```text
MP0486_AccesADades/fonts-i-projectes-base/ComputerCenterShop_v1_javafx_starter/
```

## Funcio

Aquest projecte no es una solucio completa. Es el projecte inicial d'alumnat perquè el backlog RA2 obligui a crear o corregir codi JDBC real.

## Buits controlats

| Issue | Estat inicial |
| --- | --- |
| RA2-ISSUE-02 | `connect()` pendent. |
| RA2-ISSUE-03 | `initSchema()` pendent. |
| RA2-ISSUE-04 | `insertProduct()` pendent. |
| RA2-ISSUE-05 | `updateStock()` pendent. |
| RA2-ISSUE-06 | `deleteProduct()` pendent. |
| RA2-ISSUE-07 | `getInventory()`, `findProductByName()` i `mapProduct()` pendents. |
| RA2-ISSUE-08 | `disconnect()` existeix com a base; cal validar tancament de recursos a cada metode resolt. |
| RA2-ISSUE-09 | `registerStockChange()` pendent. |
| RA2-ISSUE-10 | `evaluateStockAlertWithProcedure()` pendent. |
| RA2-ISSUE-11 | Gestio d'errors pendent de millora en UI/servei si cal. |

## Comprovacions

| Comprovacio | Resultat |
| --- | --- |
| Sidecar modificat | Sí, amb una activitat prèvia visible al començament de RA2. |
| Projecte original modificat | No. |
| Projecte complet de referencia modificat | No. |
| POM release 25 | Si. |
| FXML present | Si. |
| Swing com a acces visible | No previst. |
| JDBC dins controladors | No previst. |
| Buits JDBC intencionats | Si. |
| XML POM/FXML parsejable | Si. |
| Swing detectat | No. |
| JDBC dins controladors JavaFX | No. |
| `.class`, `bin/` o `target/` dins el ZIP distribuïble | No detectat. |
| Compilacio parcial sense JavaFX | Correcta amb `javac 25.0.3`. |
| Maven disponible en entorn de revisio | No disponible en PATH. |

## Distribució validada — 2026-11-04

- `ComputerCenterShop_v1_javafx_starter.zip` generat des de la carpeta inspeccionable del starter.
- ZIP comprovat amb 29 entrades, `pom.xml` i `README.md` a l'arrel.
- S'han exclòs del paquet `bin/`, `target/`, `.class`, `.jar` i `.git` sense modificar les sortides locals presents a la carpeta font.
- L'activitat prèvia `ra2-inici-projecte-starter-jdbc.md` enllaça la descàrrega abans de la primera unitat de RA2.

## Pendent

- Executar compilacio Maven quan `mvn` estigui disponible.
