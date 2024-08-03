<script>
    import { goto } from '$app/navigation';
    import Form from '../../lib/Form.svelte';
    import Wrapper from '../../lib/Wrapper.svelte';

    // Datos iniciales para un nuevo libro
    let book = {
        titulo: '',
        autor: '',
        edicion: '',
        numPaginas: 0
    };

    async function addBook(event) {
        event.preventDefault();
        const response = await fetch('api/book', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(book)
        });

        if (response.ok) {
            alert('Book added successfully');
            goto('/');
        }
    }
</script>

<Wrapper>
    <h1>Adding book</h1>
    <Form data={book} action={addBook} />
</Wrapper>