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
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-1f216838-b57f-4888-b642-6b7b654d55c7` |
| 2 | `POST /v1/accounts` | 201 | 14 | `qa-1b5a8a0e-8e87-4588-b63b-22739ff8fa25` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-2f3345cd-43c3-44c9-aadb-43a07a5329e0` |
| 4 | `POST /v1/conversations` | 201 | 4 | `qa-7ca1dc0e-4806-4adf-9aae-49b82788a82d` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 24 | `qa-18330ef9-d504-47d1-808a-c33e15ad9238` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 12 | `qa-56be7baf-e82b-4c7d-a048-aff425b181dc` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 10 | `qa-5d101747-2aca-4ece-a9d0-16ab71c28933` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 23 | `qa-989a09ad-887e-408c-b2d0-7f4def4cff61` |
| 9 | `GET /v1/credits/balance` | 200 | 5 | `qa-1e797511-22b5-4635-a953-4bb332562093` |
| 10 | `POST /v1/conversations` | 402 | 18 | `qa-94713021-19ef-4a4e-9587-d69a8f91f658` |
| 11 | `GET /v1/credits/ledger` | 200 | 4 | `qa-485b167f-7f42-47d7-8fd7-d1ac5d20b44b` |
| 12 | `POST /v1/auth/token` | 200 | 15 | `qa-39181e6a-3149-4954-ae66-406341f196f6` |
| 13 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-5cc94b79-80f5-4a98-a025-f240d5fcd761` |
| 14 | `POST /v1/auth/token` | 401 | 8 | `qa-32558072-9a4b-42c1-b0fe-e08894c825f0` |
| 15 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-d955c87a-251a-46bc-8be3-adaf1006a585` |
| 16 | `POST /v1/auth/token` | 401 | 6 | `qa-22b9ad75-65d1-4a20-b7f0-2944b05b1691` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1f216838-b57f-4888-b642-6b7b654d55c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f216838-b57f-4888-b642-6b7b654d55c7
Content-Type: application/json

