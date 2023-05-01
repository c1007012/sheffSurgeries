package appointmentsystem /* com.ngarnett.Patient */

class Patient {

    String patientName
    String patientAddress
    String patientResidence
    Date patientDob
    String patientID
    Date dateRegistered
    String patientPhone

    String toString() {
        return patientName
    }

    static constraints = {
        patientName size: 1..100, blank: false
        patientID size: 5..50, blank: false, unique: true
    }


    static hasMany = [surgeries: Surgery, prescriptions: Prescription, appointments: Appointment]

}
