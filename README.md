<div>
	<h1>Web-Ecommerce</h1>
	<h2>Springboot Web Application</h2>
</div>
<div>
	<p>The main goal of the project is to reproduce a Database for a Ecommerce Web Application;<br>
		We have a Category-Product relation, so that One category can have Many Products (1:N);<br>
		Some concepts are studied, like Persistence in memory, H2 database, Dependency injection, Serializable, Domain Drive Design, Object Oriented Programming, HTTP knowledge...</p>
</div>
<div>
	<p>The relationship is first set when the dependencies are imported as seen below.</p>

![image](https://user-images.githubusercontent.com/63759223/151647306-09a69693-0561-413f-9326-e031600048db.png)

<p>Secondly, to manipulate Jpa and H2, use the notations</p>

![image](https://user-images.githubusercontent.com/63759223/151647366-d8ea77a7-bfbf-41e4-8493-5987fd557719.png)
</div>
<div> 
```java
//  As it is shown, Id notation says that the atribute is of type Id and @GeneratedValue(strategy = GenerationType.IDENTITY) autoincrements it
  @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
```
<p>Once it is stablished in one side, it has to be on the other, like this.</p>

![image](https://user-images.githubusercontent.com/63759223/151647451-ca9de84c-7e4d-41cc-9abc-e993a6eaffaa.png)

<p><strong>Note that one notation is @OneToMany and the other is @ManyToOne, defining who is 1 and who is N at a 1:N relation</strong></p>
</div>
<div>
	<footer>
		Loading...
	</footer>
</div>
