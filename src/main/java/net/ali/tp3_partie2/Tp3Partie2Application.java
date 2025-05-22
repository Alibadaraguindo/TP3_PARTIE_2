package net.ali.tp3_partie2;

import net.ali.tp3_partie2.entities.Patient;
import net.ali.tp3_partie2.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Tp3Partie2Application implements CommandLineRunner {
	@Autowired
	private PatientRepository patientRepository;
	@Override
	public void run(String... args) throws Exception {
		/*//Construsteur sans parametre (NoArgsCoonstructor)
		Patient patient = new Patient();
		patient.setId(null);
		patient.setNom("Ali");
		patient.setDateNaissance(new Date());
		patient.setMalade(false);
		patient.setScore(23);

		//Construsteur avec parametre (AllArgsCoonstructor)
		Patient patient2 = new Patient(null,"Idriss",new Date(),false,123);

		//methode builder
		Patient patient3 = Patient.builder().nom("Ibrahim")
				.dateNaissance(new Date())
				.score(56)
				.malade(true)
				.build();*/
	/*	patientRepository.save(new Patient(null,"Mohamed",new Date(),false,314));
		patientRepository.save(new Patient(null,"Ali",new Date(),false,4321));
		patientRepository.save(new Patient(null,"Hanane",new Date(),true,324));
		patientRepository.save(new Patient(null,"Youssef",new Date(),true,314));
		patientRepository.save(new Patient(null,"Julie",new Date(),false,125));
*/
	}

	public static void main(String[] args) {
		SpringApplication.run(Tp3Partie2Application.class, args);
	}

}
