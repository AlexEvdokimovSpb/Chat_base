package java2.hw2;

public class MyArraySizeException extends RuntimeException {

        private int number;

        public MyArraySizeException(int number) {
            this.number = number;
        }

        public int getLine() {
            return number;
        }

}
