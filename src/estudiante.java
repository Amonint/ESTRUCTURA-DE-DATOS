
public class estudiante {
    public int id;
    public String nombre;
    public int edad;
    public int[] notas = new int[3];

    public estudiante(int _id, String _nombre, int _edad, int _n1, int _n2,
            int _n3) {
        this.id = _id;
        this.nombre = _nombre;
        this.edad = _edad;
        this.notas[0] = _n1;
        this.notas[1] = _n2;
        this.notas[2] = _n3;
    }
}
