/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entity.Areas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Araveli Araujo
 */
@Stateless
public class AreasFacade extends AbstractFacade<Areas> {

    @PersistenceContext(unitName = "DataPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AreasFacade() {
        super(Areas.class);
    }
    
}
