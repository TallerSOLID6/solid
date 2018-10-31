/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1ocp.bien;

/**
 *
 * @author Miguel Angel
 */
public abstract class Ataque implements ManejadorAtaque {

    protected Pokemon pokemon;

    public Ataque(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
    
}
