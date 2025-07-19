package com.truaton.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;
import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OpenPositionsData {

    @GetMapping("/careers/open-positions-data")
    public List<Position> getOpenPositions() {
        List<Position> positions = new ArrayList<>();

        positions.add(new Position(
                "Frontend Developer",
                "/careers/frontend-developer-internship",
                "Join our frontend team and create amazing user interfaces using modern web technologies.",
                List.of(
                        "Develop responsive frontend and interactive web applications",
                        "Implement user interface designs.",
                        "Work with modern frontend frameworks and libraries",
                        "Optimize applications for maximum speed and scalability"
                ),
                List.of(
                        "Write clean, semantic code",
                        "Implement responsive design principles",
                        "Collaborate with designers to translate mockups into code",
                        "Debug and fix cross-browser compatibility issues",
                        "Stay updated with latest frontend technologies and trends"
                )
        ));

        positions.add(new Position(
                "Backend Developer",
                "/careers/backend-developer-internship",
                "Work on server-side development and build robust APIs and database systems that power our applications.",
                List.of(
                        "Design and develop server-side applications and APIs",
                        "Work with databases and data modeling",
                        "Implement authentication and security measures",
                        "Optimize server performance and scalability"
                ),
                List.of(
                        "Write server-side code.",
                        "Design and implement RESTful APIs",
                        "Work with SQL and NoSQL databases",
                        "Implement data validation and error handling",
                        "Monitor application performance and troubleshoot issues"
                )
        ));

        positions.add(new Position(
                "UI/UX Designer",
                "/careers/ui-ux-internship",
                "Create intuitive and beautiful user experiences through research, wireframing, prototyping, and visual design.",
                List.of(
                        "Design user interfaces for web and mobile applications",
                        "Conduct user research and usability testing",
                        "Create wireframes, prototypes, and mockups",
                        "Develop design systems and style guides"
                ),
                List.of(
                        "Research user needs and behaviors",
                        "Design wireframes and interactive prototypes",
                        "Conduct usability testing and iterate on designs",
                        "Collaborate with developers to ensure design implementation"
                )
        ));

        positions.add(new Position(
                "Software Developer",
                "/careers/software-developer-internship",
                "Join our team as a Software Engineer Intern and work on real-world projects using modern technologies.",
                List.of(
                        "Assist in designing, developing, and testing software applications",
                        "Collaborate with cross-functional teams to define and implement new features",
                        "Participate in code reviews and contribute to best practices"
                ),
                List.of(
                        "Write clean, maintainable, and efficient code",
                        "Debug and resolve technical issues",
                        "Document development processes and codebase changes",
                        "Learn and adapt to new technologies as required",
                        "Work on real-world projects using modern technologies"
                )
        ));

        positions.add(new Position(
                "Junior HR",
                "/careers/junior-human-resource-internship",
                "Support our HR team in talent acquisition, employee management, and organizational development initiatives.",
                List.of(
                        "Assist in recruitment and hiring processes",
                        "Support employee onboarding and training programs",
                        "Help maintain employee records and databases",
                        "Participate in HR policy development and implementation"
                ),
                List.of(
                        "Screen resumes and conduct initial candidate interviews",
                        "Coordinate interview schedules and communications",
                        "Assist in organizing team events and employee engagement activities",
                        "Update and maintain HR documentation",
                        "Support performance review processes and feedback collection"
                )
        ));

        positions.add(new Position(
                "Business Analyst",
                "/careers/business-analyst-internship",
                "Analyze business processes and requirements to help drive strategic decisions and improve operational efficiency.",
                List.of(
                        "Analyze business processes and identify improvement opportunities",
                        "Gather and document business requirements",
                        "Create process flows and documentation",
                        "Support project management and implementation"
                ),
                List.of(
                        "Conduct stakeholder interviews and requirement gathering sessions",
                        "Create detailed business requirement documents",
                        "Analyze data trends and prepare reports",
                        "Support testing and validation of business solutions",
                        "Facilitate communication between technical and business teams"
                )
        ));

        positions.add(new Position(
                "Research & Development",
                "/careers/rnd-internship",
                "Contribute to innovative research projects and help develop cutting-edge solutions for emerging technologies.",
                List.of(
                        "Conduct research on emerging technologies and trends",
                        "Assist in prototype development and testing",
                        "Analyze research data and prepare reports",
                        "Support innovation initiatives and proof of concepts"
                ),
                List.of(
                        "Research industry trends and competitive analysis",
                        "Experiment with new technologies and frameworks",
                        "Document research findings and recommendations",
                        "Collaborate with development teams on innovative solutions",
                        "Present research findings to stakeholders"
                )
        ));

        positions.add(new Position(
                "QA",
                "/careers/qa-internship",
                "Ensure software quality through comprehensive testing strategies, automation, and quality assurance processes.",
                List.of(
                        "Design and execute test plans and test cases",
                        "Perform manual and automated testing",
                        "Identify, document, and track software defects",
                        "Collaborate with development teams on quality improvements"
                ),
                List.of(
                        "Create comprehensive test scenarios and test data",
                        "Execute functional, regression, and performance testing",
                        "Report bugs and work with developers on resolution",
                        "Maintain testing documentation and reports",
                        "Support user acceptance testing and deployment processes"
                )
        ));

        positions.add(new Position(
                "Software Tester",
                "/careers/software-tester-internship",
                "Focus on manual and automated testing to ensure software applications meet quality standards and user requirements.",
                List.of(
                        "Execute manual testing across web and mobile platforms",
                        "Learn and implement automated testing frameworks",
                        "Perform exploratory and usability testing",
                        "Support regression testing and release validation"
                ),
                List.of(
                        "Test software applications for functionality and usability",
                        "Create and maintain test cases and testing documentation",
                        "Report and track defects through their lifecycle",
                        "Collaborate with QA team on testing best practices",
                        "Support continuous integration and testing processes"
                )
        ));

        positions.add(new Position(
                "Business Executive",
                "/careers/business-executive-internship",
                "Support business operations, client relationships, and strategic initiatives to drive company growth and success.",
                List.of(
                        "Assist in business development and client acquisition",
                        "Support sales and marketing initiatives",
                        "Help manage client relationships and communications",
                        "Participate in strategic planning and market analysis"
                ),
                List.of(
                        "Conduct market research and competitive analysis",
                        "Support lead generation and customer outreach",
                        "Assist in proposal writing and presentation preparation",
                        "Maintain client databases and communication records",
                        "Support business development meetings and follow-ups"
                )
        ));

        return positions;
    }

    // Inner class to define Position structure
    public static class Position {
        private String label;
        private String link;
        private String description;
        private List<String> roles;
        private List<String> responsibilities;

        public Position(String label, String link, String description, List<String> roles, List<String> responsibilities) {
            this.label = label;
            this.link = link;
            this.description = description;
            this.roles = roles;
            this.responsibilities = responsibilities;
        }

        // Getters
        public String getLabel() { return label; }
        public String getLink() { return link; }
        public String getDescription() { return description; }
        public List<String> getRoles() { return roles; }
        public List<String> getResponsibilities() { return responsibilities; }

        // Setters
        public void setLabel(String label) { this.label = label; }
        public void setLink(String link) { this.link = link; }
        public void setDescription(String description) { this.description = description; }
        public void setRoles(List<String> roles) { this.roles = roles; }
        public void setResponsibilities(List<String> responsibilities) { this.responsibilities = responsibilities; }
    }
}