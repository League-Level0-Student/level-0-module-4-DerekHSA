PImage donkey;
PImage tail;
void setup() {
  donkey = loadImage("donkey.jpg");      //change the file name if you need to
tail = loadImage("tail.png");      //change the file name if you need to
size(800, 590);     //replace width, height with your picture's dimensions
tail.resize(100, 177);     //replace width, height with your tail's dimensions
}

void draw() {
  if(mouseX>=711&&mouseX<=751&&mouseY>=187&&mouseY<=227){
 background (donkey);
 image(tail, mouseX, mouseY);
}else {
  if (mousePressed){
    if(dist(0,0,mouseX,mouseY) < 30){
  background (donkey);
    }
  }else{
  background (#FFFFFF);
  }
  image(tail, mouseX, mouseY);
}


}