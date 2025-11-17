# Sistema de Gestión de Centros de Cultivo
## Descripción

SalmonttApp es una aplicación Java desarrollada para la empresa salmonera Salmontt, que permite gestionar y analizar centros de cultivo mediante la lectura de datos desde archivos de texto y su posterior procesamiento mediante colecciones ArrayList.SalmonttApp es una aplicación Java desarrollada para la empresa salmonera Salmontt, que permite gestionar y analizar centros de cultivo mediante la lectura de datos desde archivos de texto y su posterior procesamiento mediante colecciones ArrayList.

## Estructura del Proyecto (Paquetes y clases)

    ├── src/
    │   ├── model/
    │   │   └── CentroCultivo.java
    │   ├── data/
    │   │   └── GestorDatos.java
    │   ├── ui/
    │   │   └── Main.java
    ├── resources/
        └── centrosDeCultivo.txt
        
## Funcionalidades Implementadas   

1. Estructura de paquetes - Organización modular del proyecto
2. Clase modelo - CentroCultivo con atributos y métodos necesarios
3. Archivo de datos - Formato correcto con separadores punto y coma
4. Gestor de datos - Lectura, parsing y creación de objetos
5. Operaciones en Main:
   - Recorrido completo de la colección
   - Filtrado por condición específica (comuna)
   - Visualización de resultados


## Aprendizajes Desarrollados
- Manipulación de colecciones dinámicas en Java
- Vinculación entre archivos externos y objetos
- Aplicación de operaciones CRUD básicas sobre colecciones
- Manejo de excepciones y validación de datos
- Organización de código en paquetes según responsabilidades
