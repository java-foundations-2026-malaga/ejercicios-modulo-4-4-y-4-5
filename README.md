# JFo 4.4 y 4.5 - Clases Random y Math

Esta carpeta contiene 20 actividades autocorregibles.

## Actividades

01. Corrige el import de Random
02. Corrige la creación del objeto Random
03. Corrige un rango incorrecto de dado
04. Corrige una lotería de 1 a 10
05. Genera un número aleatorio entero
06. Simula una moneda con nextDouble()
07. Simula un dado
08. Genera una edad aleatoria válida
09. Simula piedra, papel o tijera
10. Crea una secuencia reproducible con semilla
11. Corrige una llamada inútil a Math.sqrt
12. Corrige el intento de instanciar Math
13. Corrige el uso de PI
14. Corrige una potencia calculada con operador incorrecto
15. Calcula el valor absoluto
16. Calcula máximo y mínimo
17. Calcula raíz cuadrada y potencia
18. Redondea una nota media
19. Calcula el área de un círculo
20. Calcula y redondea el IMC

Cada subcarpeta `actividadNN` es un proyecto Maven independiente con tests JUnit 5 y workflow de GitHub Actions.

## Cómo entregar las actividades

La rama `main` está protegida: contiene los enunciados originales y no se puede modificar.
Cada alumno trabaja en **su propia rama**, con su nombre.

1. Clona el repositorio:
   `git clone https://github.com/java-foundations-2026-malaga/REPOSITORIO.git`
2. Crea tu rama con tu nombre y apellido, en minúsculas y sin tildes ni espacios (por ejemplo `juan-perez`):
   `git checkout -b juan-perez`
   (En Eclipse: botón derecho sobre el proyecto > `Team > Switch To > New Branch...`).
3. Importa en Eclipse la carpeta `actividadNN` que vayas a hacer (`File > Import... > Maven > Existing Maven Projects`), resuélvela y comprueba los tests con `Run As > JUnit Test`.
4. Haz commit y sube **tu rama**:
   `git add .` → `git commit -m "Actividad NN"` → `git push -u origin juan-perez`
   (En Eclipse: `Git Staging` > `Commit and Push...`).
5. En la pestaña **Actions** del repositorio verás el resultado de la autocorrección de cada actividad que hayas modificado: ✅ aprobada o ❌ con los errores.

Si al hacer push te aparece un error sobre `main`, es que estás en la rama equivocada: cambia a tu rama con `git checkout juan-perez`.
