package me.whiteship.designpatterns._01_creational_patterns._00_di;

public class DINotApplied {
    public static void main(String[] args) {
        Project project = new Project(new BackendDeveloper(), new FrontendDeveloper());
        project.implement();
    }

    private static class BackendDeveloper {
        public void writeJava() {
            System.out.println("coding with java");
        }
    }

    private static class FrontendDeveloper {
        public void writeJs() {
            System.out.println("coding with javascript");
        }
    }

    private static class Project {
        private final BackendDeveloper backendDeveloper;
        private final FrontendDeveloper frontendDeveloper;

        public Project(BackendDeveloper backendDeveloper,
                       FrontendDeveloper frontendDeveloper) {
            this.backendDeveloper = backendDeveloper;
            this.frontendDeveloper = frontendDeveloper;
        }

        public void implement() {
            backendDeveloper.writeJava();
            frontendDeveloper.writeJs();
        }
    }
}

