package com.example.dioexplorandopadroesdeprojetonapraticacomjavaSURF;

import org.springframework.stereotype.Component;

@Component
final class OndaFechando implements Ondas {
    @Override
    public void manobrar() {
        System.out.println("Voando alto com um aéreo rodado!");
    }
}

