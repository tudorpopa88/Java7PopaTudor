/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricalfigures;

/**
 *
 * @author tudor
 */
public class Triangle extends GeometricalFigure implements Plane {
    private final String definition = " with three straight sides and three angles.";

    @Override
    public String getDefinition() {
        String response = "TRIANGLE: " + 
                Plane.definition + 
                " " + 
                super.getDefinition() + 
                definition;
        return response;
    }
    
    
}
