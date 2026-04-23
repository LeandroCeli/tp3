# Trabajo Práctico Obligatorio 3 - Buscador de Libros

## Descripción de la app
Esta aplicación de Android permite a los usuarios buscar un libro dentro de una lista predefinida. La app consta de dos pantallas (Activities):
1. **Pantalla Principal (MainActivity)**: Presenta un buscador donde el usuario puede ingresar el nombre de un libro. Al pulsar "Buscar", la aplicación verifica si el libro existe en el repositorio local.
2. **Pantalla de Detalles (DetailActivity)**: Si el libro es encontrado, la aplicación navega a esta segunda pantalla donde se muestran los detalles completos del libro: Título, Autor y Descripción.

El proyecto está desarrollado aplicando buenas prácticas de arquitectura y diseño:
- **Patrón MVVM (Model-View-ViewModel)**: Separación clara entre la vista (UI), la lógica de presentación (LibroViewModel) y los datos (LibroRepository).
- **View Binding**: Utilizado para vincular las vistas de manera segura y eficiente, reemplazando el uso del clásico `findViewById`.
- **Validaciones**: Incluye manejo de errores mostrando mensajes (Toasts) si el campo de búsqueda está vacío o si el libro no existe.

## Integrantes
- **Celi Leandro**
- **DNI**: 31542704
