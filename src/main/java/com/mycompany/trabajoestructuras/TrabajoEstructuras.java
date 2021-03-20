package com.mycompany.trabajoestructuras;

import javax.swing.JOptionPane;

public class TrabajoEstructuras {

    public static void main(String[] args) {

        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "MENÚ\n"
                    + "1. Registrar Mascotas.\n"
                    + "2. Ver reporte mascotas.\n"
                    + "3. Consultar por especie y color.\n"
                    + "4. Salir."));

            switch (opcion) {
                case 1:
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "¡Gracias!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, intente de nuevo.");
                    break;
            }
        } while (opcion != 4);
        
        //Hola Mundo
        
    }

}
