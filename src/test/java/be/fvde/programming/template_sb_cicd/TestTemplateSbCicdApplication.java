package be.fvde.programming.template_sb_cicd;

import org.springframework.boot.SpringApplication;

public class TestTemplateSbCicdApplication {

	public static void main(String[] args) {
		SpringApplication.from(TemplateSbCicdApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