--- request body ---
{"handle":"qa-4c057adeb3eb","displayName":"QA 4c057adeb3eb","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f216838-b57f-4888-b642-6b7b654d55c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 386
RateLimit-Reset: 8
Location: /v1/accounts/qa-4c057adeb3eb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f173698a-389b-4cbf-be79-52425d3ec519","handle":"qa-4c057adeb3eb","displayName":"QA 4c057adeb3eb","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.454002771Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1b5a8a0e-8e87-4588-b63b-22739ff8fa25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b5a8a0e-8e87-4588-b63b-22739ff8fa25
Content-Type: application/json

--- request body ---
{"handle":"qa-38805d739351","displayName":"QA 38805d739351","password":"****","region":"eu"}

--- response: 201 in 14 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b5a8a0e-8e87-4588-b63b-22739ff8fa25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 382
RateLimit-Reset: 8
Location: /v1/accounts/qa-38805d739351
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b0f5c314-893b-4e68-a6a7-06a5740323fd","handle":"qa-38805d739351","displayName":"QA 38805d739351","region":"eu","role":"user","createdAt":"2026-11-09T09:56:03.471694050Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2f3345cd-43c3-44c9-aadb-43a07a5329e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f3345cd-43c3-44c9-aadb-43a07a5329e0
Content-Type: application/json

--- request body ---
{"handle":"qa-4c057adeb3eb","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f3345cd-43c3-44c9-aadb-43a07a5329e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 377
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f173698a-389b-4cbf-be79-52425d3ec519"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7ca1dc0e-4806-4adf-9aae-49b82788a82d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ca1dc0e-4806-4adf-9aae-49b82788a82d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-38805d739351","subject":"Error contract","message":"Hi"}

--- response: 201 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ca1dc0e-4806-4adf-9aae-49b82788a82d
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
Location: /v1/conversations/cnv_6e091f22-090f-4298-973d-591f8fd94703
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_6e091f22-090f-4298-973d-591f8fd94703","subject":"Error contract","status":"open","region":"eu","participants":["qa-4c057adeb3eb","qa-38805d739351"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-09T09:56:03.524587407Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_6e091f22-090f-4298-973d-591f8fd94703/messages
correlation: qa-18330ef9-d504-47d1-808a-c33e15ad9238

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18330ef9-d504-47d1-808a-c33e15ad9238
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 24 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-18330ef9-d504-47d1-808a-c33e15ad9238
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

{"id":"msg_6a863149-7c1a-4a55-a6bd-f25c393405f8","conversationId":"cnv_6e091f22-090f-4298-973d-591f8fd94703","sender":"qa-4c057adeb3eb","body":"2","createdAt":"2026-11-09T09:56:03.560623132Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_6e091f22-090f-4298-973d-591f8fd94703/messages
correlation: qa-56be7baf-e82b-4c7d-a048-aff425b181dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56be7baf-e82b-4c7d-a048-aff425b181dc
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 12 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-56be7baf-e82b-4c7d-a048-aff425b181dc
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

{"id":"msg_faf1ffda-2172-486d-94f1-cc1277d92c1c","conversationId":"cnv_6e091f22-090f-4298-973d-591f8fd94703","sender":"qa-4c057adeb3eb","body":"3","createdAt":"2026-11-09T09:56:03.577341571Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_6e091f22-090f-4298-973d-591f8fd94703/messages
correlation: qa-5d101747-2aca-4ece-a9d0-16ab71c28933

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d101747-2aca-4ece-a9d0-16ab71c28933
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 10 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d101747-2aca-4ece-a9d0-16ab71c28933
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

{"id":"msg_ea2b7f1c-a6a1-4128-9a32-a223abfb9f5f","conversationId":"cnv_6e091f22-090f-4298-973d-591f8fd94703","sender":"qa-4c057adeb3eb","body":"4","createdAt":"2026-11-09T09:56:03.591271763Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_6e091f22-090f-4298-973d-591f8fd94703/messages
correlation: qa-989a09ad-887e-408c-b2d0-7f4def4cff61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-989a09ad-887e-408c-b2d0-7f4def4cff61
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 23 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-989a09ad-887e-408c-b2d0-7f4def4cff61
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

{"id":"msg_fff78b06-2e7c-4a9a-906d-0f14825c7b60","conversationId":"cnv_6e091f22-090f-4298-973d-591f8fd94703","sender":"qa-4c057adeb3eb","body":"5","createdAt":"2026-11-09T09:56:03.610212752Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-1e797511-22b5-4635-a953-4bb332562093

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e797511-22b5-4635-a953-4bb332562093
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e797511-22b5-4635-a953-4bb332562093
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

{"balance":0,"currency":"credits","accountId":"acc_f173698a-389b-4cbf-be79-52425d3ec519"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-94713021-19ef-4a4e-9587-d69a8f91f658

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94713021-19ef-4a4e-9587-d69a8f91f658
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-38805d739351","subject":"One more","message":"Hi"}

--- response: 402 in 18 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-94713021-19ef-4a4e-9587-d69a8f91f658
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

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-94713021-19ef-4a4e-9587-d69a8f91f658"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-485b167f-7f42-47d7-8fd7-d1ac5d20b44b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-485b167f-7f42-47d7-8fd7-d1ac5d20b44b
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-485b167f-7f42-47d7-8fd7-d1ac5d20b44b
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

{"items":[{"id":"led_65083aef-0719-4dbf-af4d-8e78c7281d63","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-09T09:56:03.454012585Z"},{"id":"led_7c556ea1-3415-4ddf-8bc4-25dae2fad7a4","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_6e091f22-090f-4298-973d-591f8fd94703","createdAt":"2026-11-09T09:56:03.524579245Z"},{"id":"led_08e7b402-76f9-470a-86f8-09691ea761f9","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_6a863149-7c1a-4a55-a6bd-f25c393405f8","createdAt":"2026-11-09T09:56:03.560168920Z"},{"id":"led_606034cb-03e7-4ecc-a1f9-88e3e1ff4ea0","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_faf1ffda-2172-486d-94f1-cc1277d92c1c","createdAt":"2026-11-09T09:56:03.577336463Z"},{"id":"led_ed176ad2-066a-44d7-bd79-dd3c6e9beaa2","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_ea2b7f1c-a6a1-4128-9a32-a223abfb9f5f","createdAt":"2026-11-09T09:56:03.591266225Z"},{"id":"led_3b4cfcde-24b7-4276-9158-765c6e724ec8","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_fff78b06-2e7c-4a9a-906d-0f14825c7b60","createdAt":"2026-11-09T09:56:03.610194695Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-39181e6a-3149-4954-ae66-406341f196f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39181e6a-3149-4954-ae66-406341f196f6
Content-Type: application/json

--- request body ---
{"handle":"qa-38805d739351","password":"****"}

--- response: 200 in 15 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-39181e6a-3149-4954-ae66-406341f196f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 302
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b0f5c314-893b-4e68-a6a7-06a5740323fd"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5cc94b79-80f5-4a98-a025-f240d5fcd761

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cc94b79-80f5-4a98-a025-f240d5fcd761
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5cc94b79-80f5-4a98-a025-f240d5fcd761
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
correlation: qa-32558072-9a4b-42c1-b0fe-e08894c825f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32558072-9a4b-42c1-b0fe-e08894c825f0
Content-Type: application/json

--- request body ---
{"handle":"qa-38805d739351","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32558072-9a4b-42c1-b0fe-e08894c825f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 299
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-32558072-9a4b-42c1-b0fe-e08894c825f0"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d955c87a-251a-46bc-8be3-adaf1006a585

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d955c87a-251a-46bc-8be3-adaf1006a585
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d955c87a-251a-46bc-8be3-adaf1006a585
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
correlation: qa-22b9ad75-65d1-4a20-b7f0-2944b05b1691

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22b9ad75-65d1-4a20-b7f0-2944b05b1691
Content-Type: application/json

--- request body ---
{"handle":"qa-4c057adeb3eb","password":"****"}

--- response: 401 in 6 ms ---
Date: Mon, 09 Nov 2026 09:56:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22b9ad75-65d1-4a20-b7f0-2944b05b1691
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-22b9ad75-65d1-4a20-b7f0-2944b05b1691"}
```
