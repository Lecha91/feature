import React, { useState, useEffect } from "react";
import "./Register.css";
import axios from "axios";

const Register = () => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [firstName, setFirstName] = useState("");
  const [lastName, setLastName] = useState("");
  const [users, setUser] = useState([]);

  const getData = async () => {
    await axios
      .get("http://my-json-server.typicode.com/lecha91/fakeApi/users")
      .then(res => {
        setUser(res.data);
      });
  };

  useEffect(() => {
    getData();
  }, []);

  const validateForm = () => {
    return (
      email.length > 0 &&
      password.length > 0 &&
      firstName.length > 0 &&
      lastName.length > 0
    );
  };

  const handleRegSubmit = () => {
    const newUser = {
      email: email,
      password: password,
      firstName: firstName,
      lastName: lastName
    };
    users.push({ newUser });
    console.log(users);
  };

  return (
    <form className="regForm" onSubmit={e => e.preventDefault()}>
      <label className="regLabel">First Name</label>
      <input
        className="regInput"
        autoFocus
        id="firstName"
        type="text"
        value={firstName}
        onChange={e => setFirstName(e.target.value)}
      />
      <label className="regLabel">Last Name</label>
      <input
        className="regInput"
        autoFocus
        id="lastName"
        type="text"
        value={lastName}
        onChange={e => setLastName(e.target.value)}
      />
      <label className="regLabel">Email</label>
      <input
        className="regInput"
        autoFocus
        id="email"
        type="email"
        value={email}
        onChange={e => setEmail(e.target.value)}
      />
      <label className="regLabel">Password</label>
      <input
        className="regInput"
        type="password"
        id="password"
        value={password}
        onChange={e => setPassword(e.target.value)}
      />
      <button
        className="register"
        type="submit"
        disabled={!validateForm()}
        onClick={handleRegSubmit()}
      >
        Register
      </button>
    </form>
  );
};

export default Register;
