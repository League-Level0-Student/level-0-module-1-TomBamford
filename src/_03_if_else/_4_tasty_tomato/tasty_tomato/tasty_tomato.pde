void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(#CB0E28);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#36670C);
    rect(176, 103, 12, 32);
    if(mousePressed) {
      fill(#CECCCC);
      ellipse(280, 200, 30, 30);
    }
    
}
