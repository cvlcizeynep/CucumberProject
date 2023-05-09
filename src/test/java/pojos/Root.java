package pojos;


    public class Root{
        private Object object;
        private String message;
        private String httpStatus;

        public Object getObject() {
            return object;
        }

        public void setObject(Object object) {
            this.object = object;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getHttpStatus() {
            return httpStatus;
        }

        public void setHttpStatus(String httpStatus) {
            this.httpStatus = httpStatus;
        }


        public Root() {
        }

        public Root(Object object, String message, String httpStatus) {
            this.object = object;
            this.message = message;
            this.httpStatus = httpStatus;
        }

    }

