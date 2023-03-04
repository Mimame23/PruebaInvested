# PruebaInvested
Como parte de mi proceso de selección en Invested, desarrollé una API proponiendo una arquitectura en el lenguaje de JAVA y utilizando las operaciones CRUD.
El sistema cuenta con las siguientes funcionalidades a través de servicios REST:

    GET /clientes: Obtiene todos los clientes registrados en el sistema, incluyendo su información personal y sus créditos.
    GET /clientes/{id}: Obtiene la información de un cliente específico, incluyendo su información personal y sus créditos.
    POST /clientes: Permite dar de alta a un nuevo cliente en el sistema, incluyendo su información personal y el monto de crédito solicitado.
    PUT /clientes/{id}: Permite modificar la información de un cliente existente en el sistema, incluyendo su información personal y el monto de crédito solicitado.
    DELETE /clientes/{id}: Permite eliminar un cliente del sistema, incluyendo toda su información personal y sus créditos asociados.
    GET /creditos: Obtiene todos los créditos registrados en el sistema, incluyendo información sobre el cliente al que están asignados.
    GET /creditos/{id}: Obtiene la información de un crédito específico, incluyendo su monto, su estado de pago y el cliente al que está asignado.
    POST /creditos: Permite agregar un nuevo crédito a un cliente existente en el sistema, incluyendo su monto y estado de pago.
    PUT /creditos/{id}: Permite modificar la información de un crédito existente en el sistema, incluyendo su monto y estado de pago.
    DELETE /creditos/{id}: Permite eliminar un crédito del sistema.
    
    El sistema se creo con Springboot, por lo que para abrirlo en su equipo es necesario que se importe la carpeta Invested como un proyecto Gradle y que el modelo de Investeddb se cargue a SQL, los otros dos documentos son los querys para insertar los datos existentes de cada base de datos ya que las propiedades del proyecto estan en "create" tambien se debe cambiar el user name y el password que maneje en SQL.
    Si requiere probar las operaciones CRUD desde una plataforma como Postman la URL para credito es:
    http://localhost:8080/api/v1/cliente/:idCliente/credito/
    
    Si requiere probar las operaciones CRUD desde una plataforma como Postman la URL para cliente es:
    http://localhost:8080/api/v1/cliente/
    
