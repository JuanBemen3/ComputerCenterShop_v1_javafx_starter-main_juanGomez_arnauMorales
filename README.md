# ComputerCenterShop v1 JavaFX starter

Projecte inicial d'alumnat per al backlog RA2 del modul MP0486 - Acces a dades.

## Finalitat

Aquesta variant deriva de `ComputerCenterShop_v1_javafx`, pero no esta resolta. Compila parcialment sense JavaFX i conserva la interfície JavaFX/FXML, el model i el servei, pero deixa la capa `ProductDaoImplJDBC` amb buits controlats perquè el backlog impliqui crear o corregir codi JDBC real.



## Que ha de resoldre l'alumnat

| Issue | Codi pendent |
| --- | --- |
| RA2-ISSUE-02 | Implementar `connect()` amb URL, usuari i propietats de sistema. |
| RA2-ISSUE-03 | Implementar `initSchema()` amb DDL i seed inicial. |
| RA2-ISSUE-04 | Implementar `insertProduct()` amb `PreparedStatement`. |
| RA2-ISSUE-05 | Implementar `updateStock()` i disponibilitat segons estoc. |
| RA2-ISSUE-06 | Implementar `deleteProduct()` de forma controlada. |
| RA2-ISSUE-07 | Implementar consultes, `ResultSet` i `mapProduct()`. |
| RA2-ISSUE-08 | Revisar tancament de recursos amb `try-with-resources` i `disconnect()`. |
| RA2-ISSUE-09 | Implementar transaccio `commit` / `rollback`. |
| RA2-ISSUE-10 | Implementar crida amb `CallableStatement`. |
| RA2-ISSUE-11 | Millorar gestio d'errors de connexio i operacions. |

## Execucio prevista

Requisits:

- JDK 25 LTS.
- Maven.

Compilar:

```bash
mvn compile
```

Executar JavaFX:

```bash
mvn javafx:run
```

En l'estat inicial, l'aplicacio pot mostrar errors `RA2-ISSUE-xx pendent`. Aquests errors son intencionats i indiquen quin issue s'ha de resoldre.

## Limits RA2

No s'ha d'introduir ORM, Hibernate, ObjectDB, MongoDB, serveis externs, persistencia principal en fitxers ni components reutilitzables de RA6.
