/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja43;

/**
 * Classe Voiture
 * @author stagjava
 */
public class Voiture {
    String couleur;
    private String marque;
    String modele;
    int compteur = 0;
    Boolean estDemarree = false;
    
    public Voiture (String marque, String modele, String couleur) {
        setMarque(marque);
        this.modele = modele;
        this.couleur = couleur;
    }
    
    public void demarrer() {
        estDemarree = true;
    } 

    public void avancer(int km) {
        compteur = compteur + km;
        
    }
    
    public void arreter() {
        estDemarree = false;
    } 
    public void afficher() {
        System.out.println("Couleur: "  + couleur);
        System.out.println("marque: "  + marque);
        System.out.println("modele: "  + modele);
        System.out.println("compteur: "  + compteur);
        System.out.println("Est démarrée: "  + estDemarree);
    }
    
    public void setMarque(String marque) {
        if (marque.equals("Renault") || marque.equals("Dacia"))  {
            this.marque = marque;
        } else {
            System.out.println("Marque invalide");
        }
    }
}
