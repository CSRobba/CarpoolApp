import { useEffect, useState } from 'react';

function App() {
  const [message, setMessage] = useState('');

  useEffect(() => {
    fetch("/test")  // Calls your Spring Boot endpoint
      .then(res => res.text())
      .then(data => setMessage(data));
  }, []);

  return (
    <div>
      <h1>Carpool Pathfinder</h1>
      <p>Backend says: {message}</p>
    </div>
  );
}

export default App;
