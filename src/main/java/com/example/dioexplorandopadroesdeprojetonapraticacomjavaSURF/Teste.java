package com.example.dioexplorandopadroesdeprojetonapraticacomjavaSURF;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Teste {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Obtenha instâncias das três estratégias
        Ondas ondaCavada = context.getBean(OndaCavada.class);
        Ondas ondaAchatada = context.getBean(OndaAchatada.class);
        Ondas ondaFechando = context.getBean(OndaFechando.class);

        // Chame o método manobrar para cada estratégia
        System.out.println("Manobrando na Onda Cavada:");
        ondaCavada.manobrar();

        System.out.println("\nManobrando na Onda Achatada:");
        ondaAchatada.manobrar();

        System.out.println("\nManobrando na Onda Fechando:");
        ondaFechando.manobrar();
    }
}

