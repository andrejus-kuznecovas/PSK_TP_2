package lt.vu.mif.Controllers;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lt.vu.mif.Entities.Car;
import lt.vu.mif.Repositories.CarRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import java.util.List;

@Path("/car")
@ApplicationScoped
@XmlRootElement
public class ApiController {
    public ApiController(){}

    @Inject
    @XmlElement
    private CarRepository carRepository;

    @GET
    @XmlElement
    public List<Car> getAll() {
        System.out.println("I'M IN REST CALL XD");
        return carRepository.getAll();
    }

    @GET
    @Path("/{id}")
    public Car get(@PathParam("id") int id) {

        System.out.println("I'M IN REST CALL XD WITH ID");
        return carRepository.get(id);
    }

    @PUT
    @Path("/create")
    @Transactional
    public Car create(@QueryParam("manufacturer") String manufacturer,
                      @QueryParam("model") String model) {
        Car car = new Car(manufacturer, model);
        carRepository.add(car);
        return car;
    }

    @POST
    @Path("/update/{id}")
    @Transactional
    public Car update(@PathParam("id") Integer id,
                           @QueryParam("manufacturer") String manufacturer,
                           @QueryParam("model") String model) {
        Car car = carRepository.get(id);
        if (car != null) {
            car.setManufacturer(manufacturer);
            car.setModel(model);
            carRepository.update(car);
            return car;
        }
        return null;
    }
}
