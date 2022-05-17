import { ReactComponent as GithubIcon } from "assets/img/github.svg";
import "./styles.css";

function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="webmovie-nav-content">
          <h1>WebMovie</h1>
          <a
            href="https://github.com/IagoSilvaSantos"
            target="_blank"
            rel="noreferrer"
          >
            <div className="webmovie-contact-container">
              <GithubIcon />
              <p className="webmovie-contact-link">/Git Hub Repository</p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;
