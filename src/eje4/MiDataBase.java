package eje4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MiDataBase {

	private static String       DRIVER = "com.mysql.jdbc.Driver";
	private static String       URL_DB = "jdbc:mysql://localhost:3306/";
	protected static String     DB     = "rest";                        // nombre de mi BD
	protected static String     user   = "root";
	protected static String     pass   = "";
	protected static Connection conn   = null;

	public MiDataBase() {

	}

//-----------------------------------------------------------------------
	private void connect() {
		try {
			conn = DriverManager.getConnection(URL_DB + DB + "?useSSL=false", user, pass);
		} catch (SQLException sqlEx) {
			System.out.println("No se ha podido conectar a " + URL_DB + DB + ". " + sqlEx.getMessage());
			System.out.println("Error al cargar el driver");
		}
	}

	private void disconnect() {
		if (conn != null) {
			try {
				conn.close();
				conn = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

//----------------------------------------------------------------------- 

	public void registrar(String datos) { // recibir�a una persona para los gets

		this.connect();

		String arreglo[] = separarDatos(datos);
		try {
			PreparedStatement statement = conn // "INSERT INTO participante(Nombre,id_part,DNI,Puntos)--> van los campos
												// de la tabla
					.prepareStatement("INSERT INTO usuario(userId,id,title,body) " + "VALUES (?,?,?,?)");
			statement.setString(1, arreglo[0]); // campos
			statement.setString(2, arreglo[1]);
			statement.setString(3, arreglo[2]);
			statement.setString(4, arreglo[3]);
			// System.out.println("Se conecto");
			statement.executeUpdate(); //

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.disconnect();
		}

	}

	private String[] separarDatos(String datos) {

		String   separados[] = datos.split(",");

		String[] arreglo     = { separados[0], separados[1], separados[2], separados[3] };

		return arreglo;

	}
}