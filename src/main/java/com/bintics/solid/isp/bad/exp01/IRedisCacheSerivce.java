package com.bintics.solid.isp.bad.exp01;

public interface IRedisCacheSerivce {

    // Posiblemente el método record es reflejo de la implementación propiamente de redis.
    void record(Object ... obj);

}
