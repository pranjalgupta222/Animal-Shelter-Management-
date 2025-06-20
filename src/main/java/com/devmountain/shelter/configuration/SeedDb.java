package com.devmountain.shelter.configuration;

import com.devmountain.shelter.animal.Animal;
import com.devmountain.shelter.animal.AnimalRepository;
import com.devmountain.shelter.disposition.Disposition;
import com.devmountain.shelter.disposition.DispositionRepository;
import com.devmountain.shelter.health.Health;
import com.devmountain.shelter.health.HealthRepository;
import com.devmountain.shelter.staff.Staff;
import com.devmountain.shelter.staff.StaffRepository;
import com.devmountain.shelter.task.Task;
import com.devmountain.shelter.task.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan(basePackages = {"com.devmountain.shelter.staff", "com.devmountain.shelter.animal"})

public class SeedDb implements CommandLineRunner {

    @Autowired
    private AnimalRepository animalRepository;
    @Autowired
    private HealthRepository healthRepository;
    @Autowired
    private DispositionRepository dispositionRepository;
    @Autowired
    private StaffRepository staffRepository;
    @Autowired
    private TaskRepository taskRepository;


    @Override
    public void run(String ... args) throws Exception {


        //TRY TO SEED THE DB WITH DISPOSITION
        Disposition disposition1 = new Disposition(null, "Potty", "leash", "Good with kids", "Good with other animals", "Good temper", "Good in crate", "No comments", null);
        dispositionRepository.save(disposition1);

        Health health1 = new Health(null, "spayed YES", "stool NORMAL", "3lb", "No allergy", "no disability", "no", "no", null );
        healthRepository.save(health1);

        Animal animal1 = new Animal(null, "Cat", "Fluffy", "10/04/2020", "Female", "01/01/2023", "Rescued", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Cat03.jpg/640px-Cat03.jpg", "Unknown", "Pedigree Cat Food", "1 scoop 2x day", "Available for Adoption", null, null);


        animal1.setDisposition(disposition1);
        animalRepository.save(animal1);
        animal1.setHealth(health1);
        animalRepository.save(animal1);



        Animal animal2 = new Animal(null, "Dog", "Kai", "06/01/2019", "Male", "06/01/2019", "Born in shelter", "https://www.boredpanda.com/blog/wp-content/uploads/2021/03/url-1.jpg", "Golden Retriever", "Dog food brand name", "2 1/2 scoops 2x day", "Available for Foster", null, null);
        animal2.setDisposition(disposition1);
        animalRepository.save(animal2);

        Animal animal3 = new Animal(null, "Dog", "Lily", "01/14/2021", "Female", "07/25/2021", "Stray Animal", "https://www.boredpanda.com/blog/wp-content/uploads/2021/03/url-1.jpg", "Poodle", "Doog food", "1 scoop 2x day", "Available for Adoption", null, null);
        animal3.setDisposition(disposition1);
        animalRepository.save(animal3);

        Animal animal4 = new Animal(null, "Cat", "Luna", "08/30/2022", "Female", "11/28/2022", "Transferred", "https://www.boredpanda.com/blog/wp-content/uploads/2021/03/url-1.jpg", "Siamese", "Cat food", "1/2 scoop 2x day", "Fostered", null, null);
        animal4.setDisposition(disposition1);
        animalRepository.save(animal1);

        Animal animal5 = new Animal(null, "Dog", "Bella", "05/18/2018", "Female", "09/12/2019", "Surrender", "https://www.boredpanda.com/blog/wp-content/uploads/2021/03/url-1.jpg", "Rottweiler", "Dog food", "2 scoops 2x day", "Shelter Care", null, null);
        animal5.setDisposition(disposition1);
        animalRepository.save(animal5);

        Animal animal6 = new Animal(null, "Dog", "Bella", "05/18/2018", "Female", "09/12/2019", "Surrender", "https://www.boredpanda.com/blog/wp-content/uploads/2021/03/url-1.jpg", "Rottweiler", "Dog food", "2 scoops 2x day", "Shelter Care", null, null);
        animal6.setDisposition(disposition1);
        animalRepository.save(animal6);

        Animal animal7 = new Animal(null, "Dog", "Bella", "05/18/2018", "Female", "09/12/2019", "Surrender", "https://www.boredpanda.com/blog/wp-content/uploads/2021/03/url-1.jpg", "Rottweiler", "Dog food", "2 scoops 2x day", "Available for Adoption", null, null);
        animal7.setDisposition(disposition1);
        animalRepository.save(animal7);

        Animal animal8 = new Animal(null, "Dog", "Bella", "05/18/2018", "Female", "09/12/2019", "Surrender", "https://www.boredpanda.com/blog/wp-content/uploads/2021/03/url-1.jpg", "Rottweiler", "Dog food", "2 scoops 2x day", "Fostered", null, null);
        animal5.setDisposition(disposition1);
        animalRepository.save(animal8);

        Animal animal9 = new Animal(null, "Dog", "Bella", "05/18/2018", "Female", "09/12/2019", "Surrender", "https://www.boredpanda.com/blog/wp-content/uploads/2021/03/url-1.jpg", "Rottweiler", "Dog food", "2 scoops 2x day", "Fostered", null, null);
        animal9.setDisposition(disposition1);
        animalRepository.save(animal9);

        Animal animal10 = new Animal(null, "Dog", "Bella", "05/18/2018", "Female", "09/12/2019", "Surrender", "https://www.boredpanda.com/blog/wp-content/uploads/2021/03/url-1.jpg", "Rottweiler", "Dog food", "2 scoops 2x day", "Shelter Care", null, null);
        animal10.setDisposition(disposition1);
        animalRepository.save(animal10);

        Animal animal11 = new Animal(null, "Dog", "Bella", "05/18/2018", "Male", "09/12/2019", "Surrender", "https://www.boredpanda.com/blog/wp-content/uploads/2021/03/url-1.jpg", "Rottweiler", "Dog food", "2 scoops 2x day", "Available for Adoption", null, null);
        animal11.setDisposition(disposition1);
        animalRepository.save(animal11);

        Animal animal12 = new Animal(null, "Dog", "Bella", "05/18/2018", "Female", "09/12/2019", "Surrender", "https://www.boredpanda.com/blog/wp-content/uploads/2021/03/url-1.jpg", "Rottweiler", "Dog food", "2 scoops 2x day", "Shelter Care", null, null);
        animal12.setDisposition(disposition1);
        animalRepository.save(animal12);

        Animal animal13 = new Animal(null, "Dog", "Bella", "05/18/2018", "Female", "09/12/2019", "Surrender", "https://www.boredpanda.com/blog/wp-content/uploads/2021/03/url-1.jpg", "Rottweiler", "Dog food", "2 scoops 2x day", "Shelter Care", null, null);
        animal13.setDisposition(disposition1);
        animalRepository.save(animal13);

        Animal animal14 = new Animal(null, "Cat", "Bella", "05/18/2018", "Male", "09/12/2019", "Surrender", "https://www.boredpanda.com/blog/wp-content/uploads/2021/03/url-1.jpg", "Rottweiler", "Dog food", "2 scoops 2x day", "Shelter Care", null, null);
        animal14.setDisposition(disposition1);
        animalRepository.save(animal14);

        Animal animal15 = new Animal(null, "Cat", "Bella", "05/18/2018", "Female", "09/12/2019", "Surrender", "https://www.boredpanda.com/blog/wp-content/uploads/2021/03/url-1.jpg", "Rottweiler", "Dog food", "2 scoops 2x day", "Shelter Care", null, null);
        animal15.setDisposition(disposition1);
        animalRepository.save(animal15);

        Animal animal16 = new Animal(null, "Cat", "Bella", "05/18/2018", "Male", "09/12/2019", "Surrender", "https://www.boredpanda.com/blog/wp-content/uploads/2021/03/url-1.jpg", "Rottweiler", "Dog food", "2 scoops 2x day", "Shelter Care", null, null);
        animal16.setDisposition(disposition1);
        animalRepository.save(animal16);

        Animal animal17 = new Animal(null, "Cat", "Bella", "05/18/2018", "Female", "09/12/2019", "Surrender", "https://www.boredpanda.com/blog/wp-content/uploads/2021/03/url-1.jpg", "Rottweiler", "Dog food", "2 scoops 2x day", "Available for Adoption", null, null);
        animal17.setDisposition(disposition1);
        animalRepository.save(animal7);

        Animal animal18 = new Animal(null, "Cat", "Bella", "05/18/2018", "Male", "09/12/2019", "Surrender", "https://www.boredpanda.com/blog/wp-content/uploads/2021/03/url-1.jpg", "Rottweiler", "Dog food", "2 scoops 2x day", "Available for Adoption", null, null);
        animal18.setDisposition(disposition1);
        animalRepository.save(animal18);

        Animal animal19 = new Animal(null, "Cat", "Bella", "05/18/2018", "Female", "09/12/2019", "Surrender", "https://www.boredpanda.com/blog/wp-content/uploads/2021/03/url-1.jpg", "Rottweiler", "Dog food", "2 scoops 2x day", "Shelter Care", null, null);
        animal19.setDisposition(disposition1);
        animalRepository.save(animal19);

        Animal animal20 = new Animal(null, "Dog", "Bella", "05/18/2018", "Male", "09/12/2019", "Surrender", "https://www.boredpanda.com/blog/wp-content/uploads/2021/03/url-1.jpg", "Rottweiler", "Dog food", "2 scoops 2x day", "Shelter Care", null, null);
        animal20.setDisposition(disposition1);
        animalRepository.save(animal20);


//        animalRepository.saveAll(Arrays.asList(animal1, animal2, animal3, animal4, animal5));


        Staff staff1 = new Staff();
        staff1.setId(null);
        staff1.setEmail("staff1@test.com");
        staff1.setPassword("123test");
        staff1.setName("Amanda Jones");
        staff1.setPhone("(720) 232-0909");
        staff1.setAddress("Denver-CO");
        staff1.setRole("Volunteer");

        Staff staff2 = new Staff();
        staff2.setName("Sandra Olmo");
        staff2.setPassword("123test");
        staff2.setEmail("staff2@test.com");
        staff2.setPhone("(720) 111-5050");
        staff2.setAddress("Denver-CO");
        staff2.setRole("Manager");

        Staff staff3 = new Staff();
        staff3.setName("Patrick Callahan");
        staff3.setPassword("123test");
        staff3.setEmail("staff3@test.com");
        staff3.setPhone("(360) 455-9977");
        staff3.setAddress("Denver-CO");
        staff3.setRole("Animal caretaker");

        Staff staff4 = new Staff();
        staff4.setName("Gloria Phipps");
        staff4.setPassword("123test");
        staff4.setEmail("staff4@test.com");
        staff4.setPhone("(240) 324-1133");
        staff4.setAddress("Denver-CO");
        staff4.setRole("Veterinarian");

        Staff staff5 = new Staff();
        staff5.setName("Dennis Johnson");
        staff5.setPassword("123test");
        staff5.setEmail("staff5@test.com");
        staff5.setPhone("(240) 689-4022");
        staff5.setAddress("Denver-CO");
        staff5.setRole("Kennel technician");
        staffRepository.saveAll(Arrays.asList(staff1,staff2, staff3, staff4, staff5));




//        Animal animalTest = animalRepository.findById(1L).orElse(null);
        Staff staffTest = staffRepository.findById(1L).orElse(null);
        Task task1 = new Task(null, "Take the trash out", "Wednesday - 2pm", staff1);
        Task task2 = new Task(null, "Feed the cats", "Monday - 7am and 6pm", staff2);
        Task task3 = new Task(null, "Take Fluffy to get the vaccines", "Tuesday 1pm", staff4);
        Task task4 = new Task(null, "Clean the kennel", "Friday", staff3);
        Task task5 = new Task(null, "Feed the dogs", "Tuesday - 10am", staff1);
        taskRepository.saveAll(Arrays.asList(task1, task2, task3, task4, task5));



    }
}
