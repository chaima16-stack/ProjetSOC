package entities;

import java.util.Date;

public class Incident {

    private long id;
   private String typeincident;

    private String source;

   private Date date_incident;

   private String description;
public Incident(){}
    public Incident(long id, String typeincident, String source, Date date_incident, String description) {
        this.id = id;
        this.typeincident = typeincident;
        this.source = source;
        this.date_incident = date_incident;
        this.description = description;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setTypeincident(String typeincident) {
        this.typeincident = typeincident;
    }
    public void setSource(String source) {
        this.source = source;
    }

    public void setDate_incident(Date date_incident) {
        this.date_incident = date_incident;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public long getId() {
        return id;
    }
    public String getTypeincident() {
        return typeincident;
    }
    public String getSource() {
        return source;
    }
    public Date getDate_incident() {
        return date_incident;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Incident [id=" + id + ", typeincident=" + typeincident + ", source=" + source + ", date_incident="
                + date_incident + ", description=" + description + "]";
    }



}

