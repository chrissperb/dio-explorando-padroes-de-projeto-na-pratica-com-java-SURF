package com.example.dioexplorandopadroesdeprojetonapraticacomjavaSURF;

import org.springframework.stereotype.Component;

@Component
final class OndaAchatada implements Ondas {
    @Override
    public void manobrar() {
        System.out.println("Fazendo um cutback com muito estilo...");
    }

}
