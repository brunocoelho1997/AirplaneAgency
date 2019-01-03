/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.LogsManagement;

import java.util.List;
import javax.ejb.Local;

@Local
public interface LogsManagerLocal {
    
    List<TLogDTO> getAllLogs();
    
    TLogDTO getLogsByUser(String username);
    
    boolean addLog(TLogDTO logDTO);
    
}