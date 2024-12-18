<script>
    import { goto } from '$app/navigation';
    import Form from '../../lib/Form.svelte';
    import { triggerToast } from '../../lib/toastStore';

    // Book object
    let book = {
        title: '',
        author: '',
        edition: '',
        numberOfPages: 0,
    };

    async function addBook(event) {
        event.preventDefault();
        const response = await fetch('http://localhost:8000/api/books', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(book),
        });

        if (response.ok) {
            goto('/');
            triggerToast('Book added successfully', 'success');
        }
    }
</script>

<Form data={book} action={addBook} />
