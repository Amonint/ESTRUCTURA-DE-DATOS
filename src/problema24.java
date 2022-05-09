import java.util.Scanner;


public  class problema24 {
    public class metodosrrestudiante {

    Scanner entrada;
    estudiante Aula[];
    
    int ev;
    

    public metodosrrestudiante(int lim) {
        this.entrada = new Scanner(System.in);
        this.Aula = new estudiante[lim];
        this.ev = 0;
    }
    

    public int menu() {
        int op;
        System.out.println("Ingresar nuevo estudiante       [1]");
        System.out.println("Presentar lista de estudiantes  [2]");
        System.out.println("Ingresar nuevo estudiante       [3]");
        System.out.println("Ingresar nuevo estudiante       [4]");
        System.out.println("Eliminar estudiante             [5]");
        System.out.println("Salir                           [0]");
        op = entrada.nextInt();
        return op;
    }

    public boolean AulaLlena() {
        if (ev == Aula.length) {
            return true;
        } else {
            return false;
        }
    }

    public void Ingresar() {
        int _id, _edad, _n1, _n2, _n3;
        String _nombre;
        if (AulaLlena()) {
            System.out.println("Lo siento, ya no hay espacio");
        } else {
            System.out.println("Ingrese Id: ");
            _id = entrada.nextInt();
            System.out.println("Ingrese e, nombre: ");
            _nombre = entrada.nextLine();
            System.out.println("Ingrese edad: ");
            _edad = entrada.nextInt();
            System.out.println("Ingrese nota 1: ");
            _n1 = entrada.nextInt();
            System.out.println("Ingrese nota 2: ");
            _n2 = entrada.nextInt();
            System.out.println("Ingrese nota 3: ");
            _n3 = entrada.nextInt();
            Aula[ev] = new estudiante(_id, _nombre, _edad, _n1, _n2, _n3);
            ev++;
        }
    }
    public void Listar(){
        for (int i = 0; i<ev; i++){
            System.out.println("Id: " + Aula[i].id + "\nNombre: "+ 
                    Aula[i].nombre + "\nEdad: "+Aula[i].edad + "\nNota 1: " +
                    Aula[i].notas[0] + "\nNota 2: " + Aula[i].notas[1] + 
                    "\nNota 3: " + Aula[i].notas[2] + "\nPromedio: " +
                    (Aula[i].notas[0]+ Aula[i].notas[1] + Aula[i].notas[2])/3);
        }
    }
}
}
