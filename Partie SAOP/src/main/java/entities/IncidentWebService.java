package entities;

import entities.Incident;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import services.IncidentService;

import java.util.List;

@WebService
public class IncidentWebService {
    
        private IncidentService incidentService;

        public IncidentWebService() {

            this.incidentService = new IncidentService();
        }

        @WebMethod
        public void ajouterIncident(@WebParam(name = "incident") Incident incident) {
            incidentService.ajouterIncident(incident);
        }

        @WebMethod
        public void mettreAJourIncident(@WebParam(name = "incidentId") long incidentId,
                                        @WebParam(name = "newIncident") Incident newIncident) {
            incidentService.mettreAJourIncident(incidentId, newIncident);
        }

        @WebMethod
        public void supprimerIncident(@WebParam(name = "incidentId") long incidentId) {
            incidentService.supprimerIncident(incidentId);
        }

        @WebMethod
        public List<Incident> obtenirTousIncidents() {
            return incidentService.obtenirTousIncidents();
        }

        @WebMethod
        public Incident obtenirIncidentParId(@WebParam(name = "incidentId") long incidentId) {
            return incidentService.obtenirIncidentParId(incidentId);
        }
    
}
