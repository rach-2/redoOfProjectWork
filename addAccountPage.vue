<html>
<head>
   <!-- development version, includes helpful console warnings -->
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js">

  var app = new Vue(){
  
       el: '#content'
	   heading: "wellecome to the firstPage"
	   firstNameLabel: "enter"
	   function addAccount(){
	       document.write("accountAdded")
	      
	   }
  }

</script>
</head>
<body>

<div id="content"> 
   <h1>{heading}</h1>
   <form> 
   
<label> {firstNameLabel}  </label>   <input type="text" name="fristName"> <br>
	<label> {fristNameLabel}  </label> <input type="text" name="LastName">  <br>
	 <button onclick="addAccount()" > addAccount </button>
	 
   </form>
</div>
   
</body>

</html>