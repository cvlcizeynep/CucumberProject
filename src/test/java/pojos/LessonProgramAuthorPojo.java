package pojos;



    public class LessonProgramAuthorPojo {
        private LessonProgramAuthorPojo object;
        private String message;
        private String httpStatus;

        public LessonProgramAuthorPojo() {
        }

        public LessonProgramAuthorPojo(LessonProgramAuthorPojo object, String message, String httpStatus) {
            this.object = object;
            this.message = message;
            this.httpStatus = httpStatus;
        }

        public LessonProgramAuthorPojo getObject() {
            return object;
        }

        public void setObject(LessonProgramAuthorPojo object) {
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

        @Override
        public String toString() {
            return "LessonProgramAuthorPojo{" +
                    "object=" + object +
                    ", message='" + message + '\'' +
                    ", httpStatus='" + httpStatus + '\'' +
                    '}';
        }
    }