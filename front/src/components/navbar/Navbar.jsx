import  { useState } from 'react'
import { Link } from 'react-router-dom'
import styles from './Navbar.module.css'

function Navbar() {
	const [isMobileMenuOpen, setIsMobileMenuOpen] = useState(false)

	const toggleMobileMenu = () => {
		setIsMobileMenuOpen(!isMobileMenuOpen)
	}

	return (
		<nav className={styles.navbar}>
			<div className={styles.navbarTitle}>Mi App</div>
			<button className={styles.hamburger} onClick={toggleMobileMenu}>
				☰
			</button>
			<ul className={`${styles.navbarList} ${isMobileMenuOpen ? styles.navbarListOpen : ''}`}>
				<li>
					<Link to='/'>Home</Link>
				</li>
				<li>
					<Link to='/login'>Iniciar sesión</Link>
				</li>
				<li>
					<Link to='/register'>Registrarse</Link>
				</li>
				<li>
					<Link to='/contact'>Contacto</Link>
				</li>
			</ul>
		</nav>
	)
}

export default Navbar
