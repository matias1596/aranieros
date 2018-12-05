/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoavanzada;

import java.awt.Point;
import proyectoavanzada.Poligonos.RectanguloAgregacion;

/**
 *
 * @author Pablo
 */
public class Agregacion {
    
    public Relacion relacion;
    public Point puntoCentral;
    public RectanguloAgregacion rectangulo;
    
    public Agregacion(Relacion relacion) {
        this.puntoCentral=relacion.poligono.punto;
        
        Entidad entidad1 = relacion.entidadesSelec.get(0);
        Entidad entidad2 = relacion.entidadesSelec.get(1);
        entidad1.rectangulo.PosicionAgregacionIzq(puntoCentral);
        entidad2.rectangulo.PosicionAgregacionDer(puntoCentral);
        
        this.relacion = relacion;
    }
        
    public void DibujarRectangulo(){
        //recorrer todos los elementos de entidades y la relacion(atributos)
        //para calcular el rango del rectangulo
        //punto1 = superior izquierdo
        //punto2 = inferior derecho
        Point punto1=puntoCentral;
        Point punto3=puntoCentral;

        punto1.x=300;
        punto1.y=300;
        
        punto3.x=500;
        punto3.y=500;

        this.rectangulo = new RectanguloAgregacion(punto1,punto3);
    }
    

}
