package br.com.kirgh.app.projections;

import java.util.Date;

import br.com.kirgh.app.enums.Power;

public interface ApplianceProjection {
    
    byte[] getId();

    String getName();

    String getBrand();

    String getModel();

    Power getPower();
    
}
