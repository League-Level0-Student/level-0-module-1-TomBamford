PImage face;
void setup() {
face = loadImage("zombie.jpeg");
size(500,500);
face.resize(500,500);
}
void draw() {
image(face,0,0);
noStroke();
fill(mouseX,mouseY,120);
ellipse(210,130,25,25);
ellipse(310,130,25,25);
}
