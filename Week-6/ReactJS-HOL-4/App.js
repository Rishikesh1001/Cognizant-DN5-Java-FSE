import "./App.css";

function App() {

  const offices = [
    {
      name: "DBS",
      rent: 50000,
      address: "Chennai",
      image: "https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=600"
    },
    {
      name: "Infosys",
      rent: 75000,
      address: "Bangalore",
      image: "https://images.unsplash.com/photo-1497366412874-3415097a27e7?w=600"
    }
  ];

  return (
    <div className="App">

      <h1>Office Space, at Affordable Range</h1>

      {offices.map((office, index) => (

        <div key={index} className="card">

          <img
            src={office.image}
            alt="Office"
            width="300"
          />

          <h2>Name: {office.name}</h2>

          <h3
            style={{
              color: office.rent <= 60000 ? "red" : "green"
            }}
          >
            Rent: Rs. {office.rent}
          </h3>

          <h3>Address: {office.address}</h3>

        </div>

      ))}

    </div>
  );
}

export default App;