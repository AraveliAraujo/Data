package dao;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "tramites")
@SessionScoped
public class Tramites implements Serializable {

    public Tramites() {
    }

}
