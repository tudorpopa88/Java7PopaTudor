/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricalfigures;

import geometricalfigures.GeometricalFigure;

/**
 *
 * @author tudor
 */
public class Circle extends GeometricalFigure implements Plane {
    private final String definition = " whose boundary (the circumference) consists of \n" +
"points equidistant from a fixed point (the centre).";
    
    @Override
    public String getDefinition() {
        String response = "CIRCLE: " + 
                Plane.definition + 
                " " + 
                super.getDefinition() + 
                definition;
        return response;
    }
}
