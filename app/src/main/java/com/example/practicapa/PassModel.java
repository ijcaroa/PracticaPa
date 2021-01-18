package com.example.practicapa;

public class PassModel {

    private int indexCharacter;

    //extensión
    public boolean caracterExtension(String pass) {
        return pass.length() < 5;

    }

    // Mayusculas
    public boolean verificarMayusc(String pass) {
        return pass.toLowerCase().equals(pass);

    }

    //probar ambas condiciones
    public String verificarPass(String pass) {

        if (caracterExtension(pass)) {
            return "Weak";
        } else {
            if (verificarMayusc(pass)) {
                return "Medium";
            } else {
                return "Strong";


            }
        }
    }
}





