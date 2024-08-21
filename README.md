# IngenieriaSoftware2
TALLER 1. Cuando hablamos del principio de responsabilidad única (SRP), nos referimos a que una clase debe encargarse de una sola tarea. En este caso, la clase Usuario está asumiendo varias tareas, como se observa:
Manejo de datos del usuario: Esta responsabilidad implica almacenar y acceder a la información del usuario, como su nombre y dirección de correo electrónico.
Envío de correos electrónicos: Además de gestionar la información del usuario, esta clase también maneja la lógica para enviar correos electrónicos.
Verificación de contraseñas: Esta función pertenece al ámbito de la autenticación y la seguridad.
Cálculo de salarios: Este proceso es parte de la lógica de negocio y está sujeto a cambios frecuentes.
Por lo tanto, cada una de estas funciones puede requerir modificaciones por razones completamente distintas. Al aplicar el SRP, logramos un código más fácil de gestionar y mantener.
