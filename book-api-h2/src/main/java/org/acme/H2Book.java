package org.acme;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "h2book")
public class H2Book {

    @Id
    @GeneratedValue
    public Long id;

    public String uuid;

    public String name;
    @Column(name = "persistence")
    public String from;

    public H2Book() {
        //
    }

    public H2Book(String uuid, String name, String from) {
        super();
        this.uuid = uuid;
        this.name = name;
        this.from = from;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

}
