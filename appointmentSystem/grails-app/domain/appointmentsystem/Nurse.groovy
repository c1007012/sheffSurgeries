package appointmentsystem /* com.ngarnett.Nurse */

class Nurse {

    String nurseName
    String qualifications
    String nurseEmail
    String nurseOffice
    String nursePhone

    String toString() {
        return nurseName
    }

    static constraints = {
        nurseName size: 1..100, blank: false, unique: true
        
    }

    static hasOne = [surgery: Surgery]
   
    static hasMany = [doctors: Doctor]     

}
