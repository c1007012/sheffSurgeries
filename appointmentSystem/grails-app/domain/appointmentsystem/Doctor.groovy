package appointmentsystem /* com.ngarnett.Doctor */

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

    static hasOne = [surgery: Surgery]

    static belongsTo = [Nurse]


    static hasMany = [prescriptions: Prescription, appointments: Appointment, nurses: Nurse]

}
