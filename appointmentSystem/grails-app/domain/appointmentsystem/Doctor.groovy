package appointmentsystem

class Doctor {

    String fullName
    String qualification
    String position
    String doctorEmail
    String password
    String doctorOffice
    String doctorPhone
    String bio


    String toString() {
        return fullName
    }

    static constraints = {
        fullName size: 1..100, blank: false, unique: true
   
    }

    static hasOne = [surgery: Surgery]

    static hasMany = [prescription: Prescription, appointment: Appointment, nurse: Nurse]

}
