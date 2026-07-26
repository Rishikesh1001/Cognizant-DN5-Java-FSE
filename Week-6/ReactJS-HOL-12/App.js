import React, { createContext } from "react";
import ChildA from "./Components/ChildA";

export const UserContext = createContext();

function App() {
  return (
    <UserContext.Provider value={"Rishikesh"}>
      <div className="App">
        <h1>React Context API Demo</h1>
        <ChildA />
      </div>
    </UserContext.Provider>
  );
}

export default App;
