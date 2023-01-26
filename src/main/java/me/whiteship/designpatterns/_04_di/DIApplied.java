package me.whiteship.designpatterns._04_di;

import java.util.ArrayList;
import java.util.List;

public class DIApplied {
    public static void main(String[] args) {
        List<Developer> developers = new ArrayList<>();
        developers.add(new BackendDeveloper());
        developers.add(new FrontendDeveloper());

        Project project = new Project(developers);
        project.implement();
    }

    interface Developer {
        void develop();
    }

    static class BackendDeveloper implements Developer {

        @Override
        public void develop() {
            writeJava();
        }

        void writeJava() {
            System.out.println("coding with java");
        }
    }

    static class FrontendDeveloper implements Developer {

        @Override
        public void develop() {
            writeJs();
        }

        private void writeJs() {
            System.out.println("coding with javascript");
        }
    }

    static class Project {
        private final List<Developer> developers;

        public Project(List<Developer> developers) {
            this.developers = developers;
        }

        public void implement() {
            developers.forEach(Developer::develop);
        }
    }

}



