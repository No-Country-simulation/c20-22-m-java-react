// import React from 'react'
import { useState } from 'react'
import styles from './Publishlost.module.css'

export default function Publishlost() {
	const [formData, setFormData] = useState({
		publicaDueño: true,
		rescatada: false,
		nombre: '',
		fechaPerdida: '',
		zona: '',
		mascotaEspecie: '',
		mascotaRaza: '',
		mascotaColores: [],
		mascotaTamaño: '',
		mascotaEdad: '',
		mascotaOtros: '',
		contactoNombre: '',
		contactoTelefono: '',
		contactoEmail: '',
		fotos: ''
	})

	const handleChange = (e) => {
		const { name, value } = e.target
		setFormData((formData) => ({
			...formData,
			[name]: value
		}))
	}

	const handleSubmit = async (e) => {
		e.preventDefault()
		console.log('enviando formulario', formData)
		//lógica para enviar al back el formulario
	}

	const handleClear = () => {
		setFormData({
			publicaDueño: true,
			rescatada: false,
			nombre: '',
			fechaPerdida: '',
			zona: '',
			mascotaEspecie: '',
			mascotaRaza: '',
			mascotaColores: [],
			mascotaTamaño: '',
			mascotaEdad: '',
			mascotaOtros: '',
			contactoNombre: '',
			contactoTelefono: '',
			contactoEmail: '',
			fotos: ''
		})
		console.log('formulario borrado')
	}

	return (
		<section className={styles.section}>
			<h3 className={styles.title}>¿Perdiste una mascota?</h3>
			<h4 className={styles.subtitle}>Completá el formulario y la gente te ayudará a encontrarlo</h4>
			<div className={styles.formContainer}>
				<form onSubmit={handleSubmit} className={styles.form}>
					<label htmlFor='nombre' className={styles.label}>
						Nombre
					</label>
					<input type='text' name='nombre' id='nombre' placeholder='Ej: Buddy' className={styles.input} onChange={handleChange} required value={formData.nombre} />
					<label htmlFor='fechaPerdida'>Fecha que se perdió</label>
					<input type='date' name='fechaPerdida' id='fechaPerdida' className={styles.input} onChange={handleChange} required value={formData.fechaPerdida} />
					<label htmlFor='zona'>Zona / Barrio en que se perdió la mascota</label>
					<input type='text' name='zona' id='zona' placeholder='Ej: Quilmes' className={styles.input} onChange={handleChange} required value={formData.zona} />
					<label htmlFor='mascotaEspecie'>Tipo de mascota</label>
					<select name='mascotaEspecie' id='mascotaEspecie' className={styles.input} onChange={handleChange} required value={formData.mascotaEspecie}>
						<option value=''>Selecciona la especie</option> {/* Opción por defecto */}
						<option value='Perro'>Perro</option>
						<option value='Gato'>Gato</option>
					</select>
					<label htmlFor='mascotaRaza'>Raza de la mascota</label>
					<input type='text' name='mascotaRaza' id='mascotaRaza' placeholder='Ej: Caniche / Mixto' className={styles.input} onChange={handleChange} required value={formData.mascotaRaza} />
					<label htmlFor='mascotaColores' className={styles.label}>
						Colores de la mascota, separados por coma y en orden de importancia
					</label>
					<input type='text' name='mascotaColores' id='mascotaColores' placeholder='Negro, Marron, Blanco' className={styles.input} onChange={handleChange} required value={formData.mascotaColores} />
					<label htmlFor='mascotaTamaño'>Tamaño de la mascota</label>
					<select name='mascotaTamaño' id='mascotaTamaño' className={styles.input} onChange={handleChange} required value={formData.mascotaTamaño}>
						<option value=''>Selecciona el tamaño</option> {/* Opción por defecto */}
						<option value='Pequeña'>Pequeña</option>
						<option value='Mediana'>Mediana</option>
						<option value='Grande'>Grande</option>
					</select>

					<label htmlFor='mascotaEdad'>Edad de la mascota</label>
					<input type='number' name='mascotaEdad' id='mascotaEdad' placeholder='Ej: 3' className={styles.input} onChange={handleChange} required value={formData.mascotaEdad} />
					<label htmlFor='mascotaOtros'>Otros datos de la mascota</label>
					<textarea
						name='mascotaOtros'
						id='mascotaOtros'
						placeholder='Ej: Tenía collar color negro.. responde al nombre.. tiene chip..'
						className={styles.input}
						onChange={handleChange}
						required
						value={formData.mascotaOtros}
						rows={4}
					/>

					<label htmlFor='contactoNombre'>Nombre de contacto</label>
					<input type='text' name='contactoNombre' id='contactoNombre' placeholder='Ej: Juan' className={styles.input} onChange={handleChange} required value={formData.contactoNombre} />
					<label htmlFor='contactoTelefono'>Teléfono de contacto, sin espacios</label>
					<input
						type='text'
						name='contactoTelefono'
						id='contactoTelefono'
						placeholder='Ej: +5491112345678'
						className={styles.input}
						onChange={handleChange}
						required
						value={formData.contactoTelefono}
					/>
					<label htmlFor='contactoEmail'>Email de contacto</label>
					<input type='email' name='contactoEmail' id='contactoEmail' placeholder='Ej: mail@example.com' className={styles.input} onChange={handleChange} required value={formData.contactoEmail} />

					<div className={styles.buttonContainer}>
						<button className={styles.buttonClear} onClick={handleClear}>
							Borrar todo
						</button>
						<button type='submit' className={styles.buttonSend}>
							Publicar
						</button>
					</div>
				</form>
			</div>
		</section>
	)
}
