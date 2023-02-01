package com.proyect.ProyectJWT.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PassGen {

    public static void main(String[] args) {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String pass1 = "admin";
        String pass2 = "jonantan";
        System.out.println(encoder.encode(pass1));
        System.out.println(encoder.encode(pass2));

    }
}
//"admin"
//$2a$10$rJ5.HsQcmsP3BlpoYLib3O8ZyZ8eyjFEoT3tjc4DV.lKPeappxf2K
//jonatan
//$2a$10$8szqqZ/6giezBbwupOdhE.jZ8o1FU5TiWCBiKHjzA89maCpt6ndWO
