/*Patron creacional o Builder o construccion como construir una casa */


import modelos.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Usuario usuario1 = new Usuario.UsuarioBuilder("Graciano Monsalve", "Andres Felipe")
                .edad(42)
                // sin telefono
                // sin direccion
                .build();

        Usuario usuario2 = new Usuario.UsuarioBuilder("Diaz Lazzo", "Katerine Juliet")

                .edad(30)
                .telefono("3137592237")
                // sin direccion
                .build();

        Usuario usuario4 = new Usuario.UsuarioBuilder("Fernandez Monsalve", "Neilans Catalina")

                .edad(36)
                .telefono("3012391776")
                .direccion("lejanias")
                .build();
        Usuario usuario3 = new Usuario.UsuarioBuilder("Monsalve Vargas", "Luz Milena")

                // sin edad .edad(36)
                // sin telefono
                // sin direccion
                .build();

        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println(usuario3);
        System.out.println(usuario4);

    }

}
