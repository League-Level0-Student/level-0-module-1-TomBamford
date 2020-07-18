
PImage pepperoni;
void setup() {
  noStroke();
    size(500,500);
    fill(#F7B955);
    ellipse(250,250,250,250);
    fill(#FF4044);
    ellipse(250,250,230,230);
    fill(#FFDF29);
    ellipse(250,250,200,200);
    pepperoni = loadImage("pepperoni.jpeg");
}
void draw() {
  if(mousePressed) {
  pepperoni.resize(50,55);
  image(pepperoni,270,270);
  image(pepperoni,150,220);
  image(pepperoni,220,130);
  }

}
