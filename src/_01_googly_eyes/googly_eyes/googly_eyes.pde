PImage face;
int centerX = 190;
int centerY= 140;
void setup() {
  size(500,500);
  face=loadImage("download.jpeg");
face.resize(500,500);
    background(face);
}

void draw() {
  background(face);
  fill(#FFFFFF);
  ellipse(190,140,30,30);
   ellipse(298,133,30,30);
  fill(#000000);
  if (dist(190,140,mouseX,mouseY)<12){
centerX=mouseX;
centerY=mouseY; 
  } ellipse(centerX,centerY,10,10);
ellipse(centerX+108,centerY-7,10,10);}