package appointmentsystem /* com.ngarnett */

class BootStrap {

    def init = { servletContext ->
        def surgery = new Surgery( /* com.ngarnett.Surgery */
	 name: 'Sheffield Medical Centre',
         address: '21 Spital Street, Sheffield',
         postcode: 'S3 9LB',
         telephone: '0114 272 7042',
         numberOfPatients: 80,
         description: 'Lorem ipsum',
         openingTime: '09:00 - 19:00',
         registeringNewPatients: true
        ).save()

        def surgery2 = new Surgery( /* com.ngarnett.Surgery */
	 name: 'Manchester Road Surgery',
         address: '484 Manchester Road, Sheffield',
         postcode: 'S10 5PN',
         telephone: '0114 266 8265',
         numberOfPatients: 105,
         description: 'Lorem ipsum',
         openingTime: '08:00 - 17:00',
         registeringNewPatients: true
        ).save()
	
        def doctor = new Doctor( /* com.ngarnett.Doctor */
         doctorName: 'Fred Smith',
         qualification: 'MBBS',
         position: 'Surgeon',
         doctorEmail: 'fredsmith@gmail.com',
         password: 'password',
         doctorOffice: 'D-21',
         doctorPhone: '07654896322',
         bio: 'Lorem Ipsum',
         surgery: surgery  
        ).save()

        def doctor2 = new Doctor( /* com.ngarnett.Doctor */
         doctorName: 'Darwin Paulson',
         qualification: 'BMBS',
         position: 'Junior Doctor',
         doctorEmail: 'd.paulson@outlook.com',
         password: 'password',
         doctorOffice: 'D-13',
         doctorPhone: '07376112349',
         bio: 'Lorem Ipsum',
         surgery: surgery  
        ).save()

        def patient = new Patient( /* com.ngarnett.Patient */
         patientName: 'John Doe',
         patientAddress: '23 Prospect Avenue',
         patientResidence: 'Sheffield',
         patientDob: '2002-06-23',
         patientID: 'P3245',
         dateRegistered: '2022-04-12',
         patientPhone: '07224576523',
         surgery: surgery
        ).save()

        def patient2 = new Patient( /* com.ngarnett.Patient */
         patientName: 'Juliane Johnson',
         patientAddress: '12  Fairfax Road',
         patientResidence: 'Sheffield',
         patientDob: '1987-04-19',
         patientID: 'P5438',
         dateRegistered: '2023-02-09',
         patientPhone: '07932665178',
         surgery: surgery
        ).save()

        def receptionist = new Receptionist( /* com.ngarnett.Receptionist */
         recepName: 'Daniel Stephens',
         recepEmail: 'danielstephens@outlook.com',
         recepUsername: 'username',
         recepPassword: 'password',
         recepPhone: '07665123988',
         surgery: surgery
        ).save()


        def receptionist2 = new Receptionist( /* com.ngarnett.Receptionist */
         recepName: 'Casey Kelly',
         recepEmail: 'caseykelly@gmail.com',
         recepUsername: 'ckelly',
         recepPassword: 'password',
         recepPhone: '07118765345',
         surgery: surgery
        ).save()

        def nurse = new Nurse( /* com.ngarnett.Nurse */
	 nurseName: 'Sarah Peterson',
         qualifications: 'Registered General Nurse',
         nurseEmail: 'sarahpeterson@yahoo.com',
         nurseOffice: 'N-34',
         nursePhone: '07834451989',
         surgery: surgery
        ).save()

        def nurse2 = new Nurse( /* com.ngarnett.Nurse */
	 nurseName: 'Micheal Wright',
         qualifications: 'Registered General Nurse',
         nurseEmail: 'mwright@outlook.com',
         nurseOffice: 'N-35',
         nursePhone: '07398261297',
         surgery: surgery
        ).save()

        def appointment = new Appointment( /* com.ngarnett.Appointment */
	 appDate: '2023/02/12',
         appTime: '17:00',
	 appDuration: 30,
	 roomNumber: 'A-45',
	 surgery: surgery,
	 doctor: doctor,
	 patient: patient
	).save()

        def appointment2 = new Appointment( /* com.ngarnett.Appointment */
	 appDate: '2023/03/15',
         appTime: '10:30',
	 appDuration: 60,
	 roomNumber: 'A-50',
	 surgery: surgery,
	 doctor: doctor,
	 patient: patient
	).save()

	def prescription = new Prescription( /* com.ngarnett.Prescription */
	 pharmacyName: 'Well Pharmacy',
	 prescriptionNumber: 4657,
	 medicine: 'Ibuprofen',
	 daysSupply: 15,
	 totalCost: 2.5,
	 dateIssued: new Date(2023 - 1900, 3, 21),
	 patientPaying: true,
	 doctor: doctor,
         patient: patient
	).save()

        def prescription2 = new Prescription( /* com.ngarnett.Prescription */
	 pharmacyName: 'London Road Pharmacy',
	 prescriptionNumber: 2289,
	 medicine: 'Paracetamol',
	 daysSupply: 10,
	 totalCost: 1.99,
	 dateIssued: new Date(2023 - 1200, 1, 13),
	 patientPaying: true,
	 doctor: doctor,
         patient: patient
	).save()

    }
    def destroy = {
    }
}
