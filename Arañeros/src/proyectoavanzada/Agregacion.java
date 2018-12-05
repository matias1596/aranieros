/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoavanzada;

/**
 *
 * @author Pablo
 */
public class Agregacion {
    
    public Relacion relacion;

    public Agregacion(Relacion relacion) {
        Entidad entidad1 = relacion.entidadesSelec.get(0);
        Entidad entidad2 = relacion.entidadesSelec.get(1);
        entidad1.rectangulo.PosicionAgregacionIzq(relacion.poligono.punto);
        entidad2.rectangulo.PosicionAgregacionDer(relacion.poligono.punto);
        this.relacion = relacion;
    }
        
    

}
