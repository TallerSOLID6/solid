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
public class Ataque_aire extends Ataque {
    

    public Ataque_aire(Pokemon pokemon) {
        super(pokemon);
    }
    @Override
    public void manejarAtaque() {
        this.pokemon.setPorcentajeVida(this.pokemon.getPorcentajeVida()*0.80);
    }

}
