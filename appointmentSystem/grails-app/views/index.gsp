<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>SheffSurgery Appointment System - Home Page</title>
</head>
<body>



<div id="content" role="main">
    <div class="container">
        <section class="row colset-2-its">
            <h1>Welcome to SheffSurgeries</h1>


            <div class="row">
 <div class="first">
                  <button style="background-color: #34f0fa">
	                <g:link controller="doctor" action="create">Add Doctor</g:link>
	          </button>
	    </div>
  <div class="second">
	            <button style="background-color: #34f0fa">
	                 <g:link controller="nurse" action="create">Add Nurse</g:link>
	           </button>
	    </div>
  <div class="first">
	            <button style="background-color: #34f0fa">
	                 <g:link controller="appointment" action="create">Add Appointment</g:link>
	           </button>
	    </div>
  <div class="second">
	            <button style="background-color: #34f0fa">
	                 <g:link controller="patient" action="create">Add Patient</g:link>
	           </button>
	    </div>
  <div class="first">
	            <button style="background-color: #34f0fa">
	                 <g:link controller="prescription" action="create">Add Prescription</g:link>
	           </button>
	    </div>
  <div class="second">
	            <button style="background-color: #34f0fa">
	                 <g:link controller="receptionist" action="create">Add Receptionist</g:link>
	           </button>
	    </div>
  <div class="first">
	            <button style="background-color: #34f0fa">
	                 <g:link controller="surgery" action="create">Add Surgery</g:link>
	           </button>
	    </div>

  <div class="row">
         
         <asset:image src="medical.jpg"/>

      </div>

           </div>
        </section>
    </div>
</div>

</body>
</html>
