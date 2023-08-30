package modelos;

public class Usuario {

    private final String nombres;
    private final String apellidos;

    private final int edad;

    private final String telefono;
    private final String direccion;

    public Usuario(UsuarioBuilder builder) {
        this.apellidos = builder.apellidos;
        this.nombres = builder.nombres;
        this.edad = builder.edad;
        this.telefono = builder.telefono;
        this.direccion = builder.direccion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {

        return "Usuario: " + this.apellidos + " " +
                this.nombres + ", " +
                this.edad + ", " +
                this.telefono + ", " +
                this.direccion;

    }

    public static class UsuarioBuilder {

        private String nombres;
        private String apellidos;

        private int edad;

        private String telefono;
        private String direccion;

        public UsuarioBuilder(String apellidos, String nombres) {

            this.apellidos = apellidos;
            this.nombres = nombres;

        }

        public UsuarioBuilder edad(int edad) {

            this.edad = edad;
            return this;
        }

        public UsuarioBuilder telefono(String telefono) {

            this.telefono = telefono;
            return this;
        }

        public UsuarioBuilder direccion(String direccion) {

            this.direccion = direccion;
            return this;
        }

        public Usuario build() {
            Usuario usuario = new Usuario(this);
            validarUsuario(usuario);

            return usuario;

        }

        private void validarUsuario(Usuario usuario) {
            // hacer validaciones
        }

    }

}
