package day18;

import java.io.IOException;

public class ageRestrictionException extends IOException {

        private String message;

        public ageRestrictionException(String message){
            super(message);

        }
}
