/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import model.Circle;
import model.Rectangle;
import model.Circle;
import model.Triangle;

/**
 *
 * @author lekha
 */
public class Main {
    public static void main(String[] args) {
        Validation vl = new Validation();
         Rectangle rectangle = vl.inputRectangle();
        Circle circle = vl.inputCircle();
        Triangle trigle = vl.inputTriangle();

        vl.display(trigle, rectangle, circle);
    }
    }

