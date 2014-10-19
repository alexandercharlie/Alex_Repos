/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceTest;

/**
 *
 * @author Manjeet Kumar
 */
public class God {}
class Human extends God{}
class Man extends Human{}
interface Woman{}// extends Human{}
class Child extends Man implements Woman{}

