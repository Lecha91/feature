import React from "react";
import { Link } from "@reach/router";
import "./Navigation.css";

const Navigation = () => {
  return (
    <div className="Navigation">
      <div className="NavLeft">
        <h1>Hello</h1>
      </div>
      <div className="NavRight">
        <Link to="/">LogIn</Link>
        <div className="divider"></div>
        <Link to="/register">Register</Link>
      </div>
    </div>
  );
};

export default Navigation;
