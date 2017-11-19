package lesson9;

public class EnumTest {
    public static class Tshirt{
        public enum Size {SMALL, MEDIUM, LARGE};

        private final Size size;

        public Tshirt(Size size){
            final Size s = size;
            this.size = size;
        }

        ///public boolean isFit(Peson target){
            ///switch(this.size){
           ///     case SMALL:return target.height /2<50;
               /// case MEDIUM:return target.height/2<70;

            }

        }
    ///}
///}
