<script>
    import { goto } from '$app/navigation';
    import Form from '../../lib/Form.svelte';
    import {triggerToast} from '../../lib/toastStore';

    // Datos iniciales para un nuevo libro
    let book = {
        titulo: '',
        autor: '',
        edicion: '',
        numPaginas: 0
    };

    async function addBook(event) {
        event.preventDefault();
        const response = await fetch('http://localhost:8000/book', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(book)
        });

        if (response.ok) {
            goto('/');
            triggerToast('Book added successfully', 'success');
        }
    }
</script>

<h1 class="text-center">Adding book</h1>
<Form data={book} action={addBook} />