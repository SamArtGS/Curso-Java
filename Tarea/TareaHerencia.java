Tarea Herencia:

El usuario visita una agencia vehiculos de todo tipo.
Se ha ganado mucho dinero y puede comprar hasta 5 Vehículos:

	Realizar un archivo VehiculoMain en donde le pida al usario ingresar los datos
	del tipo de vehículo que quiere comprar. Antes se le preguntará si desea gastar su dinero comprando autos, en dado de que responda que sí, entonces entrará en un menú con tres opciones: Comprar Vehículo, Ver los vehículos comprados, y una opción para SALIR. 

		***NOTA: Una vez en el menú, el usuario NO podrá salir de otra manera a menos que seleccione la opción SALIR.

		***NOTA2: la apariencia (impresión en la línea de comandos) del menú junto con los datos mostrados es a su gusto y tienen total libertad.

		***EL QUE HAGA EL PROGRAMA QUE SEA MÁS AMIGABLE A LA VISTA DEL USUARIO, GANARÁ UNA PARTICIPACIÓN.

		Ejemplo:

		Bienvenido blah, blah (depende de su creatividad)
			Comprar, ver vehículos comprados, salir

		

		*Opción "Comprar Vehículo": el usuario ingresará todos los datos de éste (todos los atrbiutos
		que tenga la clase de vehículo que escoja).
		
		Ejemplificando lo anterior

		--Tipo de Vehículo: (lo ingresa el usuario)
							en caso de que no sea terrestre, acuático, o aereo, el programa le mandará una cadena que diga: "ese tipo de auto no existe en este programa. Nos vemos." y de ahí vuelva al menú principal. (comprar, vehículos comprados, salir)
		--
		Recordar que dependiendo de su selección, llenará los datos pertinentes a los atributos que requiera la clase. (vAereo, vAcuatico, vTerrestre)
		

****NOTA FINAL**** 
No creamos la clase de vehículo acuático, por ende tendrán que crearla con el nombre "vAcuatico", ésta será igualmente hija de la clase Vehiculo

La clase vAcuatico, tendrá como atributos propios:
		-->Tipo (puede ser: yate, crucero, lancha, trajinera, barco)
		-->Piscina (sólo en caso de que el tipo sea de crucero)
		-->Sala de máquinas (sólo la tendrá el barco y el crucero)
		-->Capitan   (nombre)

		-->Pasajeros (número de pasajeros a bordo) 
				***Para dos participaciones, cada pasajero debe de tener nombre, apellido, número de boleto y tipo de boleto (VIP o general) como atributos propios (será un array de pasajeros) y los deberá de imprimir en la pantalla al final de todos los datos del Vehiculo como una lista (se imprimirá en la opción "Vehiculos Comprados" del menú principal, después de todos los datos del vehículo acuático. 

				Ejemplificando:

				Datos del vehículo comprado:
					Vehiculo acuatico.
					Cabina: No
					Capitán: Pancho Villa
					etc;
					etc;
					Pasajeros a bordo:
						1. Pepito Rodriguez		Boleto: 147		VIP: NO 
						2. Cipriano Todosalto	Boleto: 13		VIP: SI
						.
						.
						.
						20. Jorginho Valderrama  Boleto: 34      VIP:SI))
		

	
Recuerden identarlo para que sea lo más visualmente agradable.
