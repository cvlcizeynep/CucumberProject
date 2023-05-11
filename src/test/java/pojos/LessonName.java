package pojos;


    public class LessonName{
        private int lessonId;
        private String lessonName;
        private int creditScore;
        private boolean compulsory;

        public int getLessonId() {
            return lessonId;
        }

        public void setLessonId(int lessonId) {
            this.lessonId = lessonId;
        }

        public String getLessonName() {
            return lessonName;
        }

        public void setLessonName(String lessonName) {
            this.lessonName = lessonName;
        }

        public int getCreditScore() {
            return creditScore;
        }

        public void setCreditScore(int creditScore) {
            this.creditScore = creditScore;
        }

        public boolean isCompulsory() {
            return compulsory;
        }

        public void setCompulsory(boolean compulsory) {
            this.compulsory = compulsory;
        }

        public LessonName() {
        }

        public LessonName(int lessonId, String lessonName, int creditScore, boolean compulsory) {
            this.lessonId = lessonId;
            this.lessonName = lessonName;
            this.creditScore = creditScore;
            this.compulsory = compulsory;
        }

        @Override
        public String toString() {
            return "LessonName{" +
                    "lessonId=" + lessonId +
                    ", lessonName='" + lessonName + '\'' +
                    ", creditScore=" + creditScore +
                    ", compulsory=" + compulsory +
                    '}';
        }
    }


