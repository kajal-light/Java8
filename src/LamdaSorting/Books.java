package LamdaSorting;

import java.util.Objects;

public class Books {
private int id;
private String name;
private int page;

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", page=" + page +
                '}';
    }

    public Books(int id, String name, int page) {
        this.id = id;
        this.name = name;
        this.page = page;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return id == books.id && page == books.page && Objects.equals(name, books.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, page);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setId(int id) {
        this.id = id;
    }
}
