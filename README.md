# 🐟 Portal Administrativo - Salmontt Puerto Montt
## Descripción

SalmonttApp es una aplicación Java desarrollada para la empresa salmonera Salmontt, que permite Permite la administración y consulta de información de trabajadores, proveedores y clientes desde archivos de xlsx y su posterior procesamiento mediante colecciones.

## Estructura del Proyecto (Paquetes y clases)

    └─ SalmonttListas.xlsx    `com.Salmontt/
        ├── ui/
        │   └── Main.java          # Punto de entrada y menú principal
        ├── data/
        │   └── GestorDatos.java   # Gestión de datos y operaciones
        └── model/
        |    ├── DatosFicha.java    # Clase base abstracta
        |   ├── Trabajador.java    # Entidad Trabajador
        |    ├── Proveedor.java     # Entidad Proveedor
        |    └── Cliente.java       # Entidad Cliente
        ├── resuorces
            └─ SalmonttListas.xlsx

# DistribuciónArchivo XLXS

| Hoja  | Contenido  | Columnas |
| :------------ |:---------------:| :------------|
| 0      | Proveedores | RUT, Nombre, Dirección, Teléfono, Email, Centro de Costo |
| 1      | Clientes        |   RUT, Nombre, Dirección, Teléfono, Email, Sucursal |
| 2 | Trabajadores        |   RUT, Nombre, Apellido Paterno, Apellido Materno, Dirección, Teléfono, Email |
                
----
        
## Funcionalidades Implementadas   

1. Estructura basada en Colecciones 
2. Validación Básica de Datos Ingresados (entrdasa nulas, manejo tray - catch, Mensajes de error descriptivos)
3. Lectura de registros desde archivo xlsx con procesamiento de múltiples hojas 
4. Organización del Código en Paquetes Funcionales (ui/ - Interfaz de usuario y presentación, data/ - Gestión y acceso a dato, model/ - Entidades y modelo de dominio)


## Mejoras del sistema en Fase 2 
- Carga Dinámica: Datos cargados automáticamente al inicio
- Filtrado Avanzado: Búsquedas por RUT, Centro de Costo, Sucursa
- Recorrido Completo: Listado de todos los registros disponibles
