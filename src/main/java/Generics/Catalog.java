package Generics;

import java.util.ArrayList;
import java.util.List;

public class Catalog<Q> {
    private Q catalog;
    private List<Q> listOfCatalogs;

    public Catalog(Q catalog, List<Q> listOfCatalogs) {
        this.catalog = catalog;
        this.listOfCatalogs = listOfCatalogs;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "catalog=" + catalog +
                ", listOfCatalogs=" + listOfCatalogs +
                '}';
    }

    public Catalog() {
    }

    public Q getCatalog() {
        return catalog;
    }

    public void setCatalog(Q catalog) {
        this.catalog = catalog;
    }

    public List<Q> getListOfCatalogs() {
        return listOfCatalogs;
    }

    public void setListOfCatalogs(List<Q> listOfCatalogs) {
        this.listOfCatalogs = listOfCatalogs;
    }

    public void setListOfCatalogs(Q catalog) {
        if (this.listOfCatalogs==null){
            this.listOfCatalogs = new ArrayList<>();
        }
            this.listOfCatalogs.add(catalog);

    }
}
