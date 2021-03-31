package co.edu.unbosque.Controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public Client() {
		Scanner scan = new Scanner(System.in);
// the host and port variables are the connections for the server, they must be left the same in both the server class and the client class
		String Host = "127.0.0.1";
		int puerto = 5000;
		DataInputStream in;
		DataOutputStream out;

//are the local variables that we use in the program
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

		try {
			Socket sc = new Socket(Host, puerto);
//DataInputStream helps us to read a message
			in = new DataInputStream(sc.getInputStream());
//DataoutputStream helps us to write a message			
			out = new DataOutputStream(sc.getOutputStream());

//started welcoming the client only by reading the messages sent by the server			
			String bienvenida = in.readUTF();
			System.out.println(bienvenida);

			String PreguntaN = in.readUTF();
			System.out.println(PreguntaN);

			System.out.println("");
			String nombre = scan.nextLine();
			out.writeUTF(nombre);

			String bienvenida2 = in.readUTF();
			System.out.println(bienvenida2);

			String Intromenu = in.readUTF();
			System.out.println(Intromenu);

//We send the option we chose and the server reads that option			
			System.out.println("");
			String opcionMenu1 = scan.next();
			scan.nextLine();
			out.writeUTF(opcionMenu1);
			int opMenu1 = Integer.parseInt(opcionMenu1);
//from this if the first options of the first menu start
			if (opMenu1 == 1) {
				while (!salir) {
					String Menu2 = in.readUTF();
					System.out.println(Menu2);

					System.out.println("");
					String opcionMenu2 = scan.next();
					scan.nextLine();
					out.writeUTF(opcionMenu2);
					int opMenu2 = Integer.parseInt(opcionMenu2);
//we create a menu with switch that is connected to the server menu with its different cases					
					switch (opMenu2) {
					case 1:
						String case1 = in.readUTF();
						System.out.println(case1);

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
						break;
					case 2:

						String case2 = in.readUTF();
						System.out.println(case2);
						System.out.println("------------------------------------------------");
						System.out.println("ingresa la especie del animal:");
						specie = scan.nextLine();
						out.writeUTF(specie);

						System.out.println("ingresa el tama�o del animal:");
						size = scan.nextLine();
						out.writeUTF(size);

						System.out.println("ingresa la localidad del animal:");
						location = scan.nextLine();
						out.writeUTF(location);

						System.out.println("ingresa la direccion del animal:");
						Address = scan.nextLine();
						out.writeUTF(Address);

						System.out.println("ingresa tu nombre completo:");
						personName = scan.nextLine();
						out.writeUTF(personName);

						System.out.println("ingresa tu numero de celular:");
						cellphone = scan.nextLine();
						out.writeUTF(cellphone);

						System.out.println("ingresa tu correo electronico:");
						emailAddress = scan.nextLine();
						out.writeUTF(emailAddress);

						System.out.println("ingresa comentario general acerca de la situacion:");
						comentari = scan.nextLine();
						out.writeUTF(comentari);

						caso = in.readUTF();
						System.out.println(caso);

						despedidac = in.readUTF();
						System.out.println(despedidac);
						break;

					case 3:

						String case3 = in.readUTF();
						System.out.println(case3);

						System.out.println("------------------------------------------------");
						System.out.println("ingresa la especie del animal:");
						specie = scan.nextLine();
						out.writeUTF(specie);

						System.out.println("ingresa el tama�o del animal:");
						size = scan.nextLine();
						out.writeUTF(size);

						System.out.println("ingresa la localidad del animal:");
						location = scan.nextLine();
						out.writeUTF(location);

						System.out.println("ingresa la direccion del animal:");
						Address = scan.nextLine();
						out.writeUTF(Address);

						System.out.println("ingresa tu nombre completo:");
						personName = scan.nextLine();
						out.writeUTF(personName);

						System.out.println("ingresa tu numero de celular:");
						cellphone = scan.nextLine();
						out.writeUTF(cellphone);

						System.out.println("ingresa tu correo electronico:");
						emailAddress = scan.nextLine();
						out.writeUTF(emailAddress);

						System.out.println("ingresa comentario general acerca de la situacion:");
						comentari = scan.nextLine();
						out.writeUTF(comentari);

						caso = in.readUTF();
						System.out.println(caso);

						despedidac = in.readUTF();
						System.out.println(despedidac);

						break;

					case 4:

						String case4 = in.readUTF();
						System.out.println(case4);

						System.out.println("------------------------------------------------");
						System.out.println("ingresa la especie del animal:");
						specie = scan.nextLine();
						out.writeUTF(specie);

						System.out.println("ingresa el tama�o del animal:");
						size = scan.nextLine();
						out.writeUTF(size);

						System.out.println("ingresa la localidad del animal:");
						location = scan.nextLine();
						out.writeUTF(location);

						System.out.println("ingresa la direccion del animal:");
						Address = scan.nextLine();
						out.writeUTF(Address);

						System.out.println("ingresa tu nombre completo:");
						personName = scan.nextLine();
						out.writeUTF(personName);

						System.out.println("ingresa tu numero de celular:");
						cellphone = scan.nextLine();
						out.writeUTF(cellphone);

						System.out.println("ingresa tu correo electronico:");
						emailAddress = scan.nextLine();
						out.writeUTF(emailAddress);

						System.out.println("ingresa comentario general acerca de la situacion:");
						comentari = scan.nextLine();
						out.writeUTF(comentari);

						caso = in.readUTF();
						System.out.println(caso);

						despedidac = in.readUTF();
						System.out.println(despedidac);

						break;

					case 5:
						String case5 = in.readUTF();
						System.out.println(case5);

						System.out.println("------------------------------------------------");
						System.out.println("ingresa la especie del animal:");
						specie = scan.nextLine();
						out.writeUTF(specie);

						System.out.println("ingresa el tama�o del animal:");
						size = scan.nextLine();
						out.writeUTF(size);

						System.out.println("ingresa la localidad del animal:");
						location = scan.nextLine();
						out.writeUTF(location);

						System.out.println("ingresa la direccion del animal:");
						Address = scan.nextLine();
						out.writeUTF(Address);

						System.out.println("ingresa tu nombre completo:");
						personName = scan.nextLine();
						out.writeUTF(personName);

						System.out.println("ingresa tu numero de celular:");
						cellphone = scan.nextLine();
						out.writeUTF(cellphone);

						System.out.println("ingresa tu correo electronico:");
						emailAddress = scan.nextLine();
						out.writeUTF(emailAddress);

						System.out.println("ingresa comentario general acerca de la situacion:");
						comentari = scan.nextLine();
						out.writeUTF(comentari);

						caso = in.readUTF();
						System.out.println(caso);

						despedidac = in.readUTF();
						System.out.println(despedidac);

						break;

					case 6:
						despedidac = in.readUTF();
						System.out.println(despedidac);
						salir = true;
						sc.close();

						break;

					default:
						String error = in.readUTF();
						System.out.println(error);
					}

				}
//in this else if the agent's function would go
			} else if (opMenu1 == 2) {
				String msjAgente = in.readUTF();
				System.out.println(msjAgente);
//and this else is to disconnect the client from the server
			} else {
				String despedida = in.readUTF();
				System.out.println(despedida);
				sc.close();
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
