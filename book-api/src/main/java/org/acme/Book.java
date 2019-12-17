package org.acme;

/**
 * Book
 */
public class Book {

    public String uuid;

    public String name;
    public String from;

    public Book() {
        //
    }

    public Book(String uuid, String name, String from) {
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

    @Override
    public String toString() {
        return "Book [uuid=" + uuid + ", name=" + name + ", from=" + from + "]";
    }

}