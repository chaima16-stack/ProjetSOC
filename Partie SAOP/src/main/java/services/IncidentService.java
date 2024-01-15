package services;

import entities.Incident;

import java.util.ArrayList;
import java.util.List;

public class IncidentService {

    private List<Incident> incidents;

    public IncidentService() {
        this.incidents = new ArrayList<>();
    }

    public void ajouterIncident(Incident incident) {
        incidents.add(incident);
    }

    public void mettreAJourIncident(long incidentId, Incident newIncident) {

        Incident incidentToUpdate = obtenirIncidentParId(incidentId);

        if (incidentToUpdate != null) {

            incidentToUpdate.setTypeincident(newIncident.getTypeincident());
            incidentToUpdate.setSource(newIncident.getSource());
            incidentToUpdate.setDate_incident(newIncident.getDate_incident());
            incidentToUpdate.setDescription(newIncident.getDescription());
        }

    }


    public void supprimerIncident(long incidentId) {

        incidents.removeIf(incident -> incident.getId() == incidentId);
    }

    public List<Incident> obtenirTousIncidents() {
        return incidents;
    }

    public Incident obtenirIncidentParId(long incidentId) {
        return incidents.stream()
                .filter(incident -> incident.getId() == incidentId)
                .findFirst()
                .orElse(null);
    }



}
