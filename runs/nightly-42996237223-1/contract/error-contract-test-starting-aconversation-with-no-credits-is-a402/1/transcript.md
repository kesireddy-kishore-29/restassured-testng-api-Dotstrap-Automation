# Transcript: With no credits left, starting a conversation is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#startingAConversationWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 41 | `qa-666fca6d-8445-4aa7-a90c-bf523708ff57` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-32ead4fa-e528-4252-99b4-562106e964f2` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-5948e909-e22e-42d9-ae08-5c6bcb90e7a1` |
| 4 | `POST /v1/conversations` | 201 | 11 | `qa-86ed817d-5f75-47ff-b644-787667c14b04` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 24 | `qa-0f17d49f-1703-4086-9979-1e94d7e5f41c` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 22 | `qa-7727ad24-65e9-45c3-928e-390f5d3d4286` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 24 | `qa-f47e37b0-8ab9-4972-83c5-405a36bb6f63` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 27 | `qa-32136e29-be81-4982-ac38-6d22787eed13` |
| 9 | `GET /v1/credits/balance` | 200 | 25 | `qa-5221e01c-1aa5-40d9-b5eb-2909698e2392` |
| 10 | `POST /v1/conversations` | 402 | 6 | `qa-a0d85ff4-0bb3-4947-97f0-9fd2de41d76f` |
| 11 | `GET /v1/credits/ledger` | 200 | 9 | `qa-31216ece-ae0d-41e0-880c-a2a3fecfd62f` |
| 12 | `POST /v1/auth/token` | 200 | 36 | `qa-dddbee15-3989-45ca-bfba-acc732965b50` |
| 13 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-7c044949-f823-49c1-9566-7bc033a5213f` |
| 14 | `POST /v1/auth/token` | 401 | 14 | `qa-c55f492c-8039-4118-9c5a-7998d456c5a6` |
| 15 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-f9a43023-235c-4f5b-b208-78cfeda37784` |
| 16 | `POST /v1/auth/token` | 401 | 14 | `qa-637ccec6-1ab7-40eb-9c81-01b6d875cde7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-666fca6d-8445-4aa7-a90c-bf523708ff57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-666fca6d-8445-4aa7-a90c-bf523708ff57
Content-Type: application/json

--- request body ---
{"handle":"qa-5ca57e670c34","displayName":"QA 5ca57e670c34","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-666fca6d-8445-4aa7-a90c-bf523708ff57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 7
Location: /v1/accounts/qa-5ca57e670c34
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d14434b4-f025-4a07-b24f-bdde0305638c","handle":"qa-5ca57e670c34","displayName":"QA 5ca57e670c34","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.514543860Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-32ead4fa-e528-4252-99b4-562106e964f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32ead4fa-e528-4252-99b4-562106e964f2
Content-Type: application/json

--- request body ---
{"handle":"qa-6cb82b03adf0","displayName":"QA 6cb82b03adf0","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-32ead4fa-e528-4252-99b4-562106e964f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 381
RateLimit-Reset: 7
Location: /v1/accounts/qa-6cb82b03adf0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_65379911-9837-4736-a61c-87a9f6904982","handle":"qa-6cb82b03adf0","displayName":"QA 6cb82b03adf0","region":"eu","role":"user","createdAt":"2026-11-11T09:34:38.575121374Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5948e909-e22e-42d9-ae08-5c6bcb90e7a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5948e909-e22e-42d9-ae08-5c6bcb90e7a1
Content-Type: application/json

--- request body ---
{"handle":"qa-5ca57e670c34","password":"****"}

--- response: 200 in 31 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-5948e909-e22e-42d9-ae08-5c6bcb90e7a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d14434b4-f025-4a07-b24f-bdde0305638c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-86ed817d-5f75-47ff-b644-787667c14b04

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86ed817d-5f75-47ff-b644-787667c14b04
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6cb82b03adf0","subject":"Error contract","message":"Hi"}

--- response: 201 in 11 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-86ed817d-5f75-47ff-b644-787667c14b04
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_88d6d96e-8a0f-4a18-987a-7c23de2a8ec8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_88d6d96e-8a0f-4a18-987a-7c23de2a8ec8","subject":"Error contract","status":"open","region":"eu","participants":["qa-5ca57e670c34","qa-6cb82b03adf0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-11T09:34:38.654569132Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_88d6d96e-8a0f-4a18-987a-7c23de2a8ec8/messages
correlation: qa-0f17d49f-1703-4086-9979-1e94d7e5f41c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f17d49f-1703-4086-9979-1e94d7e5f41c
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f17d49f-1703-4086-9979-1e94d7e5f41c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_bdf5af81-d162-4bcf-9222-b932c5db6e0e","conversationId":"cnv_88d6d96e-8a0f-4a18-987a-7c23de2a8ec8","sender":"qa-5ca57e670c34","body":"2","createdAt":"2026-11-11T09:34:38.691639166Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_88d6d96e-8a0f-4a18-987a-7c23de2a8ec8/messages
correlation: qa-7727ad24-65e9-45c3-928e-390f5d3d4286

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7727ad24-65e9-45c3-928e-390f5d3d4286
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 22 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-7727ad24-65e9-45c3-928e-390f5d3d4286
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_18e71380-a343-4721-b655-6410aede2a48","conversationId":"cnv_88d6d96e-8a0f-4a18-987a-7c23de2a8ec8","sender":"qa-5ca57e670c34","body":"3","createdAt":"2026-11-11T09:34:38.725183957Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_88d6d96e-8a0f-4a18-987a-7c23de2a8ec8/messages
correlation: qa-f47e37b0-8ab9-4972-83c5-405a36bb6f63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f47e37b0-8ab9-4972-83c5-405a36bb6f63
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 24 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-f47e37b0-8ab9-4972-83c5-405a36bb6f63
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_14e5be05-5a1d-45da-bf43-b12221d802d5","conversationId":"cnv_88d6d96e-8a0f-4a18-987a-7c23de2a8ec8","sender":"qa-5ca57e670c34","body":"4","createdAt":"2026-11-11T09:34:38.775802301Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_88d6d96e-8a0f-4a18-987a-7c23de2a8ec8/messages
correlation: qa-32136e29-be81-4982-ac38-6d22787eed13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32136e29-be81-4982-ac38-6d22787eed13
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 27 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-32136e29-be81-4982-ac38-6d22787eed13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 192

{"id":"msg_37e1e847-d2da-4820-8354-0ef78e19a68d","conversationId":"cnv_88d6d96e-8a0f-4a18-987a-7c23de2a8ec8","sender":"qa-5ca57e670c34","body":"5","createdAt":"2026-11-11T09:34:38.841817119Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-5221e01c-1aa5-40d9-b5eb-2909698e2392

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5221e01c-1aa5-40d9-b5eb-2909698e2392
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Wed, 11 Nov 2026 09:34:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-5221e01c-1aa5-40d9-b5eb-2909698e2392
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 89

{"balance":0,"currency":"credits","accountId":"acc_d14434b4-f025-4a07-b24f-bdde0305638c"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-a0d85ff4-0bb3-4947-97f0-9fd2de41d76f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0d85ff4-0bb3-4947-97f0-9fd2de41d76f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6cb82b03adf0","subject":"One more","message":"Hi"}

--- response: 402 in 6 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0d85ff4-0bb3-4947-97f0-9fd2de41d76f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 270

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-a0d85ff4-0bb3-4947-97f0-9fd2de41d76f"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-31216ece-ae0d-41e0-880c-a2a3fecfd62f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31216ece-ae0d-41e0-880c-a2a3fecfd62f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-31216ece-ae0d-41e0-880c-a2a3fecfd62f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 1169

{"items":[{"id":"led_bd971540-b68f-4651-9432-fd81957562df","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-11T09:34:38.514552426Z"},{"id":"led_67c10c07-4e02-443d-ab7d-689cc3bbe55c","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_88d6d96e-8a0f-4a18-987a-7c23de2a8ec8","createdAt":"2026-11-11T09:34:38.654557521Z"},{"id":"led_af3ad993-fe39-4bbf-a270-7951a5cd3b82","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_bdf5af81-d162-4bcf-9222-b932c5db6e0e","createdAt":"2026-11-11T09:34:38.691616544Z"},{"id":"led_daae0057-d84a-44db-9eb6-2bb21cea20b7","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_18e71380-a343-4721-b655-6410aede2a48","createdAt":"2026-11-11T09:34:38.725177996Z"},{"id":"led_4c7ba5bc-7941-42d4-bd6d-c28df39bcc9f","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_14e5be05-5a1d-45da-bf43-b12221d802d5","createdAt":"2026-11-11T09:34:38.775793825Z"},{"id":"led_07e49063-560a-43ed-82cd-d77aae4568f9","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_37e1e847-d2da-4820-8354-0ef78e19a68d","createdAt":"2026-11-11T09:34:38.841807952Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-dddbee15-3989-45ca-bfba-acc732965b50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dddbee15-3989-45ca-bfba-acc732965b50
Content-Type: application/json

--- request body ---
{"handle":"qa-6cb82b03adf0","password":"****"}

--- response: 200 in 36 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-dddbee15-3989-45ca-bfba-acc732965b50
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 293
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_65379911-9837-4736-a61c-87a9f6904982"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7c044949-f823-49c1-9566-7bc033a5213f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c044949-f823-49c1-9566-7bc033a5213f
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7c044949-f823-49c1-9566-7bc033a5213f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-c55f492c-8039-4118-9c5a-7998d456c5a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c55f492c-8039-4118-9c5a-7998d456c5a6
Content-Type: application/json

--- request body ---
{"handle":"qa-6cb82b03adf0","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c55f492c-8039-4118-9c5a-7998d456c5a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 291
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c55f492c-8039-4118-9c5a-7998d456c5a6"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f9a43023-235c-4f5b-b208-78cfeda37784

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f9a43023-235c-4f5b-b208-78cfeda37784
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f9a43023-235c-4f5b-b208-78cfeda37784
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
```

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-637ccec6-1ab7-40eb-9c81-01b6d875cde7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-637ccec6-1ab7-40eb-9c81-01b6d875cde7
Content-Type: application/json

--- request body ---
{"handle":"qa-5ca57e670c34","password":"****"}

--- response: 401 in 14 ms ---
Date: Wed, 11 Nov 2026 09:34:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-637ccec6-1ab7-40eb-9c81-01b6d875cde7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 282
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-637ccec6-1ab7-40eb-9c81-01b6d875cde7"}
```
