package co.edu.unbosque.Controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	Scanner scan = new Scanner(System.in);
	// the host and port variables are the connections for the server, they must be
	// left the same in both the server class and the client class
	String Host = "127.0.0.1";
	int puerto = 5000;
	DataInputStream in;
	DataOutputStream out;

	// are the local variables that we use in the program
	boolean salir = false;
	String specie = "";
	String size = "";
	String location = "";
	String Address = "";
	String personName = "";
	String cellphone = "";
	String emailAddress = "";
	String comentari = "";
	String caso = "";
	String despedidac = "";
	boolean exitChat = false;
	String enunciado = "";

	public Client() {

		try {
			Socket sc = new Socket(Host, puerto);
			// DataInputStream helps us to read a message
			in = new DataInputStream(sc.getInputStream());
			// DataoutputStream helps us to write a message
			out = new DataOutputStream(sc.getOutputStream());

			// started welcoming the client only by reading the messages sent by the server
			welcome();
			while (true) {

				start(sc);

			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void start(Socket sc) {
		try {
			String Intromenu = in.readUTF();
			System.out.println(Intromenu);
			// We send the option we chose and the server reads that option
			System.out.println("");
			String opcionMenu1 = scan.next();
			scan.nextLine();
			out.writeUTF(opcionMenu1);
			int opMenu1 = Integer.parseInt(opcionMenu1);
			// from this if the first options of the first menu start
			if (opMenu1 == 1) {
				option_One(sc);
			} else if (opMenu1 == 2) {
				String msjAgente = in.readUTF();
				System.out.println(msjAgente);
				option_Two();
				// and this else is to disconnect the client from the server
			} else {
				String despedida = in.readUTF();
				System.out.println(despedida);
				sc.close();
				System.exit(0);

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void option_One(Socket sc) {
		try {

			String Menu2 = in.readUTF();
			System.out.println(Menu2);

			System.out.println("");
			String opcionMenu2 = scan.next();
			scan.nextLine();
			out.writeUTF(opcionMenu2);
			int opMenu2 = Integer.parseInt(opcionMenu2);
			// we create a menu with switch that is connected to the server menu with its
			// different cases

			if (opMenu2 < 6) {
				createCase();
			} else if (opMenu2 == 6) {
				despedidac = in.readUTF();
				System.out.println(despedidac);
				salir = true;
				sc.close();
			} else {
				System.out.println("no ingreso una opcion valida, volvera al menu");
			}

			salir = false;
			// in this else if the agent's function would go
		} catch (Exception e) {
			System.out.println("error opcion 1");
		}
	}

	public void option_Two() {
		try {
			String line = in.readUTF();
			System.out.println(line);
			String CASE = in.readUTF();
			if (CASE.equals("ACEPTO")) {
				System.out.println(in.readUTF());
				System.out.println(in.readUTF());
				while (exitChat == false) {

					send_Message(out);
					receive_message(in);

				}

				String bye = in.readUTF();
				System.out.println(bye);

			} else if (CASE.equals("DECLINO")) {
				System.out.println(in.readUTF());
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void send_Message(DataOutputStream out) {
		try {
			String mensaje = scan.nextLine();
			if (mensaje.equals("/quit")) {
//				exitChat = true;
				System.exit(0);
			}
			out.writeUTF(mensaje);

		} catch (Exception e) {
			System.out.println("error en envuar cliente");
		}
	}

	public void receive_message(DataInputStream in) {
		try {
			String mensaje = in.readUTF();
			System.out.println(mensaje);
		} catch (Exception e) {
			System.out.println("error en leer cliente");
		}
	}

	public void welcome() {
		try {
			String bienvenida = in.readUTF();
			System.out.println(bienvenida);

			String PreguntaN = in.readUTF();
			System.out.println(PreguntaN);

			System.out.println("");
			String nombre = scan.nextLine();
			out.writeUTF(nombre);

			String bienvenida2 = in.readUTF();
			System.out.println(bienvenida2);

		} catch (Exception e) {
			System.out.println("error welcome usuario");
		}
	}

	public void createCase() {

		try {

			enunciado = in.readUTF();
			System.out.println(enunciado);

			System.out.println(Style(35, " > ingresa la especie del animal:"));
			specie = scan.nextLine();
			out.writeUTF(specie);

			System.out.println(Style(35, " > ingresa el tama�o del animal:"));
			size = scan.nextLine();
			out.writeUTF(size);

			System.out.println(Style(35, " > ingresa la localidad del animal:"));
			location = scan.nextLine();
			out.writeUTF(location);

			System.out.println(Style(35, " > ingresa la direccion del animal:"));
			Address = scan.nextLine();
			out.writeUTF(Address);

			System.out.println(Style(35, " > ingresa tu nombre completo:"));
			personName = scan.nextLine();
			out.writeUTF(personName);

			System.out.println(Style(35, " > ingresa tu numero de celular:"));
			cellphone = scan.nextLine();
			out.writeUTF(cellphone);

			System.out.println(Style(35, " > ingresa tu correo electronico:"));
			emailAddress = scan.nextLine();
			out.writeUTF(emailAddress);

			System.out.println(Style(54, " > ingresa comentario general acerca de la situacion:"));
			comentari = scan.nextLine();
			out.writeUTF(comentari);

			caso = in.readUTF();
			System.out.println(caso);

			despedidac = in.readUTF();
			System.out.println(despedidac);
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
