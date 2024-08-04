<script>
    import Form from '../../../lib/Form.svelte';
    import { goto } from '$app/navigation';
    import {triggerToast} from '../../../lib/toastStore';

    export let data; // Recibo los datos de server.js

    async function updateBook() {
        // Obtencion datos del formulario
        const book = {
            titulo: data.titulo,
            autor: data.autor,
            edicion: data.edicion,
            numPaginas: data.numPaginas
        };

        try {
            const response = await fetch(`http://localhost:8000/book/${data.id}`, {
                method: 'PUT',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(book)
            });

            if (response.ok) {
                goto('/');
                triggerToast('Book updated successfully', 'success');
            } else {
                const error = await response.json();
                triggerToast(`Failed to update book: ${error.message}`, 'danger');
            }
        } catch (error) {
            triggerToast(`Error: ${error.message}`, 'danger');
        }
    }

</script>

<h1>Editing book</h1>
<Form {data} action={updateBook} />
