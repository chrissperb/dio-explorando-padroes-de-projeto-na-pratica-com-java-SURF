package com.example.dioexplorandopadroesdeprojetonapraticacomjavaSURF;

import org.springframework.stereotype.Component;

@Component
final class OndaCavada implements Ondas {
    @Override
    public void manobrar() {
        System.out.println("Dando uma batida vertical!");
    }
}
