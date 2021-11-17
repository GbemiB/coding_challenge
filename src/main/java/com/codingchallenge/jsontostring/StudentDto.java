package com.codingchallenge.jsontostring;


public class StudentDto {
        private long id;
        private String firstName;
        private String lastName;
        private int joinedYear;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getJoinedYear() {
            return joinedYear;
        }

        public void setJoinedYear(int joinedYear) {
            this.joinedYear = joinedYear;
        }
}