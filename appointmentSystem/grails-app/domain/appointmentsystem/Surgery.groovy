package appointmentsystem

class Surgery {

    String name
    String address
    String postcode
    String telephone
    int numberOfPatients
    String description
    String openingTime

    String toString() {
        return name
    }

    static constraints = {
        name size: 5..40, blank: false
        numberOfPatients min: 10
    }

    static hasMany = [doctors: Doctor, receptionists: Receptionist, nurses: Nurse, patients: Patient, appointments: Appointment]

    
}
