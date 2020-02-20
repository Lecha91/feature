import React from "react";
import { Router } from "@reach/router";
import "./App.css";
import Navigation from "./components/navigation";
import Login from "./components/screens/loginScreen";
import Footer from "./components/footer";
import Register from "./components/screens/registerScreen";

function App() {
  return (
    <div className="App">
      <Navigation />
      <Router>
        <Login path="/" />
        <Register path="register" />
      </Router>
      <Footer />
    </div>
  );
}

export default App;
