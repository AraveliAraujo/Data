/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entity.Tramites;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Araveli Araujo
 */
@Stateless
public class TramitesFacade extends AbstractFacade<Tramites> {

    @PersistenceContext(unitName = "DataPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TramitesFacade() {
        super(Tramites.class);
    }
    
}
