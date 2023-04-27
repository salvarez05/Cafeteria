import java.util.ArrayList;

public class Cafeteria {
    public String nombre;
    public String direccion;
    public String redesSociales;

    public void setRedesSociales(String redesSociales) {
        this.redesSociales = redesSociales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getRedesSociales() {
        return redesSociales;
    }

    public static void main(String[] args) {
        ArrayList<Cafe> cafes = new ArrayList<>();
        cafes.add(new Cafe("Normal", 4.3F, 9, "mediano"));
        cafes.add(new Cafe("Latte", 8F, 15, "grande"));
        for (int i = 0; i < cafes.size(); i++) {
            cafes.get(i).toString();
            System.out.println(cafes.get(i));
        }
    }
}


