/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DepJutiapa;

/**
 *
 * @author GredysMorales
 */
public class ID {

    public char MunisDepJut(String s) {
        char idmuni = '%';
        switch (s) {
            case "Agua Blanca":
                idmuni = 'a';
                break;
            case "Santa Catarina Mita":
                idmuni = 'b';
                break;
            case "Asuncion Mita":
                idmuni = 'c';
                break;
            case "El Progreso":
                idmuni = 'd';
                break;
            case "Atescatempa":
                idmuni = 'e';
                break;
            case "Conguaco":
                idmuni = 'f';
                break;
            case "El Adelanto":
                idmuni = 'g';
                break;
            case "Zapotitlan":
                idmuni = 'h';
                break;
            case "Yupiltepeque":
                idmuni = 'i';
                break;
            case "Pasaco":
                idmuni = 'j';
                break;
            case "Moyuta":
                idmuni = 'k';
                break;
            case "San Jose Acatempa":
                idmuni = 'l';
                break;
            case "Quezada":
                idmuni = 'm';
                break;
            case "Jutiapa":
                idmuni = 'n';
                break;
            case "Jerez":
                idmuni = 'o';
                break;
            case "Comapa":
                idmuni = 'p';
                break;
            case "Jalpatagua":
                idmuni = 'q';
                break;

        }
        return idmuni;

    }

}
