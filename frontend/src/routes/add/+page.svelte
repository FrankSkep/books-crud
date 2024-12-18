<script>
    import { goto } from '$app/navigation';
    import Form from '../../lib/Form.svelte';
    import { triggerToast } from '../../lib/toastStore';

    // book object
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
        } else {
            const errorData = await response.json();
            let errors = 'An error occurred';
            if (errorData.errors && Array.isArray(errorData.errors)) {
                console.log(errorData.errors);
                errors = errorData.errors.join(', ');
            } else if (errorData.message) {
                errors = errorData.message;
            } else {
                console.log('Unexpected error format:', errorData);
            }
            triggerToast(errors, 'danger');
        }
    }
</script>

<Form data={book} action={addBook} />
