<template>
  <div class="container">
    <h1>TODO</h1>
    <div>
      <input type="text" />
      <button>Add</button>
    </div>
    <div>
      <button>ALL</button>
      <button>STOCK</button>
      <button>DOING</button>
      <button>DONE</button>
    </div>
    <table>
      <thead>
        <tr>
          <th>タスク</th>
          <th>状態</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>Shopping</td>
          <td>STOCK</td>
        </tr>
        <tr>
          <td>Studying Programming</td>
          <td>DOING</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script lang="ts">
import Vue from 'vue'

export default Vue.extend({})
</script>
