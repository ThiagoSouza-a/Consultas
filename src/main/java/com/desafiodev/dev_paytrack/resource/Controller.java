package com.desafiodev.dev_paytrack.resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafiodev.dev_paytrack.entities.Veterinario;
import com.desafiodev.dev_paytrack.service.Consulta;

@RestController
@RequestMapping("/consultas")
public class Controller {
	
    @PostMapping("/agruparConsultas")
    public ResponseEntity<List<Veterinario>> agruparConsultas(@RequestBody List<Consulta> consultas) {
        Map<String, Veterinario> veterinariosFicha = new HashMap<>();

        for (Consulta consulta : consultas) {
            String nomeVeterinario = consulta.getNomeVeterinario();
            veterinariosFicha.putIfAbsent(nomeVeterinario, new Veterinario(nomeVeterinario, 0.0, new ArrayList<>()));
            Veterinario veterinario = veterinariosFicha.get(nomeVeterinario);
            veterinario.getConsultas().add(consulta);
            veterinario.setValorTotalConsultas(veterinario.getValorTotalConsultas() + consulta.getValorConsulta());
        }

        List<Veterinario> resultado = new ArrayList<>(veterinariosFicha.values());

        return ResponseEntity.ok(resultado);
    }

}
