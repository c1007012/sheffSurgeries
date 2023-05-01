package appointmentsystem /* com.ngarnett.Appointment */ 
/*was inputted this way as application struggled to run the usual way */

class Appointment {

    String appDate
    String appTime
    int appDuration
    String roomNumber

    String toString() {
        return roomNumber
    }

    static constraints = {
        roomNumber size: 1..30, blank: false, unique: true
        appDuration min: 10
    }

    static hasOne = [doctor: Doctor, surgery: Surgery, patient: Patient]

 
}
