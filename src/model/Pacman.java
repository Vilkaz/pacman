package model;// Model.Pacman.java

import ch.aplu.jgamegrid.*;

public class Pacman extends Actor
{

  private final int STEPSIZE =1;

  public Pacman()
  {
    super("sprites/pacman_0.gif");
  }

  public void moveRight(){
    this.setDirection(0);
    this.move(STEPSIZE);
  }
  public void moveDown(){
    this.setDirection(90);
    this.move(STEPSIZE);
  }
  public void moveLeft(){
    this.setDirection(180);
    this.move(STEPSIZE);
  }
  public void moveTop(){
    this.setDirection(270);
    this.move(STEPSIZE);
  }


  public void act()
  {
   
  }
}

