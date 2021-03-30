package co.edu.unbosque.Controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public static void main(String[] args) {

		ServerSocket servidor = null;
		Socket sc = null;
		DataInputStream in;
		DataOutputStream out;
		int Puerto = 5000;
		boolean salir = false;
		String nombre = "";
		String opcionMenu1 = "";
		String opcionMenu2 = "";

		String specie = "";
		String size = "";
		String location = "";
		String Address = "";
		String personName = "";
		String cellphone = "";
		String emailAddress = "";
		String comentari = "";

		try {
			servidor = new ServerSocket(Puerto);
			System.out.println("servidor Iniciado");

			while (true) {
				sc = servidor.accept();
				in = new DataInputStream(sc.getInputStream());
				out = new DataOutputStream(sc.getOutputStream());
				out.writeUTF("Bienvenido a nuestro chat de ciudadados de 4 patas");
				out.writeUTF("Por favor indicame tu nombre");
				nombre = in.readUTF();
				out.writeUTF("Bienvenido" + " " + nombre + " " + "me presento soy fernando y si soy un chatbot"
						+ "\ncreado por esteban cardenas, paula anaya y cristian sanchez (en un futuro andres galvis)"
						+ "\nfui diseñado para hacer esta interaccion mas humana en este momento te va a salir el menu de opciones"
						+ "\ndonde nos puedes indicar mas afondo en que te podemos ayudar :3");
				out.writeUTF("1. Crear caso " + "\n2. Hablar con un agente" + "\n3. salir");
				opcionMenu1 = in.readUTF();
				int Menu1 = Integer.parseInt(opcionMenu1);
				if (Menu1 == 1) {
					System.out.println("entre al 1");
					while (!salir) {
						out.writeUTF("Quieres armar un caso por favor indicanos el tipo de caso que quieres crear"
								+ "\n1. Perdida" + "\n2. Robo" + "\n3. Abandono" + "\n4. Animal Peligroso"
								+ "\n5. Manejo indebido en via publica" + "\n6. Salir");
						opcionMenu2 = in.readUTF();
						int Menu2 = Integer.parseInt(opcionMenu2);

						switch (Menu2) {
						case 1:
							out.writeUTF("Escogiste armar un caso por perdida. por favor " + nombre
									+ "\nindicanos los siguientes datos para crear los casos" + "\nEspecie del animal"
									+ "\nTamaño del animal" + "\nDireccion donde se encuentra el animal"
									+ "\nNombre completo de la persona que lo reporta"
									+ "\nTelefono de la persona que lo reporta" + "\nEmail de la persona que lo reporta"
									+ "\nComentarios generales de la situacion");
							
							specie = in.readUTF();
							size = in.readUTF();
							location = in.readUTF();
							Address = in.readUTF();
							personName = in.readUTF();
							cellphone = in.readUTF();
							emailAddress = in.readUTF();
							comentari = in.readUTF();

							System.out.println("informacion cargada");

							out.writeUTF("Querido " + nombre
									+ " con la informacion que nos brindaste generamos el siguiente caso : "
									+ "\nEspecie del animal: " + specie + "\nTamaño del animal: " + size
									+ "\nLocalicacion del animal: " + location
									+ "\nDireccion donde se encuentra el animal: " + Address
									+ "\nNombre completo de la persona que lo reporta:" + personName
									+ "\nTelefono de la persona que lo reporta: " + cellphone
									+ "\nEmail de la persona que lo reporta: " + emailAddress
									+ "\nComentarios generales de la situacion: " + comentari);
							
							out.writeUTF("Gracias por compartir esa informacion con nosotros"
									+ "\nOjala te hubieramos ayudado hasta la proxima");

							break;
						case 2:
							out.writeUTF("Escogiste armar un caso por Robo. por favor " + nombre
									+ "\nindicanos los siguientes datos para crear los casos" + "\nEspecie del animal"
									+ "\nTamaño del animal" + "\nDireccion donde se encuentra el animal"
									+ "\nNombre completo de la persona que lo reporta"
									+ "\nTelefono de la persona que lo reporta" + "\nEmail de la persona que lo reporta"
									+ "\nComentarios generales de la situacion");
							
							specie = in.readUTF();
							size = in.readUTF();
							location = in.readUTF();
							Address = in.readUTF();
							personName = in.readUTF();
							cellphone = in.readUTF();
							emailAddress = in.readUTF();
							comentari = in.readUTF();

							System.out.println("informacion cargada");

							out.writeUTF("Querido " + nombre
									+ " con la informacion que nos brindaste generamos el siguiente caso : "
									+ "\nEspecie del animal: " + specie + "\nTamaño del animal: " + size
									+ "\nLocalicacion del animal: " + location
									+ "\nDireccion donde se encuentra el animal: " + Address
									+ "\nNombre completo de la persona que lo reporta:" + personName
									+ "\nTelefono de la persona que lo reporta: " + cellphone
									+ "\nEmail de la persona que lo reporta: " + emailAddress
									+ "\nComentarios generales de la situacion: " + comentari);
							
							out.writeUTF("Gracias por compartir esa informacion con nosotros"
									+ "\nOjala te hubieramos ayudado hasta la proxima");

							break;
						case 3:
							out.writeUTF("Escogiste armar un caso por Abandono. por favor " + nombre
									+ "\nindicanos los siguientes datos para crear los casos" + "\nEspecie del animal"
									+ "\nTamaño del animal" + "\nDireccion donde se encuentra el animal"
									+ "\nNombre completo de la persona que lo reporta"
									+ "\nTelefono de la persona que lo reporta" + "\nEmail de la persona que lo reporta"
									+ "\nComentarios generales de la situacion");
							
							specie = in.readUTF();
							size = in.readUTF();
							location = in.readUTF();
							Address = in.readUTF();
							personName = in.readUTF();
							cellphone = in.readUTF();
							emailAddress = in.readUTF();
							comentari = in.readUTF();

							System.out.println("informacion cargada");

							out.writeUTF("Querido " + nombre
									+ " con la informacion que nos brindaste generamos el siguiente caso : "
									+ "\nEspecie del animal: " + specie + "\nTamaño del animal: " + size
									+ "\nLocalicacion del animal: " + location
									+ "\nDireccion donde se encuentra el animal: " + Address
									+ "\nNombre completo de la persona que lo reporta:" + personName
									+ "\nTelefono de la persona que lo reporta: " + cellphone
									+ "\nEmail de la persona que lo reporta: " + emailAddress
									+ "\nComentarios generales de la situacion: " + comentari);
							
							out.writeUTF("Gracias por compartir esa informacion con nosotros"
									+ "\nOjala te hubieramos ayudado hasta la proxima");

							break;

						case 4:
							out.writeUTF("Escogiste armar un caso por Animal peligroso. por favor " + nombre
									+ "\nindicanos los siguientes datos para crear los casos" + "\nEspecie del animal"
									+ "\nTamaño del animal" + "\nDireccion donde se encuentra el animal"
									+ "\nNombre completo de la persona que lo reporta"
									+ "\nTelefono de la persona que lo reporta" + "\nEmail de la persona que lo reporta"
									+ "\nComentarios generales de la situacion");
							
							specie = in.readUTF();
							size = in.readUTF();
							location = in.readUTF();
							Address = in.readUTF();
							personName = in.readUTF();
							cellphone = in.readUTF();
							emailAddress = in.readUTF();
							comentari = in.readUTF();

							System.out.println("informacion cargada");

							out.writeUTF("Querido " + nombre
									+ " con la informacion que nos brindaste generamos el siguiente caso : "
									+ "\nEspecie del animal: " + specie + "\nTamaño del animal: " + size
									+ "\nLocalicacion del animal: " + location
									+ "\nDireccion donde se encuentra el animal: " + Address
									+ "\nNombre completo de la persona que lo reporta:" + personName
									+ "\nTelefono de la persona que lo reporta: " + cellphone
									+ "\nEmail de la persona que lo reporta: " + emailAddress
									+ "\nComentarios generales de la situacion: " + comentari);
							
							out.writeUTF("Gracias por compartir esa informacion con nosotros"
									+ "\nOjala te hubieramos ayudado hasta la proxima");

							break;
						case 5:
							out.writeUTF("Escogiste armar un caso por Manejo indebido en via publica. por favor "
									+ nombre + "\nindicanos los siguientes datos para crear los casos"
									+ "\nEspecie del animal" + "\nTamaño del animal"
									+ "\nDireccion donde se encuentra el animal"
									+ "\nNombre completo de la persona que lo reporta"
									+ "\nTelefono de la persona que lo reporta" + "\nEmail de la persona que lo reporta"
									+ "\nComentarios generales de la situacion");
							
							specie = in.readUTF();
							size = in.readUTF();
							location = in.readUTF();
							Address = in.readUTF();
							personName = in.readUTF();
							cellphone = in.readUTF();
							emailAddress = in.readUTF();
							comentari = in.readUTF();

							System.out.println("informacion cargada");

							out.writeUTF("Querido " + nombre
									+ " con la informacion que nos brindaste generamos el siguiente caso : "
									+ "\nEspecie del animal: " + specie + "\nTamaño del animal: " + size
									+ "\nLocalicacion del animal: " + location
									+ "\nDireccion donde se encuentra el animal: " + Address
									+ "\nNombre completo de la persona que lo reporta:" + personName
									+ "\nTelefono de la persona que lo reporta: " + cellphone
									+ "\nEmail de la persona que lo reporta: " + emailAddress
									+ "\nComentarios generales de la situacion: " + comentari);
							
							out.writeUTF("Gracias por compartir esa informacion con nosotros"
									+ "\nOjala te hubieramos ayudado hasta la proxima");

							break;
						case 6:
							out.writeUTF("Siempre puedes contar con nosotros, hasta luego ");
							salir = true;
							sc.close();
							break;
						default:
							out.writeUTF(nombre + "solo puedes escoger un numero entre 1 y 6");
						}

					}
				} else if (Menu1 == 2) {
					System.out.println("entre al 2");
					out.writeUTF("querido " + nombre
							+ " esta parte esta en proceso danos tiempo somos nuevos en este tema :3");
				} else {
					System.out.println("entre al 3");
					out.writeUTF("Gracias por confiar en nosotros");
					sc.close();
				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
