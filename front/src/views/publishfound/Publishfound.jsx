// import React from 'react'
import { useState } from 'react'
import styles from './Publishfound.module.css'
import axios from 'axios'

export default function Publishfound() {
	const [images, setImages] = useState([])
	const [formData, setFormData] = useState({
		publica_duenio: false,
		rescatada: false,
		mascota_nombre: undefined,
		fecha: '',
		zona: '',
		mascota_especie: '',
		mascota_raza: '',
		mascota_colores: [],
		mascota_tamanio: '',
		mascota_edad: '',
		mascota_descripcion: '',
		usuario_nombre: '',
		usuario_telefono: '',
		usuario_email: '',
		fotos: []
	})

	function convertToBase64(e) {
		const files = Array.from(e.target.files)
		const promises = files.map((file) => {
			return new Promise((resolve, reject) => {
				const reader = new FileReader()
				reader.readAsDataURL(file)
				reader.onload = () => resolve(reader.result)
				reader.onerror = (error) => reject(error)
			})
		})

		Promise.all(promises)
			.then((base64Images) => {
				setImages(base64Images)
				setFormData({
					...formData,
					fotos: base64Images
				})
			})
			.catch((error) => console.error('Error al convertir imágenes:', error))
	}

	const handleChange = (e) => {
		const { name, value } = e.target

		// Convertir el string en un array de colores si es el campo mascota_colores
		if (name === 'mascota_colores') {
			setFormData((prevFormData) => ({
				...prevFormData,
				[name]: value.split(',').map((color) => color.trim()) // Convertir en array y eliminar espacios
			}))
		} else {
			setFormData((prevFormData) => ({
				...prevFormData,
				[name]: value
			}))
		}
	}

	const handleSubmit = async (e) => {
		e.preventDefault()
		console.log('enviando formulario', formData)
		try {
			const response = await axios.post('http://localhost:3000/api/v1/publications/save', formData)
			console.log(response)
		} catch (error) {
			console.log(error)
		}
		//lógica para enviar al back el formulario
	}

	const handleClear = () => {
		setImages([])
		setFormData({
			publica_duenio: false,
			rescatada: false,
			mascota_nombre: undefined,
			fecha: '',
			zona: '',
			mascota_especie: '',
			mascota_raza: '',
			mascota_colores: [],
			mascota_tamanio: '',
			mascota_edad: '',
			mascota_descripcion: '',
			usuario_nombre: '',
			usuario_telefono: '',
			usuario_email: '',
			fotos: []
		})
		console.log('formulario borrado')
	}

	return (
		<section className={styles.section}>
			<h3 className={styles.title}>Viste una mascota perdida? </h3>
			<h4 className={styles.subtitle}>Completá el formulario y ayudá a que se reencuentre con su dueño</h4>
			<div className={styles.formContainer}>
				<form onSubmit={handleSubmit} className={styles.form}>
					<label htmlFor='fecha'>Fecha en que lo viste</label>
					<input type='date' name='fecha' id='fecha' className={styles.input} onChange={handleChange} required value={formData.fecha} />
					<label htmlFor='zona'>Zona / Barrio en que viste la mascota</label>
					<input type='text' name='zona' id='zona' placeholder='Ej: Quilmes' className={styles.input} onChange={handleChange} required value={formData.zona} />
					<label htmlFor='mascota_especie'>Tipo de mascota</label>
					<select name='mascota_especie' id='mascota_especie' className={styles.input} onChange={handleChange} required value={formData.mascota_especie}>
						<option value=''>Selecciona la especie</option> {/* Opción por defecto */}
						<option value='Perro'>Perro</option>
						<option value='Gato'>Gato</option>
					</select>
					<label htmlFor='mascota_raza'>Raza de la mascota</label>
					<input type='text' name='mascota_raza' id='mascota_raza' placeholder='Ej: Caniche / Mixto' className={styles.input} onChange={handleChange} required value={formData.mascota_raza} />
					<label htmlFor='mascota_colores' className={styles.label}>
						Colores de la mascota, separados por coma y en orden de importancia
					</label>
					<input
						type='text'
						name='mascota_colores'
						id='mascota_colores'
						placeholder='Negro, Marron, Blanco'
						className={styles.input}
						onChange={handleChange}
						required
						value={formData.mascota_colores}
					/>
					<label htmlFor='mascota_tamanio'>Tamaño de la mascota</label>
					<select name='mascota_tamanio' id='mascota_tamanio' className={styles.input} onChange={handleChange} required value={formData.mascota_tamanio}>
						<option value=''>Selecciona el tamaño</option> {/* Opción por defecto */}
						<option value='Pequeña'>Pequeña</option>
						<option value='Mediana'>Mediana</option>
						<option value='Grande'>Grande</option>
					</select>

					<label htmlFor='mascota_edad'>Edad de la mascota</label>
					<input type='number' name='mascota_edad' id='mascota_edad' placeholder='Ej: 3' className={styles.input} onChange={handleChange} required value={formData.mascota_edad} />
					<label htmlFor='mascota_descripcion'>Otros datos de la mascota</label>
					<textarea
						name='mascota_descripcion'
						id='mascota_descripcion'
						placeholder='Ej: Se lo vió frente a un portón negro.. En la plaza..'
						className={styles.input}
						onChange={handleChange}
						required
						value={formData.mascota_descripcion}
						rows={4}
					/>

					<label htmlFor='fotos'>Fotos de la mascota</label>
					<input accept='/image/*' type='file' name='fotos' id='fotos' className={styles.input} onChange={convertToBase64} multiple />
					{images.map((img, index) => (
						<img key={index} src={img} alt={`mascota ${index}`} width={100} height={100} />
					))}

					<label htmlFor='usuario_nombre'>Nombre de contacto</label>
					<input type='text' name='usuario_nombre' id='usuario_nombre' placeholder='Ej: Juan' className={styles.input} onChange={handleChange} required value={formData.usuario_nombre} />
					<label htmlFor='usuario_telefono'>Teléfono de contacto, sin espacios</label>
					<input
						type='text'
						name='usuario_telefono'
						id='usuario_telefono'
						placeholder='Ej: +5491112345678'
						className={styles.input}
						onChange={handleChange}
						required
						value={formData.usuario_telefono}
					/>
					<label htmlFor='usuario_email'>Email de contacto</label>
					<input type='email' name='usuario_email' id='usuario_email' placeholder='Ej: mail@example.com' className={styles.input} onChange={handleChange} required value={formData.usuario_email} />

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
