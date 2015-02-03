package es.open4job.aytozgz.opendata.model.dao;

import java.util.ArrayList;

import es.open4job.aytozgz.opendata.model.vo.AparcamientosPublicosVO;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;


public class Datos implements JRDataSource {
	
	private ArrayList<AparcamientosPublicosVO> lista = new ArrayList<AparcamientosPublicosVO>();
    private int indiceParticipanteActual = -1;
    
    public Object getFieldValue(JRField jrf) throws JRException
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Object getFieldValue() throws JRException, ClassNotFoundException
    { 
        Object valor = null;  
        
        AparcamientosPublicosDAO objAparcamiento= new AparcamientosPublicosDAO();
        
        valor= objAparcamiento.getListadoAparcamientos();

        return valor; 
    }

    public boolean next() throws JRException
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
