<script>
    import Form from '../../../lib/Form.svelte';
    import { goto } from '$app/navigation';
    import { triggerToast } from '../../../lib/toastStore';

    export let data; // data from the server

    async function updateBook() {
        const book = {
            title: data.title,
            author: data.author,
            edition: data.edition,
            numberOfPages: data.numberOfPages,
        };

        try {
            const response = await fetch(
                `http://localhost:8000/api/books/${data.id}`,
                {
                    method: 'PUT',
                    headers: {
                        'Content-Type': 'application/json',
                    },
                    body: JSON.stringify(book),
                },
            );

            if (response.ok) {
                goto('/books');
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

<style>
    .alert {
        margin-top: 50px;
    }
</style>

{#if data.error === undefined}
    <Form data={data} action={updateBook} />
{:else}
    <div class="alert alert-danger">
        <p>{data.error}</p>
    </div>
    <div class="d-flex justify-content-center">
        <button class="btn btn-primary" on:click={() => window.history.back()}>Volver</button>
    </div>
{/if}