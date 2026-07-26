import { useContext } from "react";
import { UserContext } from "../App";

function ChildC() {
  const user = useContext(UserContext);

  return (
    <div>
      <h2>Child C</h2>
      <h3>Welcome {user}</h3>
    </div>
  );
}

export default ChildC;