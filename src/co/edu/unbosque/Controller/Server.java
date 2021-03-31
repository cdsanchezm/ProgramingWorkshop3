package co.edu.unbosque.Controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	public Server() {

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
			System.out.println(Style(18,  "servidor Iniciado"));

			while (true) {
				sc = servidor.accept();
				in = new DataInputStream(sc.getInputStream());
				out = new DataOutputStream(sc.getOutputStream());
				out.writeUTF(Style(51, " Bienvenido a nuestro chat de ciudadados de 4 patas"));
				out.writeUTF("> Por favor indicame tu nombre");
				nombre = in.readUTF();
				out.writeUTF(Style(64, "Bienvenido" + " " + nombre + " " + "me presento soy fernando, tu chatbot"
						+ "\ncreado por esteban cardenas, paula anaya y cristian sanchez"
						+ "\nfui dise�ado para hacer esta interaccion mas humana"
						+ "\nen este momento te va a salir el menu de opciones"
						+ "\ndonde nos puedes indicar mas afondo en que te podemos ayudar :3"));
				out.writeUTF("> 1. Crear caso     > 2. Hablar con un agente     > 3. salir\n"+line(64));
				opcionMenu1 = in.readUTF();
				int Menu1 = Integer.parseInt(opcionMenu1);
				if (Menu1 == 1) {
					System.out.println(Style(18, "entre al 1"));
					while (!salir) {
						out.writeUTF(Style(64, "Por favor indicanos el tipo de caso que quieres crear")
								+ "\n> 1. Perdida" + "\n> 2. Robo" + "\n> 3. Abandono" + "\n> 4. Animal Peligroso"
								+ "\n> 5. Manejo indebido en via publica" + "\n> 6. Salir\n"+line(64));
						opcionMenu2 = in.readUTF();
						int Menu2 = Integer.parseInt(opcionMenu2);

						switch (Menu2) {
						case 1:
							out.writeUTF(Style(64, "            > Escogiste armar un caso por perdida < \n      Por favor " + nombre
									+ ",ingresa los siguientes datos"));
							
							specie = in.readUTF();
							size = in.readUTF();
							location = in.readUTF();
							Address = in.readUTF();
							personName = in.readUTF();
							cellphone = in.readUTF();
							emailAddress = in.readUTF();
							comentari = in.readUTF();

							System.out.println(Style(30, " > informacion cargada <"));

							out.writeUTF(Style(64, "           Querido " + nombre+"."
									+ "\n Con la informacion que nos brindaste generamos el siguiente caso : "
									+ "\n > Especie del animal: " + specie + "\n > Tama�o del animal: " + size
									+ "\n > Localicacion del animal: " + location
									+ "\n > Direccion donde se encuentra el animal: " + Address
									+ "\n > Nombre completo de la persona que lo reporta:" + personName
									+ "\n > Telefono de la persona que lo reporta: " + cellphone
									+ "\n > Email de la persona que lo reporta: " + emailAddress
									+ "\n > Comentarios generales de la situacion: " + comentari));
							
							out.writeUTF("Gracias por compartir esa informacion con nosotros\n" + line(64));

							break;
						case 2:
							out.writeUTF("Escogiste armar un caso por Robo. por favor " + nombre
									+ "\nindicanos los siguientes datos para crear los casos" + "\nEspecie del animal"
									+ "\nTama�o del animal" + "\nDireccion donde se encuentra el animal"
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
									+ "\nEspecie del animal: " + specie + "\nTama�o del animal: " + size
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
									+ "\nTama�o del animal" + "\nDireccion donde se encuentra el animal"
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
									+ "\nEspecie del animal: " + specie + "\nTama�o del animal: " + size
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
									+ "\nTama�o del animal" + "\nDireccion donde se encuentra el animal"
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
									+ "\nEspecie del animal: " + specie + "\nTama�o del animal: " + size
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
									+ "\nEspecie del animal" + "\nTama�o del animal"
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
									+ "\nEspecie del animal: " + specie + "\nTama�o del animal: " + size
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

	public String Style(int numer, String Text) {
		String a = "-";
		String solution = "";
		for (int i = 0; i < numer; i++) {

			solution = solution + a;

		}

		solution = solution + "\n" + Text + "\n";

		for (int i = 0; i < numer; i++) {

			solution = solution + a;

		}

		return solution;
	}
	
	public String line(int numer) {
		String a = "-";
		String solution = "";
		for (int i = 0; i < numer; i++) {

			solution = solution + a;

		}

		return solution;
	}

}
