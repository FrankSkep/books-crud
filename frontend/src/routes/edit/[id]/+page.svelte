<script>
    import Form from '../../../lib/Form.svelte';
    import { goto } from '$app/navigation';
    import {triggerToast} from '../../../lib/toastStore';

    export let data; // Recibe los datos de +page.server.js

    async function updateBook() {
        const book = {
            titulo: data.titulo,
            autor: data.autor,
            edicion: data.edicion,
            numPaginas: data.numPaginas
        };

        try {
            const response = await fetch(`http://localhost:8000/api/books/${data.id}`, {
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

<Form {data} action={updateBook} />
