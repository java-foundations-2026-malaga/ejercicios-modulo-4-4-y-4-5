# JFo 4.4 y 4.5 - Actividad 10

## Crea una secuencia reproducible con semilla

Crea dos objetos `Random` con la misma semilla (`2026`), genera tres valores con `nextInt(100)` en cada uno y comprueba si coinciden.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Criterio de autocorrección

```text
Usa new Random(2026) dos veces y nextInt(100).
```

## Salida esperada

```text
Secuencias iguales: true
```

## Instrucciones para Eclipse

1. Importa este proyecto en Eclipse como un proyecto Maven.
2. Abre `src/main/java/modulo4_4_4_5_actividad10/Actividad10.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad10Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
