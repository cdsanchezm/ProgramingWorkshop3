package co.edu.unbosque.Controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Server {
	// best way to save the case information to export csv file
	ArrayList<case_information> case_Info = new ArrayList<case_information>();
	// Save logged in users

	ServerSocket servidor = null;
	Socket sc = null;
	DataInputStream in;
	DataOutputStream out;
	Scanner scan = new Scanner(System.in);
	int Puerto = 5000;
	boolean salir = false;
	String nombre = "";
	String opcionMenu1 = "";
	String opcionMenu2 = "";
	String advisor_name = "";
	String specie = "";
	String size = "";
	String location = "";
	String Address = "";
	String personName = "";
	String cellphone = "";
	String emailAddress = "";
	String comentari = "";
	String typology = "";
	String fecha = "";
	boolean exitChat = false;
	csv sv = new csv();
    List<case_information>save = new ArrayList<case_information>();
	public Server() {
		try {
			servidor = new ServerSocket(Puerto);
			System.out.println(Style(18, "servidor Iniciado"));
			sc = servidor.accept();
			in = new DataInputStream(sc.getInputStream());
			out = new DataOutputStream(sc.getOutputStream());
			welcome();
			while (true) {
				out.writeUTF("\n> 1. Crear caso     > 2. Hablar con un agente     > 3. salir\n" + line(64));
				opcionMenu1 = in.readUTF();
				int Menu1 = Integer.parseInt(opcionMenu1);

				if (Menu1 == 1) {
					System.out.println(Style(18, "entre al 1"));
					CreateCase();

				} else if (Menu1 == 2) {
					System.out.println("entre al 2");
					out.writeUTF("querido " + nombre + " Se le asignara un agente que lo asista...");
					chat();

				} else {
					System.out.println("entre al 3");
					out.writeUTF("Gracias por confiar en nosotros");
					sc.close();
					System.exit(0);
				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error devolver menu");
		}
	}

	public void chat() {
		try {
			System.out.println("SERVER");
			System.out.println(line(64));
			out.writeUTF(line(64));
			System.out.println("Se solicita asesor, Desea proceder?/n > ACEPTAR         > DENEGAR");
			String option = scan.nextLine().toUpperCase();

			switch (option) {
			case "ACEPTAR":
				out.writeUTF("ACEPTO");
				System.out.println("Ingrese su nombre, asesor...");
				advisor_name = scan.nextLine();
				out.writeUTF(" > El Asesor " + advisor_name
						+ " se a unido al chat. \n . para abandonar el chat por favor ingrese la palabra : /quit ");
				out.writeUTF(" > " + advisor_name + ": " + "Bienvenido " + nombre
						+ ", en esta ocasion sere tu asesor \n en que puedo colaborarte?");
				while (exitChat == false) {

					receive_message(in);
					send_Message(out);

				}
				out.writeUTF("EXIT");
				out.writeUTF(Style(64, "el chat finalizo"));
				break;
			case "DENEGAR":
				out.writeUTF("DECLINO");
				out.writeUTF(Style(64, "El asesor no la puede atender en este momento, por favor intentar mas tarde"));
				break;

			default:
				System.out.println("ADMIN SOLO PUEDE ACEPTAR O DENEGAR LA PETICION");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void send_Message(DataOutputStream out) {
		try {

			String mensaje = scan.nextLine();
			String mensaje2 = " > !" + advisor_name + ": " + mensaje;
			out.writeUTF(mensaje2);
		} catch (Exception e) {
			System.out.println("error al enviar");
		}
	}

	public void receive_message(DataInputStream in) {
		try {
			String mensaje = in.readUTF();

			if (mensaje.toLowerCase().startsWith("/quit")) {
				System.out.println(nombre + " A ABANDONADO EL CHAT");
				System.exit(0);
				exitChat = true;
			}
			System.out.println(" > " + nombre + ": " + mensaje);

		} catch (Exception e) {
			System.out.println("error al leer :v");
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

	public void welcome() {
		try {
			out.writeUTF(Style(51, " Bienvenido a nuestro chat de ciudadados de 4 patas"));
			out.writeUTF("> Por favor indicame tu nombre");
			nombre = in.readUTF();
			out.writeUTF(Style(64,
					"Bienvenido" + " " + nombre + " " + "me presento soy fernando, tu chatbot"
							+ "\ncreado por esteban cardenas, paula anaya y cristian sanchez"
							+ "\nfui disenado para hacer esta interaccion mas humana"
							+ "\nen este momento te va a salir el menu de opciones"
							+ "\ndonde nos puedes indicar mas afondo en que te podemos ayudar :3"));
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

	public void CreateCase() {

		boolean var = false;
		try {
			out.writeUTF(Style(64, "Por favor indicanos el tipo de caso que quieres crear") + "\n> 1. Perdida"
					+ "\n> 2. Robo" + "\n> 3. Abandono" + "\n> 4. Animal Peligroso"
					+ "\n> 5. Manejo indebido en via publica" + "\n> 6. Volver\n" + line(64));
			opcionMenu2 = in.readUTF();
			int Menu2 = Integer.parseInt(opcionMenu2);

			switch (Menu2) {
			case 1:
				typology = "Perdida";
				var = true;
				break;
			case 2:
				typology = "Robo";
				var = true;
				break;
			case 3:
				typology = "Abandono";
				var = true;
				break;
			case 4:
				typology = "Animal Peligroso";
				var = true;
				break;
			case 5:
				typology = "Manejo indebido en via publica";
				var = true;
				break;
			case 6:
				out.writeUTF(Style(64, "HASTA LUEGO!!"));
				break;
			default:
				out.writeUTF(nombre + "solo puedes escoger un numero entre 1 y 6");

			}
			if (var == true) {
				out.writeUTF(Style(64, "            > Escogiste armar un caso por " + typology + " < \n      Por favor "
						+ nombre + ",ingresa los siguientes datos"));

				specie = in.readUTF();
				size = in.readUTF();
				location = in.readUTF();
				Address = in.readUTF();
				personName = in.readUTF();
				cellphone = in.readUTF();
				emailAddress = in.readUTF();
				comentari = in.readUTF();
				fecha = in.readUTF();
				

				System.out.println(Style(30, " > informacion cargada <"));

				out.writeUTF(Style(64, "           Querido " + nombre + "."
						+ "\n Con la informacion que nos brindaste generamos el siguiente caso : "
						+ "\n > Especie del animal: " + specie + "\n > Tama�o del animal: " + size
						+ "\n > Localicacion del animal: " + location + "\n > Direccion donde se encuentra el animal: "
						+ Address + "\n > Nombre completo de la persona que lo reporta:" + personName
						+ "\n > Telefono de la persona que lo reporta: " + cellphone
						+ "\n > Email de la persona que lo reporta: " + emailAddress
						+ "\n > Comentarios generales de la situacion: " + comentari));

				out.writeUTF("Gracias por compartir esa informacion con nosotros\n" + line(64));
				System.out.println(Style(64, saveCase()));
				
				// out.writeUTF(Style(64,saveCase()));
				var = false;

			}
		} catch (Exception e) {
			System.out.println("error en crear caso");
		}
	}

	public String saveCase() throws IOException {
		String status = " > anithing ?";
		try {
			case_information saves = new case_information(typology, specie, size, location, Address, personName,
					cellphone, emailAddress, comentari,fecha);
			save.add(new case_information(typology, specie, size, location, Address, personName, cellphone, emailAddress, comentari, fecha));
			sv.exportCsv(save);
			
			if (!case_Info.contains(saves)) {
				case_Info.add(saves);
				status = " > Caso Creado Satisfactoriamente";

			} else {
				status = " > Caso imposible de crear, ya esta en el sistema";
			}
		} catch (Exception e) {
			out.writeUTF("error en save");
		}
		return status;

	}
	
	

}
