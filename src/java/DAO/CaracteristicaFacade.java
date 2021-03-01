/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ec.edu.itq.programacion2.Hotel2.Caracteristica;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author User
 */
@Stateless
public class CaracteristicaFacade extends AbstractFacade<Caracteristica> {

    @PersistenceContext(unitName = "Hotel2PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CaracteristicaFacade() {
        super(Caracteristica.class);
    }
    
}
