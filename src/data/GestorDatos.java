package data;

import model.CentroCultivo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GestorDatos {

    public List<CentroCultivo> listaCentroCultivo(String nombreArchivo) {
        List<CentroCultivo> listaCentro = new ArrayList<>();

        try {
            // Usar getResourceAsStream directamente
            InputStream recurso = getClass().getClassLoader().getResourceAsStream(nombreArchivo);

            if (recurso == null) {
                System.err.println("Recurso no encontrado: " + nombreArchivo);
                System.err.println("Buscar en: " + getClass().getClassLoader().getResource(""));
                return listaCentro; // Retorna lista vacía en lugar de lanzar excepción
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(recurso));
            String linea;
            int nroLinea = 0;

            while ((linea = br.readLine()) != null) {
                nroLinea++;
                if (linea.trim().isEmpty()) continue;

                // Separar por ;
                String[] partes = linea.split(";");
                if (partes.length != 3) {
                    System.err.println("Error en línea " + nroLinea + ": formato inválido - " + linea);
                    continue;
                }

                String centroName = partes[0].trim();
                String comuna = partes[1].trim();
                String toneladaStr = partes[2].trim();

                try {
                    double toneladas = Double.parseDouble(toneladaStr);
                    CentroCultivo centroCultivo = new CentroCultivo(centroName, comuna, toneladas);
                    listaCentro.add(centroCultivo);
                } catch (NumberFormatException ex) {
                    System.err.println("Toneladas no es número en la línea " + nroLinea + ": " + toneladaStr);
                }
            }

            br.close();
            recurso.close();

        } catch (Exception e) {
            System.err.println("Ocurrió un error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }

        return listaCentro;
    }
}
