package com.si;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class complaintService implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        // Hent complaint-værdien fra processens variabler
        String complaint = (String) execution.getVariable("klage");

        // Check om complaint er null eller ej
        if (complaint != null) {
            // Successfuld behandling
            System.out.println("Successfuld behandling (true)");
            // Her kan du tilføje yderligere logik eller handlinger, der skal udføres
            execution.setVariable("isSuccessful", false);
        } else {
            // Mislykket behandling
            System.out.println("Mislykket behandling (false)");
            // Her kan du tilføje yderligere logik eller handlinger, der skal udføres i tilfælde af mislykket behandling
            execution.setVariable("isSuccessful", true);
        }
    }
}