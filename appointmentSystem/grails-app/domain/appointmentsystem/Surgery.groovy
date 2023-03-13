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

    static hasMany = [doctor: Doctor, receptionist: Receptionist, nurse: Nurse, patient: Patient]

    static belongsTo = [patient: Patient]
}
