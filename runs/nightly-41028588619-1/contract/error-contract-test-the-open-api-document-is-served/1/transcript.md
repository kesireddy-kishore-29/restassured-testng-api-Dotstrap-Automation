# Transcript: The OpenAPI document is served and names every operation

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#theOpenApiDocumentIsServed` |
| Features | FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 1 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `GET /openapi.yaml` | 200 | 30 | `qa-1d2345fa-7201-46b0-bb79-cb030bbf1197` |

## 1. GET /openapi.yaml

```text
#1 GET http://localhost:7070/openapi.yaml
correlation: qa-1d2345fa-7201-46b0-bb79-cb030bbf1197

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d2345fa-7201-46b0-bb79-cb030bbf1197
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Fri, 30 Oct 2026 08:46:06 GMT
Content-Type: application/yaml
X-Correlation-Id: qa-1d2345fa-7201-46b0-bb79-cb030bbf1197
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Content-Encoding: gzip
Content-Length: 3575

openapi: 3.0.3
info:
  title: Reference Service
  version: 1.0.0
  description: |
    Self-hosted system under test for restassured-testng-api-Dotstrap-Automation. It exposes behaviour public
    demo APIs lack: idempotency keys, rate limits, CORS, a credit ledger, multi-region data
    residency and RFC 7807 errors. Every error is `application/problem+json`.

    Data residency: an account lives in its home region (`in`, `eu`, `us`); a conversation is
    stored in the recipient's region. Authenticated responses carry `X-Served-Region`.

    Test-only fault injection (enabled by default): `X-Fault: latency=<ms>`, `X-Fault: drop-response`,
    `X-Fault: unavailable-once` with `X-Fault-Key`.
servers:
  - url: http://localhost:7070
tags:
  - name: meta
  - name: accounts
  - name: conversations
  - name: credits
  - name: admin

paths:
  /health:
    get:
      tags: [meta]
      operationId: getHealth
      summary: Liveness and build information
      responses:
        "200":
          description: Service is up
          content:
            application/json:
              schema: { $ref: "#/components/schemas/Health" }

  /openapi.yaml:
    get:
      tags: [meta]
      operationId: getOpenApi
      summary: This document
      responses:
        "200":
          description: The OpenAPI document
          content:
            application/yaml:
              schema: { type: string }

  /v1/auth/token:
    post:
      tags: [accounts]
      operationId: issueToken
      summary: Exchange a handle and password for a bearer token
      requestBody:
        required: true
        content:
          application/json:
            schema: { $ref: "#/components/schemas/TokenRequest" }
      responses:
        "200":
          description: Token issued
          content:
            application/json:
              schema: { $ref: "#/components/schemas/Token" }
        "400": { $ref: "#/components/responses/BadRequest" }
        "401": { $ref: "#/components/responses/Unauthorized" }
        "415": { $ref: "#/components/responses/UnsupportedMediaType" }
        "422": { $ref: "#/components/responses/ValidationFailed" }
        "429": { $ref: "#/components/responses/TooManyRequests" }
        "503": { $ref: "#/components/responses/Unavailable" }

  /v1/accounts:
    post:
      tags: [accounts]
      operationId: createAccount
      summary: Create an account (grants 5 free credits once)
      requestBody:
        required: true
        content:
          application/json:
            schema: { $ref: "#/components/schemas/CreateAccountRequest" }
      responses:
        "201":
          description: Account created
          headers:
            Location: { $ref: "#/components/headers/Location" }
          content:
            application/json:
              schema: { $ref: "#/components/schemas/Account" }
        "400": { $ref: "#/components/responses/BadRequest" }
        "409": { $ref: "#/components/responses/Conflict" }
        "415": { $ref: "#/components/responses/UnsupportedMediaType" }
        "422": { $ref: "#/components/responses/ValidationFailed" }
        "429": { $ref: "#/components/responses/TooManyRequests" }
        "503": { $ref: "#/components/responses/Unavailable" }

  /v1/accounts/me:
    get:
      tags: [accounts]
      operationId: getMe
      summary: The signed-in account
      security: [{ bearerAuth: [] }]
      responses:
        "200":
          description: The caller's account
          content:
            application/json:
              schema: { $ref: "#/components/schemas/Account" }
        "401": { $ref: "#/components/responses/Unauthorized" }
        "429": { $ref: "#/components/responses/TooManyRequests" }
        "503": { $ref: "#/components/responses/Unavailable" }
    patch:
      tags: [accounts]
      operationId: updateMe
      summary: Change the display name
      security: [{ bearerAuth: [] }]
      requestBody:
        required: true
        content:
          application/json:
            schema: { $ref: "#/components/schemas/UpdateAccountRequest" }
      responses:
        "200":
          description: Updated account
          content:
            application/json:
              schema: { $ref: "#/components/schemas/Account" }
        "400": { $ref: "#/components/responses/BadRequest" }
        "401": { $ref: "#/components/responses/Unauthorized" }
        "415": { $ref: "#/components/responses/UnsupportedMediaType" }
        "422": { $ref: "#/components/responses/ValidationFailed" }
        "429": { $ref: "#/components/responses/TooManyRequests" }
        "503": { $ref: "#/components/responses/Unavailable" }
    delete:
      tags: [accounts]
      operationId: deleteMe
      summary: Delete the account, its conversations, ledger and tokens
      security: [{ bearerAuth: [] }]
      responses:
        "204": { description: Deleted }
        "401": { $ref: "#/components/responses/Unauthorized" }
        "429": { $ref: "#/components/responses/TooManyRequests" }
        "503": { $ref: "#/components/responses/Unavailable" }

  /v1/accounts/{handle}:
    get:
      tags: [accounts]
      operationId: getPublicProfile
      summary: Public profile of any account (no private fields)
      security: [{ bearerAuth: [] }]
      parameters:
        - name: handle
          in: path
          required: true
          schema: { type: string }
      responses:
        "200":
          description: Public profile
          content:
            application/json:
              schema: { $ref: "#/components/schemas/PublicProfile" }
        "401": { $ref: "#/components/responses/Unauthorized" }
        "404": { $ref: "#/components/responses/NotFound" }
        "429": { $ref: "#/components/responses/TooManyRequests" }
        "503": { $ref: "#/components/responses/Unavailable" }

  /v1/conversations:
    post:
      tags: [conversations]
      operationId: startConversation
      summary: Start a conversation (the first message costs 1 credit)
      security: [{ bearerAuth: [] }]
      requestBody:
        required: true
        content:
          application/json:
            schema: { $ref: "#/components/schemas/StartConversationRequest" }
      responses:
        "201":
          description: Conversation started, stored in the recipient's region
          headers:
            Location: { $ref: "#/components/headers/Location" }
            X-Data-Region: { $ref: "#/components/headers/DataRegion" }
          content:
            application/json:
              schema: { $ref: "#/components/schemas/Conversation" }
        "400": { $ref: "#/components/responses/BadRequest" }
        "401": { $ref: "#/components/responses/Unauthorized" }
        "402": { $ref: "#/components/responses/PaymentRequired" }
        "415": { $ref: "#/components/responses/UnsupportedMediaType" }
        "422": { $ref: "#/components/responses/ValidationFailed" }
        "429": { $ref: "#/components/responses/TooManyRequests" }
        "503": { $ref: "#/components/responses/Unavailable" }
    get:
      tags: [conversations]
      operationId: listConversations
      summary: Conversations the caller takes part in, newest first
      security: [{ bearerAuth: [] }]
      responses:
        "200":
          description: Page of conversations
          content:
            application/json:
              schema: { $ref: "#/components/schemas/ConversationPage" }
        "401": { $ref: "#/components/responses/Unauthorized" }
        "429": { $ref: "#/components/responses/TooManyRequests" }
        "503": { $ref: "#/components/responses/Unavailable" }

  /v1/conversations/{id}:
    parameters:
      - $ref: "#/components/parameters/ConversationId"
    get:
      tags: [conversations]
      operationId: getConversation
      security: [{ bearerAuth: [] }]
      responses:
        "200":
          description: The conversation, with the caller's unread count
          headers:
            X-Data-Region: { $ref: "#/components/headers/DataRegion" }
          content:
            application/json:
              schema: { $ref: "#/components/schemas/Conversation" }
        "401": { $ref: "#/components/responses/Unauthorized" }
        "403": { $ref: "#/components/responses/Forbidden" }
        "404": { $ref: "#/components/responses/NotFound" }
        "429": { $ref: "#/components/responses/TooManyRequests" }
        "503": { $ref: "#/components/responses/Unavailable" }

  /v1/conversations/{id}/messages:
    parameters:
      - $ref: "#/components/parameters/ConversationId"
    get:
      tags: [conversations]
      operationId: listMessages
      security: [{ bearerAuth: [] }]
      responses:
        "200":
          description: Messages, oldest first
          content:
            application/json:
              schema: { $ref: "#/components/schemas/MessagePage" }
        "401": { $ref: "#/components/responses/Unauthorized" }
        "403": { $ref: "#/components/responses/Forbidden" }
        "404": { $ref: "#/components/responses/NotFound" }
        "429": { $ref: "#/components/responses/TooManyRequests" }
        "503": { $ref: "#/components/responses/Unavailable" }
    post:
      tags: [conversations]
      operationId: sendMessage
      summary: Send a message (costs the sender 1 credit)
      security: [{ bearerAuth: [] }]
      requestBody:
        required: true
        content:
          application/json:
            schema: { $ref: "#/components/schemas/SendMessageRequest" }
      responses:
        "201":
          description: Message sent
          content:
            application/json:
              schema: { $ref: "#/components/schemas/Message" }
        "400": { $ref: "#/components/responses/BadRequest" }
        "401": { $ref: "#/components/responses/Unauthorized" }
        "402": { $ref: "#/components/responses/PaymentRequired" }
        "403": { $ref: "#/components/responses/Forbidden" }
        "404": { $ref: "#/components/responses/NotFound" }
        "409": { $ref: "#/components/responses/Conflict" }
        "415": { $ref: "#/components/responses/UnsupportedMediaType" }
        "422": { $ref: "#/components/responses/ValidationFailed" }
        "429": { $ref: "#/components/responses/TooManyRequests" }
        "503": { $ref: "#/components/responses/Unavailable" }

  /v1/conversations/{id}/read:
    parameters:
      - $ref: "#/components/parameters/ConversationId"
    post:
      tags: [conversations]
      operationId: markRead
      security: [{ bearerAuth: [] }]
      responses:
        "200":
          description: Marked read
          content:
            application/json:
              schema: { $ref: "#/components/schemas/ReadState" }
        "401": { $ref: "#/components/responses/Unauthorized" }
        "403": { $ref: "#/components/responses/Forbidden" }
        "404": { $ref: "#/components/responses/NotFound" }
        "429": { $ref: "#/components/responses/TooManyRequests" }
        "503": { $ref: "#/components/responses/Unavailable" }

  /v1/conversations/{id}/close:
    parameters:
      - $ref: "#/components/parameters/ConversationId"
    post:
      tags: [conversations]
      operationId: closeConversation
      summary: Close the conversation (idempotent)
      security: [{ bearerAuth: [] }]
      responses:
        "200":
          description: Closed conversation
          content:
            application/json:
              schema: { $ref: "#/components/schemas/Conversation" }
        "401": { $ref: "#/components/responses/Unauthorized" }
        "403": { $ref: "#/components/responses/Forbidden" }
        "404": { $ref: "#/components/responses/NotFound" }
        "429": { $ref: "#/components/responses/TooManyRequests" }
        "503": { $ref: "#/components/responses/Unavailable" }

  /v1/credits/balance:
    get:
      tags: [credits]
      operationId: getBalance
      security: [{ bearerAuth: [] }]
      responses:
        "200":
          description: Current balance
          content:
            application/json:
              schema: { $ref: "#/components/schemas/Balance" }
        "401": { $ref: "#/components/responses/Unauthorized" }
        "429": { $ref: "#/components/responses/TooManyRequests" }
        "503": { $ref: "#/components/responses/Unavailable" }

  /v1/credits/ledger:
    get:
      tags: [credits]
      operationId: getLedger
      security: [{ bearerAuth: [] }]
      responses:
        "200":
          description: Every movement, oldest first, and the balance they sum to
          content:
            application/json:
              schema: { $ref: "#/components/schemas/Ledger" }
        "401": { $ref: "#/components/responses/Unauthorized" }
        "429": { $ref: "#/components/responses/TooManyRequests" }
        "503": { $ref: "#/components/responses/Unavailable" }

  /v1/credits/purchases:
    post:
      tags: [credits]
      operationId: purchaseCredits
      summary: Buy a credit pack. Requires Idempotency-Key.
      description: |
        Same key + same body replays the original purchase (200, `Idempotent-Replayed: true`).
        Same key + different body is a 409. A concurrent duplicate waits for the original.
      security: [{ bearerAuth: [] }]
      parameters:
        - name: Idempotency-Key
          in: header
          required: true
          schema: { type: string, pattern: "^[A-Za-z0-9_-]{8,64}$" }
      requestBody:
        required: true
        content:
          application/json:
            schema: { $ref: "#/components/schemas/PurchaseRequest" }
      responses:
        "201":
          description: Purchase completed
          headers:
            Location: { $ref: "#/components/headers/Location" }
          content:
            application/json:
              schema: { $ref: "#/components/schemas/Purchase" }
        "200":
          description: Replay of the purchase this key already completed
          headers:
            Idempotent-Replayed:
              schema: { type: string, enum: ["true"] }
          content:
            application/json:
              schema: { $ref: "#/components/schemas/Purchase" }
        "400": { $ref: "#/components/responses/BadRequest" }
        "401": { $ref: "#/components/responses/Unauthorized" }
        "409": { $ref: "#/components/responses/Conflict" }
        "415": { $ref: "#/components/responses/UnsupportedMediaType" }
        "422": { $ref: "#/components/responses/ValidationFailed" }
        "429": { $ref: "#/components/responses/TooManyRequests" }
        "503": { $ref: "#/components/responses/Unavailable" }

  /v1/admin/stats:
    get:
      tags: [admin]
      operationId: getStats
      summary: Service-wide counts (administrators only)
      security: [{ bearerAuth: [] }]
      responses:
        "200":
          description: Counts
          content:
            application/json:
              schema: { $ref: "#/components/schemas/Stats" }
        "401": { $ref: "#/components/responses/Unauthorized" }
        "403": { $ref: "#/components/responses/Forbidden" }
        "429": { $ref: "#/components/responses/TooManyRequests" }
        "503": { $ref: "#/components/responses/Unavailable" }

components:
  securitySchemes:
    bearerAuth:
      type: http
      scheme: bearer

  parameters:
    ConversationId:
      name: id
      in: path
      required: true
      schema: { type: string }

  headers:
    Location:
      schema: { type: string }
    DataRegion:
      description: Region whose store holds this record
      schema: { $ref: "#/components/schemas/RegionCode" }
    RetryAfter:
      description: Seconds to wait before retrying
      schema: { type: integer, minimum: 1 }

  responses:
    BadRequest:
      description: Malformed request (bad JSON, missing Idempotency-Key)
      content:
        application/problem+json:
          schema: { $ref: "#/components/schemas/Problem" }
    Unauthorized:
      description: Missing, invalid or expired token; or wrong credentials
      content:
        application/problem+json:
          schema: { $ref: "#/components/schemas/Problem" }
    PaymentRequired:
      description: Not enough credits
      content:
        application/problem+json:
          schema: { $ref: "#/components/schemas/Problem" }
    Forbidden:
      description: Authenticated but not allowed
      content:
        application/problem+json:
          schema: { $ref: "#/components/schemas/Problem" }
    NotFound:
      description: No such resource
      content:
        application/problem+json:
          schema: { $ref: "#/components/schemas/Problem" }
    Conflict:
      description: State conflict (handle taken, conversation closed, idempotency key reused)
      content:
        application/problem+json:
          schema: { $ref: "#/components/schemas/Problem" }
    UnsupportedMediaType:
      description: Body is not application/json
      content:
        application/problem+json:
          schema: { $ref: "#/components/schemas/Problem" }
    ValidationFailed:
      description: One or more fields are invalid
      content:
        application/problem+json:
          schema: { $ref: "#/components/schemas/Problem" }
    TooManyRequests:
      description: Rate limited
      headers:
        Retry-After: { $ref: "#/components/headers/RetryAfter" }
      content:
        application/problem+json:
          schema: { $ref: "#/components/schemas/Problem" }
    Unavailable:
      description: Temporarily unavailable (fault injection)
      headers:
        Retry-After: { $ref: "#/components/headers/RetryAfter" }
      content:
        application/problem+json:
          schema: { $ref: "#/components/schemas/Problem" }

  schemas:
    RegionCode:
      type: string
      enum: [in, eu, us]

    Problem:
      type: object
      description: RFC 7807 problem details
      additionalProperties: false
      required: [type, title, status]
      properties:
        type: { type: string, format: uri }
        title: { type: string }
        status: { type: integer, minimum: 400, maximum: 599 }
        detail: { type: string }
        instance: { type: string }
        correlationId: { type: string }
        errors:
          type: array
          items:
            type: object
            additionalProperties: false
            required: [field, message]
            properties:
              field: { type: string }
              message: { type: string }

    Health:
      type: object
      additionalProperties: false
      required: [status, version, region, regions, faultsEnabled]
      properties:
        status: { type: string, enum: [UP] }
        version: { type: string }
        region: { $ref: "#/components/schemas/RegionCode" }
        regions:
          type: array
          items: { $ref: "#/components/schemas/RegionCode" }
        faultsEnabled: { type: boolean }

    CreateAccountRequest:
      type: object
      required: [handle, displayName, password, region]
      properties:
        handle: { type: string, pattern: "^[a-z0-9][a-z0-9-]{2,29}$" }
        displayName: { type: string, minLength: 1, maxLength: 60 }
        password: { type: string, minLength: 8, maxLength: 72 }
        region: { $ref: "#/components/schemas/RegionCode" }

    UpdateAccountRequest:
      type: object
      required: [displayName]
      properties:
        displayName: { type: string, minLength: 1, maxLength: 60 }

    TokenRequest:
      type: object
      required: [handle, password]
      properties:
        handle: { type: string }
        password: { type: string }
        ttlSeconds: { type: integer, minimum: 1, maximum: 3600 }

    Token:
      type: object
      additionalProperties: false
      required: [accessToken, tokenType, expiresIn, accountId]
      properties:
        accessToken: { type: string, minLength: 20 }
        tokenType: { type: string, enum: [Bearer] }
        expiresIn: { type: integer, minimum: 1 }
        accountId: { type: string, pattern: "^acc_" }

    Account:
      type: object
      additionalProperties: false
      required: [id, handle, displayName, region, role, createdAt]
      properties:
        id: { type: string, pattern: "^acc_" }
        handle: { type: string }
        displayName: { type: string }
        region: { $ref: "#/components/schemas/RegionCode" }
        role: { type: string, enum: [user, admin] }
        createdAt: { type: string, format: date-time }

    PublicProfile:
      type: object
      additionalProperties: false
      required: [handle, displayName, region]
      properties:
        handle: { type: string }
        displayName: { type: string }
        region: { $ref: "#/components/schemas/RegionCode" }

    StartConversationRequest:
      type: object
      required: [recipientHandle, subject, message]
      properties:
        recipientHandle: { type: string }
        subject: { type: string, minLength: 1, maxLength: 120 }
        message: { type: string, minLength: 1, maxLength: 2000 }

    SendMessageRequest:
      type: object
      required: [body]
      properties:
        body: { type: string, minLength: 1, maxLength: 2000 }

    Conversation:
      type: object
      additionalProperties: false
      required: [id, subject, status, region, participants, messageCount, unreadCount, createdAt]
      properties:
        id: { type: string, pattern: "^cnv_" }
        subject: { type: string }
        status: { type: string, enum: [open, closed] }
        region: { $ref: "#/components/schemas/RegionCode" }
        participants:
          type: array
          minItems: 2
          maxItems: 2
          items: { type: string }
        messageCount: { type: integer, minimum: 0 }
        unreadCount: { type: integer, minimum: 0 }
        createdAt: { type: string, format: date-time }
        closedAt: { type: string, format: date-time }

    ConversationPage:
      type: object
      additionalProperties: false
      required: [items, total]
      properties:
        items:
          type: array
          items: { $ref: "#/components/schemas/Conversation" }
        total: { type: integer, minimum: 0 }

    Message:
      type: object
      additionalProperties: false
      required: [id, conversationId, sender, body, createdAt]
      properties:
        id: { type: string, pattern: "^msg_" }
        conversationId: { type: string, pattern: "^cnv_" }
        sender: { type: string }
        body: { type: string }
        createdAt: { type: string, format: date-time }

    MessagePage:
      type: object
      additionalProperties: false
      required: [items, total]
      properties:
        items:
          type: array
          items: { $ref: "#/components/schemas/Message" }
        total: { type: integer, minimum: 0 }

    ReadState:
      type: object
      additionalProperties: false
      required: [conversationId, unreadCount]
      properties:
        conversationId: { type: string }
        unreadCount: { type: integer, minimum: 0 }

    Balance:
      type: object
      additionalProperties: false
      required: [balance, currency, accountId]
      properties:
        balance: { type: integer, minimum: 0 }
        currency: { type: string, enum: [credits] }
        accountId: { type: string, pattern: "^acc_" }

    LedgerEntry:
      type: object
      additionalProperties: false
      required: [id, type, amount, balanceAfter, reference, createdAt]
      properties:
        id: { type: string, pattern: "^led_" }
        type: { type: string, enum: [grant, purchase, spend] }
        amount: { type: integer }
        balanceAfter: { type: integer, minimum: 0 }
        reference: { type: string }
        createdAt: { type: string, format: date-time }

    Ledger:
      type: object
      additionalProperties: false
      required: [items, total, balance]
      properties:
        items:
          type: array
          items: { $ref: "#/components/schemas/LedgerEntry" }
        total: { type: integer, minimum: 0 }
        balance: { type: integer, minimum: 0 }

    PurchaseRequest:
      type: object
      required: [packId]
      properties:
        packId: { type: string, enum: [pack-10, pack-50] }

    Purchase:
      type: object
      additionalProperties: false
      required: [id, packId, credits, balanceAfter, createdAt]
      properties:
        id: { type: string, pattern: "^pur_" }
        packId: { type: string, enum: [pack-10, pack-50] }
        credits: { type: integer, minimum: 1 }
        balanceAfter: { type: integer, minimum: 0 }
        createdAt: { type: string, format: date-time }

    Stats:
      type: object
      additionalProperties: false
      required: [accounts, conversations, purchases]
      properties:
        accounts: { type: integer, minimum: 0 }
        conversations: { type: integer, minimum: 0 }
        purchases: { type: integer, minimum: 0 }

```
