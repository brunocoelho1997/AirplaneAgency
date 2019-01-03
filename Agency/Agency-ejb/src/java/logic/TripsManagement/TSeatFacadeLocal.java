/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.TripsManagement;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author bruno
 */
@Local
public interface TSeatFacadeLocal {

    void create(TSeat tSeat);

    void edit(TSeat tSeat);

    void remove(TSeat tSeat);

    TSeat find(Object id);

    List<TSeat> findAll();

    List<TSeat> findRange(int[] range);

    int count();
    
}