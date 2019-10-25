/* 
 * Copyright 2019 Manu Portolés Zagalá.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class main {

    /**
     * /* @param args the command line arguments
     */
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        double dDia;
        double diCa;
        final double DIST_SAG_SAN = 980;
        double diCar;
        try {
            System.out.print("Desplazamiento diario (km) ...: ");
            dDia = SCN.nextDouble();
            diCa = DIST_SAG_SAN / dDia;

            System.out.printf("%s %d %n", "Días de Clases/Camino ........:",
                    (int) diCa < diCa ? (int) diCa + 1 : (int) diCa);
        } catch (Exception e) {
            System.out.println("Error, teclee solo números");
        } finally {
            SCN.nextLine();
        }
    }

}
