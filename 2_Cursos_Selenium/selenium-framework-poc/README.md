# Proyecto POM

Este es un proyecto de automatización que sigue el patron de diseño de POM.

---

### Herramientas

* Cucumber (BDD)
* JUnit (Assertions) - Librería de pruebas unitarias
* Java
* IntelliJ (IDE)
* Selenium WebDriver (Interacciones con la UI)
* Lombok

---

### Pre requisitos:

1. Tener instalado el JDK 1.8
2. Tener instalado Docker
3. Intellij Community Edition. Se recomienda la última versión
4. Maven 3.6 o superior
5. Plugin gherkin for java en Intellij

---

## Estructura del proyecto

* **builders:** Contiene las carpetas con los constructores necesarios.
    * **data:** Contiene los constructores con la información requerida para la realización de las pruebas
* **conf:** Contiene las carpetas con las configuraciones necesarias.
    * **DriverConfig:** Es el archivo de configuraciones del driver con las configuraciones del DriverFactory y los Wait requeridos.
* **enums:** Contiene los archivos con las constantes del sistema.
    * Browser: Contiene los nombres asignados a cada uno de los diferentes navegadores utilizados para las pruebas automatizadas.
* **models:** Contiene los diferentes modelos utilizados en el sistema para agrupar el conjunto de datos asociados a una entidad.
* **pageactions:** Contiene a las clases que se encargan de almacenar los métodos utilizados por los stepdefinitions y todo el tema relacionado con las esperas entre peticiones.
* **pageobjects:** Contiene a las clases que tienen la responsabilidad de manejar los WebElements, adicionalmente extiende de PageBase y posse inyección de código proveniente de WedDriver.
* **stepdefinitions:** Contiene el conjunto de pasos establecido en el archivo feature de cucumber para la ejecución y validaciones de los mismos.
* **tasks:** Contiene todos los archivos relacionados con la navegación por url asignada por el usuario, así como también las acciones a realizar para obtener los parámetros asociados a una entidad.
* **util:** Contiene las utilidades utilizadas por el sistema para el desarrollo de las actividades de automatización designadas.
    * **driver:** Carpeta donde se almacena la clase PageFactory que contiene las diferentes configuraciones necesarias para poder utilizar nuestros drivers.
    * **reporting:** Paquete con las diferentes configuraciones para las capturas de pantalla y sus diferentes condiciones.
        * **PhotographerHook:** Esta clase se encarga de tomar las diferentes capturas de pantalla por diferentes parámetros y validaciones correspondiente a los steps definidos dentro del archivo feature.
        * **TakeScreenshotCondition:** Este archivo contiene las constantes que se seleccionan en el archivo de variables de entorno para realizar las diferentes capturas de pantalla.
    * **PageBase:** Esta clase se encarga de inicializar el page factory, almacena configuraciones que el usuario requiera para el Web driver como lo son las características de .manage()
* **CucumberTest:** Clase principal donde se ejecutaran todos nuestros casos de pruebas y las respectivas configuraciones de nuestros features y los reportes correspondientes.
* **resources:** Carpeta para almacenar los recursos indispensables para el correcto funcionamiento del proyecto.
    * **drivers:** Carpeta donde se van a almacenar los diferentes driver de los navegadores utilizados para los diferentes sistemas operativos.
    * **features:** Contiene los features descritos para los escenarios de pruebas necesarios para la verificación del cumplimiento de la funcionalidad.
    * **properties:** Contiene las variables de entorno para ejecutar el proyecto en diferentes environments.

---

## Ejecutar el proyecto

Para correr el proyecto existen las siguientes formas:

### IDE
* Para ejecutar el proyecto desde el IDE se debe realizar click en run test al archivo CucumberTest

### Consola
* Para ejecutar por medio de la consola debe ingresar el comando `mvn clean test`
* Para ejecutar por medio de la consola para un ambiente determinado debe ingresar el comando `mvn clean test -Denvironment=nombreDelAmbiente`
