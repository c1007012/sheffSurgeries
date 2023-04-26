package appointmentsystem

class Doctor {

    String doctorName
    String qualification
    String position
    String doctorEmail
    String password
    String doctorOffice
    String doctorPhone
    String bio


    String toString() {
        return doctorName
    }

    static constraints = {
        doctorName size: 1..100, blank: false, unique: true
   
    }
    static belongsTo = [Nurse]

    static hasOne = [surgery: Surgery]

    static hasMany = [prescriptions: Prescription, appointments: Appointment, nurses: Nurse]

}
