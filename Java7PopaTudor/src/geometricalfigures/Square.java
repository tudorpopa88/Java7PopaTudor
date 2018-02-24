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
public class Square extends GeometricalFigure implements Plane {
    private final String definition = " with four equal straight sides and four right angles.";
    
    @Override
    public String getDefinition() {
        String response = "SQUARE: " + 
                Plane.definition + 
                " " + 
                super.getDefinition() + 
                definition;
        return response;
    }
}
